package typings.baseui.anon

import typings.baseui.baseuiStrings.MZ
import typings.baseui.baseuiStrings.Plussign258
import typings.baseui.baseuiStrings.`Mozambique LeftparenthesisMoçambiqueRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `139` extends js.Object {
  var dialCode: Plussign258 = js.native
  var id: MZ = js.native
  var label: `Mozambique LeftparenthesisMoçambiqueRightparenthesis` = js.native
}

object `139` {
  @scala.inline
  def apply(dialCode: Plussign258, id: MZ, label: `Mozambique LeftparenthesisMoçambiqueRightparenthesis`): `139` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`139`]
  }
  @scala.inline
  implicit class `139Ops`[Self <: `139`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign258): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: MZ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Mozambique LeftparenthesisMoçambiqueRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

