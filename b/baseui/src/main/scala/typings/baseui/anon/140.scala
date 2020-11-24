package typings.baseui.anon

import typings.baseui.baseuiStrings.MM
import typings.baseui.baseuiStrings.Plussign95
import typings.baseui.baseuiStrings.`Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `140` extends js.Object {
  
  var dialCode: Plussign95 = js.native
  
  var id: MM = js.native
  
  var label: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis` = js.native
}
object `140` {
  
  @scala.inline
  def apply(
    dialCode: Plussign95,
    id: MM,
    label: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`
  ): `140` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`140`]
  }
  
  @scala.inline
  implicit class `140Ops`[Self <: `140`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign95): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MM): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
