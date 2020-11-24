package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign262
import typings.baseui.baseuiStrings.RE
import typings.baseui.baseuiStrings.`Réunion LeftparenthesisLa RéunionRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `168` extends js.Object {
  
  var dialCode: Plussign262 = js.native
  
  var id: RE = js.native
  
  var label: `Réunion LeftparenthesisLa RéunionRightparenthesis` = js.native
}
object `168` {
  
  @scala.inline
  def apply(dialCode: Plussign262, id: RE, label: `Réunion LeftparenthesisLa RéunionRightparenthesis`): `168` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`168`]
  }
  
  @scala.inline
  implicit class `168Ops`[Self <: `168`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign262): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: RE): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Réunion LeftparenthesisLa RéunionRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
