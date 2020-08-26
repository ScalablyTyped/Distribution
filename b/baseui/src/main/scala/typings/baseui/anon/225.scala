package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign598
import typings.baseui.baseuiStrings.UY
import typings.baseui.baseuiStrings.Uruguay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `225` extends js.Object {
  var dialCode: Plussign598 = js.native
  var id: UY = js.native
  var label: Uruguay = js.native
}

object `225` {
  @scala.inline
  def apply(dialCode: Plussign598, id: UY, label: Uruguay): `225` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`225`]
  }
  @scala.inline
  implicit class `225Ops`[Self <: `225`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign598): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: UY): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Uruguay): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

