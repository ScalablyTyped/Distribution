package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign378
import typings.baseui.baseuiStrings.SM
import typings.baseui.baseuiStrings.`San Marino`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `180` extends js.Object {
  var dialCode: Plussign378 = js.native
  var id: SM = js.native
  var label: `San Marino` = js.native
}

object `180` {
  @scala.inline
  def apply(dialCode: Plussign378, id: SM, label: `San Marino`): `180` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`180`]
  }
  @scala.inline
  implicit class `180Ops`[Self <: `180`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign378): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SM): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `San Marino`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

