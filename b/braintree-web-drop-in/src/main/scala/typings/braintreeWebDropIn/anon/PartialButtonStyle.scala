package typings.braintreeWebDropIn.anon

import typings.paypalCheckoutComponents.configurationMod.ButtonColorOption
import typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption
import typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption
import typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<paypal-checkout-components.paypal-checkout-components.ButtonStyle> */
@js.native
trait PartialButtonStyle extends js.Object {
  
  var color: js.UndefOr[ButtonColorOption] = js.native
  
  var label: js.UndefOr[ButtonLabelOption] = js.native
  
  var shape: js.UndefOr[ButtonShapeOption] = js.native
  
  var size: js.UndefOr[ButtonSizeOption] = js.native
  
  var tagline: js.UndefOr[Boolean] = js.native
}
object PartialButtonStyle {
  
  @scala.inline
  def apply(): PartialButtonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonStyle]
  }
  
  @scala.inline
  implicit class PartialButtonStyleOps[Self <: PartialButtonStyle] (val x: Self) extends AnyVal {
    
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
    def setColor(value: ButtonColorOption): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setLabel(value: ButtonLabelOption): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setShape(value: ButtonShapeOption): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSize(value: ButtonSizeOption): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTagline(value: Boolean): Self = this.set("tagline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagline: Self = this.set("tagline", js.undefined)
  }
}
