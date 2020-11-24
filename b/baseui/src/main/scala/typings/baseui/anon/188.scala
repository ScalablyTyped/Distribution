package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1721
import typings.baseui.baseuiStrings.SX
import typings.baseui.baseuiStrings.`Sint Maarten`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `188` extends js.Object {
  
  var dialCode: Plussign1721 = js.native
  
  var id: SX = js.native
  
  var label: `Sint Maarten` = js.native
}
object `188` {
  
  @scala.inline
  def apply(dialCode: Plussign1721, id: SX, label: `Sint Maarten`): `188` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`188`]
  }
  
  @scala.inline
  implicit class `188Ops`[Self <: `188`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1721): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SX): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Sint Maarten`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
