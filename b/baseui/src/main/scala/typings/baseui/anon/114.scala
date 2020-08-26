package typings.baseui.anon

import typings.baseui.baseuiStrings.LY
import typings.baseui.baseuiStrings.Plussign218
import typings.baseui.baseuiStrings.`Libya Leftparenthesis‫ليبيا‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `114` extends js.Object {
  var dialCode: Plussign218 = js.native
  var id: LY = js.native
  var label: `Libya Leftparenthesis‫ليبيا‬‎Rightparenthesis` = js.native
}

object `114` {
  @scala.inline
  def apply(dialCode: Plussign218, id: LY, label: `Libya Leftparenthesis‫ليبيا‬‎Rightparenthesis`): `114` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`114`]
  }
  @scala.inline
  implicit class `114Ops`[Self <: `114`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign218): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: LY): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Libya Leftparenthesis‫ليبيا‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

