package typings.baseui.anon

import typings.baseui.baseuiStrings.CY
import typings.baseui.baseuiStrings.Plussign357
import typings.baseui.baseuiStrings.`Cyprus LeftparenthesisΚύπροςRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `50` extends js.Object {
  
  var dialCode: Plussign357 = js.native
  
  var id: CY = js.native
  
  var label: `Cyprus LeftparenthesisΚύπροςRightparenthesis` = js.native
}
object `50` {
  
  @scala.inline
  def apply(dialCode: Plussign357, id: CY, label: `Cyprus LeftparenthesisΚύπροςRightparenthesis`): `50` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`50`]
  }
  
  @scala.inline
  implicit class `50Ops`[Self <: `50`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign357): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CY): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cyprus LeftparenthesisΚύπροςRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
