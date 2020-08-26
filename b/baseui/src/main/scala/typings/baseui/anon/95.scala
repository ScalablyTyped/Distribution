package typings.baseui.anon

import typings.baseui.baseuiStrings.IE
import typings.baseui.baseuiStrings.Ireland
import typings.baseui.baseuiStrings.Plussign353
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `95` extends js.Object {
  var dialCode: Plussign353 = js.native
  var id: IE = js.native
  var label: Ireland = js.native
}

object `95` {
  @scala.inline
  def apply(dialCode: Plussign353, id: IE, label: Ireland): `95` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`95`]
  }
  @scala.inline
  implicit class `95Ops`[Self <: `95`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign353): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: IE): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Ireland): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

