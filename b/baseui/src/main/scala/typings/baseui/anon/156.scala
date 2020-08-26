package typings.baseui.anon

import typings.baseui.baseuiStrings.PK
import typings.baseui.baseuiStrings.Plussign92
import typings.baseui.baseuiStrings.`Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `156` extends js.Object {
  var dialCode: Plussign92 = js.native
  var id: PK = js.native
  var label: `Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis` = js.native
}

object `156` {
  @scala.inline
  def apply(dialCode: Plussign92, id: PK, label: `Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis`): `156` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`156`]
  }
  @scala.inline
  implicit class `156Ops`[Self <: `156`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign92): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: PK): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

