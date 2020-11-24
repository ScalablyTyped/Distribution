package typings.baseui.anon

import typings.baseui.baseuiStrings.GE
import typings.baseui.baseuiStrings.Plussign995
import typings.baseui.baseuiStrings.`Georgia LeftparenthesisსაქართველოRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `72` extends js.Object {
  
  var dialCode: Plussign995 = js.native
  
  var id: GE = js.native
  
  var label: `Georgia LeftparenthesisსაქართველოRightparenthesis` = js.native
}
object `72` {
  
  @scala.inline
  def apply(dialCode: Plussign995, id: GE, label: `Georgia LeftparenthesisსაქართველოRightparenthesis`): `72` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`72`]
  }
  
  @scala.inline
  implicit class `72Ops`[Self <: `72`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign995): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GE): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Georgia LeftparenthesisსაქართველოRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
