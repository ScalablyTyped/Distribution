package typings.baseui.anon

import typings.baseui.baseuiStrings.AE
import typings.baseui.baseuiStrings.Plussign971
import typings.baseui.baseuiStrings.`United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `222` extends js.Object {
  
  var dialCode: Plussign971 = js.native
  
  var id: AE = js.native
  
  var label: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis` = js.native
}
object `222` {
  
  @scala.inline
  def apply(
    dialCode: Plussign971,
    id: AE,
    label: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`
  ): `222` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`222`]
  }
  
  @scala.inline
  implicit class `222Ops`[Self <: `222`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign971): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AE): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
