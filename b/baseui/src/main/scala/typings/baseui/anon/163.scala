package typings.baseui.anon

import typings.baseui.baseuiStrings.PH
import typings.baseui.baseuiStrings.Philippines
import typings.baseui.baseuiStrings.Plussign63
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `163` extends js.Object {
  var dialCode: Plussign63 = js.native
  var id: PH = js.native
  var label: Philippines = js.native
}

object `163` {
  @scala.inline
  def apply(dialCode: Plussign63, id: PH, label: Philippines): `163` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`163`]
  }
  @scala.inline
  implicit class `163Ops`[Self <: `163`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign63): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: PH): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Philippines): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

