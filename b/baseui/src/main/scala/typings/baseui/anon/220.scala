package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign256
import typings.baseui.baseuiStrings.UG
import typings.baseui.baseuiStrings.Uganda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `220` extends js.Object {
  var dialCode: Plussign256 = js.native
  var id: UG = js.native
  var label: Uganda = js.native
}

object `220` {
  @scala.inline
  def apply(dialCode: Plussign256, id: UG, label: Uganda): `220` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`220`]
  }
  @scala.inline
  implicit class `220Ops`[Self <: `220`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign256): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: UG): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Uganda): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

