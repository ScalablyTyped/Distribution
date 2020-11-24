package typings.baseui.anon

import typings.baseui.baseuiStrings.AT
import typings.baseui.baseuiStrings.Plussign43
import typings.baseui.baseuiStrings.`Austria LeftparenthesisÖsterreichRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `7` extends js.Object {
  
  var dialCode: Plussign43 = js.native
  
  var id: AT = js.native
  
  var label: `Austria LeftparenthesisÖsterreichRightparenthesis` = js.native
}
object `7` {
  
  @scala.inline
  def apply(dialCode: Plussign43, id: AT, label: `Austria LeftparenthesisÖsterreichRightparenthesis`): `7` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7Ops`[Self <: `7`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign43): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AT): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Austria LeftparenthesisÖsterreichRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
