package typings.baseui.anon

import typings.baseui.baseuiStrings.CV
import typings.baseui.baseuiStrings.Plussign238
import typings.baseui.baseuiStrings.`Cape Verde LeftparenthesisKabu VerdiRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `32` extends js.Object {
  
  var dialCode: Plussign238 = js.native
  
  var id: CV = js.native
  
  var label: `Cape Verde LeftparenthesisKabu VerdiRightparenthesis` = js.native
}
object `32` {
  
  @scala.inline
  def apply(dialCode: Plussign238, id: CV, label: `Cape Verde LeftparenthesisKabu VerdiRightparenthesis`): `32` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit class `32Ops`[Self <: `32`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign238): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CV): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cape Verde LeftparenthesisKabu VerdiRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
