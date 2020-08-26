package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign7
import typings.baseui.baseuiStrings.RU
import typings.baseui.baseuiStrings.`Russia LeftparenthesisРоссияRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `170` extends js.Object {
  var dialCode: Plussign7 = js.native
  var id: RU = js.native
  var label: `Russia LeftparenthesisРоссияRightparenthesis` = js.native
}

object `170` {
  @scala.inline
  def apply(dialCode: Plussign7, id: RU, label: `Russia LeftparenthesisРоссияRightparenthesis`): `170` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`170`]
  }
  @scala.inline
  implicit class `170Ops`[Self <: `170`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign7): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: RU): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Russia LeftparenthesisРоссияRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

