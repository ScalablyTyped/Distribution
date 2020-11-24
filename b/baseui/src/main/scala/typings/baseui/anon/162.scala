package typings.baseui.anon

import typings.baseui.baseuiStrings.PE
import typings.baseui.baseuiStrings.Plussign51
import typings.baseui.baseuiStrings.`Peru LeftparenthesisPerúRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `162` extends js.Object {
  
  var dialCode: Plussign51 = js.native
  
  var id: PE = js.native
  
  var label: `Peru LeftparenthesisPerúRightparenthesis` = js.native
}
object `162` {
  
  @scala.inline
  def apply(dialCode: Plussign51, id: PE, label: `Peru LeftparenthesisPerúRightparenthesis`): `162` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`162`]
  }
  
  @scala.inline
  implicit class `162Ops`[Self <: `162`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign51): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PE): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Peru LeftparenthesisPerúRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
