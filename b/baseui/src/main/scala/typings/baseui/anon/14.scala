package typings.baseui.anon

import typings.baseui.baseuiStrings.BE
import typings.baseui.baseuiStrings.Plussign32
import typings.baseui.baseuiStrings.`Belgium LeftparenthesisBelgiëRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `14` extends js.Object {
  
  var dialCode: Plussign32 = js.native
  
  var id: BE = js.native
  
  var label: `Belgium LeftparenthesisBelgiëRightparenthesis` = js.native
}
object `14` {
  
  @scala.inline
  def apply(dialCode: Plussign32, id: BE, label: `Belgium LeftparenthesisBelgiëRightparenthesis`): `14` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14Ops`[Self <: `14`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign32): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BE): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Belgium LeftparenthesisBelgiëRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
