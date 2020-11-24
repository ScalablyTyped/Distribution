package typings.baseui.anon

import typings.baseui.baseuiStrings.KG
import typings.baseui.baseuiStrings.Plussign996
import typings.baseui.baseuiStrings.`Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `108` extends js.Object {
  
  var dialCode: Plussign996 = js.native
  
  var id: KG = js.native
  
  var label: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis` = js.native
}
object `108` {
  
  @scala.inline
  def apply(dialCode: Plussign996, id: KG, label: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`): `108` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`108`]
  }
  
  @scala.inline
  implicit class `108Ops`[Self <: `108`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign996): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KG): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
