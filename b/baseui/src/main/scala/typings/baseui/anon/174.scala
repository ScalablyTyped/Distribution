package typings.baseui.anon

import typings.baseui.baseuiStrings.KN
import typings.baseui.baseuiStrings.Plussign1869
import typings.baseui.baseuiStrings.`Saint Kitts and Nevis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `174` extends js.Object {
  
  var dialCode: Plussign1869 = js.native
  
  var id: KN = js.native
  
  var label: `Saint Kitts and Nevis` = js.native
}
object `174` {
  
  @scala.inline
  def apply(dialCode: Plussign1869, id: KN, label: `Saint Kitts and Nevis`): `174` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`174`]
  }
  
  @scala.inline
  implicit class `174Ops`[Self <: `174`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign1869): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KN): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Saint Kitts and Nevis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
