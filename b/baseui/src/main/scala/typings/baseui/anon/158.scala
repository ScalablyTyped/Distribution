package typings.baseui.anon

import typings.baseui.baseuiStrings.PS
import typings.baseui.baseuiStrings.Plussign970
import typings.baseui.baseuiStrings.`Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `158` extends js.Object {
  var dialCode: Plussign970 = js.native
  var id: PS = js.native
  var label: `Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis` = js.native
}

object `158` {
  @scala.inline
  def apply(dialCode: Plussign970, id: PS, label: `Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis`): `158` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`158`]
  }
  @scala.inline
  implicit class `158Ops`[Self <: `158`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign970): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: PS): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

