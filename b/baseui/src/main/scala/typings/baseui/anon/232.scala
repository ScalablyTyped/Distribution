package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign967
import typings.baseui.baseuiStrings.YE
import typings.baseui.baseuiStrings.`Yemen Leftparenthesis‫اليمن‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `232` extends js.Object {
  var dialCode: Plussign967 = js.native
  var id: YE = js.native
  var label: `Yemen Leftparenthesis‫اليمن‬‎Rightparenthesis` = js.native
}

object `232` {
  @scala.inline
  def apply(dialCode: Plussign967, id: YE, label: `Yemen Leftparenthesis‫اليمن‬‎Rightparenthesis`): `232` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`232`]
  }
  @scala.inline
  implicit class `232Ops`[Self <: `232`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign967): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: YE): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Yemen Leftparenthesis‫اليمن‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

