package com.enssel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController("/enssel")
public class KR_Controller {

    // 메인
    @GetMapping("/{lang}")
    public ModelAndView getMain(@PathVariable("lang") String lang){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("page", "index");
        mav.addObject("lang",lang);
        return mav;
    }

    // 회사정보
    @GetMapping("/{lang}/introduce")
    public ModelAndView getIntroduce(@PathVariable("lang") String lang){
        ModelAndView mav = new ModelAndView("kr_view/introduce");
        mav.addObject("lang",lang);
        return mav;
    }

    // 사업분야
    @GetMapping("/{lang}/business")
    public ModelAndView getBusiness(@PathVariable("lang") String lang){
        ModelAndView mav = new ModelAndView("kr_view/business");
        mav.addObject("lang",lang);
        return mav;
    }

    // E-NOW
    @GetMapping("/e-now")
    public ModelAndView getEnow(){
        ModelAndView mav = new ModelAndView("kr_view/e-now");
        return mav;
    }

    // Contact
    @GetMapping("/{lang}/contact")
    public ModelAndView getContact(@PathVariable("lang") String lang){
        ModelAndView mav = new ModelAndView("kr_view/contact");
        mav.addObject("lang",lang);
        return mav;
    }
}
