package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign688
import typings.baseui.baseuiStrings.TV
import typings.baseui.baseuiStrings.Tuvalu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `218` extends js.Object {
  
  var dialCode: Plussign688 = js.native
  
  var id: TV = js.native
  
  var label: Tuvalu = js.native
}
object `218` {
  
  @scala.inline
  def apply(dialCode: Plussign688, id: TV, label: Tuvalu): `218` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`218`]
  }
  
  @scala.inline
  implicit class `218Ops`[Self <: `218`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign688): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TV): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Tuvalu): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
