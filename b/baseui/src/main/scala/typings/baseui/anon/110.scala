package typings.baseui.anon

import typings.baseui.baseuiStrings.LV
import typings.baseui.baseuiStrings.Plussign371
import typings.baseui.baseuiStrings.`Latvia LeftparenthesisLatvijaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `110` extends js.Object {
  
  var dialCode: Plussign371 = js.native
  
  var id: LV = js.native
  
  var label: `Latvia LeftparenthesisLatvijaRightparenthesis` = js.native
}
object `110` {
  
  @scala.inline
  def apply(dialCode: Plussign371, id: LV, label: `Latvia LeftparenthesisLatvijaRightparenthesis`): `110` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit class `110Ops`[Self <: `110`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign371): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LV): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Latvia LeftparenthesisLatvijaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
