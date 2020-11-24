package typings.baseui.anon

import typings.baseui.baseuiStrings.JO
import typings.baseui.baseuiStrings.Plussign962
import typings.baseui.baseuiStrings.`Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `102` extends js.Object {
  
  var dialCode: Plussign962 = js.native
  
  var id: JO = js.native
  
  var label: `Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis` = js.native
}
object `102` {
  
  @scala.inline
  def apply(dialCode: Plussign962, id: JO, label: `Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis`): `102` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`102`]
  }
  
  @scala.inline
  implicit class `102Ops`[Self <: `102`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign962): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: JO): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
