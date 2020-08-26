package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign963
import typings.baseui.baseuiStrings.SY
import typings.baseui.baseuiStrings.`Syria Leftparenthesis‫سوريا‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `204` extends js.Object {
  var dialCode: Plussign963 = js.native
  var id: SY = js.native
  var label: `Syria Leftparenthesis‫سوريا‬‎Rightparenthesis` = js.native
}

object `204` {
  @scala.inline
  def apply(dialCode: Plussign963, id: SY, label: `Syria Leftparenthesis‫سوريا‬‎Rightparenthesis`): `204` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`204`]
  }
  @scala.inline
  implicit class `204Ops`[Self <: `204`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign963): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SY): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Syria Leftparenthesis‫سوريا‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

