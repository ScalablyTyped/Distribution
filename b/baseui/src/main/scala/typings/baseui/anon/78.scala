package typings.baseui.anon

import typings.baseui.baseuiStrings.GD
import typings.baseui.baseuiStrings.Grenada
import typings.baseui.baseuiStrings.Plussign1473
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `78` extends js.Object {
  
  var dialCode: Plussign1473 = js.native
  
  var id: GD = js.native
  
  var label: Grenada = js.native
}
object `78` {
  
  @scala.inline
  def apply(dialCode: Plussign1473, id: GD, label: Grenada): `78` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`78`]
  }
  
  @scala.inline
  implicit class `78Ops`[Self <: `78`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1473): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GD): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Grenada): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
