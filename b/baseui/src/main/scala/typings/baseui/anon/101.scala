package typings.baseui.anon

import typings.baseui.baseuiStrings.JE
import typings.baseui.baseuiStrings.Jersey
import typings.baseui.baseuiStrings.Plussign44
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `101` extends js.Object {
  var dialCode: Plussign44 = js.native
  var id: JE = js.native
  var label: Jersey = js.native
}

object `101` {
  @scala.inline
  def apply(dialCode: Plussign44, id: JE, label: Jersey): `101` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`101`]
  }
  @scala.inline
  implicit class `101Ops`[Self <: `101`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign44): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: JE): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Jersey): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

