package typings.baseui.anon

import typings.baseui.baseuiStrings.KZ
import typings.baseui.baseuiStrings.Plussign7
import typings.baseui.baseuiStrings.`Kazakhstan LeftparenthesisКазахстанRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `103` extends js.Object {
  
  var dialCode: Plussign7 = js.native
  
  var id: KZ = js.native
  
  var label: `Kazakhstan LeftparenthesisКазахстанRightparenthesis` = js.native
}
object `103` {
  
  @scala.inline
  def apply(dialCode: Plussign7, id: KZ, label: `Kazakhstan LeftparenthesisКазахстанRightparenthesis`): `103` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`103`]
  }
  
  @scala.inline
  implicit class `103Ops`[Self <: `103`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign7): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KZ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Kazakhstan LeftparenthesisКазахстанRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
