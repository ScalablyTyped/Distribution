package typings.baseui.anon

import typings.baseui.baseuiStrings.PR
import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.`Puerto Rico`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `166` extends js.Object {
  
  var dialCode: Plussign1 = js.native
  
  var id: PR = js.native
  
  var label: `Puerto Rico` = js.native
}
object `166` {
  
  @scala.inline
  def apply(dialCode: Plussign1, id: PR, label: `Puerto Rico`): `166` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`166`]
  }
  
  @scala.inline
  implicit class `166Ops`[Self <: `166`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PR): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Puerto Rico`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
