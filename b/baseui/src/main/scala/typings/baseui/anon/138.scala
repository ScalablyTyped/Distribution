package typings.baseui.anon

import typings.baseui.baseuiStrings.MA
import typings.baseui.baseuiStrings.Plussign212
import typings.baseui.baseuiStrings.`Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `138` extends js.Object {
  
  var dialCode: Plussign212 = js.native
  
  var id: MA = js.native
  
  var label: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis` = js.native
}
object `138` {
  
  @scala.inline
  def apply(dialCode: Plussign212, id: MA, label: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`): `138` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`138`]
  }
  
  @scala.inline
  implicit class `138Ops`[Self <: `138`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign212): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MA): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
