package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign503
import typings.baseui.baseuiStrings.SV
import typings.baseui.baseuiStrings.`El Salvador`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `58` extends js.Object {
  var dialCode: Plussign503 = js.native
  var id: SV = js.native
  var label: `El Salvador` = js.native
}

object `58` {
  @scala.inline
  def apply(dialCode: Plussign503, id: SV, label: `El Salvador`): `58` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`58`]
  }
  @scala.inline
  implicit class `58Ops`[Self <: `58`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign503): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SV): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `El Salvador`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

