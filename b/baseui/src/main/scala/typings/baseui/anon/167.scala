package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign974
import typings.baseui.baseuiStrings.QA
import typings.baseui.baseuiStrings.`Qatar Leftparenthesis‫قطر‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `167` extends js.Object {
  var dialCode: Plussign974 = js.native
  var id: QA = js.native
  var label: `Qatar Leftparenthesis‫قطر‬‎Rightparenthesis` = js.native
}

object `167` {
  @scala.inline
  def apply(dialCode: Plussign974, id: QA, label: `Qatar Leftparenthesis‫قطر‬‎Rightparenthesis`): `167` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`167`]
  }
  @scala.inline
  implicit class `167Ops`[Self <: `167`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign974): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: QA): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Qatar Leftparenthesis‫قطر‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

