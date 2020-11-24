package typings.baseui.anon

import typings.baseui.baseuiStrings.HR
import typings.baseui.baseuiStrings.Plussign385
import typings.baseui.baseuiStrings.`Croatia LeftparenthesisHrvatskaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `47` extends js.Object {
  
  var dialCode: Plussign385 = js.native
  
  var id: HR = js.native
  
  var label: `Croatia LeftparenthesisHrvatskaRightparenthesis` = js.native
}
object `47` {
  
  @scala.inline
  def apply(dialCode: Plussign385, id: HR, label: `Croatia LeftparenthesisHrvatskaRightparenthesis`): `47` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`47`]
  }
  
  @scala.inline
  implicit class `47Ops`[Self <: `47`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign385): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: HR): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Croatia LeftparenthesisHrvatskaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
