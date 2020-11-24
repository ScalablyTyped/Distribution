package typings.baseui.anon

import typings.baseui.baseuiStrings.Kosovo
import typings.baseui.baseuiStrings.Plussign383
import typings.baseui.baseuiStrings.XK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `106` extends js.Object {
  
  var dialCode: Plussign383 = js.native
  
  var id: XK = js.native
  
  var label: Kosovo = js.native
}
object `106` {
  
  @scala.inline
  def apply(dialCode: Plussign383, id: XK, label: Kosovo): `106` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`106`]
  }
  
  @scala.inline
  implicit class `106Ops`[Self <: `106`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign383): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: XK): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Kosovo): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
