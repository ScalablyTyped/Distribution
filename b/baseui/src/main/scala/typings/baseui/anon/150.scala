package typings.baseui.anon

import typings.baseui.baseuiStrings.NU
import typings.baseui.baseuiStrings.Niue
import typings.baseui.baseuiStrings.Plussign683
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `150` extends js.Object {
  var dialCode: Plussign683 = js.native
  var id: NU = js.native
  var label: Niue = js.native
}

object `150` {
  @scala.inline
  def apply(dialCode: Plussign683, id: NU, label: Niue): `150` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`150`]
  }
  @scala.inline
  implicit class `150Ops`[Self <: `150`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign683): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: NU): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Niue): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

