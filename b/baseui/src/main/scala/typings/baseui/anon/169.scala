package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign40
import typings.baseui.baseuiStrings.RO
import typings.baseui.baseuiStrings.`Romania LeftparenthesisRomâniaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `169` extends js.Object {
  var dialCode: Plussign40 = js.native
  var id: RO = js.native
  var label: `Romania LeftparenthesisRomâniaRightparenthesis` = js.native
}

object `169` {
  @scala.inline
  def apply(dialCode: Plussign40, id: RO, label: `Romania LeftparenthesisRomâniaRightparenthesis`): `169` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`169`]
  }
  @scala.inline
  implicit class `169Ops`[Self <: `169`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign40): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: RO): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Romania LeftparenthesisRomâniaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

