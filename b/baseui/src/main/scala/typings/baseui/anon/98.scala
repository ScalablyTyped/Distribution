package typings.baseui.anon

import typings.baseui.baseuiStrings.IT
import typings.baseui.baseuiStrings.Plussign39
import typings.baseui.baseuiStrings.`Italy LeftparenthesisItaliaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `98` extends js.Object {
  
  var dialCode: Plussign39 = js.native
  
  var id: IT = js.native
  
  var label: `Italy LeftparenthesisItaliaRightparenthesis` = js.native
}
object `98` {
  
  @scala.inline
  def apply(dialCode: Plussign39, id: IT, label: `Italy LeftparenthesisItaliaRightparenthesis`): `98` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`98`]
  }
  
  @scala.inline
  implicit class `98Ops`[Self <: `98`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign39): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IT): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Italy LeftparenthesisItaliaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
