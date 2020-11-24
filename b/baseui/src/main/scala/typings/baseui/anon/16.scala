package typings.baseui.anon

import typings.baseui.baseuiStrings.BJ
import typings.baseui.baseuiStrings.Plussign229
import typings.baseui.baseuiStrings.`Benin LeftparenthesisBéninRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16` extends js.Object {
  
  var dialCode: Plussign229 = js.native
  
  var id: BJ = js.native
  
  var label: `Benin LeftparenthesisBéninRightparenthesis` = js.native
}
object `16` {
  
  @scala.inline
  def apply(dialCode: Plussign229, id: BJ, label: `Benin LeftparenthesisBéninRightparenthesis`): `16` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16Ops`[Self <: `16`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign229): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BJ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Benin LeftparenthesisBéninRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
