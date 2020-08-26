package typings.baseui.anon

import typings.baseui.baseuiStrings.DJ
import typings.baseui.baseuiStrings.Djibouti
import typings.baseui.baseuiStrings.Plussign253
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `53` extends js.Object {
  var dialCode: Plussign253 = js.native
  var id: DJ = js.native
  var label: Djibouti = js.native
}

object `53` {
  @scala.inline
  def apply(dialCode: Plussign253, id: DJ, label: Djibouti): `53` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`53`]
  }
  @scala.inline
  implicit class `53Ops`[Self <: `53`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign253): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: DJ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Djibouti): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

