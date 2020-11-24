package typings.baseui.anon

import typings.baseui.baseuiStrings.AS
import typings.baseui.baseuiStrings.Plussign1684
import typings.baseui.baseuiStrings.`American Samoa`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdLabel extends js.Object {
  
  var dialCode: Plussign1684 = js.native
  
  var id: AS = js.native
  
  var label: `American Samoa` = js.native
}
object IdLabel {
  
  @scala.inline
  def apply(dialCode: Plussign1684, id: AS, label: `American Samoa`): IdLabel = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdLabel]
  }
  
  @scala.inline
  implicit class IdLabelOps[Self <: IdLabel] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1684): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AS): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `American Samoa`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
