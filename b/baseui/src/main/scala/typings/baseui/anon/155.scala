package typings.baseui.anon

import typings.baseui.baseuiStrings.OM
import typings.baseui.baseuiStrings.Plussign968
import typings.baseui.baseuiStrings.`Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `155` extends js.Object {
  
  var dialCode: Plussign968 = js.native
  
  var id: OM = js.native
  
  var label: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis` = js.native
}
object `155` {
  
  @scala.inline
  def apply(dialCode: Plussign968, id: OM, label: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`): `155` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`155`]
  }
  
  @scala.inline
  implicit class `155Ops`[Self <: `155`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign968): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: OM): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
