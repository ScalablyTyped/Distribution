package typings.baseui.anon

import typings.baseui.baseuiStrings.IN
import typings.baseui.baseuiStrings.Plussign91
import typings.baseui.baseuiStrings.`India LeftparenthesisभारतRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `91` extends js.Object {
  var dialCode: Plussign91 = js.native
  var id: IN = js.native
  var label: `India LeftparenthesisभारतRightparenthesis` = js.native
}

object `91` {
  @scala.inline
  def apply(dialCode: Plussign91, id: IN, label: `India LeftparenthesisभारतRightparenthesis`): `91` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`91`]
  }
  @scala.inline
  implicit class `91Ops`[Self <: `91`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign91): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: IN): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `India LeftparenthesisभारतRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

