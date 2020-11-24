package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign66
import typings.baseui.baseuiStrings.TH
import typings.baseui.baseuiStrings.`Thailand LeftparenthesisไทยRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `208` extends js.Object {
  
  var dialCode: Plussign66 = js.native
  
  var id: TH = js.native
  
  var label: `Thailand LeftparenthesisไทยRightparenthesis` = js.native
}
object `208` {
  
  @scala.inline
  def apply(dialCode: Plussign66, id: TH, label: `Thailand LeftparenthesisไทยRightparenthesis`): `208` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`208`]
  }
  
  @scala.inline
  implicit class `208Ops`[Self <: `208`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign66): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TH): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Thailand LeftparenthesisไทยRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
