package typings.baseui.anon

import typings.baseui.baseuiStrings.ER
import typings.baseui.baseuiStrings.Eritrea
import typings.baseui.baseuiStrings.Plussign291
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `60` extends js.Object {
  var dialCode: Plussign291 = js.native
  var id: ER = js.native
  var label: Eritrea = js.native
}

object `60` {
  @scala.inline
  def apply(dialCode: Plussign291, id: ER, label: Eritrea): `60` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`60`]
  }
  @scala.inline
  implicit class `60Ops`[Self <: `60`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign291): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: ER): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Eritrea): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

