package typings.baseui.anon

import typings.baseui.baseuiStrings.DO
import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.`Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `55` extends js.Object {
  var dialCode: Plussign1 = js.native
  var id: DO = js.native
  var label: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis` = js.native
}

object `55` {
  @scala.inline
  def apply(
    dialCode: Plussign1,
    id: DO,
    label: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`
  ): `55` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`55`]
  }
  @scala.inline
  implicit class `55Ops`[Self <: `55`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign1): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: DO): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

