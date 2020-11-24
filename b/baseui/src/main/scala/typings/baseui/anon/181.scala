package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign239
import typings.baseui.baseuiStrings.ST
import typings.baseui.baseuiStrings.`São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `181` extends js.Object {
  
  var dialCode: Plussign239 = js.native
  
  var id: ST = js.native
  
  var label: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis` = js.native
}
object `181` {
  
  @scala.inline
  def apply(
    dialCode: Plussign239,
    id: ST,
    label: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`
  ): `181` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`181`]
  }
  
  @scala.inline
  implicit class `181Ops`[Self <: `181`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign239): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ST): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
