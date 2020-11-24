package typings.baseui.anon

import typings.baseui.baseuiStrings.GU
import typings.baseui.baseuiStrings.Guam
import typings.baseui.baseuiStrings.Plussign1671
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `80` extends js.Object {
  
  var dialCode: Plussign1671 = js.native
  
  var id: GU = js.native
  
  var label: Guam = js.native
}
object `80` {
  
  @scala.inline
  def apply(dialCode: Plussign1671, id: GU, label: Guam): `80` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`80`]
  }
  
  @scala.inline
  implicit class `80Ops`[Self <: `80`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1671): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GU): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Guam): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
