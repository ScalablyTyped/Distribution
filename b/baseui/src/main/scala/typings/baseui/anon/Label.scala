package typings.baseui.anon

import typings.baseui.baseuiStrings.AL
import typings.baseui.baseuiStrings.Plussign355
import typings.baseui.baseuiStrings.`Albania LeftparenthesisShqipëriRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends js.Object {
  
  var dialCode: Plussign355 = js.native
  
  var id: AL = js.native
  
  var label: `Albania LeftparenthesisShqipëriRightparenthesis` = js.native
}
object Label {
  
  @scala.inline
  def apply(dialCode: Plussign355, id: AL, label: `Albania LeftparenthesisShqipëriRightparenthesis`): Label = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign355): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AL): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Albania LeftparenthesisShqipëriRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
