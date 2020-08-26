package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign290
import typings.baseui.baseuiStrings.SH
import typings.baseui.baseuiStrings.`Saint Helena`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `173` extends js.Object {
  var dialCode: Plussign290 = js.native
  var id: SH = js.native
  var label: `Saint Helena` = js.native
}

object `173` {
  @scala.inline
  def apply(dialCode: Plussign290, id: SH, label: `Saint Helena`): `173` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`173`]
  }
  @scala.inline
  implicit class `173Ops`[Self <: `173`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign290): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SH): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Saint Helena`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

