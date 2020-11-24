package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1868
import typings.baseui.baseuiStrings.TT
import typings.baseui.baseuiStrings.`Trinisoad and Tobago`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `213` extends js.Object {
  
  var dialCode: Plussign1868 = js.native
  
  var id: TT = js.native
  
  var label: `Trinisoad and Tobago` = js.native
}
object `213` {
  
  @scala.inline
  def apply(dialCode: Plussign1868, id: TT, label: `Trinisoad and Tobago`): `213` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`213`]
  }
  
  @scala.inline
  implicit class `213Ops`[Self <: `213`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1868): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TT): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Trinisoad and Tobago`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
