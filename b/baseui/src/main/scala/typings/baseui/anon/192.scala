package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign252
import typings.baseui.baseuiStrings.SO
import typings.baseui.baseuiStrings.`Somalia LeftparenthesisSoomaaliyaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `192` extends js.Object {
  
  var dialCode: Plussign252 = js.native
  
  var id: SO = js.native
  
  var label: `Somalia LeftparenthesisSoomaaliyaRightparenthesis` = js.native
}
object `192` {
  
  @scala.inline
  def apply(dialCode: Plussign252, id: SO, label: `Somalia LeftparenthesisSoomaaliyaRightparenthesis`): `192` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`192`]
  }
  
  @scala.inline
  implicit class `192Ops`[Self <: `192`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign252): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SO): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Somalia LeftparenthesisSoomaaliyaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
