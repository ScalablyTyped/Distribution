package typings.csstype.mod.AtRule

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined csstype.csstype.Fallback<csstype.csstype.AtRule.CounterStyle<TLength, TTime>> */
trait CounterStyleFallback[TLength, TTime] extends StObject {
  
  var additiveSymbols: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var fallback: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var negative: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var pad: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var prefix: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var range: js.UndefOr[Range | js.Array[NonNullable[js.UndefOr[Range]]]] = js.undefined
  
  var speakAs: js.UndefOr[SpeakAs | js.Array[NonNullable[js.UndefOr[SpeakAs]]]] = js.undefined
  
  var suffix: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var symbols: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var system: js.UndefOr[System | js.Array[NonNullable[js.UndefOr[System]]]] = js.undefined
}
object CounterStyleFallback {
  
  inline def apply[TLength, TTime](): CounterStyleFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyleFallback[TLength, TTime]]
  }
  
  extension [Self <: CounterStyleFallback[?, ?], TLength, TTime](x: Self & (CounterStyleFallback[TLength, TTime])) {
    
    inline def setAdditiveSymbols(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "additiveSymbols", value.asInstanceOf[js.Any])
    
    inline def setAdditiveSymbolsUndefined: Self = StObject.set(x, "additiveSymbols", js.undefined)
    
    inline def setAdditiveSymbolsVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "additiveSymbols", js.Array(value*))
    
    inline def setFallback(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setFallbackVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "fallback", js.Array(value*))
    
    inline def setNegative(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setNegativeVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "negative", js.Array(value*))
    
    inline def setPad(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setPadVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "pad", js.Array(value*))
    
    inline def setPrefix(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPrefixVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "prefix", js.Array(value*))
    
    inline def setRange(value: Range | js.Array[NonNullable[js.UndefOr[Range]]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: NonNullable[js.UndefOr[Range]]*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setSpeakAs(value: SpeakAs | js.Array[NonNullable[js.UndefOr[SpeakAs]]]): Self = StObject.set(x, "speakAs", value.asInstanceOf[js.Any])
    
    inline def setSpeakAsUndefined: Self = StObject.set(x, "speakAs", js.undefined)
    
    inline def setSpeakAsVarargs(value: NonNullable[js.UndefOr[SpeakAs]]*): Self = StObject.set(x, "speakAs", js.Array(value*))
    
    inline def setSuffix(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSuffixVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "suffix", js.Array(value*))
    
    inline def setSymbols(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    inline def setSymbolsVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "symbols", js.Array(value*))
    
    inline def setSystem(value: System | js.Array[NonNullable[js.UndefOr[System]]]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setSystemVarargs(value: NonNullable[js.UndefOr[System]]*): Self = StObject.set(x, "system", js.Array(value*))
  }
}
