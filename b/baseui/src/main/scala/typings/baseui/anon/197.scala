package typings.baseui.anon

import typings.baseui.baseuiStrings.LK
import typings.baseui.baseuiStrings.Plussign94
import typings.baseui.baseuiStrings.`Sri Lanka Leftparenthesisශ්‍රී ලංකාවRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `197` extends js.Object {
  var dialCode: Plussign94 = js.native
  var id: LK = js.native
  var label: `Sri Lanka Leftparenthesisශ්‍රී ලංකාවRightparenthesis` = js.native
}

object `197` {
  @scala.inline
  def apply(dialCode: Plussign94, id: LK, label: `Sri Lanka Leftparenthesisශ්‍රී ලංකාවRightparenthesis`): `197` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`197`]
  }
  @scala.inline
  implicit class `197Ops`[Self <: `197`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign94): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: LK): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Sri Lanka Leftparenthesisශ්‍රී ලංකාවRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

