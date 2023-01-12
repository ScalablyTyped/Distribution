package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.i18n
/////////////////////////////////
// i18n - Internationalization //
/////////////////////////////////
/**
  * Use the chrome.i18n infrastructure to implement internationalization across your whole app.
  * Content scripts: Fully supported.
  * @see[Docs]{@link https://developer.chrome.com/apps/i18n}
  * @since Chrome 25.
  */
object i18n {
  
  /** Holds detected ISO language code and its percentage in the input string */
  trait DetectedLanguage extends StObject {
    
    /**
      * An ISO language code such as 'en' or 'fr'.
      * For a complete list of languages supported by this method:
      * @see [kLanguageInfoTable]{@link https://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc}.
      * For an unknown language, 'und' will be returned, which means that [percentage] of the text is unknown to CLD */
    var language: kLanguageInfoTable
    
    /** The percentage of the detected language */
    var percentage: integer
  }
  object DetectedLanguage {
    
    inline def apply(language: kLanguageInfoTable, percentage: integer): DetectedLanguage = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedLanguage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetectedLanguage] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: kLanguageInfoTable): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPercentage(value: integer): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An ISO language code such as en or fr.
    * For a complete list of languages supported by this method, see kLanguageInfoTable.
    * For an unknown language, und will be returned,
    * which means that [percentage] of the text is unknown to CLD
    * @since Chrome 47.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.und
    - typings.chromeApps.chromeAppsStrings.af
    - typings.chromeApps.chromeAppsStrings.am
    - typings.chromeApps.chromeAppsStrings.an
    - typings.chromeApps.chromeAppsStrings.ar
    - typings.chromeApps.chromeAppsStrings.ast
    - typings.chromeApps.chromeAppsStrings.az
    - typings.chromeApps.chromeAppsStrings.be
    - typings.chromeApps.chromeAppsStrings.bg
    - typings.chromeApps.chromeAppsStrings.bh
    - typings.chromeApps.chromeAppsStrings.bn
    - typings.chromeApps.chromeAppsStrings.br
    - typings.chromeApps.chromeAppsStrings.bs
    - typings.chromeApps.chromeAppsStrings.ca
    - typings.chromeApps.chromeAppsStrings.ceb
    - typings.chromeApps.chromeAppsStrings.ckb
    - typings.chromeApps.chromeAppsStrings.co
    - typings.chromeApps.chromeAppsStrings.cs
    - typings.chromeApps.chromeAppsStrings.cy
    - typings.chromeApps.chromeAppsStrings.da
    - typings.chromeApps.chromeAppsStrings.de
    - typings.chromeApps.chromeAppsStrings.`de-AT`
    - typings.chromeApps.chromeAppsStrings.`de-CH`
    - typings.chromeApps.chromeAppsStrings.`de-DE`
    - typings.chromeApps.chromeAppsStrings.`de-LI`
    - typings.chromeApps.chromeAppsStrings.el
    - typings.chromeApps.chromeAppsStrings.en
    - typings.chromeApps.chromeAppsStrings.`en-AU`
    - typings.chromeApps.chromeAppsStrings.`en-CA`
    - typings.chromeApps.chromeAppsStrings.`en-GB`
    - typings.chromeApps.chromeAppsStrings.`en-IN`
    - typings.chromeApps.chromeAppsStrings.`en-NZ`
    - typings.chromeApps.chromeAppsStrings.`en-US`
    - typings.chromeApps.chromeAppsStrings.`en-ZA`
    - typings.chromeApps.chromeAppsStrings.eo
    - typings.chromeApps.chromeAppsStrings.es
    - typings.chromeApps.chromeAppsStrings.`es-419`
    - typings.chromeApps.chromeAppsStrings.`es-AR`
    - typings.chromeApps.chromeAppsStrings.`es-CL`
    - typings.chromeApps.chromeAppsStrings.`es-CO`
    - typings.chromeApps.chromeAppsStrings.`es-CR`
    - typings.chromeApps.chromeAppsStrings.`es-ES`
    - typings.chromeApps.chromeAppsStrings.`es-HN`
    - typings.chromeApps.chromeAppsStrings.`es-MX`
    - typings.chromeApps.chromeAppsStrings.`es-PE`
    - typings.chromeApps.chromeAppsStrings.`es-US`
    - typings.chromeApps.chromeAppsStrings.`es-UY`
    - typings.chromeApps.chromeAppsStrings.`es-VE`
    - typings.chromeApps.chromeAppsStrings.et
    - typings.chromeApps.chromeAppsStrings.eu
    - typings.chromeApps.chromeAppsStrings.fa
    - typings.chromeApps.chromeAppsStrings.fi
    - typings.chromeApps.chromeAppsStrings.fil
    - typings.chromeApps.chromeAppsStrings.fo
    - typings.chromeApps.chromeAppsStrings.fr
    - typings.chromeApps.chromeAppsStrings.`fr-CA`
    - typings.chromeApps.chromeAppsStrings.`fr-CH`
    - typings.chromeApps.chromeAppsStrings.`fr-FR`
    - typings.chromeApps.chromeAppsStrings.fy
    - typings.chromeApps.chromeAppsStrings.ga
    - typings.chromeApps.chromeAppsStrings.gd
    - typings.chromeApps.chromeAppsStrings.gl
    - typings.chromeApps.chromeAppsStrings.gn
    - typings.chromeApps.chromeAppsStrings.gu
    - typings.chromeApps.chromeAppsStrings.ha
    - typings.chromeApps.chromeAppsStrings.haw
    - typings.chromeApps.chromeAppsStrings.he
    - typings.chromeApps.chromeAppsStrings.hi
    - typings.chromeApps.chromeAppsStrings.hmn
    - typings.chromeApps.chromeAppsStrings.hr
    - typings.chromeApps.chromeAppsStrings.ht
    - typings.chromeApps.chromeAppsStrings.hu
    - typings.chromeApps.chromeAppsStrings.hy
    - typings.chromeApps.chromeAppsStrings.ia
    - typings.chromeApps.chromeAppsStrings.id
    - typings.chromeApps.chromeAppsStrings.ig
    - typings.chromeApps.chromeAppsStrings.is
    - typings.chromeApps.chromeAppsStrings.it
    - typings.chromeApps.chromeAppsStrings.`it-CH`
    - typings.chromeApps.chromeAppsStrings.`it-IT`
    - typings.chromeApps.chromeAppsStrings.ja
    - typings.chromeApps.chromeAppsStrings.jv
    - typings.chromeApps.chromeAppsStrings.ka
    - typings.chromeApps.chromeAppsStrings.kk
    - typings.chromeApps.chromeAppsStrings.km
    - typings.chromeApps.chromeAppsStrings.kn
    - typings.chromeApps.chromeAppsStrings.ko
    - typings.chromeApps.chromeAppsStrings.ku
    - typings.chromeApps.chromeAppsStrings.ky
    - typings.chromeApps.chromeAppsStrings.la
    - typings.chromeApps.chromeAppsStrings.lb
    - typings.chromeApps.chromeAppsStrings.ln
    - typings.chromeApps.chromeAppsStrings.lo
    - typings.chromeApps.chromeAppsStrings.lt
    - typings.chromeApps.chromeAppsStrings.lv
    - typings.chromeApps.chromeAppsStrings.mg
    - typings.chromeApps.chromeAppsStrings.mi
    - typings.chromeApps.chromeAppsStrings.mk
    - typings.chromeApps.chromeAppsStrings.ml
    - typings.chromeApps.chromeAppsStrings.mn
    - typings.chromeApps.chromeAppsStrings.mo
    - typings.chromeApps.chromeAppsStrings.mr
    - typings.chromeApps.chromeAppsStrings.ms
    - typings.chromeApps.chromeAppsStrings.mt
    - typings.chromeApps.chromeAppsStrings.my
    - typings.chromeApps.chromeAppsStrings.nb
    - typings.chromeApps.chromeAppsStrings.ne
    - typings.chromeApps.chromeAppsStrings.nl
    - typings.chromeApps.chromeAppsStrings.nn
    - typings.chromeApps.chromeAppsStrings.no
    - typings.chromeApps.chromeAppsStrings.ny
    - typings.chromeApps.chromeAppsStrings.oc
    - typings.chromeApps.chromeAppsStrings.om
    - typings.chromeApps.chromeAppsStrings.or
    - typings.chromeApps.chromeAppsStrings.pa
    - typings.chromeApps.chromeAppsStrings.pl
    - typings.chromeApps.chromeAppsStrings.ps
    - typings.chromeApps.chromeAppsStrings.pt
    - typings.chromeApps.chromeAppsStrings.`pt-BR`
    - typings.chromeApps.chromeAppsStrings.`pt-PT`
    - typings.chromeApps.chromeAppsStrings.qu
    - typings.chromeApps.chromeAppsStrings.rm
    - typings.chromeApps.chromeAppsStrings.ro
    - typings.chromeApps.chromeAppsStrings.ru
    - typings.chromeApps.chromeAppsStrings.sd
    - typings.chromeApps.chromeAppsStrings.sh
    - typings.chromeApps.chromeAppsStrings.si
    - typings.chromeApps.chromeAppsStrings.sk
    - typings.chromeApps.chromeAppsStrings.sl
    - typings.chromeApps.chromeAppsStrings.sm
    - typings.chromeApps.chromeAppsStrings.sn
    - typings.chromeApps.chromeAppsStrings.so
    - typings.chromeApps.chromeAppsStrings.sq
    - typings.chromeApps.chromeAppsStrings.sr
    - typings.chromeApps.chromeAppsStrings.st
    - typings.chromeApps.chromeAppsStrings.su
    - typings.chromeApps.chromeAppsStrings.sv
    - typings.chromeApps.chromeAppsStrings.sw
    - typings.chromeApps.chromeAppsStrings.ta
    - typings.chromeApps.chromeAppsStrings.te
    - typings.chromeApps.chromeAppsStrings.tg
    - typings.chromeApps.chromeAppsStrings.th
    - typings.chromeApps.chromeAppsStrings.ti
    - typings.chromeApps.chromeAppsStrings.tk
    - typings.chromeApps.chromeAppsStrings.to
    - typings.chromeApps.chromeAppsStrings.tr
    - typings.chromeApps.chromeAppsStrings.tt
    - typings.chromeApps.chromeAppsStrings.tw
    - typings.chromeApps.chromeAppsStrings.ug
    - typings.chromeApps.chromeAppsStrings.uk
    - typings.chromeApps.chromeAppsStrings.ur
    - typings.chromeApps.chromeAppsStrings.uz
    - typings.chromeApps.chromeAppsStrings.vi
    - typings.chromeApps.chromeAppsStrings.wa
    - typings.chromeApps.chromeAppsStrings.xh
    - typings.chromeApps.chromeAppsStrings.yi
    - typings.chromeApps.chromeAppsStrings.yo
    - typings.chromeApps.chromeAppsStrings.zh
    - typings.chromeApps.chromeAppsStrings.`zh-CN`
    - typings.chromeApps.chromeAppsStrings.`zh-HK`
    - typings.chromeApps.chromeAppsStrings.`zh-TW`
    - typings.chromeApps.chromeAppsStrings.zu
    - typings.chromeApps.chromeAppsStrings.ar_001
    - typings.chromeApps.chromeAppsStrings.en_001
    - typings.chromeApps.chromeAppsStrings.en_150
    - typings.chromeApps.chromeAppsStrings.zh_hans_cn
    - typings.chromeApps.chromeAppsStrings.zh_hant_hk
    - typings.chromeApps.chromeAppsStrings.zh_hant_mo
    - typings.chromeApps.chromeAppsStrings.zh_hans_sg
    - typings.chromeApps.chromeAppsStrings.zh_hant_tw
  */
  trait LanguageCode extends StObject
  object LanguageCode {
    
    inline def af: typings.chromeApps.chromeAppsStrings.af = "af".asInstanceOf[typings.chromeApps.chromeAppsStrings.af]
    
    inline def am: typings.chromeApps.chromeAppsStrings.am = "am".asInstanceOf[typings.chromeApps.chromeAppsStrings.am]
    
    inline def an: typings.chromeApps.chromeAppsStrings.an = "an".asInstanceOf[typings.chromeApps.chromeAppsStrings.an]
    
    inline def ar: typings.chromeApps.chromeAppsStrings.ar = "ar".asInstanceOf[typings.chromeApps.chromeAppsStrings.ar]
    
    inline def ar_001: typings.chromeApps.chromeAppsStrings.ar_001 = "ar_001".asInstanceOf[typings.chromeApps.chromeAppsStrings.ar_001]
    
    inline def ast: typings.chromeApps.chromeAppsStrings.ast = "ast".asInstanceOf[typings.chromeApps.chromeAppsStrings.ast]
    
    inline def az: typings.chromeApps.chromeAppsStrings.az = "az".asInstanceOf[typings.chromeApps.chromeAppsStrings.az]
    
    inline def be: typings.chromeApps.chromeAppsStrings.be = "be".asInstanceOf[typings.chromeApps.chromeAppsStrings.be]
    
    inline def bg: typings.chromeApps.chromeAppsStrings.bg = "bg".asInstanceOf[typings.chromeApps.chromeAppsStrings.bg]
    
    inline def bh: typings.chromeApps.chromeAppsStrings.bh = "bh".asInstanceOf[typings.chromeApps.chromeAppsStrings.bh]
    
    inline def bn: typings.chromeApps.chromeAppsStrings.bn = "bn".asInstanceOf[typings.chromeApps.chromeAppsStrings.bn]
    
    inline def br: typings.chromeApps.chromeAppsStrings.br = "br".asInstanceOf[typings.chromeApps.chromeAppsStrings.br]
    
    inline def bs: typings.chromeApps.chromeAppsStrings.bs = "bs".asInstanceOf[typings.chromeApps.chromeAppsStrings.bs]
    
    inline def ca: typings.chromeApps.chromeAppsStrings.ca = "ca".asInstanceOf[typings.chromeApps.chromeAppsStrings.ca]
    
    inline def ceb: typings.chromeApps.chromeAppsStrings.ceb = "ceb".asInstanceOf[typings.chromeApps.chromeAppsStrings.ceb]
    
    inline def ckb: typings.chromeApps.chromeAppsStrings.ckb = "ckb".asInstanceOf[typings.chromeApps.chromeAppsStrings.ckb]
    
    inline def co: typings.chromeApps.chromeAppsStrings.co = "co".asInstanceOf[typings.chromeApps.chromeAppsStrings.co]
    
    inline def cs: typings.chromeApps.chromeAppsStrings.cs = "cs".asInstanceOf[typings.chromeApps.chromeAppsStrings.cs]
    
    inline def cy: typings.chromeApps.chromeAppsStrings.cy = "cy".asInstanceOf[typings.chromeApps.chromeAppsStrings.cy]
    
    inline def da: typings.chromeApps.chromeAppsStrings.da = "da".asInstanceOf[typings.chromeApps.chromeAppsStrings.da]
    
    inline def de: typings.chromeApps.chromeAppsStrings.de = "de".asInstanceOf[typings.chromeApps.chromeAppsStrings.de]
    
    inline def `de-AT`: typings.chromeApps.chromeAppsStrings.`de-AT` = "de-AT".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-AT`]
    
    inline def `de-CH`: typings.chromeApps.chromeAppsStrings.`de-CH` = "de-CH".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-CH`]
    
    inline def `de-DE`: typings.chromeApps.chromeAppsStrings.`de-DE` = "de-DE".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-DE`]
    
    inline def `de-LI`: typings.chromeApps.chromeAppsStrings.`de-LI` = "de-LI".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-LI`]
    
    inline def el: typings.chromeApps.chromeAppsStrings.el = "el".asInstanceOf[typings.chromeApps.chromeAppsStrings.el]
    
    inline def en: typings.chromeApps.chromeAppsStrings.en = "en".asInstanceOf[typings.chromeApps.chromeAppsStrings.en]
    
    inline def `en-AU`: typings.chromeApps.chromeAppsStrings.`en-AU` = "en-AU".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-AU`]
    
    inline def `en-CA`: typings.chromeApps.chromeAppsStrings.`en-CA` = "en-CA".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-CA`]
    
    inline def `en-GB`: typings.chromeApps.chromeAppsStrings.`en-GB` = "en-GB".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-GB`]
    
    inline def `en-IN`: typings.chromeApps.chromeAppsStrings.`en-IN` = "en-IN".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-IN`]
    
    inline def `en-NZ`: typings.chromeApps.chromeAppsStrings.`en-NZ` = "en-NZ".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-NZ`]
    
    inline def `en-US`: typings.chromeApps.chromeAppsStrings.`en-US` = "en-US".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-US`]
    
    inline def `en-ZA`: typings.chromeApps.chromeAppsStrings.`en-ZA` = "en-ZA".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-ZA`]
    
    inline def en_001: typings.chromeApps.chromeAppsStrings.en_001 = "en_001".asInstanceOf[typings.chromeApps.chromeAppsStrings.en_001]
    
    inline def en_150: typings.chromeApps.chromeAppsStrings.en_150 = "en_150".asInstanceOf[typings.chromeApps.chromeAppsStrings.en_150]
    
    inline def eo: typings.chromeApps.chromeAppsStrings.eo = "eo".asInstanceOf[typings.chromeApps.chromeAppsStrings.eo]
    
    inline def es: typings.chromeApps.chromeAppsStrings.es = "es".asInstanceOf[typings.chromeApps.chromeAppsStrings.es]
    
    inline def `es-419`: typings.chromeApps.chromeAppsStrings.`es-419` = "es-419".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-419`]
    
    inline def `es-AR`: typings.chromeApps.chromeAppsStrings.`es-AR` = "es-AR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-AR`]
    
    inline def `es-CL`: typings.chromeApps.chromeAppsStrings.`es-CL` = "es-CL".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-CL`]
    
    inline def `es-CO`: typings.chromeApps.chromeAppsStrings.`es-CO` = "es-CO".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-CO`]
    
    inline def `es-CR`: typings.chromeApps.chromeAppsStrings.`es-CR` = "es-CR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-CR`]
    
    inline def `es-ES`: typings.chromeApps.chromeAppsStrings.`es-ES` = "es-ES".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-ES`]
    
    inline def `es-HN`: typings.chromeApps.chromeAppsStrings.`es-HN` = "es-HN".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-HN`]
    
    inline def `es-MX`: typings.chromeApps.chromeAppsStrings.`es-MX` = "es-MX".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-MX`]
    
    inline def `es-PE`: typings.chromeApps.chromeAppsStrings.`es-PE` = "es-PE".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-PE`]
    
    inline def `es-US`: typings.chromeApps.chromeAppsStrings.`es-US` = "es-US".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-US`]
    
    inline def `es-UY`: typings.chromeApps.chromeAppsStrings.`es-UY` = "es-UY".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-UY`]
    
    inline def `es-VE`: typings.chromeApps.chromeAppsStrings.`es-VE` = "es-VE".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-VE`]
    
    inline def et: typings.chromeApps.chromeAppsStrings.et = "et".asInstanceOf[typings.chromeApps.chromeAppsStrings.et]
    
    inline def eu: typings.chromeApps.chromeAppsStrings.eu = "eu".asInstanceOf[typings.chromeApps.chromeAppsStrings.eu]
    
    inline def fa: typings.chromeApps.chromeAppsStrings.fa = "fa".asInstanceOf[typings.chromeApps.chromeAppsStrings.fa]
    
    inline def fi: typings.chromeApps.chromeAppsStrings.fi = "fi".asInstanceOf[typings.chromeApps.chromeAppsStrings.fi]
    
    inline def fil: typings.chromeApps.chromeAppsStrings.fil = "fil".asInstanceOf[typings.chromeApps.chromeAppsStrings.fil]
    
    inline def fo: typings.chromeApps.chromeAppsStrings.fo = "fo".asInstanceOf[typings.chromeApps.chromeAppsStrings.fo]
    
    inline def fr: typings.chromeApps.chromeAppsStrings.fr = "fr".asInstanceOf[typings.chromeApps.chromeAppsStrings.fr]
    
    inline def `fr-CA`: typings.chromeApps.chromeAppsStrings.`fr-CA` = "fr-CA".asInstanceOf[typings.chromeApps.chromeAppsStrings.`fr-CA`]
    
    inline def `fr-CH`: typings.chromeApps.chromeAppsStrings.`fr-CH` = "fr-CH".asInstanceOf[typings.chromeApps.chromeAppsStrings.`fr-CH`]
    
    inline def `fr-FR`: typings.chromeApps.chromeAppsStrings.`fr-FR` = "fr-FR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`fr-FR`]
    
    inline def fy: typings.chromeApps.chromeAppsStrings.fy = "fy".asInstanceOf[typings.chromeApps.chromeAppsStrings.fy]
    
    inline def ga: typings.chromeApps.chromeAppsStrings.ga = "ga".asInstanceOf[typings.chromeApps.chromeAppsStrings.ga]
    
    inline def gd: typings.chromeApps.chromeAppsStrings.gd = "gd".asInstanceOf[typings.chromeApps.chromeAppsStrings.gd]
    
    inline def gl: typings.chromeApps.chromeAppsStrings.gl = "gl".asInstanceOf[typings.chromeApps.chromeAppsStrings.gl]
    
    inline def gn: typings.chromeApps.chromeAppsStrings.gn = "gn".asInstanceOf[typings.chromeApps.chromeAppsStrings.gn]
    
    inline def gu: typings.chromeApps.chromeAppsStrings.gu = "gu".asInstanceOf[typings.chromeApps.chromeAppsStrings.gu]
    
    inline def ha: typings.chromeApps.chromeAppsStrings.ha = "ha".asInstanceOf[typings.chromeApps.chromeAppsStrings.ha]
    
    inline def haw: typings.chromeApps.chromeAppsStrings.haw = "haw".asInstanceOf[typings.chromeApps.chromeAppsStrings.haw]
    
    inline def he: typings.chromeApps.chromeAppsStrings.he = "he".asInstanceOf[typings.chromeApps.chromeAppsStrings.he]
    
    inline def hi: typings.chromeApps.chromeAppsStrings.hi = "hi".asInstanceOf[typings.chromeApps.chromeAppsStrings.hi]
    
    inline def hmn: typings.chromeApps.chromeAppsStrings.hmn = "hmn".asInstanceOf[typings.chromeApps.chromeAppsStrings.hmn]
    
    inline def hr: typings.chromeApps.chromeAppsStrings.hr = "hr".asInstanceOf[typings.chromeApps.chromeAppsStrings.hr]
    
    inline def ht: typings.chromeApps.chromeAppsStrings.ht = "ht".asInstanceOf[typings.chromeApps.chromeAppsStrings.ht]
    
    inline def hu: typings.chromeApps.chromeAppsStrings.hu = "hu".asInstanceOf[typings.chromeApps.chromeAppsStrings.hu]
    
    inline def hy: typings.chromeApps.chromeAppsStrings.hy = "hy".asInstanceOf[typings.chromeApps.chromeAppsStrings.hy]
    
    inline def ia: typings.chromeApps.chromeAppsStrings.ia = "ia".asInstanceOf[typings.chromeApps.chromeAppsStrings.ia]
    
    inline def id: typings.chromeApps.chromeAppsStrings.id = "id".asInstanceOf[typings.chromeApps.chromeAppsStrings.id]
    
    inline def ig: typings.chromeApps.chromeAppsStrings.ig = "ig".asInstanceOf[typings.chromeApps.chromeAppsStrings.ig]
    
    inline def is: typings.chromeApps.chromeAppsStrings.is = "is".asInstanceOf[typings.chromeApps.chromeAppsStrings.is]
    
    inline def it: typings.chromeApps.chromeAppsStrings.it = "it".asInstanceOf[typings.chromeApps.chromeAppsStrings.it]
    
    inline def `it-CH`: typings.chromeApps.chromeAppsStrings.`it-CH` = "it-CH".asInstanceOf[typings.chromeApps.chromeAppsStrings.`it-CH`]
    
    inline def `it-IT`: typings.chromeApps.chromeAppsStrings.`it-IT` = "it-IT".asInstanceOf[typings.chromeApps.chromeAppsStrings.`it-IT`]
    
    inline def ja: typings.chromeApps.chromeAppsStrings.ja = "ja".asInstanceOf[typings.chromeApps.chromeAppsStrings.ja]
    
    inline def jv: typings.chromeApps.chromeAppsStrings.jv = "jv".asInstanceOf[typings.chromeApps.chromeAppsStrings.jv]
    
    inline def ka: typings.chromeApps.chromeAppsStrings.ka = "ka".asInstanceOf[typings.chromeApps.chromeAppsStrings.ka]
    
    inline def kk: typings.chromeApps.chromeAppsStrings.kk = "kk".asInstanceOf[typings.chromeApps.chromeAppsStrings.kk]
    
    inline def km: typings.chromeApps.chromeAppsStrings.km = "km".asInstanceOf[typings.chromeApps.chromeAppsStrings.km]
    
    inline def kn: typings.chromeApps.chromeAppsStrings.kn = "kn".asInstanceOf[typings.chromeApps.chromeAppsStrings.kn]
    
    inline def ko: typings.chromeApps.chromeAppsStrings.ko = "ko".asInstanceOf[typings.chromeApps.chromeAppsStrings.ko]
    
    inline def ku: typings.chromeApps.chromeAppsStrings.ku = "ku".asInstanceOf[typings.chromeApps.chromeAppsStrings.ku]
    
    inline def ky: typings.chromeApps.chromeAppsStrings.ky = "ky".asInstanceOf[typings.chromeApps.chromeAppsStrings.ky]
    
    inline def la: typings.chromeApps.chromeAppsStrings.la = "la".asInstanceOf[typings.chromeApps.chromeAppsStrings.la]
    
    inline def lb: typings.chromeApps.chromeAppsStrings.lb = "lb".asInstanceOf[typings.chromeApps.chromeAppsStrings.lb]
    
    inline def ln: typings.chromeApps.chromeAppsStrings.ln = "ln".asInstanceOf[typings.chromeApps.chromeAppsStrings.ln]
    
    inline def lo: typings.chromeApps.chromeAppsStrings.lo = "lo".asInstanceOf[typings.chromeApps.chromeAppsStrings.lo]
    
    inline def lt: typings.chromeApps.chromeAppsStrings.lt = "lt".asInstanceOf[typings.chromeApps.chromeAppsStrings.lt]
    
    inline def lv: typings.chromeApps.chromeAppsStrings.lv = "lv".asInstanceOf[typings.chromeApps.chromeAppsStrings.lv]
    
    inline def mg: typings.chromeApps.chromeAppsStrings.mg = "mg".asInstanceOf[typings.chromeApps.chromeAppsStrings.mg]
    
    inline def mi: typings.chromeApps.chromeAppsStrings.mi = "mi".asInstanceOf[typings.chromeApps.chromeAppsStrings.mi]
    
    inline def mk: typings.chromeApps.chromeAppsStrings.mk = "mk".asInstanceOf[typings.chromeApps.chromeAppsStrings.mk]
    
    inline def ml: typings.chromeApps.chromeAppsStrings.ml = "ml".asInstanceOf[typings.chromeApps.chromeAppsStrings.ml]
    
    inline def mn: typings.chromeApps.chromeAppsStrings.mn = "mn".asInstanceOf[typings.chromeApps.chromeAppsStrings.mn]
    
    inline def mo: typings.chromeApps.chromeAppsStrings.mo = "mo".asInstanceOf[typings.chromeApps.chromeAppsStrings.mo]
    
    inline def mr: typings.chromeApps.chromeAppsStrings.mr = "mr".asInstanceOf[typings.chromeApps.chromeAppsStrings.mr]
    
    inline def ms: typings.chromeApps.chromeAppsStrings.ms = "ms".asInstanceOf[typings.chromeApps.chromeAppsStrings.ms]
    
    inline def mt: typings.chromeApps.chromeAppsStrings.mt = "mt".asInstanceOf[typings.chromeApps.chromeAppsStrings.mt]
    
    inline def my: typings.chromeApps.chromeAppsStrings.my = "my".asInstanceOf[typings.chromeApps.chromeAppsStrings.my]
    
    inline def nb: typings.chromeApps.chromeAppsStrings.nb = "nb".asInstanceOf[typings.chromeApps.chromeAppsStrings.nb]
    
    inline def ne: typings.chromeApps.chromeAppsStrings.ne = "ne".asInstanceOf[typings.chromeApps.chromeAppsStrings.ne]
    
    inline def nl: typings.chromeApps.chromeAppsStrings.nl = "nl".asInstanceOf[typings.chromeApps.chromeAppsStrings.nl]
    
    inline def nn: typings.chromeApps.chromeAppsStrings.nn = "nn".asInstanceOf[typings.chromeApps.chromeAppsStrings.nn]
    
    inline def no: typings.chromeApps.chromeAppsStrings.no = "no".asInstanceOf[typings.chromeApps.chromeAppsStrings.no]
    
    inline def ny: typings.chromeApps.chromeAppsStrings.ny = "ny".asInstanceOf[typings.chromeApps.chromeAppsStrings.ny]
    
    inline def oc: typings.chromeApps.chromeAppsStrings.oc = "oc".asInstanceOf[typings.chromeApps.chromeAppsStrings.oc]
    
    inline def om: typings.chromeApps.chromeAppsStrings.om = "om".asInstanceOf[typings.chromeApps.chromeAppsStrings.om]
    
    inline def or: typings.chromeApps.chromeAppsStrings.or = "or".asInstanceOf[typings.chromeApps.chromeAppsStrings.or]
    
    inline def pa: typings.chromeApps.chromeAppsStrings.pa = "pa".asInstanceOf[typings.chromeApps.chromeAppsStrings.pa]
    
    inline def pl: typings.chromeApps.chromeAppsStrings.pl = "pl".asInstanceOf[typings.chromeApps.chromeAppsStrings.pl]
    
    inline def ps: typings.chromeApps.chromeAppsStrings.ps = "ps".asInstanceOf[typings.chromeApps.chromeAppsStrings.ps]
    
    inline def pt: typings.chromeApps.chromeAppsStrings.pt = "pt".asInstanceOf[typings.chromeApps.chromeAppsStrings.pt]
    
    inline def `pt-BR`: typings.chromeApps.chromeAppsStrings.`pt-BR` = "pt-BR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`pt-BR`]
    
    inline def `pt-PT`: typings.chromeApps.chromeAppsStrings.`pt-PT` = "pt-PT".asInstanceOf[typings.chromeApps.chromeAppsStrings.`pt-PT`]
    
    inline def qu: typings.chromeApps.chromeAppsStrings.qu = "qu".asInstanceOf[typings.chromeApps.chromeAppsStrings.qu]
    
    inline def rm: typings.chromeApps.chromeAppsStrings.rm = "rm".asInstanceOf[typings.chromeApps.chromeAppsStrings.rm]
    
    inline def ro: typings.chromeApps.chromeAppsStrings.ro = "ro".asInstanceOf[typings.chromeApps.chromeAppsStrings.ro]
    
    inline def ru: typings.chromeApps.chromeAppsStrings.ru = "ru".asInstanceOf[typings.chromeApps.chromeAppsStrings.ru]
    
    inline def sd: typings.chromeApps.chromeAppsStrings.sd = "sd".asInstanceOf[typings.chromeApps.chromeAppsStrings.sd]
    
    inline def sh: typings.chromeApps.chromeAppsStrings.sh = "sh".asInstanceOf[typings.chromeApps.chromeAppsStrings.sh]
    
    inline def si: typings.chromeApps.chromeAppsStrings.si = "si".asInstanceOf[typings.chromeApps.chromeAppsStrings.si]
    
    inline def sk: typings.chromeApps.chromeAppsStrings.sk = "sk".asInstanceOf[typings.chromeApps.chromeAppsStrings.sk]
    
    inline def sl: typings.chromeApps.chromeAppsStrings.sl = "sl".asInstanceOf[typings.chromeApps.chromeAppsStrings.sl]
    
    inline def sm: typings.chromeApps.chromeAppsStrings.sm = "sm".asInstanceOf[typings.chromeApps.chromeAppsStrings.sm]
    
    inline def sn: typings.chromeApps.chromeAppsStrings.sn = "sn".asInstanceOf[typings.chromeApps.chromeAppsStrings.sn]
    
    inline def so: typings.chromeApps.chromeAppsStrings.so = "so".asInstanceOf[typings.chromeApps.chromeAppsStrings.so]
    
    inline def sq: typings.chromeApps.chromeAppsStrings.sq = "sq".asInstanceOf[typings.chromeApps.chromeAppsStrings.sq]
    
    inline def sr: typings.chromeApps.chromeAppsStrings.sr = "sr".asInstanceOf[typings.chromeApps.chromeAppsStrings.sr]
    
    inline def st: typings.chromeApps.chromeAppsStrings.st = "st".asInstanceOf[typings.chromeApps.chromeAppsStrings.st]
    
    inline def su: typings.chromeApps.chromeAppsStrings.su = "su".asInstanceOf[typings.chromeApps.chromeAppsStrings.su]
    
    inline def sv: typings.chromeApps.chromeAppsStrings.sv = "sv".asInstanceOf[typings.chromeApps.chromeAppsStrings.sv]
    
    inline def sw: typings.chromeApps.chromeAppsStrings.sw = "sw".asInstanceOf[typings.chromeApps.chromeAppsStrings.sw]
    
    inline def ta: typings.chromeApps.chromeAppsStrings.ta = "ta".asInstanceOf[typings.chromeApps.chromeAppsStrings.ta]
    
    inline def te: typings.chromeApps.chromeAppsStrings.te = "te".asInstanceOf[typings.chromeApps.chromeAppsStrings.te]
    
    inline def tg: typings.chromeApps.chromeAppsStrings.tg = "tg".asInstanceOf[typings.chromeApps.chromeAppsStrings.tg]
    
    inline def th: typings.chromeApps.chromeAppsStrings.th = "th".asInstanceOf[typings.chromeApps.chromeAppsStrings.th]
    
    inline def ti: typings.chromeApps.chromeAppsStrings.ti = "ti".asInstanceOf[typings.chromeApps.chromeAppsStrings.ti]
    
    inline def tk: typings.chromeApps.chromeAppsStrings.tk = "tk".asInstanceOf[typings.chromeApps.chromeAppsStrings.tk]
    
    inline def to: typings.chromeApps.chromeAppsStrings.to = "to".asInstanceOf[typings.chromeApps.chromeAppsStrings.to]
    
    inline def tr: typings.chromeApps.chromeAppsStrings.tr = "tr".asInstanceOf[typings.chromeApps.chromeAppsStrings.tr]
    
    inline def tt: typings.chromeApps.chromeAppsStrings.tt = "tt".asInstanceOf[typings.chromeApps.chromeAppsStrings.tt]
    
    inline def tw: typings.chromeApps.chromeAppsStrings.tw = "tw".asInstanceOf[typings.chromeApps.chromeAppsStrings.tw]
    
    inline def ug: typings.chromeApps.chromeAppsStrings.ug = "ug".asInstanceOf[typings.chromeApps.chromeAppsStrings.ug]
    
    inline def uk: typings.chromeApps.chromeAppsStrings.uk = "uk".asInstanceOf[typings.chromeApps.chromeAppsStrings.uk]
    
    inline def und: typings.chromeApps.chromeAppsStrings.und = "und".asInstanceOf[typings.chromeApps.chromeAppsStrings.und]
    
    inline def ur: typings.chromeApps.chromeAppsStrings.ur = "ur".asInstanceOf[typings.chromeApps.chromeAppsStrings.ur]
    
    inline def uz: typings.chromeApps.chromeAppsStrings.uz = "uz".asInstanceOf[typings.chromeApps.chromeAppsStrings.uz]
    
    inline def vi: typings.chromeApps.chromeAppsStrings.vi = "vi".asInstanceOf[typings.chromeApps.chromeAppsStrings.vi]
    
    inline def wa: typings.chromeApps.chromeAppsStrings.wa = "wa".asInstanceOf[typings.chromeApps.chromeAppsStrings.wa]
    
    inline def xh: typings.chromeApps.chromeAppsStrings.xh = "xh".asInstanceOf[typings.chromeApps.chromeAppsStrings.xh]
    
    inline def yi: typings.chromeApps.chromeAppsStrings.yi = "yi".asInstanceOf[typings.chromeApps.chromeAppsStrings.yi]
    
    inline def yo: typings.chromeApps.chromeAppsStrings.yo = "yo".asInstanceOf[typings.chromeApps.chromeAppsStrings.yo]
    
    inline def zh: typings.chromeApps.chromeAppsStrings.zh = "zh".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh]
    
    inline def `zh-CN`: typings.chromeApps.chromeAppsStrings.`zh-CN` = "zh-CN".asInstanceOf[typings.chromeApps.chromeAppsStrings.`zh-CN`]
    
    inline def `zh-HK`: typings.chromeApps.chromeAppsStrings.`zh-HK` = "zh-HK".asInstanceOf[typings.chromeApps.chromeAppsStrings.`zh-HK`]
    
    inline def `zh-TW`: typings.chromeApps.chromeAppsStrings.`zh-TW` = "zh-TW".asInstanceOf[typings.chromeApps.chromeAppsStrings.`zh-TW`]
    
    inline def zh_hans_cn: typings.chromeApps.chromeAppsStrings.zh_hans_cn = "zh_hans_cn".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hans_cn]
    
    inline def zh_hans_sg: typings.chromeApps.chromeAppsStrings.zh_hans_sg = "zh_hans_sg".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hans_sg]
    
    inline def zh_hant_hk: typings.chromeApps.chromeAppsStrings.zh_hant_hk = "zh_hant_hk".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hant_hk]
    
    inline def zh_hant_mo: typings.chromeApps.chromeAppsStrings.zh_hant_mo = "zh_hant_mo".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hant_mo]
    
    inline def zh_hant_tw: typings.chromeApps.chromeAppsStrings.zh_hant_tw = "zh_hant_tw".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hant_tw]
    
    inline def zu: typings.chromeApps.chromeAppsStrings.zu = "zu".asInstanceOf[typings.chromeApps.chromeAppsStrings.zu]
  }
  
  /** Holds detected language reliability and array of DetectedLanguage */
  trait LanguageDetectionResult extends StObject {
    
    /** CLD detected language reliability */
    var isReliable: Boolean
    
    /** Array of DetectedLanguage */
    var languages: js.Array[DetectedLanguage]
  }
  object LanguageDetectionResult {
    
    inline def apply(isReliable: Boolean, languages: js.Array[DetectedLanguage]): LanguageDetectionResult = {
      val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageDetectionResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LanguageDetectionResult] (val x: Self) extends AnyVal {
      
      inline def setIsReliable(value: Boolean): Self = StObject.set(x, "isReliable", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: js.Array[DetectedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: DetectedLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
    }
  }
  
  /** Allow array of strings with length 1 to 9 */
  type StringSubstitutions = js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String]) | (js.Tuple5[String, String, String, String, String]) | (js.Tuple6[String, String, String, String, String, String]) | (js.Tuple7[String, String, String, String, String, String, String]) | (js.Tuple8[String, String, String, String, String, String, String, String]) | (js.Tuple9[String, String, String, String, String, String, String, String, String])
  
  /**
    * @see[Source]{@link https://github.com/chromium/chromium/blob/master/ui/base/l10n/l10n_util.cc}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.af
    - typings.chromeApps.chromeAppsStrings.am
    - typings.chromeApps.chromeAppsStrings.an
    - typings.chromeApps.chromeAppsStrings.ar
    - typings.chromeApps.chromeAppsStrings.ast
    - typings.chromeApps.chromeAppsStrings.az
    - typings.chromeApps.chromeAppsStrings.be
    - typings.chromeApps.chromeAppsStrings.bg
    - typings.chromeApps.chromeAppsStrings.bh
    - typings.chromeApps.chromeAppsStrings.bn
    - typings.chromeApps.chromeAppsStrings.br
    - typings.chromeApps.chromeAppsStrings.bs
    - typings.chromeApps.chromeAppsStrings.ca
    - typings.chromeApps.chromeAppsStrings.ceb
    - typings.chromeApps.chromeAppsStrings.ckb
    - typings.chromeApps.chromeAppsStrings.co
    - typings.chromeApps.chromeAppsStrings.cs
    - typings.chromeApps.chromeAppsStrings.cy
    - typings.chromeApps.chromeAppsStrings.da
    - typings.chromeApps.chromeAppsStrings.de
    - typings.chromeApps.chromeAppsStrings.`de-AT`
    - typings.chromeApps.chromeAppsStrings.`de-CH`
    - typings.chromeApps.chromeAppsStrings.`de-DE`
    - typings.chromeApps.chromeAppsStrings.`de-LI`
    - typings.chromeApps.chromeAppsStrings.el
    - typings.chromeApps.chromeAppsStrings.en
    - typings.chromeApps.chromeAppsStrings.`en-AU`
    - typings.chromeApps.chromeAppsStrings.`en-CA`
    - typings.chromeApps.chromeAppsStrings.`en-GB`
    - typings.chromeApps.chromeAppsStrings.`en-IN`
    - typings.chromeApps.chromeAppsStrings.`en-NZ`
    - typings.chromeApps.chromeAppsStrings.`en-US`
    - typings.chromeApps.chromeAppsStrings.`en-ZA`
    - typings.chromeApps.chromeAppsStrings.eo
    - typings.chromeApps.chromeAppsStrings.es
    - typings.chromeApps.chromeAppsStrings.`es-419`
    - typings.chromeApps.chromeAppsStrings.`es-AR`
    - typings.chromeApps.chromeAppsStrings.`es-CL`
    - typings.chromeApps.chromeAppsStrings.`es-CO`
    - typings.chromeApps.chromeAppsStrings.`es-CR`
    - typings.chromeApps.chromeAppsStrings.`es-ES`
    - typings.chromeApps.chromeAppsStrings.`es-HN`
    - typings.chromeApps.chromeAppsStrings.`es-MX`
    - typings.chromeApps.chromeAppsStrings.`es-PE`
    - typings.chromeApps.chromeAppsStrings.`es-US`
    - typings.chromeApps.chromeAppsStrings.`es-UY`
    - typings.chromeApps.chromeAppsStrings.`es-VE`
    - typings.chromeApps.chromeAppsStrings.et
    - typings.chromeApps.chromeAppsStrings.eu
    - typings.chromeApps.chromeAppsStrings.fa
    - typings.chromeApps.chromeAppsStrings.fi
    - typings.chromeApps.chromeAppsStrings.fil
    - typings.chromeApps.chromeAppsStrings.fo
    - typings.chromeApps.chromeAppsStrings.fr
    - typings.chromeApps.chromeAppsStrings.`fr-CA`
    - typings.chromeApps.chromeAppsStrings.`fr-CH`
    - typings.chromeApps.chromeAppsStrings.`fr-FR`
    - typings.chromeApps.chromeAppsStrings.fy
    - typings.chromeApps.chromeAppsStrings.ga
    - typings.chromeApps.chromeAppsStrings.gd
    - typings.chromeApps.chromeAppsStrings.gl
    - typings.chromeApps.chromeAppsStrings.gn
    - typings.chromeApps.chromeAppsStrings.gu
    - typings.chromeApps.chromeAppsStrings.ha
    - typings.chromeApps.chromeAppsStrings.haw
    - typings.chromeApps.chromeAppsStrings.he
    - typings.chromeApps.chromeAppsStrings.hi
    - typings.chromeApps.chromeAppsStrings.hmn
    - typings.chromeApps.chromeAppsStrings.hr
    - typings.chromeApps.chromeAppsStrings.ht
    - typings.chromeApps.chromeAppsStrings.hu
    - typings.chromeApps.chromeAppsStrings.hy
    - typings.chromeApps.chromeAppsStrings.ia
    - typings.chromeApps.chromeAppsStrings.id
    - typings.chromeApps.chromeAppsStrings.ig
    - typings.chromeApps.chromeAppsStrings.is
    - typings.chromeApps.chromeAppsStrings.it
    - typings.chromeApps.chromeAppsStrings.`it-CH`
    - typings.chromeApps.chromeAppsStrings.`it-IT`
    - typings.chromeApps.chromeAppsStrings.ja
    - typings.chromeApps.chromeAppsStrings.jv
    - typings.chromeApps.chromeAppsStrings.ka
    - typings.chromeApps.chromeAppsStrings.kk
    - typings.chromeApps.chromeAppsStrings.km
    - typings.chromeApps.chromeAppsStrings.kn
    - typings.chromeApps.chromeAppsStrings.ko
    - typings.chromeApps.chromeAppsStrings.ku
    - typings.chromeApps.chromeAppsStrings.ky
    - typings.chromeApps.chromeAppsStrings.la
    - typings.chromeApps.chromeAppsStrings.lb
    - typings.chromeApps.chromeAppsStrings.ln
    - typings.chromeApps.chromeAppsStrings.lo
    - typings.chromeApps.chromeAppsStrings.lt
    - typings.chromeApps.chromeAppsStrings.lv
    - typings.chromeApps.chromeAppsStrings.mg
    - typings.chromeApps.chromeAppsStrings.mi
    - typings.chromeApps.chromeAppsStrings.mk
    - typings.chromeApps.chromeAppsStrings.ml
    - typings.chromeApps.chromeAppsStrings.mn
    - typings.chromeApps.chromeAppsStrings.mo
    - typings.chromeApps.chromeAppsStrings.mr
    - typings.chromeApps.chromeAppsStrings.ms
    - typings.chromeApps.chromeAppsStrings.mt
    - typings.chromeApps.chromeAppsStrings.my
    - typings.chromeApps.chromeAppsStrings.nb
    - typings.chromeApps.chromeAppsStrings.ne
    - typings.chromeApps.chromeAppsStrings.nl
    - typings.chromeApps.chromeAppsStrings.nn
    - typings.chromeApps.chromeAppsStrings.no
    - typings.chromeApps.chromeAppsStrings.ny
    - typings.chromeApps.chromeAppsStrings.oc
    - typings.chromeApps.chromeAppsStrings.om
    - typings.chromeApps.chromeAppsStrings.or
    - typings.chromeApps.chromeAppsStrings.pa
    - typings.chromeApps.chromeAppsStrings.pl
    - typings.chromeApps.chromeAppsStrings.ps
    - typings.chromeApps.chromeAppsStrings.pt
    - typings.chromeApps.chromeAppsStrings.`pt-BR`
    - typings.chromeApps.chromeAppsStrings.`pt-PT`
    - typings.chromeApps.chromeAppsStrings.qu
    - typings.chromeApps.chromeAppsStrings.rm
    - typings.chromeApps.chromeAppsStrings.ro
    - typings.chromeApps.chromeAppsStrings.ru
    - typings.chromeApps.chromeAppsStrings.sd
    - typings.chromeApps.chromeAppsStrings.sh
    - typings.chromeApps.chromeAppsStrings.si
    - typings.chromeApps.chromeAppsStrings.sk
    - typings.chromeApps.chromeAppsStrings.sl
    - typings.chromeApps.chromeAppsStrings.sm
    - typings.chromeApps.chromeAppsStrings.sn
    - typings.chromeApps.chromeAppsStrings.so
    - typings.chromeApps.chromeAppsStrings.sq
    - typings.chromeApps.chromeAppsStrings.sr
    - typings.chromeApps.chromeAppsStrings.st
    - typings.chromeApps.chromeAppsStrings.su
    - typings.chromeApps.chromeAppsStrings.sv
    - typings.chromeApps.chromeAppsStrings.sw
    - typings.chromeApps.chromeAppsStrings.ta
    - typings.chromeApps.chromeAppsStrings.te
    - typings.chromeApps.chromeAppsStrings.tg
    - typings.chromeApps.chromeAppsStrings.th
    - typings.chromeApps.chromeAppsStrings.ti
    - typings.chromeApps.chromeAppsStrings.tk
    - typings.chromeApps.chromeAppsStrings.to
    - typings.chromeApps.chromeAppsStrings.tr
    - typings.chromeApps.chromeAppsStrings.tt
    - typings.chromeApps.chromeAppsStrings.tw
    - typings.chromeApps.chromeAppsStrings.ug
    - typings.chromeApps.chromeAppsStrings.uk
    - typings.chromeApps.chromeAppsStrings.ur
    - typings.chromeApps.chromeAppsStrings.uz
    - typings.chromeApps.chromeAppsStrings.vi
    - typings.chromeApps.chromeAppsStrings.wa
    - typings.chromeApps.chromeAppsStrings.xh
    - typings.chromeApps.chromeAppsStrings.yi
    - typings.chromeApps.chromeAppsStrings.yo
    - typings.chromeApps.chromeAppsStrings.zh
    - typings.chromeApps.chromeAppsStrings.`zh-CN`
    - typings.chromeApps.chromeAppsStrings.`zh-HK`
    - typings.chromeApps.chromeAppsStrings.`zh-TW`
    - typings.chromeApps.chromeAppsStrings.zu
    - typings.chromeApps.chromeAppsStrings.ar_001
    - typings.chromeApps.chromeAppsStrings.en_001
    - typings.chromeApps.chromeAppsStrings.en_150
    - typings.chromeApps.chromeAppsStrings.zh_hans_cn
    - typings.chromeApps.chromeAppsStrings.zh_hant_hk
    - typings.chromeApps.chromeAppsStrings.zh_hant_mo
    - typings.chromeApps.chromeAppsStrings.zh_hans_sg
    - typings.chromeApps.chromeAppsStrings.zh_hant_tw
  */
  trait kLanguageInfoTable extends StObject
  object kLanguageInfoTable {
    
    inline def af: typings.chromeApps.chromeAppsStrings.af = "af".asInstanceOf[typings.chromeApps.chromeAppsStrings.af]
    
    inline def am: typings.chromeApps.chromeAppsStrings.am = "am".asInstanceOf[typings.chromeApps.chromeAppsStrings.am]
    
    inline def an: typings.chromeApps.chromeAppsStrings.an = "an".asInstanceOf[typings.chromeApps.chromeAppsStrings.an]
    
    inline def ar: typings.chromeApps.chromeAppsStrings.ar = "ar".asInstanceOf[typings.chromeApps.chromeAppsStrings.ar]
    
    inline def ar_001: typings.chromeApps.chromeAppsStrings.ar_001 = "ar_001".asInstanceOf[typings.chromeApps.chromeAppsStrings.ar_001]
    
    inline def ast: typings.chromeApps.chromeAppsStrings.ast = "ast".asInstanceOf[typings.chromeApps.chromeAppsStrings.ast]
    
    inline def az: typings.chromeApps.chromeAppsStrings.az = "az".asInstanceOf[typings.chromeApps.chromeAppsStrings.az]
    
    inline def be: typings.chromeApps.chromeAppsStrings.be = "be".asInstanceOf[typings.chromeApps.chromeAppsStrings.be]
    
    inline def bg: typings.chromeApps.chromeAppsStrings.bg = "bg".asInstanceOf[typings.chromeApps.chromeAppsStrings.bg]
    
    inline def bh: typings.chromeApps.chromeAppsStrings.bh = "bh".asInstanceOf[typings.chromeApps.chromeAppsStrings.bh]
    
    inline def bn: typings.chromeApps.chromeAppsStrings.bn = "bn".asInstanceOf[typings.chromeApps.chromeAppsStrings.bn]
    
    inline def br: typings.chromeApps.chromeAppsStrings.br = "br".asInstanceOf[typings.chromeApps.chromeAppsStrings.br]
    
    inline def bs: typings.chromeApps.chromeAppsStrings.bs = "bs".asInstanceOf[typings.chromeApps.chromeAppsStrings.bs]
    
    inline def ca: typings.chromeApps.chromeAppsStrings.ca = "ca".asInstanceOf[typings.chromeApps.chromeAppsStrings.ca]
    
    inline def ceb: typings.chromeApps.chromeAppsStrings.ceb = "ceb".asInstanceOf[typings.chromeApps.chromeAppsStrings.ceb]
    
    inline def ckb: typings.chromeApps.chromeAppsStrings.ckb = "ckb".asInstanceOf[typings.chromeApps.chromeAppsStrings.ckb]
    
    inline def co: typings.chromeApps.chromeAppsStrings.co = "co".asInstanceOf[typings.chromeApps.chromeAppsStrings.co]
    
    inline def cs: typings.chromeApps.chromeAppsStrings.cs = "cs".asInstanceOf[typings.chromeApps.chromeAppsStrings.cs]
    
    inline def cy: typings.chromeApps.chromeAppsStrings.cy = "cy".asInstanceOf[typings.chromeApps.chromeAppsStrings.cy]
    
    inline def da: typings.chromeApps.chromeAppsStrings.da = "da".asInstanceOf[typings.chromeApps.chromeAppsStrings.da]
    
    inline def de: typings.chromeApps.chromeAppsStrings.de = "de".asInstanceOf[typings.chromeApps.chromeAppsStrings.de]
    
    inline def `de-AT`: typings.chromeApps.chromeAppsStrings.`de-AT` = "de-AT".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-AT`]
    
    inline def `de-CH`: typings.chromeApps.chromeAppsStrings.`de-CH` = "de-CH".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-CH`]
    
    inline def `de-DE`: typings.chromeApps.chromeAppsStrings.`de-DE` = "de-DE".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-DE`]
    
    inline def `de-LI`: typings.chromeApps.chromeAppsStrings.`de-LI` = "de-LI".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-LI`]
    
    inline def el: typings.chromeApps.chromeAppsStrings.el = "el".asInstanceOf[typings.chromeApps.chromeAppsStrings.el]
    
    inline def en: typings.chromeApps.chromeAppsStrings.en = "en".asInstanceOf[typings.chromeApps.chromeAppsStrings.en]
    
    inline def `en-AU`: typings.chromeApps.chromeAppsStrings.`en-AU` = "en-AU".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-AU`]
    
    inline def `en-CA`: typings.chromeApps.chromeAppsStrings.`en-CA` = "en-CA".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-CA`]
    
    inline def `en-GB`: typings.chromeApps.chromeAppsStrings.`en-GB` = "en-GB".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-GB`]
    
    inline def `en-IN`: typings.chromeApps.chromeAppsStrings.`en-IN` = "en-IN".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-IN`]
    
    inline def `en-NZ`: typings.chromeApps.chromeAppsStrings.`en-NZ` = "en-NZ".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-NZ`]
    
    inline def `en-US`: typings.chromeApps.chromeAppsStrings.`en-US` = "en-US".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-US`]
    
    inline def `en-ZA`: typings.chromeApps.chromeAppsStrings.`en-ZA` = "en-ZA".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-ZA`]
    
    inline def en_001: typings.chromeApps.chromeAppsStrings.en_001 = "en_001".asInstanceOf[typings.chromeApps.chromeAppsStrings.en_001]
    
    inline def en_150: typings.chromeApps.chromeAppsStrings.en_150 = "en_150".asInstanceOf[typings.chromeApps.chromeAppsStrings.en_150]
    
    inline def eo: typings.chromeApps.chromeAppsStrings.eo = "eo".asInstanceOf[typings.chromeApps.chromeAppsStrings.eo]
    
    inline def es: typings.chromeApps.chromeAppsStrings.es = "es".asInstanceOf[typings.chromeApps.chromeAppsStrings.es]
    
    inline def `es-419`: typings.chromeApps.chromeAppsStrings.`es-419` = "es-419".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-419`]
    
    inline def `es-AR`: typings.chromeApps.chromeAppsStrings.`es-AR` = "es-AR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-AR`]
    
    inline def `es-CL`: typings.chromeApps.chromeAppsStrings.`es-CL` = "es-CL".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-CL`]
    
    inline def `es-CO`: typings.chromeApps.chromeAppsStrings.`es-CO` = "es-CO".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-CO`]
    
    inline def `es-CR`: typings.chromeApps.chromeAppsStrings.`es-CR` = "es-CR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-CR`]
    
    inline def `es-ES`: typings.chromeApps.chromeAppsStrings.`es-ES` = "es-ES".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-ES`]
    
    inline def `es-HN`: typings.chromeApps.chromeAppsStrings.`es-HN` = "es-HN".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-HN`]
    
    inline def `es-MX`: typings.chromeApps.chromeAppsStrings.`es-MX` = "es-MX".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-MX`]
    
    inline def `es-PE`: typings.chromeApps.chromeAppsStrings.`es-PE` = "es-PE".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-PE`]
    
    inline def `es-US`: typings.chromeApps.chromeAppsStrings.`es-US` = "es-US".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-US`]
    
    inline def `es-UY`: typings.chromeApps.chromeAppsStrings.`es-UY` = "es-UY".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-UY`]
    
    inline def `es-VE`: typings.chromeApps.chromeAppsStrings.`es-VE` = "es-VE".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-VE`]
    
    inline def et: typings.chromeApps.chromeAppsStrings.et = "et".asInstanceOf[typings.chromeApps.chromeAppsStrings.et]
    
    inline def eu: typings.chromeApps.chromeAppsStrings.eu = "eu".asInstanceOf[typings.chromeApps.chromeAppsStrings.eu]
    
    inline def fa: typings.chromeApps.chromeAppsStrings.fa = "fa".asInstanceOf[typings.chromeApps.chromeAppsStrings.fa]
    
    inline def fi: typings.chromeApps.chromeAppsStrings.fi = "fi".asInstanceOf[typings.chromeApps.chromeAppsStrings.fi]
    
    inline def fil: typings.chromeApps.chromeAppsStrings.fil = "fil".asInstanceOf[typings.chromeApps.chromeAppsStrings.fil]
    
    inline def fo: typings.chromeApps.chromeAppsStrings.fo = "fo".asInstanceOf[typings.chromeApps.chromeAppsStrings.fo]
    
    inline def fr: typings.chromeApps.chromeAppsStrings.fr = "fr".asInstanceOf[typings.chromeApps.chromeAppsStrings.fr]
    
    inline def `fr-CA`: typings.chromeApps.chromeAppsStrings.`fr-CA` = "fr-CA".asInstanceOf[typings.chromeApps.chromeAppsStrings.`fr-CA`]
    
    inline def `fr-CH`: typings.chromeApps.chromeAppsStrings.`fr-CH` = "fr-CH".asInstanceOf[typings.chromeApps.chromeAppsStrings.`fr-CH`]
    
    inline def `fr-FR`: typings.chromeApps.chromeAppsStrings.`fr-FR` = "fr-FR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`fr-FR`]
    
    inline def fy: typings.chromeApps.chromeAppsStrings.fy = "fy".asInstanceOf[typings.chromeApps.chromeAppsStrings.fy]
    
    inline def ga: typings.chromeApps.chromeAppsStrings.ga = "ga".asInstanceOf[typings.chromeApps.chromeAppsStrings.ga]
    
    inline def gd: typings.chromeApps.chromeAppsStrings.gd = "gd".asInstanceOf[typings.chromeApps.chromeAppsStrings.gd]
    
    inline def gl: typings.chromeApps.chromeAppsStrings.gl = "gl".asInstanceOf[typings.chromeApps.chromeAppsStrings.gl]
    
    inline def gn: typings.chromeApps.chromeAppsStrings.gn = "gn".asInstanceOf[typings.chromeApps.chromeAppsStrings.gn]
    
    inline def gu: typings.chromeApps.chromeAppsStrings.gu = "gu".asInstanceOf[typings.chromeApps.chromeAppsStrings.gu]
    
    inline def ha: typings.chromeApps.chromeAppsStrings.ha = "ha".asInstanceOf[typings.chromeApps.chromeAppsStrings.ha]
    
    inline def haw: typings.chromeApps.chromeAppsStrings.haw = "haw".asInstanceOf[typings.chromeApps.chromeAppsStrings.haw]
    
    inline def he: typings.chromeApps.chromeAppsStrings.he = "he".asInstanceOf[typings.chromeApps.chromeAppsStrings.he]
    
    inline def hi: typings.chromeApps.chromeAppsStrings.hi = "hi".asInstanceOf[typings.chromeApps.chromeAppsStrings.hi]
    
    inline def hmn: typings.chromeApps.chromeAppsStrings.hmn = "hmn".asInstanceOf[typings.chromeApps.chromeAppsStrings.hmn]
    
    inline def hr: typings.chromeApps.chromeAppsStrings.hr = "hr".asInstanceOf[typings.chromeApps.chromeAppsStrings.hr]
    
    inline def ht: typings.chromeApps.chromeAppsStrings.ht = "ht".asInstanceOf[typings.chromeApps.chromeAppsStrings.ht]
    
    inline def hu: typings.chromeApps.chromeAppsStrings.hu = "hu".asInstanceOf[typings.chromeApps.chromeAppsStrings.hu]
    
    inline def hy: typings.chromeApps.chromeAppsStrings.hy = "hy".asInstanceOf[typings.chromeApps.chromeAppsStrings.hy]
    
    inline def ia: typings.chromeApps.chromeAppsStrings.ia = "ia".asInstanceOf[typings.chromeApps.chromeAppsStrings.ia]
    
    inline def id: typings.chromeApps.chromeAppsStrings.id = "id".asInstanceOf[typings.chromeApps.chromeAppsStrings.id]
    
    inline def ig: typings.chromeApps.chromeAppsStrings.ig = "ig".asInstanceOf[typings.chromeApps.chromeAppsStrings.ig]
    
    inline def is: typings.chromeApps.chromeAppsStrings.is = "is".asInstanceOf[typings.chromeApps.chromeAppsStrings.is]
    
    inline def it: typings.chromeApps.chromeAppsStrings.it = "it".asInstanceOf[typings.chromeApps.chromeAppsStrings.it]
    
    inline def `it-CH`: typings.chromeApps.chromeAppsStrings.`it-CH` = "it-CH".asInstanceOf[typings.chromeApps.chromeAppsStrings.`it-CH`]
    
    inline def `it-IT`: typings.chromeApps.chromeAppsStrings.`it-IT` = "it-IT".asInstanceOf[typings.chromeApps.chromeAppsStrings.`it-IT`]
    
    inline def ja: typings.chromeApps.chromeAppsStrings.ja = "ja".asInstanceOf[typings.chromeApps.chromeAppsStrings.ja]
    
    inline def jv: typings.chromeApps.chromeAppsStrings.jv = "jv".asInstanceOf[typings.chromeApps.chromeAppsStrings.jv]
    
    inline def ka: typings.chromeApps.chromeAppsStrings.ka = "ka".asInstanceOf[typings.chromeApps.chromeAppsStrings.ka]
    
    inline def kk: typings.chromeApps.chromeAppsStrings.kk = "kk".asInstanceOf[typings.chromeApps.chromeAppsStrings.kk]
    
    inline def km: typings.chromeApps.chromeAppsStrings.km = "km".asInstanceOf[typings.chromeApps.chromeAppsStrings.km]
    
    inline def kn: typings.chromeApps.chromeAppsStrings.kn = "kn".asInstanceOf[typings.chromeApps.chromeAppsStrings.kn]
    
    inline def ko: typings.chromeApps.chromeAppsStrings.ko = "ko".asInstanceOf[typings.chromeApps.chromeAppsStrings.ko]
    
    inline def ku: typings.chromeApps.chromeAppsStrings.ku = "ku".asInstanceOf[typings.chromeApps.chromeAppsStrings.ku]
    
    inline def ky: typings.chromeApps.chromeAppsStrings.ky = "ky".asInstanceOf[typings.chromeApps.chromeAppsStrings.ky]
    
    inline def la: typings.chromeApps.chromeAppsStrings.la = "la".asInstanceOf[typings.chromeApps.chromeAppsStrings.la]
    
    inline def lb: typings.chromeApps.chromeAppsStrings.lb = "lb".asInstanceOf[typings.chromeApps.chromeAppsStrings.lb]
    
    inline def ln: typings.chromeApps.chromeAppsStrings.ln = "ln".asInstanceOf[typings.chromeApps.chromeAppsStrings.ln]
    
    inline def lo: typings.chromeApps.chromeAppsStrings.lo = "lo".asInstanceOf[typings.chromeApps.chromeAppsStrings.lo]
    
    inline def lt: typings.chromeApps.chromeAppsStrings.lt = "lt".asInstanceOf[typings.chromeApps.chromeAppsStrings.lt]
    
    inline def lv: typings.chromeApps.chromeAppsStrings.lv = "lv".asInstanceOf[typings.chromeApps.chromeAppsStrings.lv]
    
    inline def mg: typings.chromeApps.chromeAppsStrings.mg = "mg".asInstanceOf[typings.chromeApps.chromeAppsStrings.mg]
    
    inline def mi: typings.chromeApps.chromeAppsStrings.mi = "mi".asInstanceOf[typings.chromeApps.chromeAppsStrings.mi]
    
    inline def mk: typings.chromeApps.chromeAppsStrings.mk = "mk".asInstanceOf[typings.chromeApps.chromeAppsStrings.mk]
    
    inline def ml: typings.chromeApps.chromeAppsStrings.ml = "ml".asInstanceOf[typings.chromeApps.chromeAppsStrings.ml]
    
    inline def mn: typings.chromeApps.chromeAppsStrings.mn = "mn".asInstanceOf[typings.chromeApps.chromeAppsStrings.mn]
    
    inline def mo: typings.chromeApps.chromeAppsStrings.mo = "mo".asInstanceOf[typings.chromeApps.chromeAppsStrings.mo]
    
    inline def mr: typings.chromeApps.chromeAppsStrings.mr = "mr".asInstanceOf[typings.chromeApps.chromeAppsStrings.mr]
    
    inline def ms: typings.chromeApps.chromeAppsStrings.ms = "ms".asInstanceOf[typings.chromeApps.chromeAppsStrings.ms]
    
    inline def mt: typings.chromeApps.chromeAppsStrings.mt = "mt".asInstanceOf[typings.chromeApps.chromeAppsStrings.mt]
    
    inline def my: typings.chromeApps.chromeAppsStrings.my = "my".asInstanceOf[typings.chromeApps.chromeAppsStrings.my]
    
    inline def nb: typings.chromeApps.chromeAppsStrings.nb = "nb".asInstanceOf[typings.chromeApps.chromeAppsStrings.nb]
    
    inline def ne: typings.chromeApps.chromeAppsStrings.ne = "ne".asInstanceOf[typings.chromeApps.chromeAppsStrings.ne]
    
    inline def nl: typings.chromeApps.chromeAppsStrings.nl = "nl".asInstanceOf[typings.chromeApps.chromeAppsStrings.nl]
    
    inline def nn: typings.chromeApps.chromeAppsStrings.nn = "nn".asInstanceOf[typings.chromeApps.chromeAppsStrings.nn]
    
    inline def no: typings.chromeApps.chromeAppsStrings.no = "no".asInstanceOf[typings.chromeApps.chromeAppsStrings.no]
    
    inline def ny: typings.chromeApps.chromeAppsStrings.ny = "ny".asInstanceOf[typings.chromeApps.chromeAppsStrings.ny]
    
    inline def oc: typings.chromeApps.chromeAppsStrings.oc = "oc".asInstanceOf[typings.chromeApps.chromeAppsStrings.oc]
    
    inline def om: typings.chromeApps.chromeAppsStrings.om = "om".asInstanceOf[typings.chromeApps.chromeAppsStrings.om]
    
    inline def or: typings.chromeApps.chromeAppsStrings.or = "or".asInstanceOf[typings.chromeApps.chromeAppsStrings.or]
    
    inline def pa: typings.chromeApps.chromeAppsStrings.pa = "pa".asInstanceOf[typings.chromeApps.chromeAppsStrings.pa]
    
    inline def pl: typings.chromeApps.chromeAppsStrings.pl = "pl".asInstanceOf[typings.chromeApps.chromeAppsStrings.pl]
    
    inline def ps: typings.chromeApps.chromeAppsStrings.ps = "ps".asInstanceOf[typings.chromeApps.chromeAppsStrings.ps]
    
    inline def pt: typings.chromeApps.chromeAppsStrings.pt = "pt".asInstanceOf[typings.chromeApps.chromeAppsStrings.pt]
    
    inline def `pt-BR`: typings.chromeApps.chromeAppsStrings.`pt-BR` = "pt-BR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`pt-BR`]
    
    inline def `pt-PT`: typings.chromeApps.chromeAppsStrings.`pt-PT` = "pt-PT".asInstanceOf[typings.chromeApps.chromeAppsStrings.`pt-PT`]
    
    inline def qu: typings.chromeApps.chromeAppsStrings.qu = "qu".asInstanceOf[typings.chromeApps.chromeAppsStrings.qu]
    
    inline def rm: typings.chromeApps.chromeAppsStrings.rm = "rm".asInstanceOf[typings.chromeApps.chromeAppsStrings.rm]
    
    inline def ro: typings.chromeApps.chromeAppsStrings.ro = "ro".asInstanceOf[typings.chromeApps.chromeAppsStrings.ro]
    
    inline def ru: typings.chromeApps.chromeAppsStrings.ru = "ru".asInstanceOf[typings.chromeApps.chromeAppsStrings.ru]
    
    inline def sd: typings.chromeApps.chromeAppsStrings.sd = "sd".asInstanceOf[typings.chromeApps.chromeAppsStrings.sd]
    
    inline def sh: typings.chromeApps.chromeAppsStrings.sh = "sh".asInstanceOf[typings.chromeApps.chromeAppsStrings.sh]
    
    inline def si: typings.chromeApps.chromeAppsStrings.si = "si".asInstanceOf[typings.chromeApps.chromeAppsStrings.si]
    
    inline def sk: typings.chromeApps.chromeAppsStrings.sk = "sk".asInstanceOf[typings.chromeApps.chromeAppsStrings.sk]
    
    inline def sl: typings.chromeApps.chromeAppsStrings.sl = "sl".asInstanceOf[typings.chromeApps.chromeAppsStrings.sl]
    
    inline def sm: typings.chromeApps.chromeAppsStrings.sm = "sm".asInstanceOf[typings.chromeApps.chromeAppsStrings.sm]
    
    inline def sn: typings.chromeApps.chromeAppsStrings.sn = "sn".asInstanceOf[typings.chromeApps.chromeAppsStrings.sn]
    
    inline def so: typings.chromeApps.chromeAppsStrings.so = "so".asInstanceOf[typings.chromeApps.chromeAppsStrings.so]
    
    inline def sq: typings.chromeApps.chromeAppsStrings.sq = "sq".asInstanceOf[typings.chromeApps.chromeAppsStrings.sq]
    
    inline def sr: typings.chromeApps.chromeAppsStrings.sr = "sr".asInstanceOf[typings.chromeApps.chromeAppsStrings.sr]
    
    inline def st: typings.chromeApps.chromeAppsStrings.st = "st".asInstanceOf[typings.chromeApps.chromeAppsStrings.st]
    
    inline def su: typings.chromeApps.chromeAppsStrings.su = "su".asInstanceOf[typings.chromeApps.chromeAppsStrings.su]
    
    inline def sv: typings.chromeApps.chromeAppsStrings.sv = "sv".asInstanceOf[typings.chromeApps.chromeAppsStrings.sv]
    
    inline def sw: typings.chromeApps.chromeAppsStrings.sw = "sw".asInstanceOf[typings.chromeApps.chromeAppsStrings.sw]
    
    inline def ta: typings.chromeApps.chromeAppsStrings.ta = "ta".asInstanceOf[typings.chromeApps.chromeAppsStrings.ta]
    
    inline def te: typings.chromeApps.chromeAppsStrings.te = "te".asInstanceOf[typings.chromeApps.chromeAppsStrings.te]
    
    inline def tg: typings.chromeApps.chromeAppsStrings.tg = "tg".asInstanceOf[typings.chromeApps.chromeAppsStrings.tg]
    
    inline def th: typings.chromeApps.chromeAppsStrings.th = "th".asInstanceOf[typings.chromeApps.chromeAppsStrings.th]
    
    inline def ti: typings.chromeApps.chromeAppsStrings.ti = "ti".asInstanceOf[typings.chromeApps.chromeAppsStrings.ti]
    
    inline def tk: typings.chromeApps.chromeAppsStrings.tk = "tk".asInstanceOf[typings.chromeApps.chromeAppsStrings.tk]
    
    inline def to: typings.chromeApps.chromeAppsStrings.to = "to".asInstanceOf[typings.chromeApps.chromeAppsStrings.to]
    
    inline def tr: typings.chromeApps.chromeAppsStrings.tr = "tr".asInstanceOf[typings.chromeApps.chromeAppsStrings.tr]
    
    inline def tt: typings.chromeApps.chromeAppsStrings.tt = "tt".asInstanceOf[typings.chromeApps.chromeAppsStrings.tt]
    
    inline def tw: typings.chromeApps.chromeAppsStrings.tw = "tw".asInstanceOf[typings.chromeApps.chromeAppsStrings.tw]
    
    inline def ug: typings.chromeApps.chromeAppsStrings.ug = "ug".asInstanceOf[typings.chromeApps.chromeAppsStrings.ug]
    
    inline def uk: typings.chromeApps.chromeAppsStrings.uk = "uk".asInstanceOf[typings.chromeApps.chromeAppsStrings.uk]
    
    inline def ur: typings.chromeApps.chromeAppsStrings.ur = "ur".asInstanceOf[typings.chromeApps.chromeAppsStrings.ur]
    
    inline def uz: typings.chromeApps.chromeAppsStrings.uz = "uz".asInstanceOf[typings.chromeApps.chromeAppsStrings.uz]
    
    inline def vi: typings.chromeApps.chromeAppsStrings.vi = "vi".asInstanceOf[typings.chromeApps.chromeAppsStrings.vi]
    
    inline def wa: typings.chromeApps.chromeAppsStrings.wa = "wa".asInstanceOf[typings.chromeApps.chromeAppsStrings.wa]
    
    inline def xh: typings.chromeApps.chromeAppsStrings.xh = "xh".asInstanceOf[typings.chromeApps.chromeAppsStrings.xh]
    
    inline def yi: typings.chromeApps.chromeAppsStrings.yi = "yi".asInstanceOf[typings.chromeApps.chromeAppsStrings.yi]
    
    inline def yo: typings.chromeApps.chromeAppsStrings.yo = "yo".asInstanceOf[typings.chromeApps.chromeAppsStrings.yo]
    
    inline def zh: typings.chromeApps.chromeAppsStrings.zh = "zh".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh]
    
    inline def `zh-CN`: typings.chromeApps.chromeAppsStrings.`zh-CN` = "zh-CN".asInstanceOf[typings.chromeApps.chromeAppsStrings.`zh-CN`]
    
    inline def `zh-HK`: typings.chromeApps.chromeAppsStrings.`zh-HK` = "zh-HK".asInstanceOf[typings.chromeApps.chromeAppsStrings.`zh-HK`]
    
    inline def `zh-TW`: typings.chromeApps.chromeAppsStrings.`zh-TW` = "zh-TW".asInstanceOf[typings.chromeApps.chromeAppsStrings.`zh-TW`]
    
    inline def zh_hans_cn: typings.chromeApps.chromeAppsStrings.zh_hans_cn = "zh_hans_cn".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hans_cn]
    
    inline def zh_hans_sg: typings.chromeApps.chromeAppsStrings.zh_hans_sg = "zh_hans_sg".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hans_sg]
    
    inline def zh_hant_hk: typings.chromeApps.chromeAppsStrings.zh_hant_hk = "zh_hant_hk".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hant_hk]
    
    inline def zh_hant_mo: typings.chromeApps.chromeAppsStrings.zh_hant_mo = "zh_hant_mo".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hant_mo]
    
    inline def zh_hant_tw: typings.chromeApps.chromeAppsStrings.zh_hant_tw = "zh_hant_tw".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hant_tw]
    
    inline def zu: typings.chromeApps.chromeAppsStrings.zu = "zu".asInstanceOf[typings.chromeApps.chromeAppsStrings.zu]
  }
}
