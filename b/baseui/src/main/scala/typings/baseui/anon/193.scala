package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign27
import typings.baseui.baseuiStrings.ZA
import typings.baseui.baseuiStrings.`South Africa`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `193` extends js.Object {
  
  var dialCode: Plussign27 = js.native
  
  var id: ZA = js.native
  
  var label: `South Africa` = js.native
}
object `193` {
  
  @scala.inline
  def apply(dialCode: Plussign27, id: ZA, label: `South Africa`): `193` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`193`]
  }
  
  @scala.inline
  implicit class `193Ops`[Self <: `193`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign27): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ZA): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `South Africa`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
