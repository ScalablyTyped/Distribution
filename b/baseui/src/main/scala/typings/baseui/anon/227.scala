package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign678
import typings.baseui.baseuiStrings.VU
import typings.baseui.baseuiStrings.Vanuatu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `227` extends js.Object {
  var dialCode: Plussign678 = js.native
  var id: VU = js.native
  var label: Vanuatu = js.native
}

object `227` {
  @scala.inline
  def apply(dialCode: Plussign678, id: VU, label: Vanuatu): `227` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`227`]
  }
  @scala.inline
  implicit class `227Ops`[Self <: `227`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign678): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: VU): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Vanuatu): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

