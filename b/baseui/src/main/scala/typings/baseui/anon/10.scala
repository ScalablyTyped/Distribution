package typings.baseui.anon

import typings.baseui.baseuiStrings.BH
import typings.baseui.baseuiStrings.Plussign973
import typings.baseui.baseuiStrings.`Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `10` extends js.Object {
  var dialCode: Plussign973 = js.native
  var id: BH = js.native
  var label: `Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis` = js.native
}

object `10` {
  @scala.inline
  def apply(dialCode: Plussign973, id: BH, label: `Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis`): `10` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  @scala.inline
  implicit class `10Ops`[Self <: `10`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign973): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: BH): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

