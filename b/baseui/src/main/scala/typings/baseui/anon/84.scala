package typings.baseui.anon

import typings.baseui.baseuiStrings.GW
import typings.baseui.baseuiStrings.Plussign245
import typings.baseui.baseuiStrings.`Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `84` extends js.Object {
  var dialCode: Plussign245 = js.native
  var id: GW = js.native
  var label: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis` = js.native
}

object `84` {
  @scala.inline
  def apply(dialCode: Plussign245, id: GW, label: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`): `84` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`84`]
  }
  @scala.inline
  implicit class `84Ops`[Self <: `84`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign245): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: GW): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

