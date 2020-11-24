package typings.baseui.anon

import typings.baseui.baseuiStrings.CF
import typings.baseui.baseuiStrings.Plussign236
import typings.baseui.baseuiStrings.`Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `34` extends js.Object {
  
  var dialCode: Plussign236 = js.native
  
  var id: CF = js.native
  
  var label: `Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis` = js.native
}
object `34` {
  
  @scala.inline
  def apply(
    dialCode: Plussign236,
    id: CF,
    label: `Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis`
  ): `34` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`34`]
  }
  
  @scala.inline
  implicit class `34Ops`[Self <: `34`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign236): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CF): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
