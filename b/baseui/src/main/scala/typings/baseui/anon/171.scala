package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign250
import typings.baseui.baseuiStrings.RW
import typings.baseui.baseuiStrings.Rwanda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `171` extends js.Object {
  var dialCode: Plussign250 = js.native
  var id: RW = js.native
  var label: Rwanda = js.native
}

object `171` {
  @scala.inline
  def apply(dialCode: Plussign250, id: RW, label: Rwanda): `171` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`171`]
  }
  @scala.inline
  implicit class `171Ops`[Self <: `171`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign250): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: RW): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Rwanda): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

