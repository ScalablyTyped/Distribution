package typings.baseui.anon

import typings.baseui.baseuiStrings.EG
import typings.baseui.baseuiStrings.Plussign20
import typings.baseui.baseuiStrings.`Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `57` extends js.Object {
  var dialCode: Plussign20 = js.native
  var id: EG = js.native
  var label: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis` = js.native
}

object `57` {
  @scala.inline
  def apply(dialCode: Plussign20, id: EG, label: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`): `57` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`57`]
  }
  @scala.inline
  implicit class `57Ops`[Self <: `57`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign20): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: EG): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

