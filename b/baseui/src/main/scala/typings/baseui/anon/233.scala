package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign260
import typings.baseui.baseuiStrings.ZM
import typings.baseui.baseuiStrings.Zambia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `233` extends js.Object {
  
  var dialCode: Plussign260 = js.native
  
  var id: ZM = js.native
  
  var label: Zambia = js.native
}
object `233` {
  
  @scala.inline
  def apply(dialCode: Plussign260, id: ZM, label: Zambia): `233` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`233`]
  }
  
  @scala.inline
  implicit class `233Ops`[Self <: `233`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign260): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ZM): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Zambia): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
