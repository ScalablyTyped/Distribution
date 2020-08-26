package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1784
import typings.baseui.baseuiStrings.VC
import typings.baseui.baseuiStrings.`Saint Vincent and the Grenadines`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `178` extends js.Object {
  var dialCode: Plussign1784 = js.native
  var id: VC = js.native
  var label: `Saint Vincent and the Grenadines` = js.native
}

object `178` {
  @scala.inline
  def apply(dialCode: Plussign1784, id: VC, label: `Saint Vincent and the Grenadines`): `178` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`178`]
  }
  @scala.inline
  implicit class `178Ops`[Self <: `178`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign1784): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: VC): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Saint Vincent and the Grenadines`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

