package typings.baseui.anon

import typings.baseui.baseuiStrings.BY
import typings.baseui.baseuiStrings.Plussign375
import typings.baseui.baseuiStrings.`Belarus LeftparenthesisБеларусьRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `13` extends js.Object {
  
  var dialCode: Plussign375 = js.native
  
  var id: BY = js.native
  
  var label: `Belarus LeftparenthesisБеларусьRightparenthesis` = js.native
}
object `13` {
  
  @scala.inline
  def apply(dialCode: Plussign375, id: BY, label: `Belarus LeftparenthesisБеларусьRightparenthesis`): `13` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13Ops`[Self <: `13`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign375): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BY): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Belarus LeftparenthesisБеларусьRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
