package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign58
import typings.baseui.baseuiStrings.VE
import typings.baseui.baseuiStrings.Venezuela
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `229` extends js.Object {
  var dialCode: Plussign58 = js.native
  var id: VE = js.native
  var label: Venezuela = js.native
}

object `229` {
  @scala.inline
  def apply(dialCode: Plussign58, id: VE, label: Venezuela): `229` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`229`]
  }
  @scala.inline
  implicit class `229Ops`[Self <: `229`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign58): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: VE): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Venezuela): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

