package typings.baseui.anon

import typings.baseui.baseuiStrings.PF
import typings.baseui.baseuiStrings.Plussign689
import typings.baseui.baseuiStrings.`French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `69` extends js.Object {
  
  var dialCode: Plussign689 = js.native
  
  var id: PF = js.native
  
  var label: `French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis` = js.native
}
object `69` {
  
  @scala.inline
  def apply(
    dialCode: Plussign689,
    id: PF,
    label: `French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis`
  ): `69` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`69`]
  }
  
  @scala.inline
  implicit class `69Ops`[Self <: `69`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign689): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PF): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
