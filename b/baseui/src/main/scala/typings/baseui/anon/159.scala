package typings.baseui.anon

import typings.baseui.baseuiStrings.PA
import typings.baseui.baseuiStrings.Plussign507
import typings.baseui.baseuiStrings.`Panama LeftparenthesisPanamáRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `159` extends js.Object {
  
  var dialCode: Plussign507 = js.native
  
  var id: PA = js.native
  
  var label: `Panama LeftparenthesisPanamáRightparenthesis` = js.native
}
object `159` {
  
  @scala.inline
  def apply(dialCode: Plussign507, id: PA, label: `Panama LeftparenthesisPanamáRightparenthesis`): `159` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`159`]
  }
  
  @scala.inline
  implicit class `159Ops`[Self <: `159`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign507): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PA): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Panama LeftparenthesisPanamáRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
