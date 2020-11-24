package typings.baseui.anon

import typings.baseui.baseuiStrings.PY
import typings.baseui.baseuiStrings.Paraguay
import typings.baseui.baseuiStrings.Plussign595
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `161` extends js.Object {
  
  var dialCode: Plussign595 = js.native
  
  var id: PY = js.native
  
  var label: Paraguay = js.native
}
object `161` {
  
  @scala.inline
  def apply(dialCode: Plussign595, id: PY, label: Paraguay): `161` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`161`]
  }
  
  @scala.inline
  implicit class `161Ops`[Self <: `161`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign595): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PY): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Paraguay): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
