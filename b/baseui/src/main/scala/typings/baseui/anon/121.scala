package typings.baseui.anon

import typings.baseui.baseuiStrings.MW
import typings.baseui.baseuiStrings.Malawi
import typings.baseui.baseuiStrings.Plussign265
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `121` extends js.Object {
  var dialCode: Plussign265 = js.native
  var id: MW = js.native
  var label: Malawi = js.native
}

object `121` {
  @scala.inline
  def apply(dialCode: Plussign265, id: MW, label: Malawi): `121` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`121`]
  }
  @scala.inline
  implicit class `121Ops`[Self <: `121`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign265): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: MW): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Malawi): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

