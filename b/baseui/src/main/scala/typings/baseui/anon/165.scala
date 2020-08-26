package typings.baseui.anon

import typings.baseui.baseuiStrings.PT
import typings.baseui.baseuiStrings.Plussign351
import typings.baseui.baseuiStrings.Portugal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `165` extends js.Object {
  var dialCode: Plussign351 = js.native
  var id: PT = js.native
  var label: Portugal = js.native
}

object `165` {
  @scala.inline
  def apply(dialCode: Plussign351, id: PT, label: Portugal): `165` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`165`]
  }
  @scala.inline
  implicit class `165Ops`[Self <: `165`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign351): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: PT): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Portugal): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

