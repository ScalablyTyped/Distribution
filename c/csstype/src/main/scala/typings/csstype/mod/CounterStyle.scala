package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CounterStyle extends js.Object {
  
  var additiveSymbols: js.UndefOr[String] = js.native
  
  var fallback: js.UndefOr[String] = js.native
  
  var negative: js.UndefOr[String] = js.native
  
  var pad: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var range: js.UndefOr[CounterStyleRangeProperty] = js.native
  
  var speakAs: js.UndefOr[CounterStyleSpeakAsProperty] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var symbols: js.UndefOr[String] = js.native
  
  var system: js.UndefOr[CounterStyleSystemProperty] = js.native
}
object CounterStyle {
  
  @scala.inline
  def apply(): CounterStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyle]
  }
  
  @scala.inline
  implicit class CounterStyleOps[Self <: CounterStyle] (val x: Self) extends AnyVal {
    
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
    def setAdditiveSymbols(value: String): Self = this.set("additiveSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditiveSymbols: Self = this.set("additiveSymbols", js.undefined)
    
    @scala.inline
    def setFallback(value: String): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setNegative(value: String): Self = this.set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    
    @scala.inline
    def setPad(value: String): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRange(value: CounterStyleRangeProperty): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSpeakAs(value: CounterStyleSpeakAsProperty): Self = this.set("speakAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeakAs: Self = this.set("speakAs", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setSymbols(value: String): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    
    @scala.inline
    def setSystem(value: CounterStyleSystemProperty): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
}
