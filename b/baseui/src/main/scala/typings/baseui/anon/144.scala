package typings.baseui.anon

import typings.baseui.baseuiStrings.NL
import typings.baseui.baseuiStrings.Plussign31
import typings.baseui.baseuiStrings.`Netherlands LeftparenthesisNederlandRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `144` extends js.Object {
  
  var dialCode: Plussign31 = js.native
  
  var id: NL = js.native
  
  var label: `Netherlands LeftparenthesisNederlandRightparenthesis` = js.native
}
object `144` {
  
  @scala.inline
  def apply(dialCode: Plussign31, id: NL, label: `Netherlands LeftparenthesisNederlandRightparenthesis`): `144` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit class `144Ops`[Self <: `144`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign31): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NL): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Netherlands LeftparenthesisNederlandRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
