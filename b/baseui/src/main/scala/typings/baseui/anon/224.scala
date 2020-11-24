package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.US
import typings.baseui.baseuiStrings.`United States`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `224` extends js.Object {
  
  var dialCode: Plussign1 = js.native
  
  var id: US = js.native
  
  var label: `United States` = js.native
}
object `224` {
  
  @scala.inline
  def apply(dialCode: Plussign1, id: US, label: `United States`): `224` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`224`]
  }
  
  @scala.inline
  implicit class `224Ops`[Self <: `224`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: US): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `United States`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
