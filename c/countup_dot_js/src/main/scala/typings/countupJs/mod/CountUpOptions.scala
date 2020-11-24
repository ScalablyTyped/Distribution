package typings.countupJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountUpOptions extends js.Object {
  
  var decimal: js.UndefOr[String] = js.native
  
  var decimalPlaces: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easingFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.native
  
  var formattingFn: js.UndefOr[js.Function1[/* n */ Double, String]] = js.native
  
  var numerals: js.UndefOr[js.Array[String]] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var smartEasingAmount: js.UndefOr[Double] = js.native
  
  var smartEasingThreshold: js.UndefOr[Double] = js.native
  
  var startVal: js.UndefOr[Double] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var useEasing: js.UndefOr[Boolean] = js.native
  
  var useGrouping: js.UndefOr[Boolean] = js.native
}
object CountUpOptions {
  
  @scala.inline
  def apply(): CountUpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountUpOptions]
  }
  
  @scala.inline
  implicit class CountUpOptionsOps[Self <: CountUpOptions] (val x: Self) extends AnyVal {
    
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
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    
    @scala.inline
    def setDecimalPlaces(value: Double): Self = this.set("decimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalPlaces: Self = this.set("decimalPlaces", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasingFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = this.set("easingFn", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteEasingFn: Self = this.set("easingFn", js.undefined)
    
    @scala.inline
    def setFormattingFn(value: /* n */ Double => String): Self = this.set("formattingFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormattingFn: Self = this.set("formattingFn", js.undefined)
    
    @scala.inline
    def setNumeralsVarargs(value: String*): Self = this.set("numerals", js.Array(value :_*))
    
    @scala.inline
    def setNumerals(value: js.Array[String]): Self = this.set("numerals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumerals: Self = this.set("numerals", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSmartEasingAmount(value: Double): Self = this.set("smartEasingAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartEasingAmount: Self = this.set("smartEasingAmount", js.undefined)
    
    @scala.inline
    def setSmartEasingThreshold(value: Double): Self = this.set("smartEasingThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartEasingThreshold: Self = this.set("smartEasingThreshold", js.undefined)
    
    @scala.inline
    def setStartVal(value: Double): Self = this.set("startVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartVal: Self = this.set("startVal", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setUseEasing(value: Boolean): Self = this.set("useEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEasing: Self = this.set("useEasing", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
  }
}
