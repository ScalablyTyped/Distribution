package typings.baseui.anon

import typings.baseui.baseuiStrings.EE
import typings.baseui.baseuiStrings.Plussign372
import typings.baseui.baseuiStrings.`Estonia LeftparenthesisEestiRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `61` extends js.Object {
  
  var dialCode: Plussign372 = js.native
  
  var id: EE = js.native
  
  var label: `Estonia LeftparenthesisEestiRightparenthesis` = js.native
}
object `61` {
  
  @scala.inline
  def apply(dialCode: Plussign372, id: EE, label: `Estonia LeftparenthesisEestiRightparenthesis`): `61` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit class `61Ops`[Self <: `61`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign372): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: EE): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Estonia LeftparenthesisEestiRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
