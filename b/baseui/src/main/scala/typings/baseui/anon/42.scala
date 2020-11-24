package typings.baseui.anon

import typings.baseui.baseuiStrings.CD
import typings.baseui.baseuiStrings.Plussign243
import typings.baseui.baseuiStrings.`Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `42` extends js.Object {
  
  var dialCode: Plussign243 = js.native
  
  var id: CD = js.native
  
  var label: `Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis` = js.native
}
object `42` {
  
  @scala.inline
  def apply(
    dialCode: Plussign243,
    id: CD,
    label: `Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis`
  ): `42` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`42`]
  }
  
  @scala.inline
  implicit class `42Ops`[Self <: `42`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign243): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CD): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(
      value: `Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis`
    ): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
