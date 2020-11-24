package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign232
import typings.baseui.baseuiStrings.SL
import typings.baseui.baseuiStrings.`Sierra Leone`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `186` extends js.Object {
  
  var dialCode: Plussign232 = js.native
  
  var id: SL = js.native
  
  var label: `Sierra Leone` = js.native
}
object `186` {
  
  @scala.inline
  def apply(dialCode: Plussign232, id: SL, label: `Sierra Leone`): `186` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`186`]
  }
  
  @scala.inline
  implicit class `186Ops`[Self <: `186`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign232): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SL): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Sierra Leone`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
