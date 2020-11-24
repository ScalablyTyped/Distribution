package typings.baseui.anon

import typings.baseui.baseuiStrings.MS
import typings.baseui.baseuiStrings.Montserrat
import typings.baseui.baseuiStrings.Plussign1664
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `137` extends js.Object {
  
  var dialCode: Plussign1664 = js.native
  
  var id: MS = js.native
  
  var label: Montserrat = js.native
}
object `137` {
  
  @scala.inline
  def apply(dialCode: Plussign1664, id: MS, label: Montserrat): `137` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`137`]
  }
  
  @scala.inline
  implicit class `137Ops`[Self <: `137`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1664): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MS): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Montserrat): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
