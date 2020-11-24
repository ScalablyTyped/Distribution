package typings.baseui.anon

import typings.baseui.baseuiStrings.BT
import typings.baseui.baseuiStrings.Plussign975
import typings.baseui.baseuiStrings.`Bhutan LeftparenthesisའབྲུགRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `18` extends js.Object {
  
  var dialCode: Plussign975 = js.native
  
  var id: BT = js.native
  
  var label: `Bhutan LeftparenthesisའབྲུགRightparenthesis` = js.native
}
object `18` {
  
  @scala.inline
  def apply(dialCode: Plussign975, id: BT, label: `Bhutan LeftparenthesisའབྲུགRightparenthesis`): `18` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18Ops`[Self <: `18`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign975): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BT): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Bhutan LeftparenthesisའབྲུགRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
