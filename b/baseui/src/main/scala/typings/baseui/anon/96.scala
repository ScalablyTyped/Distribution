package typings.baseui.anon

import typings.baseui.baseuiStrings.IM
import typings.baseui.baseuiStrings.Plussign44
import typings.baseui.baseuiStrings.`Isle of Man`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `96` extends js.Object {
  var dialCode: Plussign44 = js.native
  var id: IM = js.native
  var label: `Isle of Man` = js.native
}

object `96` {
  @scala.inline
  def apply(dialCode: Plussign44, id: IM, label: `Isle of Man`): `96` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`96`]
  }
  @scala.inline
  implicit class `96Ops`[Self <: `96`] (val x: Self) extends AnyVal {
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
    def setId(value: IM): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Isle of Man`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

