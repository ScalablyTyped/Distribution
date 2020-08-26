package typings.baseui.anon

import typings.baseui.baseuiStrings.CL
import typings.baseui.baseuiStrings.Chile
import typings.baseui.baseuiStrings.Plussign56
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `36` extends js.Object {
  var dialCode: Plussign56 = js.native
  var id: CL = js.native
  var label: Chile = js.native
}

object `36` {
  @scala.inline
  def apply(dialCode: Plussign56, id: CL, label: Chile): `36` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`36`]
  }
  @scala.inline
  implicit class `36Ops`[Self <: `36`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign56): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: CL): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Chile): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

