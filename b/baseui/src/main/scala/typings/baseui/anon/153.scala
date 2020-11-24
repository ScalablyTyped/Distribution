package typings.baseui.anon

import typings.baseui.baseuiStrings.MP
import typings.baseui.baseuiStrings.Plussign1670
import typings.baseui.baseuiStrings.`Northern Mariana Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `153` extends js.Object {
  
  var dialCode: Plussign1670 = js.native
  
  var id: MP = js.native
  
  var label: `Northern Mariana Islands` = js.native
}
object `153` {
  
  @scala.inline
  def apply(dialCode: Plussign1670, id: MP, label: `Northern Mariana Islands`): `153` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`153`]
  }
  
  @scala.inline
  implicit class `153Ops`[Self <: `153`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1670): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MP): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Northern Mariana Islands`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
