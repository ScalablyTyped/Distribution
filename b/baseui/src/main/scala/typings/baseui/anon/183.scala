package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign221
import typings.baseui.baseuiStrings.SN
import typings.baseui.baseuiStrings.`Senegal LeftparenthesisSénégalRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `183` extends js.Object {
  var dialCode: Plussign221 = js.native
  var id: SN = js.native
  var label: `Senegal LeftparenthesisSénégalRightparenthesis` = js.native
}

object `183` {
  @scala.inline
  def apply(dialCode: Plussign221, id: SN, label: `Senegal LeftparenthesisSénégalRightparenthesis`): `183` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`183`]
  }
  @scala.inline
  implicit class `183Ops`[Self <: `183`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign221): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SN): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Senegal LeftparenthesisSénégalRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

