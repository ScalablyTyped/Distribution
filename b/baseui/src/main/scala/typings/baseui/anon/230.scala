package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign84
import typings.baseui.baseuiStrings.VN
import typings.baseui.baseuiStrings.`Vietnam LeftparenthesisViệt NamRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `230` extends js.Object {
  
  var dialCode: Plussign84 = js.native
  
  var id: VN = js.native
  
  var label: `Vietnam LeftparenthesisViệt NamRightparenthesis` = js.native
}
object `230` {
  
  @scala.inline
  def apply(dialCode: Plussign84, id: VN, label: `Vietnam LeftparenthesisViệt NamRightparenthesis`): `230` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`230`]
  }
  
  @scala.inline
  implicit class `230Ops`[Self <: `230`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign84): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: VN): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Vietnam LeftparenthesisViệt NamRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
