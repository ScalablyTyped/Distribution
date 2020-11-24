package typings.baseui.anon

import typings.baseui.baseuiStrings.MF
import typings.baseui.baseuiStrings.Plussign590
import typings.baseui.baseuiStrings.`Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `176` extends js.Object {
  
  var dialCode: Plussign590 = js.native
  
  var id: MF = js.native
  
  var label: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis` = js.native
}
object `176` {
  
  @scala.inline
  def apply(
    dialCode: Plussign590,
    id: MF,
    label: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
  ): `176` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`176`]
  }
  
  @scala.inline
  implicit class `176Ops`[Self <: `176`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign590): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MF): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(
      value: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
    ): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
