package typings.baseui.anon

import typings.baseui.baseuiStrings.CR
import typings.baseui.baseuiStrings.Plussign506
import typings.baseui.baseuiStrings.`Costa Rica`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `45` extends js.Object {
  
  var dialCode: Plussign506 = js.native
  
  var id: CR = js.native
  
  var label: `Costa Rica` = js.native
}
object `45` {
  
  @scala.inline
  def apply(dialCode: Plussign506, id: CR, label: `Costa Rica`): `45` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit class `45Ops`[Self <: `45`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign506): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CR): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Costa Rica`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
