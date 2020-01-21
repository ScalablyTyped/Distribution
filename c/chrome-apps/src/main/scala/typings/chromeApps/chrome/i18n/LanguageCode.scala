package typings.chromeApps.chrome.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def af: typings.chromeApps.chromeAppsStrings.af = this.cast("af")
  @scala.inline
  def am: typings.chromeApps.chromeAppsStrings.am = this.cast("am")
  @scala.inline
  def an: typings.chromeApps.chromeAppsStrings.an = this.cast("an")
  @scala.inline
  def ar: typings.chromeApps.chromeAppsStrings.ar = this.cast("ar")
  @scala.inline
  def ar_001: typings.chromeApps.chromeAppsStrings.ar_001 = this.cast("ar_001")
  @scala.inline
  def ast: typings.chromeApps.chromeAppsStrings.ast = this.cast("ast")
  @scala.inline
  def az: typings.chromeApps.chromeAppsStrings.az = this.cast("az")
  @scala.inline
  def be: typings.chromeApps.chromeAppsStrings.be = this.cast("be")
  @scala.inline
  def bg: typings.chromeApps.chromeAppsStrings.bg = this.cast("bg")
  @scala.inline
  def bh: typings.chromeApps.chromeAppsStrings.bh = this.cast("bh")
  @scala.inline
  def bn: typings.chromeApps.chromeAppsStrings.bn = this.cast("bn")
  @scala.inline
  def br: typings.chromeApps.chromeAppsStrings.br = this.cast("br")
  @scala.inline
  def bs: typings.chromeApps.chromeAppsStrings.bs = this.cast("bs")
  @scala.inline
  def ca: typings.chromeApps.chromeAppsStrings.ca = this.cast("ca")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ceb: typings.chromeApps.chromeAppsStrings.ceb = this.cast("ceb")
  @scala.inline
  def ckb: typings.chromeApps.chromeAppsStrings.ckb = this.cast("ckb")
  @scala.inline
  def co: typings.chromeApps.chromeAppsStrings.co = this.cast("co")
  @scala.inline
  def cs: typings.chromeApps.chromeAppsStrings.cs = this.cast("cs")
  @scala.inline
  def cy: typings.chromeApps.chromeAppsStrings.cy = this.cast("cy")
  @scala.inline
  def da: typings.chromeApps.chromeAppsStrings.da = this.cast("da")
  @scala.inline
  def de: typings.chromeApps.chromeAppsStrings.de = this.cast("de")
  @scala.inline
  def `de-AT`: typings.chromeApps.chromeAppsStrings.`de-AT` = this.cast("de-AT")
  @scala.inline
  def `de-CH`: typings.chromeApps.chromeAppsStrings.`de-CH` = this.cast("de-CH")
  @scala.inline
  def `de-DE`: typings.chromeApps.chromeAppsStrings.`de-DE` = this.cast("de-DE")
  @scala.inline
  def `de-LI`: typings.chromeApps.chromeAppsStrings.`de-LI` = this.cast("de-LI")
  @scala.inline
  def el: typings.chromeApps.chromeAppsStrings.el = this.cast("el")
  @scala.inline
  def en: typings.chromeApps.chromeAppsStrings.en = this.cast("en")
  @scala.inline
  def `en-AU`: typings.chromeApps.chromeAppsStrings.`en-AU` = this.cast("en-AU")
  @scala.inline
  def `en-CA`: typings.chromeApps.chromeAppsStrings.`en-CA` = this.cast("en-CA")
  @scala.inline
  def `en-GB`: typings.chromeApps.chromeAppsStrings.`en-GB` = this.cast("en-GB")
  @scala.inline
  def `en-IN`: typings.chromeApps.chromeAppsStrings.`en-IN` = this.cast("en-IN")
  @scala.inline
  def `en-NZ`: typings.chromeApps.chromeAppsStrings.`en-NZ` = this.cast("en-NZ")
  @scala.inline
  def `en-US`: typings.chromeApps.chromeAppsStrings.`en-US` = this.cast("en-US")
  @scala.inline
  def `en-ZA`: typings.chromeApps.chromeAppsStrings.`en-ZA` = this.cast("en-ZA")
  @scala.inline
  def en_001: typings.chromeApps.chromeAppsStrings.en_001 = this.cast("en_001")
  @scala.inline
  def en_150: typings.chromeApps.chromeAppsStrings.en_150 = this.cast("en_150")
  @scala.inline
  def eo: typings.chromeApps.chromeAppsStrings.eo = this.cast("eo")
  @scala.inline
  def es: typings.chromeApps.chromeAppsStrings.es = this.cast("es")
  @scala.inline
  def `es-419`: typings.chromeApps.chromeAppsStrings.`es-419` = this.cast("es-419")
  @scala.inline
  def `es-AR`: typings.chromeApps.chromeAppsStrings.`es-AR` = this.cast("es-AR")
  @scala.inline
  def `es-CL`: typings.chromeApps.chromeAppsStrings.`es-CL` = this.cast("es-CL")
  @scala.inline
  def `es-CO`: typings.chromeApps.chromeAppsStrings.`es-CO` = this.cast("es-CO")
  @scala.inline
  def `es-CR`: typings.chromeApps.chromeAppsStrings.`es-CR` = this.cast("es-CR")
  @scala.inline
  def `es-ES`: typings.chromeApps.chromeAppsStrings.`es-ES` = this.cast("es-ES")
  @scala.inline
  def `es-HN`: typings.chromeApps.chromeAppsStrings.`es-HN` = this.cast("es-HN")
  @scala.inline
  def `es-MX`: typings.chromeApps.chromeAppsStrings.`es-MX` = this.cast("es-MX")
  @scala.inline
  def `es-PE`: typings.chromeApps.chromeAppsStrings.`es-PE` = this.cast("es-PE")
  @scala.inline
  def `es-US`: typings.chromeApps.chromeAppsStrings.`es-US` = this.cast("es-US")
  @scala.inline
  def `es-UY`: typings.chromeApps.chromeAppsStrings.`es-UY` = this.cast("es-UY")
  @scala.inline
  def `es-VE`: typings.chromeApps.chromeAppsStrings.`es-VE` = this.cast("es-VE")
  @scala.inline
  def et: typings.chromeApps.chromeAppsStrings.et = this.cast("et")
  @scala.inline
  def eu: typings.chromeApps.chromeAppsStrings.eu = this.cast("eu")
  @scala.inline
  def fa: typings.chromeApps.chromeAppsStrings.fa = this.cast("fa")
  @scala.inline
  def fi: typings.chromeApps.chromeAppsStrings.fi = this.cast("fi")
  @scala.inline
  def fil: typings.chromeApps.chromeAppsStrings.fil = this.cast("fil")
  @scala.inline
  def fo: typings.chromeApps.chromeAppsStrings.fo = this.cast("fo")
  @scala.inline
  def fr: typings.chromeApps.chromeAppsStrings.fr = this.cast("fr")
  @scala.inline
  def `fr-CA`: typings.chromeApps.chromeAppsStrings.`fr-CA` = this.cast("fr-CA")
  @scala.inline
  def `fr-CH`: typings.chromeApps.chromeAppsStrings.`fr-CH` = this.cast("fr-CH")
  @scala.inline
  def `fr-FR`: typings.chromeApps.chromeAppsStrings.`fr-FR` = this.cast("fr-FR")
  @scala.inline
  def fy: typings.chromeApps.chromeAppsStrings.fy = this.cast("fy")
  @scala.inline
  def ga: typings.chromeApps.chromeAppsStrings.ga = this.cast("ga")
  @scala.inline
  def gd: typings.chromeApps.chromeAppsStrings.gd = this.cast("gd")
  @scala.inline
  def gl: typings.chromeApps.chromeAppsStrings.gl = this.cast("gl")
  @scala.inline
  def gn: typings.chromeApps.chromeAppsStrings.gn = this.cast("gn")
  @scala.inline
  def gu: typings.chromeApps.chromeAppsStrings.gu = this.cast("gu")
  @scala.inline
  def ha: typings.chromeApps.chromeAppsStrings.ha = this.cast("ha")
  @scala.inline
  def haw: typings.chromeApps.chromeAppsStrings.haw = this.cast("haw")
  @scala.inline
  def he: typings.chromeApps.chromeAppsStrings.he = this.cast("he")
  @scala.inline
  def hi: typings.chromeApps.chromeAppsStrings.hi = this.cast("hi")
  @scala.inline
  def hmn: typings.chromeApps.chromeAppsStrings.hmn = this.cast("hmn")
  @scala.inline
  def hr: typings.chromeApps.chromeAppsStrings.hr = this.cast("hr")
  @scala.inline
  def ht: typings.chromeApps.chromeAppsStrings.ht = this.cast("ht")
  @scala.inline
  def hu: typings.chromeApps.chromeAppsStrings.hu = this.cast("hu")
  @scala.inline
  def hy: typings.chromeApps.chromeAppsStrings.hy = this.cast("hy")
  @scala.inline
  def ia: typings.chromeApps.chromeAppsStrings.ia = this.cast("ia")
  @scala.inline
  def id: typings.chromeApps.chromeAppsStrings.id = this.cast("id")
  @scala.inline
  def ig: typings.chromeApps.chromeAppsStrings.ig = this.cast("ig")
  @scala.inline
  def is: typings.chromeApps.chromeAppsStrings.is = this.cast("is")
  @scala.inline
  def it: typings.chromeApps.chromeAppsStrings.it = this.cast("it")
  @scala.inline
  def `it-CH`: typings.chromeApps.chromeAppsStrings.`it-CH` = this.cast("it-CH")
  @scala.inline
  def `it-IT`: typings.chromeApps.chromeAppsStrings.`it-IT` = this.cast("it-IT")
  @scala.inline
  def ja: typings.chromeApps.chromeAppsStrings.ja = this.cast("ja")
  @scala.inline
  def jv: typings.chromeApps.chromeAppsStrings.jv = this.cast("jv")
  @scala.inline
  def ka: typings.chromeApps.chromeAppsStrings.ka = this.cast("ka")
  @scala.inline
  def kk: typings.chromeApps.chromeAppsStrings.kk = this.cast("kk")
  @scala.inline
  def km: typings.chromeApps.chromeAppsStrings.km = this.cast("km")
  @scala.inline
  def kn: typings.chromeApps.chromeAppsStrings.kn = this.cast("kn")
  @scala.inline
  def ko: typings.chromeApps.chromeAppsStrings.ko = this.cast("ko")
  @scala.inline
  def ku: typings.chromeApps.chromeAppsStrings.ku = this.cast("ku")
  @scala.inline
  def ky: typings.chromeApps.chromeAppsStrings.ky = this.cast("ky")
  @scala.inline
  def la: typings.chromeApps.chromeAppsStrings.la = this.cast("la")
  @scala.inline
  def lb: typings.chromeApps.chromeAppsStrings.lb = this.cast("lb")
  @scala.inline
  def ln: typings.chromeApps.chromeAppsStrings.ln = this.cast("ln")
  @scala.inline
  def lo: typings.chromeApps.chromeAppsStrings.lo = this.cast("lo")
  @scala.inline
  def lt: typings.chromeApps.chromeAppsStrings.lt = this.cast("lt")
  @scala.inline
  def lv: typings.chromeApps.chromeAppsStrings.lv = this.cast("lv")
  @scala.inline
  def mg: typings.chromeApps.chromeAppsStrings.mg = this.cast("mg")
  @scala.inline
  def mi: typings.chromeApps.chromeAppsStrings.mi = this.cast("mi")
  @scala.inline
  def mk: typings.chromeApps.chromeAppsStrings.mk = this.cast("mk")
  @scala.inline
  def ml: typings.chromeApps.chromeAppsStrings.ml = this.cast("ml")
  @scala.inline
  def mn: typings.chromeApps.chromeAppsStrings.mn = this.cast("mn")
  @scala.inline
  def mo: typings.chromeApps.chromeAppsStrings.mo = this.cast("mo")
  @scala.inline
  def mr: typings.chromeApps.chromeAppsStrings.mr = this.cast("mr")
  @scala.inline
  def ms: typings.chromeApps.chromeAppsStrings.ms = this.cast("ms")
  @scala.inline
  def mt: typings.chromeApps.chromeAppsStrings.mt = this.cast("mt")
  @scala.inline
  def my: typings.chromeApps.chromeAppsStrings.my = this.cast("my")
  @scala.inline
  def nb: typings.chromeApps.chromeAppsStrings.nb = this.cast("nb")
  @scala.inline
  def ne: typings.chromeApps.chromeAppsStrings.ne = this.cast("ne")
  @scala.inline
  def nl: typings.chromeApps.chromeAppsStrings.nl = this.cast("nl")
  @scala.inline
  def nn: typings.chromeApps.chromeAppsStrings.nn = this.cast("nn")
  @scala.inline
  def no: typings.chromeApps.chromeAppsStrings.no = this.cast("no")
  @scala.inline
  def ny: typings.chromeApps.chromeAppsStrings.ny = this.cast("ny")
  @scala.inline
  def oc: typings.chromeApps.chromeAppsStrings.oc = this.cast("oc")
  @scala.inline
  def om: typings.chromeApps.chromeAppsStrings.om = this.cast("om")
  @scala.inline
  def or: typings.chromeApps.chromeAppsStrings.or = this.cast("or")
  @scala.inline
  def pa: typings.chromeApps.chromeAppsStrings.pa = this.cast("pa")
  @scala.inline
  def pl: typings.chromeApps.chromeAppsStrings.pl = this.cast("pl")
  @scala.inline
  def ps: typings.chromeApps.chromeAppsStrings.ps = this.cast("ps")
  @scala.inline
  def pt: typings.chromeApps.chromeAppsStrings.pt = this.cast("pt")
  @scala.inline
  def `pt-BR`: typings.chromeApps.chromeAppsStrings.`pt-BR` = this.cast("pt-BR")
  @scala.inline
  def `pt-PT`: typings.chromeApps.chromeAppsStrings.`pt-PT` = this.cast("pt-PT")
  @scala.inline
  def qu: typings.chromeApps.chromeAppsStrings.qu = this.cast("qu")
  @scala.inline
  def rm: typings.chromeApps.chromeAppsStrings.rm = this.cast("rm")
  @scala.inline
  def ro: typings.chromeApps.chromeAppsStrings.ro = this.cast("ro")
  @scala.inline
  def ru: typings.chromeApps.chromeAppsStrings.ru = this.cast("ru")
  @scala.inline
  def sd: typings.chromeApps.chromeAppsStrings.sd = this.cast("sd")
  @scala.inline
  def sh: typings.chromeApps.chromeAppsStrings.sh = this.cast("sh")
  @scala.inline
  def si: typings.chromeApps.chromeAppsStrings.si = this.cast("si")
  @scala.inline
  def sk: typings.chromeApps.chromeAppsStrings.sk = this.cast("sk")
  @scala.inline
  def sl: typings.chromeApps.chromeAppsStrings.sl = this.cast("sl")
  @scala.inline
  def sm: typings.chromeApps.chromeAppsStrings.sm = this.cast("sm")
  @scala.inline
  def sn: typings.chromeApps.chromeAppsStrings.sn = this.cast("sn")
  @scala.inline
  def so: typings.chromeApps.chromeAppsStrings.so = this.cast("so")
  @scala.inline
  def sq: typings.chromeApps.chromeAppsStrings.sq = this.cast("sq")
  @scala.inline
  def sr: typings.chromeApps.chromeAppsStrings.sr = this.cast("sr")
  @scala.inline
  def st: typings.chromeApps.chromeAppsStrings.st = this.cast("st")
  @scala.inline
  def su: typings.chromeApps.chromeAppsStrings.su = this.cast("su")
  @scala.inline
  def sv: typings.chromeApps.chromeAppsStrings.sv = this.cast("sv")
  @scala.inline
  def sw: typings.chromeApps.chromeAppsStrings.sw = this.cast("sw")
  @scala.inline
  def ta: typings.chromeApps.chromeAppsStrings.ta = this.cast("ta")
  @scala.inline
  def te: typings.chromeApps.chromeAppsStrings.te = this.cast("te")
  @scala.inline
  def tg: typings.chromeApps.chromeAppsStrings.tg = this.cast("tg")
  @scala.inline
  def th: typings.chromeApps.chromeAppsStrings.th = this.cast("th")
  @scala.inline
  def ti: typings.chromeApps.chromeAppsStrings.ti = this.cast("ti")
  @scala.inline
  def tk: typings.chromeApps.chromeAppsStrings.tk = this.cast("tk")
  @scala.inline
  def to: typings.chromeApps.chromeAppsStrings.to = this.cast("to")
  @scala.inline
  def tr: typings.chromeApps.chromeAppsStrings.tr = this.cast("tr")
  @scala.inline
  def tt: typings.chromeApps.chromeAppsStrings.tt = this.cast("tt")
  @scala.inline
  def tw: typings.chromeApps.chromeAppsStrings.tw = this.cast("tw")
  @scala.inline
  def ug: typings.chromeApps.chromeAppsStrings.ug = this.cast("ug")
  @scala.inline
  def uk: typings.chromeApps.chromeAppsStrings.uk = this.cast("uk")
  @scala.inline
  def und: typings.chromeApps.chromeAppsStrings.und = this.cast("und")
  @scala.inline
  def ur: typings.chromeApps.chromeAppsStrings.ur = this.cast("ur")
  @scala.inline
  def uz: typings.chromeApps.chromeAppsStrings.uz = this.cast("uz")
  @scala.inline
  def vi: typings.chromeApps.chromeAppsStrings.vi = this.cast("vi")
  @scala.inline
  def wa: typings.chromeApps.chromeAppsStrings.wa = this.cast("wa")
  @scala.inline
  def xh: typings.chromeApps.chromeAppsStrings.xh = this.cast("xh")
  @scala.inline
  def yi: typings.chromeApps.chromeAppsStrings.yi = this.cast("yi")
  @scala.inline
  def yo: typings.chromeApps.chromeAppsStrings.yo = this.cast("yo")
  @scala.inline
  def zh: typings.chromeApps.chromeAppsStrings.zh = this.cast("zh")
  @scala.inline
  def `zh-CN`: typings.chromeApps.chromeAppsStrings.`zh-CN` = this.cast("zh-CN")
  @scala.inline
  def `zh-HK`: typings.chromeApps.chromeAppsStrings.`zh-HK` = this.cast("zh-HK")
  @scala.inline
  def `zh-TW`: typings.chromeApps.chromeAppsStrings.`zh-TW` = this.cast("zh-TW")
  @scala.inline
  def zh_hans_cn: typings.chromeApps.chromeAppsStrings.zh_hans_cn = this.cast("zh_hans_cn")
  @scala.inline
  def zh_hans_sg: typings.chromeApps.chromeAppsStrings.zh_hans_sg = this.cast("zh_hans_sg")
  @scala.inline
  def zh_hant_hk: typings.chromeApps.chromeAppsStrings.zh_hant_hk = this.cast("zh_hant_hk")
  @scala.inline
  def zh_hant_mo: typings.chromeApps.chromeAppsStrings.zh_hant_mo = this.cast("zh_hant_mo")
  @scala.inline
  def zh_hant_tw: typings.chromeApps.chromeAppsStrings.zh_hant_tw = this.cast("zh_hant_tw")
  @scala.inline
  def zu: typings.chromeApps.chromeAppsStrings.zu = this.cast("zu")
}

