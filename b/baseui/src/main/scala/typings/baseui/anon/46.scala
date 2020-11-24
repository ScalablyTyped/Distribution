package typings.baseui.anon

import typings.baseui.baseuiStrings.CI
import typings.baseui.baseuiStrings.Plussign225
import typings.baseui.baseuiStrings.`Côte dRightsinglequotationmarkIvoire`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `46` extends js.Object {
  
  var dialCode: Plussign225 = js.native
  
  var id: CI = js.native
  
  var label: `Côte dRightsinglequotationmarkIvoire` = js.native
}
object `46` {
  
  @scala.inline
  def apply(dialCode: Plussign225, id: CI, label: `Côte dRightsinglequotationmarkIvoire`): `46` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit class `46Ops`[Self <: `46`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign225): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CI): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Côte dRightsinglequotationmarkIvoire`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
