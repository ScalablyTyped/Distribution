package typings.baseui.anon

import typings.baseui.baseuiStrings.MC
import typings.baseui.baseuiStrings.Monaco
import typings.baseui.baseuiStrings.Plussign377
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `134` extends js.Object {
  
  var dialCode: Plussign377 = js.native
  
  var id: MC = js.native
  
  var label: Monaco = js.native
}
object `134` {
  
  @scala.inline
  def apply(dialCode: Plussign377, id: MC, label: Monaco): `134` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`134`]
  }
  
  @scala.inline
  implicit class `134Ops`[Self <: `134`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign377): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MC): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Monaco): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
