package typings.baseui.anon

import typings.baseui.baseuiStrings.ME
import typings.baseui.baseuiStrings.Plussign382
import typings.baseui.baseuiStrings.`Montenegro LeftparenthesisCrna GoraRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `136` extends js.Object {
  
  var dialCode: Plussign382 = js.native
  
  var id: ME = js.native
  
  var label: `Montenegro LeftparenthesisCrna GoraRightparenthesis` = js.native
}
object `136` {
  
  @scala.inline
  def apply(dialCode: Plussign382, id: ME, label: `Montenegro LeftparenthesisCrna GoraRightparenthesis`): `136` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`136`]
  }
  
  @scala.inline
  implicit class `136Ops`[Self <: `136`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign382): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ME): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Montenegro LeftparenthesisCrna GoraRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
