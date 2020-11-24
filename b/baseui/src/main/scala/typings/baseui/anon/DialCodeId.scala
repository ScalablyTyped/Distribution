package typings.baseui.anon

import typings.baseui.baseuiStrings.DZ
import typings.baseui.baseuiStrings.Plussign213
import typings.baseui.baseuiStrings.`Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialCodeId extends js.Object {
  
  var dialCode: Plussign213 = js.native
  
  var id: DZ = js.native
  
  var label: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis` = js.native
}
object DialCodeId {
  
  @scala.inline
  def apply(dialCode: Plussign213, id: DZ, label: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`): DialCodeId = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCodeId]
  }
  
  @scala.inline
  implicit class DialCodeIdOps[Self <: DialCodeId] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign213): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DZ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
