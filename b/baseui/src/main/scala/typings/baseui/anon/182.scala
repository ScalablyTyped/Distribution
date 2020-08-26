package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign966
import typings.baseui.baseuiStrings.SA
import typings.baseui.baseuiStrings.`Saudi Arabia Leftparenthesis‫المملكة العربية السعودية‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `182` extends js.Object {
  var dialCode: Plussign966 = js.native
  var id: SA = js.native
  var label: `Saudi Arabia Leftparenthesis‫المملكة العربية السعودية‬‎Rightparenthesis` = js.native
}

object `182` {
  @scala.inline
  def apply(
    dialCode: Plussign966,
    id: SA,
    label: `Saudi Arabia Leftparenthesis‫المملكة العربية السعودية‬‎Rightparenthesis`
  ): `182` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`182`]
  }
  @scala.inline
  implicit class `182Ops`[Self <: `182`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign966): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SA): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Saudi Arabia Leftparenthesis‫المملكة العربية السعودية‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

