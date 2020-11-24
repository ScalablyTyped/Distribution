package typings.baseui.anon

import typings.baseui.baseuiStrings.MX
import typings.baseui.baseuiStrings.Plussign52
import typings.baseui.baseuiStrings.`Mexico LeftparenthesisMéxicoRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `131` extends js.Object {
  
  var dialCode: Plussign52 = js.native
  
  var id: MX = js.native
  
  var label: `Mexico LeftparenthesisMéxicoRightparenthesis` = js.native
}
object `131` {
  
  @scala.inline
  def apply(dialCode: Plussign52, id: MX, label: `Mexico LeftparenthesisMéxicoRightparenthesis`): `131` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit class `131Ops`[Self <: `131`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign52): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MX): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mexico LeftparenthesisMéxicoRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
