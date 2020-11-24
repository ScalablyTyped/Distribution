package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign216
import typings.baseui.baseuiStrings.TN
import typings.baseui.baseuiStrings.`Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `214` extends js.Object {
  
  var dialCode: Plussign216 = js.native
  
  var id: TN = js.native
  
  var label: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis` = js.native
}
object `214` {
  
  @scala.inline
  def apply(dialCode: Plussign216, id: TN, label: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`): `214` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`214`]
  }
  
  @scala.inline
  implicit class `214Ops`[Self <: `214`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign216): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TN): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
