package typings.baseui.anon

import typings.baseui.baseuiStrings.GR
import typings.baseui.baseuiStrings.Plussign30
import typings.baseui.baseuiStrings.`Greece LeftparenthesisΕλλάδαRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `76` extends js.Object {
  
  var dialCode: Plussign30 = js.native
  
  var id: GR = js.native
  
  var label: `Greece LeftparenthesisΕλλάδαRightparenthesis` = js.native
}
object `76` {
  
  @scala.inline
  def apply(dialCode: Plussign30, id: GR, label: `Greece LeftparenthesisΕλλάδαRightparenthesis`): `76` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit class `76Ops`[Self <: `76`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign30): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GR): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Greece LeftparenthesisΕλλάδαRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
