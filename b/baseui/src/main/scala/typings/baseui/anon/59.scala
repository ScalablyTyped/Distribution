package typings.baseui.anon

import typings.baseui.baseuiStrings.GQ
import typings.baseui.baseuiStrings.Plussign240
import typings.baseui.baseuiStrings.`Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `59` extends js.Object {
  
  var dialCode: Plussign240 = js.native
  
  var id: GQ = js.native
  
  var label: `Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis` = js.native
}
object `59` {
  
  @scala.inline
  def apply(
    dialCode: Plussign240,
    id: GQ,
    label: `Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis`
  ): `59` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`59`]
  }
  
  @scala.inline
  implicit class `59Ops`[Self <: `59`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign240): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GQ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
