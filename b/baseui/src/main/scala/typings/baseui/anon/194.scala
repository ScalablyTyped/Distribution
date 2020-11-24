package typings.baseui.anon

import typings.baseui.baseuiStrings.KR
import typings.baseui.baseuiStrings.Plussign82
import typings.baseui.baseuiStrings.`South Korea Leftparenthesis대한민국Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `194` extends js.Object {
  
  var dialCode: Plussign82 = js.native
  
  var id: KR = js.native
  
  var label: `South Korea Leftparenthesis대한민국Rightparenthesis` = js.native
}
object `194` {
  
  @scala.inline
  def apply(dialCode: Plussign82, id: KR, label: `South Korea Leftparenthesis대한민국Rightparenthesis`): `194` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`194`]
  }
  
  @scala.inline
  implicit class `194Ops`[Self <: `194`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign82): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KR): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `South Korea Leftparenthesis대한민국Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
