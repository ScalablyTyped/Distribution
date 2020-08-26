package typings.baseui.anon

import typings.baseui.baseuiStrings.BG
import typings.baseui.baseuiStrings.Plussign359
import typings.baseui.baseuiStrings.`Bulgaria LeftparenthesisБългарияRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `26` extends js.Object {
  var dialCode: Plussign359 = js.native
  var id: BG = js.native
  var label: `Bulgaria LeftparenthesisБългарияRightparenthesis` = js.native
}

object `26` {
  @scala.inline
  def apply(dialCode: Plussign359, id: BG, label: `Bulgaria LeftparenthesisБългарияRightparenthesis`): `26` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
  @scala.inline
  implicit class `26Ops`[Self <: `26`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign359): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: BG): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Bulgaria LeftparenthesisБългарияRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

