package typings.baseui.anon

import typings.baseui.baseuiStrings.AX
import typings.baseui.baseuiStrings.Plussign358
import typings.baseui.baseuiStrings.`Åland Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `235` extends js.Object {
  
  var dialCode: Plussign358 = js.native
  
  var id: AX = js.native
  
  var label: `Åland Islands` = js.native
}
object `235` {
  
  @scala.inline
  def apply(dialCode: Plussign358, id: AX, label: `Åland Islands`): `235` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`235`]
  }
  
  @scala.inline
  implicit class `235Ops`[Self <: `235`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign358): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AX): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Åland Islands`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
