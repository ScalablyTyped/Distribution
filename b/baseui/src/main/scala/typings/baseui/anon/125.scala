package typings.baseui.anon

import typings.baseui.baseuiStrings.MT
import typings.baseui.baseuiStrings.Malta
import typings.baseui.baseuiStrings.Plussign356
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `125` extends js.Object {
  var dialCode: Plussign356 = js.native
  var id: MT = js.native
  var label: Malta = js.native
}

object `125` {
  @scala.inline
  def apply(dialCode: Plussign356, id: MT, label: Malta): `125` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`125`]
  }
  @scala.inline
  implicit class `125Ops`[Self <: `125`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign356): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: MT): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Malta): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

