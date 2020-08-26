package typings.baseui.anon

import typings.baseui.baseuiStrings.KM
import typings.baseui.baseuiStrings.Plussign269
import typings.baseui.baseuiStrings.`Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `41` extends js.Object {
  var dialCode: Plussign269 = js.native
  var id: KM = js.native
  var label: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis` = js.native
}

object `41` {
  @scala.inline
  def apply(dialCode: Plussign269, id: KM, label: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`): `41` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`41`]
  }
  @scala.inline
  implicit class `41Ops`[Self <: `41`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign269): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: KM): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

