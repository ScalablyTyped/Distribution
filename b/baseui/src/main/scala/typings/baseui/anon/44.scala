package typings.baseui.anon

import typings.baseui.baseuiStrings.CK
import typings.baseui.baseuiStrings.Plussign682
import typings.baseui.baseuiStrings.`Cook Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `44` extends js.Object {
  var dialCode: Plussign682 = js.native
  var id: CK = js.native
  var label: `Cook Islands` = js.native
}

object `44` {
  @scala.inline
  def apply(dialCode: Plussign682, id: CK, label: `Cook Islands`): `44` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`44`]
  }
  @scala.inline
  implicit class `44Ops`[Self <: `44`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign682): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: CK): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Cook Islands`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

