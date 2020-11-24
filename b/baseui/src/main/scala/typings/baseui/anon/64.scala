package typings.baseui.anon

import typings.baseui.baseuiStrings.FO
import typings.baseui.baseuiStrings.Plussign298
import typings.baseui.baseuiStrings.`Faroe Islands LeftparenthesisFøroyarRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `64` extends js.Object {
  
  var dialCode: Plussign298 = js.native
  
  var id: FO = js.native
  
  var label: `Faroe Islands LeftparenthesisFøroyarRightparenthesis` = js.native
}
object `64` {
  
  @scala.inline
  def apply(dialCode: Plussign298, id: FO, label: `Faroe Islands LeftparenthesisFøroyarRightparenthesis`): `64` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`64`]
  }
  
  @scala.inline
  implicit class `64Ops`[Self <: `64`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign298): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FO): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Faroe Islands LeftparenthesisFøroyarRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
