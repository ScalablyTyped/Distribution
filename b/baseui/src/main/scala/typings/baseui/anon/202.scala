package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign46
import typings.baseui.baseuiStrings.SE
import typings.baseui.baseuiStrings.`Sweden LeftparenthesisSverigeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `202` extends js.Object {
  
  var dialCode: Plussign46 = js.native
  
  var id: SE = js.native
  
  var label: `Sweden LeftparenthesisSverigeRightparenthesis` = js.native
}
object `202` {
  
  @scala.inline
  def apply(dialCode: Plussign46, id: SE, label: `Sweden LeftparenthesisSverigeRightparenthesis`): `202` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202`]
  }
  
  @scala.inline
  implicit class `202Ops`[Self <: `202`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign46): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SE): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Sweden LeftparenthesisSverigeRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
