package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign381
import typings.baseui.baseuiStrings.RS
import typings.baseui.baseuiStrings.`Serbia LeftparenthesisСрбијаRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `184` extends js.Object {
  var dialCode: Plussign381 = js.native
  var id: RS = js.native
  var label: `Serbia LeftparenthesisСрбијаRightparenthesis` = js.native
}

object `184` {
  @scala.inline
  def apply(dialCode: Plussign381, id: RS, label: `Serbia LeftparenthesisСрбијаRightparenthesis`): `184` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`184`]
  }
  @scala.inline
  implicit class `184Ops`[Self <: `184`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign381): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: RS): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Serbia LeftparenthesisСрбијаRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

