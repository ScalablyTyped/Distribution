package typings.baseui.anon

import typings.baseui.baseuiStrings.KY
import typings.baseui.baseuiStrings.Plussign1345
import typings.baseui.baseuiStrings.`Cayman Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `33` extends js.Object {
  var dialCode: Plussign1345 = js.native
  var id: KY = js.native
  var label: `Cayman Islands` = js.native
}

object `33` {
  @scala.inline
  def apply(dialCode: Plussign1345, id: KY, label: `Cayman Islands`): `33` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`33`]
  }
  @scala.inline
  implicit class `33Ops`[Self <: `33`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign1345): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: KY): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Cayman Islands`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

