package typings.baseui.anon

import typings.baseui.baseuiStrings.FJ
import typings.baseui.baseuiStrings.Fiji
import typings.baseui.baseuiStrings.Plussign679
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `65` extends js.Object {
  var dialCode: Plussign679 = js.native
  var id: FJ = js.native
  var label: Fiji = js.native
}

object `65` {
  @scala.inline
  def apply(dialCode: Plussign679, id: FJ, label: Fiji): `65` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`65`]
  }
  @scala.inline
  implicit class `65Ops`[Self <: `65`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign679): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: FJ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Fiji): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

