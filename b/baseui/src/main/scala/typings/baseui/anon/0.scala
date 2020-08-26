package typings.baseui.anon

import typings.baseui.baseuiStrings.AO
import typings.baseui.baseuiStrings.Angola
import typings.baseui.baseuiStrings.Plussign244
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var dialCode: Plussign244 = js.native
  var id: AO = js.native
  var label: Angola = js.native
}

object `0` {
  @scala.inline
  def apply(dialCode: Plussign244, id: AO, label: Angola): `0` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign244): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: AO): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Angola): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

