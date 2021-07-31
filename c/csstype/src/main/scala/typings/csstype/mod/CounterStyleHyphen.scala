package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterStyleHyphen extends StObject {
  
  var `additive-symbols`: js.UndefOr[String] = js.undefined
  
  var fallback: js.UndefOr[String] = js.undefined
  
  var negative: js.UndefOr[String] = js.undefined
  
  var pad: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var range: js.UndefOr[CounterStyleRangeProperty] = js.undefined
  
  var `speak-as`: js.UndefOr[CounterStyleSpeakAsProperty] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var symbols: js.UndefOr[String] = js.undefined
  
  var system: js.UndefOr[CounterStyleSystemProperty] = js.undefined
}
object CounterStyleHyphen {
  
  @scala.inline
  def apply(): CounterStyleHyphen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyleHyphen]
  }
  
  @scala.inline
  implicit class CounterStyleHyphenMutableBuilder[Self <: CounterStyleHyphen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAdditive-symbols`(value: String): Self = StObject.set(x, "additive-symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAdditive-symbolsUndefined`: Self = StObject.set(x, "additive-symbols", js.undefined)
    
    @scala.inline
    def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    @scala.inline
    def setPad(value: String): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setRange(value: CounterStyleRangeProperty): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def `setSpeak-as`(value: CounterStyleSpeakAsProperty): Self = StObject.set(x, "speak-as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSpeak-asUndefined`: Self = StObject.set(x, "speak-as", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setSymbols(value: String): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    @scala.inline
    def setSystem(value: CounterStyleSystemProperty): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
