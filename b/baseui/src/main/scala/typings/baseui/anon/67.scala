package typings.baseui.anon

import typings.baseui.baseuiStrings.FR
import typings.baseui.baseuiStrings.France
import typings.baseui.baseuiStrings.Plussign33
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `67` extends js.Object {
  
  var dialCode: Plussign33 = js.native
  
  var id: FR = js.native
  
  var label: France = js.native
}
object `67` {
  
  @scala.inline
  def apply(dialCode: Plussign33, id: FR, label: France): `67` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`67`]
  }
  
  @scala.inline
  implicit class `67Ops`[Self <: `67`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign33): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FR): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: France): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
