package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<coingecko-api.coingecko-api.Locale, string> */
trait Localization extends StObject {
  
  var ar: String
  
  var de: String
  
  var en: String
  
  var es: String
  
  var fr: String
  
  var hu: String
  
  var id: String
  
  var it: String
  
  var ja: String
  
  var ko: String
  
  var nl: String
  
  var pl: String
  
  var pt: String
  
  var ro: String
  
  var ru: String
  
  var sv: String
  
  var th: String
  
  var tr: String
  
  var vi: String
  
  var zh: String
  
  var `zh-tw`: String
}
object Localization {
  
  inline def apply(
    ar: String,
    de: String,
    en: String,
    es: String,
    fr: String,
    hu: String,
    id: String,
    it: String,
    ja: String,
    ko: String,
    nl: String,
    pl: String,
    pt: String,
    ro: String,
    ru: String,
    sv: String,
    th: String,
    tr: String,
    vi: String,
    zh: String,
    `zh-tw`: String
  ): Localization = {
    val __obj = js.Dynamic.literal(ar = ar.asInstanceOf[js.Any], de = de.asInstanceOf[js.Any], en = en.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any], fr = fr.asInstanceOf[js.Any], hu = hu.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], ja = ja.asInstanceOf[js.Any], ko = ko.asInstanceOf[js.Any], nl = nl.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any], ro = ro.asInstanceOf[js.Any], ru = ru.asInstanceOf[js.Any], sv = sv.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], vi = vi.asInstanceOf[js.Any], zh = zh.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-tw")(`zh-tw`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Localization]
  }
  
  extension [Self <: Localization](x: Self) {
    
    inline def setAr(value: String): Self = StObject.set(x, "ar", value.asInstanceOf[js.Any])
    
    inline def setDe(value: String): Self = StObject.set(x, "de", value.asInstanceOf[js.Any])
    
    inline def setEn(value: String): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
    
    inline def setEs(value: String): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    inline def setFr(value: String): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
    
    inline def setHu(value: String): Self = StObject.set(x, "hu", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIt(value: String): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
    
    inline def setJa(value: String): Self = StObject.set(x, "ja", value.asInstanceOf[js.Any])
    
    inline def setKo(value: String): Self = StObject.set(x, "ko", value.asInstanceOf[js.Any])
    
    inline def setNl(value: String): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
    
    inline def setPl(value: String): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    inline def setPt(value: String): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    inline def setRo(value: String): Self = StObject.set(x, "ro", value.asInstanceOf[js.Any])
    
    inline def setRu(value: String): Self = StObject.set(x, "ru", value.asInstanceOf[js.Any])
    
    inline def setSv(value: String): Self = StObject.set(x, "sv", value.asInstanceOf[js.Any])
    
    inline def setTh(value: String): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
    
    inline def setTr(value: String): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    inline def setVi(value: String): Self = StObject.set(x, "vi", value.asInstanceOf[js.Any])
    
    inline def setZh(value: String): Self = StObject.set(x, "zh", value.asInstanceOf[js.Any])
    
    inline def `setZh-tw`(value: String): Self = StObject.set(x, "zh-tw", value.asInstanceOf[js.Any])
  }
}
