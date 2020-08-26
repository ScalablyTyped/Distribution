package typings.baseui.anon

import typings.baseui.baseuiStrings.NZ
import typings.baseui.baseuiStrings.Plussign64
import typings.baseui.baseuiStrings.`New Zealand`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `146` extends js.Object {
  var dialCode: Plussign64 = js.native
  var id: NZ = js.native
  var label: `New Zealand` = js.native
}

object `146` {
  @scala.inline
  def apply(dialCode: Plussign64, id: NZ, label: `New Zealand`): `146` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`146`]
  }
  @scala.inline
  implicit class `146Ops`[Self <: `146`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign64): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: NZ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `New Zealand`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

