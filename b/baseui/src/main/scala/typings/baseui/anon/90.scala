package typings.baseui.anon

import typings.baseui.baseuiStrings.IS
import typings.baseui.baseuiStrings.Plussign354
import typings.baseui.baseuiStrings.`Iceland LeftparenthesisÍslandRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `90` extends js.Object {
  
  var dialCode: Plussign354 = js.native
  
  var id: IS = js.native
  
  var label: `Iceland LeftparenthesisÍslandRightparenthesis` = js.native
}
object `90` {
  
  @scala.inline
  def apply(dialCode: Plussign354, id: IS, label: `Iceland LeftparenthesisÍslandRightparenthesis`): `90` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`90`]
  }
  
  @scala.inline
  implicit class `90Ops`[Self <: `90`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign354): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IS): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Iceland LeftparenthesisÍslandRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
