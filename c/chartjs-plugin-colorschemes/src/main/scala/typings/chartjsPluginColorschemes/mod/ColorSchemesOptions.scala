package typings.chartjsPluginColorschemes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSchemesOptions extends js.Object {
  
  var custom: js.UndefOr[js.Function1[/* schemeColors */ js.Array[String], js.Array[String] | Unit]] = js.native
  
  var fillAlpha: js.UndefOr[Double] = js.native
  
  var `override`: js.UndefOr[Boolean] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var scheme: String | js.Array[String] = js.native
}
object ColorSchemesOptions {
  
  @scala.inline
  def apply(scheme: String | js.Array[String]): ColorSchemesOptions = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSchemesOptions]
  }
  
  @scala.inline
  implicit class ColorSchemesOptionsOps[Self <: ColorSchemesOptions] (val x: Self) extends AnyVal {
    
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
    def setSchemeVarargs(value: String*): Self = this.set("scheme", js.Array(value :_*))
    
    @scala.inline
    def setScheme(value: String | js.Array[String]): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: /* schemeColors */ js.Array[String] => js.Array[String] | Unit): Self = this.set("custom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setFillAlpha(value: Double): Self = this.set("fillAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillAlpha: Self = this.set("fillAlpha", js.undefined)
    
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
  }
}
