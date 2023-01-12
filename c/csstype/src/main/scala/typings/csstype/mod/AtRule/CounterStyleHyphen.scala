package typings.csstype.mod.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterStyleHyphen[TLength, TTime] extends StObject {
  
  var `additive-symbols`: js.UndefOr[String] = js.undefined
  
  var fallback: js.UndefOr[String] = js.undefined
  
  var negative: js.UndefOr[String] = js.undefined
  
  var pad: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var range: js.UndefOr[Range] = js.undefined
  
  var `speak-as`: js.UndefOr[SpeakAs] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var symbols: js.UndefOr[String] = js.undefined
  
  var system: js.UndefOr[System] = js.undefined
}
object CounterStyleHyphen {
  
  inline def apply[TLength, TTime](): CounterStyleHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyleHyphen[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CounterStyleHyphen[?, ?], TLength, TTime] (val x: Self & (CounterStyleHyphen[TLength, TTime])) extends AnyVal {
    
    inline def `setAdditive-symbols`(value: String): Self = StObject.set(x, "additive-symbols", value.asInstanceOf[js.Any])
    
    inline def `setAdditive-symbolsUndefined`: Self = StObject.set(x, "additive-symbols", js.undefined)
    
    inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setPad(value: String): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def `setSpeak-as`(value: SpeakAs): Self = StObject.set(x, "speak-as", value.asInstanceOf[js.Any])
    
    inline def `setSpeak-asUndefined`: Self = StObject.set(x, "speak-as", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSymbols(value: String): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    inline def setSystem(value: System): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
