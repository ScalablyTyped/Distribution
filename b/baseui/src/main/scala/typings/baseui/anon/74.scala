package typings.baseui.anon

import typings.baseui.baseuiStrings.GH
import typings.baseui.baseuiStrings.Plussign233
import typings.baseui.baseuiStrings.`Ghana LeftparenthesisGaanaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `74` extends js.Object {
  var dialCode: Plussign233 = js.native
  var id: GH = js.native
  var label: `Ghana LeftparenthesisGaanaRightparenthesis` = js.native
}

object `74` {
  @scala.inline
  def apply(dialCode: Plussign233, id: GH, label: `Ghana LeftparenthesisGaanaRightparenthesis`): `74` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`74`]
  }
  @scala.inline
  implicit class `74Ops`[Self <: `74`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign233): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: GH): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Ghana LeftparenthesisGaanaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

