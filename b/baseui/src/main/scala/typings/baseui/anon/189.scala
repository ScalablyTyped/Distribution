package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign421
import typings.baseui.baseuiStrings.SK
import typings.baseui.baseuiStrings.`Slovakia LeftparenthesisSlovenskoRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `189` extends js.Object {
  var dialCode: Plussign421 = js.native
  var id: SK = js.native
  var label: `Slovakia LeftparenthesisSlovenskoRightparenthesis` = js.native
}

object `189` {
  @scala.inline
  def apply(dialCode: Plussign421, id: SK, label: `Slovakia LeftparenthesisSlovenskoRightparenthesis`): `189` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`189`]
  }
  @scala.inline
  implicit class `189Ops`[Self <: `189`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign421): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SK): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Slovakia LeftparenthesisSlovenskoRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

