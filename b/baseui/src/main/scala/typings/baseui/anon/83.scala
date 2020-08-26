package typings.baseui.anon

import typings.baseui.baseuiStrings.GN
import typings.baseui.baseuiStrings.Plussign224
import typings.baseui.baseuiStrings.`Guinea LeftparenthesisGuinéeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `83` extends js.Object {
  var dialCode: Plussign224 = js.native
  var id: GN = js.native
  var label: `Guinea LeftparenthesisGuinéeRightparenthesis` = js.native
}

object `83` {
  @scala.inline
  def apply(dialCode: Plussign224, id: GN, label: `Guinea LeftparenthesisGuinéeRightparenthesis`): `83` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`83`]
  }
  @scala.inline
  implicit class `83Ops`[Self <: `83`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign224): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: GN): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Guinea LeftparenthesisGuinéeRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

