package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign47
import typings.baseui.baseuiStrings.SJ
import typings.baseui.baseuiStrings.`Svalbard and Jan Mayen`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `200` extends js.Object {
  
  var dialCode: Plussign47 = js.native
  
  var id: SJ = js.native
  
  var label: `Svalbard and Jan Mayen` = js.native
}
object `200` {
  
  @scala.inline
  def apply(dialCode: Plussign47, id: SJ, label: `Svalbard and Jan Mayen`): `200` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200`]
  }
  
  @scala.inline
  implicit class `200Ops`[Self <: `200`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign47): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SJ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Svalbard and Jan Mayen`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
