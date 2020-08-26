package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign386
import typings.baseui.baseuiStrings.SI
import typings.baseui.baseuiStrings.`Slovenia LeftparenthesisSlovenijaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `190` extends js.Object {
  var dialCode: Plussign386 = js.native
  var id: SI = js.native
  var label: `Slovenia LeftparenthesisSlovenijaRightparenthesis` = js.native
}

object `190` {
  @scala.inline
  def apply(dialCode: Plussign386, id: SI, label: `Slovenia LeftparenthesisSlovenijaRightparenthesis`): `190` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`190`]
  }
  @scala.inline
  implicit class `190Ops`[Self <: `190`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign386): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SI): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Slovenia LeftparenthesisSlovenijaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

