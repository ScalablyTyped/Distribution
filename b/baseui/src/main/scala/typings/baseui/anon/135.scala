package typings.baseui.anon

import typings.baseui.baseuiStrings.MN
import typings.baseui.baseuiStrings.Plussign976
import typings.baseui.baseuiStrings.`Mongolia LeftparenthesisМонголRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `135` extends js.Object {
  
  var dialCode: Plussign976 = js.native
  
  var id: MN = js.native
  
  var label: `Mongolia LeftparenthesisМонголRightparenthesis` = js.native
}
object `135` {
  
  @scala.inline
  def apply(dialCode: Plussign976, id: MN, label: `Mongolia LeftparenthesisМонголRightparenthesis`): `135` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`135`]
  }
  
  @scala.inline
  implicit class `135Ops`[Self <: `135`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign976): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MN): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mongolia LeftparenthesisМонголRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
