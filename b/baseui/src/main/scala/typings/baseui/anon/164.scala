package typings.baseui.anon

import typings.baseui.baseuiStrings.PL
import typings.baseui.baseuiStrings.Plussign48
import typings.baseui.baseuiStrings.`Poland LeftparenthesisPolskaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `164` extends js.Object {
  var dialCode: Plussign48 = js.native
  var id: PL = js.native
  var label: `Poland LeftparenthesisPolskaRightparenthesis` = js.native
}

object `164` {
  @scala.inline
  def apply(dialCode: Plussign48, id: PL, label: `Poland LeftparenthesisPolskaRightparenthesis`): `164` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`164`]
  }
  @scala.inline
  implicit class `164Ops`[Self <: `164`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign48): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: PL): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Poland LeftparenthesisPolskaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

