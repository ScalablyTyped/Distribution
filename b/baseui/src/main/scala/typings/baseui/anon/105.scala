package typings.baseui.anon

import typings.baseui.baseuiStrings.KI
import typings.baseui.baseuiStrings.Kiribati
import typings.baseui.baseuiStrings.Plussign686
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `105` extends js.Object {
  
  var dialCode: Plussign686 = js.native
  
  var id: KI = js.native
  
  var label: Kiribati = js.native
}
object `105` {
  
  @scala.inline
  def apply(dialCode: Plussign686, id: KI, label: Kiribati): `105` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`105`]
  }
  
  @scala.inline
  implicit class `105Ops`[Self <: `105`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign686): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KI): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Kiribati): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
