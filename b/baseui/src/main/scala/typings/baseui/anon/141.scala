package typings.baseui.anon

import typings.baseui.baseuiStrings.NA
import typings.baseui.baseuiStrings.Plussign264
import typings.baseui.baseuiStrings.`Namibia LeftparenthesisNamibiëRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `141` extends js.Object {
  var dialCode: Plussign264 = js.native
  var id: NA = js.native
  var label: `Namibia LeftparenthesisNamibiëRightparenthesis` = js.native
}

object `141` {
  @scala.inline
  def apply(dialCode: Plussign264, id: NA, label: `Namibia LeftparenthesisNamibiëRightparenthesis`): `141` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`141`]
  }
  @scala.inline
  implicit class `141Ops`[Self <: `141`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign264): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: NA): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Namibia LeftparenthesisNamibiëRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

