package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign670
import typings.baseui.baseuiStrings.TL
import typings.baseui.baseuiStrings.`Timor-Leste`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `209` extends js.Object {
  var dialCode: Plussign670 = js.native
  var id: TL = js.native
  var label: `Timor-Leste` = js.native
}

object `209` {
  @scala.inline
  def apply(dialCode: Plussign670, id: TL, label: `Timor-Leste`): `209` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`209`]
  }
  @scala.inline
  implicit class `209Ops`[Self <: `209`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign670): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: TL): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Timor-Leste`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

