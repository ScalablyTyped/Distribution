package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1284
import typings.baseui.baseuiStrings.VG
import typings.baseui.baseuiStrings.`British Virgin Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `24` extends js.Object {
  var dialCode: Plussign1284 = js.native
  var id: VG = js.native
  var label: `British Virgin Islands` = js.native
}

object `24` {
  @scala.inline
  def apply(dialCode: Plussign1284, id: VG, label: `British Virgin Islands`): `24` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  @scala.inline
  implicit class `24Ops`[Self <: `24`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign1284): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: VG): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `British Virgin Islands`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

