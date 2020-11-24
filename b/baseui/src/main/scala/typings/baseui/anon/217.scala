package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1649
import typings.baseui.baseuiStrings.TC
import typings.baseui.baseuiStrings.`Turks and Caicos Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `217` extends js.Object {
  
  var dialCode: Plussign1649 = js.native
  
  var id: TC = js.native
  
  var label: `Turks and Caicos Islands` = js.native
}
object `217` {
  
  @scala.inline
  def apply(dialCode: Plussign1649, id: TC, label: `Turks and Caicos Islands`): `217` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`217`]
  }
  
  @scala.inline
  implicit class `217Ops`[Self <: `217`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1649): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TC): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Turks and Caicos Islands`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
