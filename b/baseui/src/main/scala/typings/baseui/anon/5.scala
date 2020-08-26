package typings.baseui.anon

import typings.baseui.baseuiStrings.AW
import typings.baseui.baseuiStrings.Aruba
import typings.baseui.baseuiStrings.Plussign297
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `5` extends js.Object {
  var dialCode: Plussign297 = js.native
  var id: AW = js.native
  var label: Aruba = js.native
}

object `5` {
  @scala.inline
  def apply(dialCode: Plussign297, id: AW, label: Aruba): `5` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  @scala.inline
  implicit class `5Ops`[Self <: `5`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign297): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: AW): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Aruba): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

