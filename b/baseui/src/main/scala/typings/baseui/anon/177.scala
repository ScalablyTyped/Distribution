package typings.baseui.anon

import typings.baseui.baseuiStrings.PM
import typings.baseui.baseuiStrings.Plussign508
import typings.baseui.baseuiStrings.`Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `177` extends js.Object {
  
  var dialCode: Plussign508 = js.native
  
  var id: PM = js.native
  
  var label: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis` = js.native
}
object `177` {
  
  @scala.inline
  def apply(
    dialCode: Plussign508,
    id: PM,
    label: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`
  ): `177` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`177`]
  }
  
  @scala.inline
  implicit class `177Ops`[Self <: `177`] (val x: Self) extends AnyVal {
    
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
    def setDialCode(value: Plussign508): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PM): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
