package typings.chromeApps.chrome.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait LanguageCode extends js.Object
object LanguageCode {
  
  @scala.inline
  def af: typings.chromeApps.chromeAppsStrings.af = "af".asInstanceOf[typings.chromeApps.chromeAppsStrings.af]
  
  @scala.inline
  def am: typings.chromeApps.chromeAppsStrings.am = "am".asInstanceOf[typings.chromeApps.chromeAppsStrings.am]
  
  @scala.inline
  def an: typings.chromeApps.chromeAppsStrings.an = "an".asInstanceOf[typings.chromeApps.chromeAppsStrings.an]
  
  @scala.inline
  def ar: typings.chromeApps.chromeAppsStrings.ar = "ar".asInstanceOf[typings.chromeApps.chromeAppsStrings.ar]
  
  @scala.inline
  def ar_001: typings.chromeApps.chromeAppsStrings.ar_001 = "ar_001".asInstanceOf[typings.chromeApps.chromeAppsStrings.ar_001]
  
  @scala.inline
  def ast: typings.chromeApps.chromeAppsStrings.ast = "ast".asInstanceOf[typings.chromeApps.chromeAppsStrings.ast]
  
  @scala.inline
  def az: typings.chromeApps.chromeAppsStrings.az = "az".asInstanceOf[typings.chromeApps.chromeAppsStrings.az]
  
  @scala.inline
  def be: typings.chromeApps.chromeAppsStrings.be = "be".asInstanceOf[typings.chromeApps.chromeAppsStrings.be]
  
  @scala.inline
  def bg: typings.chromeApps.chromeAppsStrings.bg = "bg".asInstanceOf[typings.chromeApps.chromeAppsStrings.bg]
  
  @scala.inline
  def bh: typings.chromeApps.chromeAppsStrings.bh = "bh".asInstanceOf[typings.chromeApps.chromeAppsStrings.bh]
  
  @scala.inline
  def bn: typings.chromeApps.chromeAppsStrings.bn = "bn".asInstanceOf[typings.chromeApps.chromeAppsStrings.bn]
  
  @scala.inline
  def br: typings.chromeApps.chromeAppsStrings.br = "br".asInstanceOf[typings.chromeApps.chromeAppsStrings.br]
  
  @scala.inline
  def bs: typings.chromeApps.chromeAppsStrings.bs = "bs".asInstanceOf[typings.chromeApps.chromeAppsStrings.bs]
  
  @scala.inline
  def ca: typings.chromeApps.chromeAppsStrings.ca = "ca".asInstanceOf[typings.chromeApps.chromeAppsStrings.ca]
  
  @scala.inline
  def ceb: typings.chromeApps.chromeAppsStrings.ceb = "ceb".asInstanceOf[typings.chromeApps.chromeAppsStrings.ceb]
  
  @scala.inline
  def ckb: typings.chromeApps.chromeAppsStrings.ckb = "ckb".asInstanceOf[typings.chromeApps.chromeAppsStrings.ckb]
  
  @scala.inline
  def co: typings.chromeApps.chromeAppsStrings.co = "co".asInstanceOf[typings.chromeApps.chromeAppsStrings.co]
  
  @scala.inline
  def cs: typings.chromeApps.chromeAppsStrings.cs = "cs".asInstanceOf[typings.chromeApps.chromeAppsStrings.cs]
  
  @scala.inline
  def cy: typings.chromeApps.chromeAppsStrings.cy = "cy".asInstanceOf[typings.chromeApps.chromeAppsStrings.cy]
  
  @scala.inline
  def da: typings.chromeApps.chromeAppsStrings.da = "da".asInstanceOf[typings.chromeApps.chromeAppsStrings.da]
  
  @scala.inline
  def de: typings.chromeApps.chromeAppsStrings.de = "de".asInstanceOf[typings.chromeApps.chromeAppsStrings.de]
  
  @scala.inline
  def `de-AT`: typings.chromeApps.chromeAppsStrings.`de-AT` = "de-AT".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-AT`]
  
  @scala.inline
  def `de-CH`: typings.chromeApps.chromeAppsStrings.`de-CH` = "de-CH".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-CH`]
  
  @scala.inline
  def `de-DE`: typings.chromeApps.chromeAppsStrings.`de-DE` = "de-DE".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-DE`]
  
  @scala.inline
  def `de-LI`: typings.chromeApps.chromeAppsStrings.`de-LI` = "de-LI".asInstanceOf[typings.chromeApps.chromeAppsStrings.`de-LI`]
  
  @scala.inline
  def el: typings.chromeApps.chromeAppsStrings.el = "el".asInstanceOf[typings.chromeApps.chromeAppsStrings.el]
  
  @scala.inline
  def en: typings.chromeApps.chromeAppsStrings.en = "en".asInstanceOf[typings.chromeApps.chromeAppsStrings.en]
  
  @scala.inline
  def `en-AU`: typings.chromeApps.chromeAppsStrings.`en-AU` = "en-AU".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-AU`]
  
  @scala.inline
  def `en-CA`: typings.chromeApps.chromeAppsStrings.`en-CA` = "en-CA".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-CA`]
  
  @scala.inline
  def `en-GB`: typings.chromeApps.chromeAppsStrings.`en-GB` = "en-GB".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-GB`]
  
  @scala.inline
  def `en-IN`: typings.chromeApps.chromeAppsStrings.`en-IN` = "en-IN".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-IN`]
  
  @scala.inline
  def `en-NZ`: typings.chromeApps.chromeAppsStrings.`en-NZ` = "en-NZ".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-NZ`]
  
  @scala.inline
  def `en-US`: typings.chromeApps.chromeAppsStrings.`en-US` = "en-US".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-US`]
  
  @scala.inline
  def `en-ZA`: typings.chromeApps.chromeAppsStrings.`en-ZA` = "en-ZA".asInstanceOf[typings.chromeApps.chromeAppsStrings.`en-ZA`]
  
  @scala.inline
  def en_001: typings.chromeApps.chromeAppsStrings.en_001 = "en_001".asInstanceOf[typings.chromeApps.chromeAppsStrings.en_001]
  
  @scala.inline
  def en_150: typings.chromeApps.chromeAppsStrings.en_150 = "en_150".asInstanceOf[typings.chromeApps.chromeAppsStrings.en_150]
  
  @scala.inline
  def eo: typings.chromeApps.chromeAppsStrings.eo = "eo".asInstanceOf[typings.chromeApps.chromeAppsStrings.eo]
  
  @scala.inline
  def es: typings.chromeApps.chromeAppsStrings.es = "es".asInstanceOf[typings.chromeApps.chromeAppsStrings.es]
  
  @scala.inline
  def `es-419`: typings.chromeApps.chromeAppsStrings.`es-419` = "es-419".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-419`]
  
  @scala.inline
  def `es-AR`: typings.chromeApps.chromeAppsStrings.`es-AR` = "es-AR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-AR`]
  
  @scala.inline
  def `es-CL`: typings.chromeApps.chromeAppsStrings.`es-CL` = "es-CL".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-CL`]
  
  @scala.inline
  def `es-CO`: typings.chromeApps.chromeAppsStrings.`es-CO` = "es-CO".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-CO`]
  
  @scala.inline
  def `es-CR`: typings.chromeApps.chromeAppsStrings.`es-CR` = "es-CR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-CR`]
  
  @scala.inline
  def `es-ES`: typings.chromeApps.chromeAppsStrings.`es-ES` = "es-ES".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-ES`]
  
  @scala.inline
  def `es-HN`: typings.chromeApps.chromeAppsStrings.`es-HN` = "es-HN".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-HN`]
  
  @scala.inline
  def `es-MX`: typings.chromeApps.chromeAppsStrings.`es-MX` = "es-MX".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-MX`]
  
  @scala.inline
  def `es-PE`: typings.chromeApps.chromeAppsStrings.`es-PE` = "es-PE".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-PE`]
  
  @scala.inline
  def `es-US`: typings.chromeApps.chromeAppsStrings.`es-US` = "es-US".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-US`]
  
  @scala.inline
  def `es-UY`: typings.chromeApps.chromeAppsStrings.`es-UY` = "es-UY".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-UY`]
  
  @scala.inline
  def `es-VE`: typings.chromeApps.chromeAppsStrings.`es-VE` = "es-VE".asInstanceOf[typings.chromeApps.chromeAppsStrings.`es-VE`]
  
  @scala.inline
  def et: typings.chromeApps.chromeAppsStrings.et = "et".asInstanceOf[typings.chromeApps.chromeAppsStrings.et]
  
  @scala.inline
  def eu: typings.chromeApps.chromeAppsStrings.eu = "eu".asInstanceOf[typings.chromeApps.chromeAppsStrings.eu]
  
  @scala.inline
  def fa: typings.chromeApps.chromeAppsStrings.fa = "fa".asInstanceOf[typings.chromeApps.chromeAppsStrings.fa]
  
  @scala.inline
  def fi: typings.chromeApps.chromeAppsStrings.fi = "fi".asInstanceOf[typings.chromeApps.chromeAppsStrings.fi]
  
  @scala.inline
  def fil: typings.chromeApps.chromeAppsStrings.fil = "fil".asInstanceOf[typings.chromeApps.chromeAppsStrings.fil]
  
  @scala.inline
  def fo: typings.chromeApps.chromeAppsStrings.fo = "fo".asInstanceOf[typings.chromeApps.chromeAppsStrings.fo]
  
  @scala.inline
  def fr: typings.chromeApps.chromeAppsStrings.fr = "fr".asInstanceOf[typings.chromeApps.chromeAppsStrings.fr]
  
  @scala.inline
  def `fr-CA`: typings.chromeApps.chromeAppsStrings.`fr-CA` = "fr-CA".asInstanceOf[typings.chromeApps.chromeAppsStrings.`fr-CA`]
  
  @scala.inline
  def `fr-CH`: typings.chromeApps.chromeAppsStrings.`fr-CH` = "fr-CH".asInstanceOf[typings.chromeApps.chromeAppsStrings.`fr-CH`]
  
  @scala.inline
  def `fr-FR`: typings.chromeApps.chromeAppsStrings.`fr-FR` = "fr-FR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`fr-FR`]
  
  @scala.inline
  def fy: typings.chromeApps.chromeAppsStrings.fy = "fy".asInstanceOf[typings.chromeApps.chromeAppsStrings.fy]
  
  @scala.inline
  def ga: typings.chromeApps.chromeAppsStrings.ga = "ga".asInstanceOf[typings.chromeApps.chromeAppsStrings.ga]
  
  @scala.inline
  def gd: typings.chromeApps.chromeAppsStrings.gd = "gd".asInstanceOf[typings.chromeApps.chromeAppsStrings.gd]
  
  @scala.inline
  def gl: typings.chromeApps.chromeAppsStrings.gl = "gl".asInstanceOf[typings.chromeApps.chromeAppsStrings.gl]
  
  @scala.inline
  def gn: typings.chromeApps.chromeAppsStrings.gn = "gn".asInstanceOf[typings.chromeApps.chromeAppsStrings.gn]
  
  @scala.inline
  def gu: typings.chromeApps.chromeAppsStrings.gu = "gu".asInstanceOf[typings.chromeApps.chromeAppsStrings.gu]
  
  @scala.inline
  def ha: typings.chromeApps.chromeAppsStrings.ha = "ha".asInstanceOf[typings.chromeApps.chromeAppsStrings.ha]
  
  @scala.inline
  def haw: typings.chromeApps.chromeAppsStrings.haw = "haw".asInstanceOf[typings.chromeApps.chromeAppsStrings.haw]
  
  @scala.inline
  def he: typings.chromeApps.chromeAppsStrings.he = "he".asInstanceOf[typings.chromeApps.chromeAppsStrings.he]
  
  @scala.inline
  def hi: typings.chromeApps.chromeAppsStrings.hi = "hi".asInstanceOf[typings.chromeApps.chromeAppsStrings.hi]
  
  @scala.inline
  def hmn: typings.chromeApps.chromeAppsStrings.hmn = "hmn".asInstanceOf[typings.chromeApps.chromeAppsStrings.hmn]
  
  @scala.inline
  def hr: typings.chromeApps.chromeAppsStrings.hr = "hr".asInstanceOf[typings.chromeApps.chromeAppsStrings.hr]
  
  @scala.inline
  def ht: typings.chromeApps.chromeAppsStrings.ht = "ht".asInstanceOf[typings.chromeApps.chromeAppsStrings.ht]
  
  @scala.inline
  def hu: typings.chromeApps.chromeAppsStrings.hu = "hu".asInstanceOf[typings.chromeApps.chromeAppsStrings.hu]
  
  @scala.inline
  def hy: typings.chromeApps.chromeAppsStrings.hy = "hy".asInstanceOf[typings.chromeApps.chromeAppsStrings.hy]
  
  @scala.inline
  def ia: typings.chromeApps.chromeAppsStrings.ia = "ia".asInstanceOf[typings.chromeApps.chromeAppsStrings.ia]
  
  @scala.inline
  def id: typings.chromeApps.chromeAppsStrings.id = "id".asInstanceOf[typings.chromeApps.chromeAppsStrings.id]
  
  @scala.inline
  def ig: typings.chromeApps.chromeAppsStrings.ig = "ig".asInstanceOf[typings.chromeApps.chromeAppsStrings.ig]
  
  @scala.inline
  def is: typings.chromeApps.chromeAppsStrings.is = "is".asInstanceOf[typings.chromeApps.chromeAppsStrings.is]
  
  @scala.inline
  def it: typings.chromeApps.chromeAppsStrings.it = "it".asInstanceOf[typings.chromeApps.chromeAppsStrings.it]
  
  @scala.inline
  def `it-CH`: typings.chromeApps.chromeAppsStrings.`it-CH` = "it-CH".asInstanceOf[typings.chromeApps.chromeAppsStrings.`it-CH`]
  
  @scala.inline
  def `it-IT`: typings.chromeApps.chromeAppsStrings.`it-IT` = "it-IT".asInstanceOf[typings.chromeApps.chromeAppsStrings.`it-IT`]
  
  @scala.inline
  def ja: typings.chromeApps.chromeAppsStrings.ja = "ja".asInstanceOf[typings.chromeApps.chromeAppsStrings.ja]
  
  @scala.inline
  def jv: typings.chromeApps.chromeAppsStrings.jv = "jv".asInstanceOf[typings.chromeApps.chromeAppsStrings.jv]
  
  @scala.inline
  def ka: typings.chromeApps.chromeAppsStrings.ka = "ka".asInstanceOf[typings.chromeApps.chromeAppsStrings.ka]
  
  @scala.inline
  def kk: typings.chromeApps.chromeAppsStrings.kk = "kk".asInstanceOf[typings.chromeApps.chromeAppsStrings.kk]
  
  @scala.inline
  def km: typings.chromeApps.chromeAppsStrings.km = "km".asInstanceOf[typings.chromeApps.chromeAppsStrings.km]
  
  @scala.inline
  def kn: typings.chromeApps.chromeAppsStrings.kn = "kn".asInstanceOf[typings.chromeApps.chromeAppsStrings.kn]
  
  @scala.inline
  def ko: typings.chromeApps.chromeAppsStrings.ko = "ko".asInstanceOf[typings.chromeApps.chromeAppsStrings.ko]
  
  @scala.inline
  def ku: typings.chromeApps.chromeAppsStrings.ku = "ku".asInstanceOf[typings.chromeApps.chromeAppsStrings.ku]
  
  @scala.inline
  def ky: typings.chromeApps.chromeAppsStrings.ky = "ky".asInstanceOf[typings.chromeApps.chromeAppsStrings.ky]
  
  @scala.inline
  def la: typings.chromeApps.chromeAppsStrings.la = "la".asInstanceOf[typings.chromeApps.chromeAppsStrings.la]
  
  @scala.inline
  def lb: typings.chromeApps.chromeAppsStrings.lb = "lb".asInstanceOf[typings.chromeApps.chromeAppsStrings.lb]
  
  @scala.inline
  def ln: typings.chromeApps.chromeAppsStrings.ln = "ln".asInstanceOf[typings.chromeApps.chromeAppsStrings.ln]
  
  @scala.inline
  def lo: typings.chromeApps.chromeAppsStrings.lo = "lo".asInstanceOf[typings.chromeApps.chromeAppsStrings.lo]
  
  @scala.inline
  def lt: typings.chromeApps.chromeAppsStrings.lt = "lt".asInstanceOf[typings.chromeApps.chromeAppsStrings.lt]
  
  @scala.inline
  def lv: typings.chromeApps.chromeAppsStrings.lv = "lv".asInstanceOf[typings.chromeApps.chromeAppsStrings.lv]
  
  @scala.inline
  def mg: typings.chromeApps.chromeAppsStrings.mg = "mg".asInstanceOf[typings.chromeApps.chromeAppsStrings.mg]
  
  @scala.inline
  def mi: typings.chromeApps.chromeAppsStrings.mi = "mi".asInstanceOf[typings.chromeApps.chromeAppsStrings.mi]
  
  @scala.inline
  def mk: typings.chromeApps.chromeAppsStrings.mk = "mk".asInstanceOf[typings.chromeApps.chromeAppsStrings.mk]
  
  @scala.inline
  def ml: typings.chromeApps.chromeAppsStrings.ml = "ml".asInstanceOf[typings.chromeApps.chromeAppsStrings.ml]
  
  @scala.inline
  def mn: typings.chromeApps.chromeAppsStrings.mn = "mn".asInstanceOf[typings.chromeApps.chromeAppsStrings.mn]
  
  @scala.inline
  def mo: typings.chromeApps.chromeAppsStrings.mo = "mo".asInstanceOf[typings.chromeApps.chromeAppsStrings.mo]
  
  @scala.inline
  def mr: typings.chromeApps.chromeAppsStrings.mr = "mr".asInstanceOf[typings.chromeApps.chromeAppsStrings.mr]
  
  @scala.inline
  def ms: typings.chromeApps.chromeAppsStrings.ms = "ms".asInstanceOf[typings.chromeApps.chromeAppsStrings.ms]
  
  @scala.inline
  def mt: typings.chromeApps.chromeAppsStrings.mt = "mt".asInstanceOf[typings.chromeApps.chromeAppsStrings.mt]
  
  @scala.inline
  def my: typings.chromeApps.chromeAppsStrings.my = "my".asInstanceOf[typings.chromeApps.chromeAppsStrings.my]
  
  @scala.inline
  def nb: typings.chromeApps.chromeAppsStrings.nb = "nb".asInstanceOf[typings.chromeApps.chromeAppsStrings.nb]
  
  @scala.inline
  def ne: typings.chromeApps.chromeAppsStrings.ne = "ne".asInstanceOf[typings.chromeApps.chromeAppsStrings.ne]
  
  @scala.inline
  def nl: typings.chromeApps.chromeAppsStrings.nl = "nl".asInstanceOf[typings.chromeApps.chromeAppsStrings.nl]
  
  @scala.inline
  def nn: typings.chromeApps.chromeAppsStrings.nn = "nn".asInstanceOf[typings.chromeApps.chromeAppsStrings.nn]
  
  @scala.inline
  def no: typings.chromeApps.chromeAppsStrings.no = "no".asInstanceOf[typings.chromeApps.chromeAppsStrings.no]
  
  @scala.inline
  def ny: typings.chromeApps.chromeAppsStrings.ny = "ny".asInstanceOf[typings.chromeApps.chromeAppsStrings.ny]
  
  @scala.inline
  def oc: typings.chromeApps.chromeAppsStrings.oc = "oc".asInstanceOf[typings.chromeApps.chromeAppsStrings.oc]
  
  @scala.inline
  def om: typings.chromeApps.chromeAppsStrings.om = "om".asInstanceOf[typings.chromeApps.chromeAppsStrings.om]
  
  @scala.inline
  def or: typings.chromeApps.chromeAppsStrings.or = "or".asInstanceOf[typings.chromeApps.chromeAppsStrings.or]
  
  @scala.inline
  def pa: typings.chromeApps.chromeAppsStrings.pa = "pa".asInstanceOf[typings.chromeApps.chromeAppsStrings.pa]
  
  @scala.inline
  def pl: typings.chromeApps.chromeAppsStrings.pl = "pl".asInstanceOf[typings.chromeApps.chromeAppsStrings.pl]
  
  @scala.inline
  def ps: typings.chromeApps.chromeAppsStrings.ps = "ps".asInstanceOf[typings.chromeApps.chromeAppsStrings.ps]
  
  @scala.inline
  def pt: typings.chromeApps.chromeAppsStrings.pt = "pt".asInstanceOf[typings.chromeApps.chromeAppsStrings.pt]
  
  @scala.inline
  def `pt-BR`: typings.chromeApps.chromeAppsStrings.`pt-BR` = "pt-BR".asInstanceOf[typings.chromeApps.chromeAppsStrings.`pt-BR`]
  
  @scala.inline
  def `pt-PT`: typings.chromeApps.chromeAppsStrings.`pt-PT` = "pt-PT".asInstanceOf[typings.chromeApps.chromeAppsStrings.`pt-PT`]
  
  @scala.inline
  def qu: typings.chromeApps.chromeAppsStrings.qu = "qu".asInstanceOf[typings.chromeApps.chromeAppsStrings.qu]
  
  @scala.inline
  def rm: typings.chromeApps.chromeAppsStrings.rm = "rm".asInstanceOf[typings.chromeApps.chromeAppsStrings.rm]
  
  @scala.inline
  def ro: typings.chromeApps.chromeAppsStrings.ro = "ro".asInstanceOf[typings.chromeApps.chromeAppsStrings.ro]
  
  @scala.inline
  def ru: typings.chromeApps.chromeAppsStrings.ru = "ru".asInstanceOf[typings.chromeApps.chromeAppsStrings.ru]
  
  @scala.inline
  def sd: typings.chromeApps.chromeAppsStrings.sd = "sd".asInstanceOf[typings.chromeApps.chromeAppsStrings.sd]
  
  @scala.inline
  def sh: typings.chromeApps.chromeAppsStrings.sh = "sh".asInstanceOf[typings.chromeApps.chromeAppsStrings.sh]
  
  @scala.inline
  def si: typings.chromeApps.chromeAppsStrings.si = "si".asInstanceOf[typings.chromeApps.chromeAppsStrings.si]
  
  @scala.inline
  def sk: typings.chromeApps.chromeAppsStrings.sk = "sk".asInstanceOf[typings.chromeApps.chromeAppsStrings.sk]
  
  @scala.inline
  def sl: typings.chromeApps.chromeAppsStrings.sl = "sl".asInstanceOf[typings.chromeApps.chromeAppsStrings.sl]
  
  @scala.inline
  def sm: typings.chromeApps.chromeAppsStrings.sm = "sm".asInstanceOf[typings.chromeApps.chromeAppsStrings.sm]
  
  @scala.inline
  def sn: typings.chromeApps.chromeAppsStrings.sn = "sn".asInstanceOf[typings.chromeApps.chromeAppsStrings.sn]
  
  @scala.inline
  def so: typings.chromeApps.chromeAppsStrings.so = "so".asInstanceOf[typings.chromeApps.chromeAppsStrings.so]
  
  @scala.inline
  def sq: typings.chromeApps.chromeAppsStrings.sq = "sq".asInstanceOf[typings.chromeApps.chromeAppsStrings.sq]
  
  @scala.inline
  def sr: typings.chromeApps.chromeAppsStrings.sr = "sr".asInstanceOf[typings.chromeApps.chromeAppsStrings.sr]
  
  @scala.inline
  def st: typings.chromeApps.chromeAppsStrings.st = "st".asInstanceOf[typings.chromeApps.chromeAppsStrings.st]
  
  @scala.inline
  def su: typings.chromeApps.chromeAppsStrings.su = "su".asInstanceOf[typings.chromeApps.chromeAppsStrings.su]
  
  @scala.inline
  def sv: typings.chromeApps.chromeAppsStrings.sv = "sv".asInstanceOf[typings.chromeApps.chromeAppsStrings.sv]
  
  @scala.inline
  def sw: typings.chromeApps.chromeAppsStrings.sw = "sw".asInstanceOf[typings.chromeApps.chromeAppsStrings.sw]
  
  @scala.inline
  def ta: typings.chromeApps.chromeAppsStrings.ta = "ta".asInstanceOf[typings.chromeApps.chromeAppsStrings.ta]
  
  @scala.inline
  def te: typings.chromeApps.chromeAppsStrings.te = "te".asInstanceOf[typings.chromeApps.chromeAppsStrings.te]
  
  @scala.inline
  def tg: typings.chromeApps.chromeAppsStrings.tg = "tg".asInstanceOf[typings.chromeApps.chromeAppsStrings.tg]
  
  @scala.inline
  def th: typings.chromeApps.chromeAppsStrings.th = "th".asInstanceOf[typings.chromeApps.chromeAppsStrings.th]
  
  @scala.inline
  def ti: typings.chromeApps.chromeAppsStrings.ti = "ti".asInstanceOf[typings.chromeApps.chromeAppsStrings.ti]
  
  @scala.inline
  def tk: typings.chromeApps.chromeAppsStrings.tk = "tk".asInstanceOf[typings.chromeApps.chromeAppsStrings.tk]
  
  @scala.inline
  def to: typings.chromeApps.chromeAppsStrings.to = "to".asInstanceOf[typings.chromeApps.chromeAppsStrings.to]
  
  @scala.inline
  def tr: typings.chromeApps.chromeAppsStrings.tr = "tr".asInstanceOf[typings.chromeApps.chromeAppsStrings.tr]
  
  @scala.inline
  def tt: typings.chromeApps.chromeAppsStrings.tt = "tt".asInstanceOf[typings.chromeApps.chromeAppsStrings.tt]
  
  @scala.inline
  def tw: typings.chromeApps.chromeAppsStrings.tw = "tw".asInstanceOf[typings.chromeApps.chromeAppsStrings.tw]
  
  @scala.inline
  def ug: typings.chromeApps.chromeAppsStrings.ug = "ug".asInstanceOf[typings.chromeApps.chromeAppsStrings.ug]
  
  @scala.inline
  def uk: typings.chromeApps.chromeAppsStrings.uk = "uk".asInstanceOf[typings.chromeApps.chromeAppsStrings.uk]
  
  @scala.inline
  def und: typings.chromeApps.chromeAppsStrings.und = "und".asInstanceOf[typings.chromeApps.chromeAppsStrings.und]
  
  @scala.inline
  def ur: typings.chromeApps.chromeAppsStrings.ur = "ur".asInstanceOf[typings.chromeApps.chromeAppsStrings.ur]
  
  @scala.inline
  def uz: typings.chromeApps.chromeAppsStrings.uz = "uz".asInstanceOf[typings.chromeApps.chromeAppsStrings.uz]
  
  @scala.inline
  def vi: typings.chromeApps.chromeAppsStrings.vi = "vi".asInstanceOf[typings.chromeApps.chromeAppsStrings.vi]
  
  @scala.inline
  def wa: typings.chromeApps.chromeAppsStrings.wa = "wa".asInstanceOf[typings.chromeApps.chromeAppsStrings.wa]
  
  @scala.inline
  def xh: typings.chromeApps.chromeAppsStrings.xh = "xh".asInstanceOf[typings.chromeApps.chromeAppsStrings.xh]
  
  @scala.inline
  def yi: typings.chromeApps.chromeAppsStrings.yi = "yi".asInstanceOf[typings.chromeApps.chromeAppsStrings.yi]
  
  @scala.inline
  def yo: typings.chromeApps.chromeAppsStrings.yo = "yo".asInstanceOf[typings.chromeApps.chromeAppsStrings.yo]
  
  @scala.inline
  def zh: typings.chromeApps.chromeAppsStrings.zh = "zh".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh]
  
  @scala.inline
  def `zh-CN`: typings.chromeApps.chromeAppsStrings.`zh-CN` = "zh-CN".asInstanceOf[typings.chromeApps.chromeAppsStrings.`zh-CN`]
  
  @scala.inline
  def `zh-HK`: typings.chromeApps.chromeAppsStrings.`zh-HK` = "zh-HK".asInstanceOf[typings.chromeApps.chromeAppsStrings.`zh-HK`]
  
  @scala.inline
  def `zh-TW`: typings.chromeApps.chromeAppsStrings.`zh-TW` = "zh-TW".asInstanceOf[typings.chromeApps.chromeAppsStrings.`zh-TW`]
  
  @scala.inline
  def zh_hans_cn: typings.chromeApps.chromeAppsStrings.zh_hans_cn = "zh_hans_cn".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hans_cn]
  
  @scala.inline
  def zh_hans_sg: typings.chromeApps.chromeAppsStrings.zh_hans_sg = "zh_hans_sg".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hans_sg]
  
  @scala.inline
  def zh_hant_hk: typings.chromeApps.chromeAppsStrings.zh_hant_hk = "zh_hant_hk".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hant_hk]
  
  @scala.inline
  def zh_hant_mo: typings.chromeApps.chromeAppsStrings.zh_hant_mo = "zh_hant_mo".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hant_mo]
  
  @scala.inline
  def zh_hant_tw: typings.chromeApps.chromeAppsStrings.zh_hant_tw = "zh_hant_tw".asInstanceOf[typings.chromeApps.chromeAppsStrings.zh_hant_tw]
  
  @scala.inline
  def zu: typings.chromeApps.chromeAppsStrings.zu = "zu".asInstanceOf[typings.chromeApps.chromeAppsStrings.zu]
}
