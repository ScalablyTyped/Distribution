package typings.baseui.anon

import typings.baseui.baseuiStrings.MH
import typings.baseui.baseuiStrings.Plussign692
import typings.baseui.baseuiStrings.`Marshall Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `126` extends js.Object {
  
  var dialCode: Plussign692 = js.native
  
  var id: MH = js.native
  
  var label: `Marshall Islands` = js.native
}
object `126` {
  
  @scala.inline
  def apply(dialCode: Plussign692, id: MH, label: `Marshall Islands`): `126` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`126`]
  }
  
  @scala.inline
  implicit class `126Ops`[Self <: `126`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign692): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MH): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Marshall Islands`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
