package typings.baseui.anon

import typings.baseui.baseuiStrings.MK
import typings.baseui.baseuiStrings.Plussign389
import typings.baseui.baseuiStrings.`Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `119` extends js.Object {
  
  var dialCode: Plussign389 = js.native
  
  var id: MK = js.native
  
  var label: `Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis` = js.native
}
object `119` {
  
  @scala.inline
  def apply(
    dialCode: Plussign389,
    id: MK,
    label: `Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`
  ): `119` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`119`]
  }
  
  @scala.inline
  implicit class `119Ops`[Self <: `119`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign389): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MK): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
