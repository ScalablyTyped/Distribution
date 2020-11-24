package typings.baseui.anon

import typings.baseui.baseuiStrings.MU
import typings.baseui.baseuiStrings.Plussign230
import typings.baseui.baseuiStrings.`Mauritius LeftparenthesisMorisRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `129` extends js.Object {
  
  var dialCode: Plussign230 = js.native
  
  var id: MU = js.native
  
  var label: `Mauritius LeftparenthesisMorisRightparenthesis` = js.native
}
object `129` {
  
  @scala.inline
  def apply(dialCode: Plussign230, id: MU, label: `Mauritius LeftparenthesisMorisRightparenthesis`): `129` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit class `129Ops`[Self <: `129`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign230): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MU): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mauritius LeftparenthesisMorisRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
