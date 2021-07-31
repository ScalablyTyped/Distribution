package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterStyleHyphenFallback extends StObject {
  
  var `additive-symbols`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var fallback: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var negative: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var pad: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var prefix: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var range: js.UndefOr[CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]] = js.undefined
  
  var `speak-as`: js.UndefOr[CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]] = js.undefined
  
  var suffix: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var symbols: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var system: js.UndefOr[CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]] = js.undefined
}
object CounterStyleHyphenFallback {
  
  @scala.inline
  def apply(): CounterStyleHyphenFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyleHyphenFallback]
  }
  
  @scala.inline
  implicit class CounterStyleHyphenFallbackMutableBuilder[Self <: CounterStyleHyphenFallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAdditive-symbols`(value: String | js.Array[String]): Self = StObject.set(x, "additive-symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAdditive-symbolsUndefined`: Self = StObject.set(x, "additive-symbols", js.undefined)
    
    @scala.inline
    def `setAdditive-symbolsVarargs`(value: String*): Self = StObject.set(x, "additive-symbols", js.Array(value :_*))
    
    @scala.inline
    def setFallback(value: String | js.Array[String]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setFallbackVarargs(value: String*): Self = StObject.set(x, "fallback", js.Array(value :_*))
    
    @scala.inline
    def setNegative(value: String | js.Array[String]): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    @scala.inline
    def setNegativeVarargs(value: String*): Self = StObject.set(x, "negative", js.Array(value :_*))
    
    @scala.inline
    def setPad(value: String | js.Array[String]): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setPadVarargs(value: String*): Self = StObject.set(x, "pad", js.Array(value :_*))
    
    @scala.inline
    def setPrefix(value: String | js.Array[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setPrefixVarargs(value: String*): Self = StObject.set(x, "prefix", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: CounterStyleRangeProperty*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def `setSpeak-as`(value: CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]): Self = StObject.set(x, "speak-as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSpeak-asUndefined`: Self = StObject.set(x, "speak-as", js.undefined)
    
    @scala.inline
    def `setSpeak-asVarargs`(value: CounterStyleSpeakAsProperty*): Self = StObject.set(x, "speak-as", js.Array(value :_*))
    
    @scala.inline
    def setSuffix(value: String | js.Array[String]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setSuffixVarargs(value: String*): Self = StObject.set(x, "suffix", js.Array(value :_*))
    
    @scala.inline
    def setSymbols(value: String | js.Array[String]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    @scala.inline
    def setSymbolsVarargs(value: String*): Self = StObject.set(x, "symbols", js.Array(value :_*))
    
    @scala.inline
    def setSystem(value: CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setSystemVarargs(value: CounterStyleSystemProperty*): Self = StObject.set(x, "system", js.Array(value :_*))
  }
}
