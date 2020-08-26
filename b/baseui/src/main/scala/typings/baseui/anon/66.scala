package typings.baseui.anon

import typings.baseui.baseuiStrings.FI
import typings.baseui.baseuiStrings.Plussign358
import typings.baseui.baseuiStrings.`Finland LeftparenthesisSuomiRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `66` extends js.Object {
  var dialCode: Plussign358 = js.native
  var id: FI = js.native
  var label: `Finland LeftparenthesisSuomiRightparenthesis` = js.native
}

object `66` {
  @scala.inline
  def apply(dialCode: Plussign358, id: FI, label: `Finland LeftparenthesisSuomiRightparenthesis`): `66` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`66`]
  }
  @scala.inline
  implicit class `66Ops`[Self <: `66`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign358): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: FI): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Finland LeftparenthesisSuomiRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

