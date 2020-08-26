package typings.baseui.anon

import typings.baseui.baseuiStrings.LB
import typings.baseui.baseuiStrings.Plussign961
import typings.baseui.baseuiStrings.`Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `111` extends js.Object {
  var dialCode: Plussign961 = js.native
  var id: LB = js.native
  var label: `Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis` = js.native
}

object `111` {
  @scala.inline
  def apply(dialCode: Plussign961, id: LB, label: `Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis`): `111` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  @scala.inline
  implicit class `111Ops`[Self <: `111`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign961): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: LB): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

