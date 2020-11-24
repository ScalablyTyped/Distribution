package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign685
import typings.baseui.baseuiStrings.Samoa
import typings.baseui.baseuiStrings.WS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `179` extends js.Object {
  
  var dialCode: Plussign685 = js.native
  
  var id: WS = js.native
  
  var label: Samoa = js.native
}
object `179` {
  
  @scala.inline
  def apply(dialCode: Plussign685, id: WS, label: Samoa): `179` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`179`]
  }
  
  @scala.inline
  implicit class `179Ops`[Self <: `179`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign685): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: WS): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Samoa): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
