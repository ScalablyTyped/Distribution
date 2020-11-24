package typings.baseui.anon

import typings.baseui.baseuiStrings.KW
import typings.baseui.baseuiStrings.Plussign965
import typings.baseui.baseuiStrings.`Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `107` extends js.Object {
  
  var dialCode: Plussign965 = js.native
  
  var id: KW = js.native
  
  var label: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis` = js.native
}
object `107` {
  
  @scala.inline
  def apply(dialCode: Plussign965, id: KW, label: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`): `107` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`107`]
  }
  
  @scala.inline
  implicit class `107Ops`[Self <: `107`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign965): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KW): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
