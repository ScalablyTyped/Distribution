package typings.baseui.anon

import typings.baseui.baseuiStrings.BB
import typings.baseui.baseuiStrings.Barbados
import typings.baseui.baseuiStrings.Plussign1246
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `12` extends js.Object {
  var dialCode: Plussign1246 = js.native
  var id: BB = js.native
  var label: Barbados = js.native
}

object `12` {
  @scala.inline
  def apply(dialCode: Plussign1246, id: BB, label: Barbados): `12` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  @scala.inline
  implicit class `12Ops`[Self <: `12`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign1246): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: BB): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Barbados): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

