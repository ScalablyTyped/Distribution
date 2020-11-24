package typings.baseui.anon

import typings.baseui.baseuiStrings.BL
import typings.baseui.baseuiStrings.Plussign590
import typings.baseui.baseuiStrings.`Saint Barthélemy`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `172` extends js.Object {
  
  var dialCode: Plussign590 = js.native
  
  var id: BL = js.native
  
  var label: `Saint Barthélemy` = js.native
}
object `172` {
  
  @scala.inline
  def apply(dialCode: Plussign590, id: BL, label: `Saint Barthélemy`): `172` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`172`]
  }
  
  @scala.inline
  implicit class `172Ops`[Self <: `172`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign590): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BL): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Saint Barthélemy`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
