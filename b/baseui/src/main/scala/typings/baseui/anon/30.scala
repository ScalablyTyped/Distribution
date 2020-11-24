package typings.baseui.anon

import typings.baseui.baseuiStrings.CM
import typings.baseui.baseuiStrings.Plussign237
import typings.baseui.baseuiStrings.`Cameroon LeftparenthesisCamerounRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `30` extends js.Object {
  
  var dialCode: Plussign237 = js.native
  
  var id: CM = js.native
  
  var label: `Cameroon LeftparenthesisCamerounRightparenthesis` = js.native
}
object `30` {
  
  @scala.inline
  def apply(dialCode: Plussign237, id: CM, label: `Cameroon LeftparenthesisCamerounRightparenthesis`): `30` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit class `30Ops`[Self <: `30`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign237): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CM): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cameroon LeftparenthesisCamerounRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
