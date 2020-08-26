package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign249
import typings.baseui.baseuiStrings.SD
import typings.baseui.baseuiStrings.`Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `198` extends js.Object {
  var dialCode: Plussign249 = js.native
  var id: SD = js.native
  var label: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis` = js.native
}

object `198` {
  @scala.inline
  def apply(dialCode: Plussign249, id: SD, label: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`): `198` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`198`]
  }
  @scala.inline
  implicit class `198Ops`[Self <: `198`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign249): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SD): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

