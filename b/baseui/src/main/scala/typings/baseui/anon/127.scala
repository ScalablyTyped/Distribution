package typings.baseui.anon

import typings.baseui.baseuiStrings.MQ
import typings.baseui.baseuiStrings.Martinique
import typings.baseui.baseuiStrings.Plussign596
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `127` extends js.Object {
  
  var dialCode: Plussign596 = js.native
  
  var id: MQ = js.native
  
  var label: Martinique = js.native
}
object `127` {
  
  @scala.inline
  def apply(dialCode: Plussign596, id: MQ, label: Martinique): `127` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`127`]
  }
  
  @scala.inline
  implicit class `127Ops`[Self <: `127`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign596): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MQ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Martinique): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
