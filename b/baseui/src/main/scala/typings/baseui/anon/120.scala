package typings.baseui.anon

import typings.baseui.baseuiStrings.MG
import typings.baseui.baseuiStrings.Plussign261
import typings.baseui.baseuiStrings.`Madagascar LeftparenthesisMadagasikaraRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `120` extends js.Object {
  
  var dialCode: Plussign261 = js.native
  
  var id: MG = js.native
  
  var label: `Madagascar LeftparenthesisMadagasikaraRightparenthesis` = js.native
}
object `120` {
  
  @scala.inline
  def apply(dialCode: Plussign261, id: MG, label: `Madagascar LeftparenthesisMadagasikaraRightparenthesis`): `120` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`120`]
  }
  
  @scala.inline
  implicit class `120Ops`[Self <: `120`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign261): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MG): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Madagascar LeftparenthesisMadagasikaraRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
