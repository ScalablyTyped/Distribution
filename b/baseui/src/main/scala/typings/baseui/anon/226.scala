package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign998
import typings.baseui.baseuiStrings.UZ
import typings.baseui.baseuiStrings.`Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `226` extends js.Object {
  var dialCode: Plussign998 = js.native
  var id: UZ = js.native
  var label: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis` = js.native
}

object `226` {
  @scala.inline
  def apply(dialCode: Plussign998, id: UZ, label: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`): `226` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`226`]
  }
  @scala.inline
  implicit class `226Ops`[Self <: `226`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign998): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: UZ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

