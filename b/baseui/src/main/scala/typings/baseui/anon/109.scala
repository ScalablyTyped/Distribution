package typings.baseui.anon

import typings.baseui.baseuiStrings.LA
import typings.baseui.baseuiStrings.Plussign856
import typings.baseui.baseuiStrings.`Laos LeftparenthesisລາວRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `109` extends js.Object {
  var dialCode: Plussign856 = js.native
  var id: LA = js.native
  var label: `Laos LeftparenthesisລາວRightparenthesis` = js.native
}

object `109` {
  @scala.inline
  def apply(dialCode: Plussign856, id: LA, label: `Laos LeftparenthesisລາວRightparenthesis`): `109` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`109`]
  }
  @scala.inline
  implicit class `109Ops`[Self <: `109`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign856): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: LA): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Laos LeftparenthesisລາວRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

