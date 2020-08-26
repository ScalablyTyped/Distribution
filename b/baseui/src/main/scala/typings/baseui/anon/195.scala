package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign211
import typings.baseui.baseuiStrings.SS
import typings.baseui.baseuiStrings.`South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `195` extends js.Object {
  var dialCode: Plussign211 = js.native
  var id: SS = js.native
  var label: `South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis` = js.native
}

object `195` {
  @scala.inline
  def apply(dialCode: Plussign211, id: SS, label: `South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis`): `195` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`195`]
  }
  @scala.inline
  implicit class `195Ops`[Self <: `195`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign211): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SS): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

