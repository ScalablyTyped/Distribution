package typings.baseui.anon

import typings.baseui.baseuiStrings.IL
import typings.baseui.baseuiStrings.Plussign972
import typings.baseui.baseuiStrings.`Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `97` extends js.Object {
  var dialCode: Plussign972 = js.native
  var id: IL = js.native
  var label: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis` = js.native
}

object `97` {
  @scala.inline
  def apply(dialCode: Plussign972, id: IL, label: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`): `97` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`97`]
  }
  @scala.inline
  implicit class `97Ops`[Self <: `97`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign972): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: IL): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

