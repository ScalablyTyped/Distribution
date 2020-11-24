package typings.baseui.anon

import typings.baseui.baseuiStrings.LT
import typings.baseui.baseuiStrings.Plussign370
import typings.baseui.baseuiStrings.`Lithuania LeftparenthesisLietuvaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `116` extends js.Object {
  
  var dialCode: Plussign370 = js.native
  
  var id: LT = js.native
  
  var label: `Lithuania LeftparenthesisLietuvaRightparenthesis` = js.native
}
object `116` {
  
  @scala.inline
  def apply(dialCode: Plussign370, id: LT, label: `Lithuania LeftparenthesisLietuvaRightparenthesis`): `116` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`116`]
  }
  
  @scala.inline
  implicit class `116Ops`[Self <: `116`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign370): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LT): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Lithuania LeftparenthesisLietuvaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
