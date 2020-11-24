package typings.baseui.anon

import typings.baseui.baseuiStrings.NC
import typings.baseui.baseuiStrings.Plussign687
import typings.baseui.baseuiStrings.`New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `145` extends js.Object {
  
  var dialCode: Plussign687 = js.native
  
  var id: NC = js.native
  
  var label: `New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis` = js.native
}
object `145` {
  
  @scala.inline
  def apply(
    dialCode: Plussign687,
    id: NC,
    label: `New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis`
  ): `145` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`145`]
  }
  
  @scala.inline
  implicit class `145Ops`[Self <: `145`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign687): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NC): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
