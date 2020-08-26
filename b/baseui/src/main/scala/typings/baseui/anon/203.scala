package typings.baseui.anon

import typings.baseui.baseuiStrings.CH
import typings.baseui.baseuiStrings.Plussign41
import typings.baseui.baseuiStrings.`Switzerland LeftparenthesisSchweizRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `203` extends js.Object {
  var dialCode: Plussign41 = js.native
  var id: CH = js.native
  var label: `Switzerland LeftparenthesisSchweizRightparenthesis` = js.native
}

object `203` {
  @scala.inline
  def apply(dialCode: Plussign41, id: CH, label: `Switzerland LeftparenthesisSchweizRightparenthesis`): `203` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`203`]
  }
  @scala.inline
  implicit class `203Ops`[Self <: `203`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign41): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: CH): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Switzerland LeftparenthesisSchweizRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

