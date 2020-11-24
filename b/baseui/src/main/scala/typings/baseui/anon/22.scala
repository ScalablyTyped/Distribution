package typings.baseui.anon

import typings.baseui.baseuiStrings.BR
import typings.baseui.baseuiStrings.Plussign55
import typings.baseui.baseuiStrings.`Brazil LeftparenthesisBrasilRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `22` extends js.Object {
  
  var dialCode: Plussign55 = js.native
  
  var id: BR = js.native
  
  var label: `Brazil LeftparenthesisBrasilRightparenthesis` = js.native
}
object `22` {
  
  @scala.inline
  def apply(dialCode: Plussign55, id: BR, label: `Brazil LeftparenthesisBrasilRightparenthesis`): `22` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit class `22Ops`[Self <: `22`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign55): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BR): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Brazil LeftparenthesisBrasilRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
