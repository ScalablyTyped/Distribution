package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CounterStyleHyphenFallback extends js.Object {
  
  var `additive-symbols`: js.UndefOr[String | js.Array[String]] = js.native
  
  var fallback: js.UndefOr[String | js.Array[String]] = js.native
  
  var negative: js.UndefOr[String | js.Array[String]] = js.native
  
  var pad: js.UndefOr[String | js.Array[String]] = js.native
  
  var prefix: js.UndefOr[String | js.Array[String]] = js.native
  
  var range: js.UndefOr[CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]] = js.native
  
  var `speak-as`: js.UndefOr[CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]] = js.native
  
  var suffix: js.UndefOr[String | js.Array[String]] = js.native
  
  var symbols: js.UndefOr[String | js.Array[String]] = js.native
  
  var system: js.UndefOr[CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]] = js.native
}
object CounterStyleHyphenFallback {
  
  @scala.inline
  def apply(): CounterStyleHyphenFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyleHyphenFallback]
  }
  
  @scala.inline
  implicit class CounterStyleHyphenFallbackOps[Self <: CounterStyleHyphenFallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setAdditive-symbolsVarargs`(value: String*): Self = this.set("additive-symbols", js.Array(value :_*))
    
    @scala.inline
    def `setAdditive-symbols`(value: String | js.Array[String]): Self = this.set("additive-symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAdditive-symbols`: Self = this.set("additive-symbols", js.undefined)
    
    @scala.inline
    def setFallbackVarargs(value: String*): Self = this.set("fallback", js.Array(value :_*))
    
    @scala.inline
    def setFallback(value: String | js.Array[String]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setNegativeVarargs(value: String*): Self = this.set("negative", js.Array(value :_*))
    
    @scala.inline
    def setNegative(value: String | js.Array[String]): Self = this.set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    
    @scala.inline
    def setPadVarargs(value: String*): Self = this.set("pad", js.Array(value :_*))
    
    @scala.inline
    def setPad(value: String | js.Array[String]): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setPrefixVarargs(value: String*): Self = this.set("prefix", js.Array(value :_*))
    
    @scala.inline
    def setPrefix(value: String | js.Array[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: CounterStyleRangeProperty*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def `setSpeak-asVarargs`(value: CounterStyleSpeakAsProperty*): Self = this.set("speak-as", js.Array(value :_*))
    
    @scala.inline
    def `setSpeak-as`(value: CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]): Self = this.set("speak-as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSpeak-as`: Self = this.set("speak-as", js.undefined)
    
    @scala.inline
    def setSuffixVarargs(value: String*): Self = this.set("suffix", js.Array(value :_*))
    
    @scala.inline
    def setSuffix(value: String | js.Array[String]): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setSymbolsVarargs(value: String*): Self = this.set("symbols", js.Array(value :_*))
    
    @scala.inline
    def setSymbols(value: String | js.Array[String]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    
    @scala.inline
    def setSystemVarargs(value: CounterStyleSystemProperty*): Self = this.set("system", js.Array(value :_*))
    
    @scala.inline
    def setSystem(value: CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
}
