package typings.baseui.anon

import typings.baseui.baseuiStrings.AF
import typings.baseui.baseuiStrings.Plussign93
import typings.baseui.baseuiStrings.`Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialCode extends js.Object {
  var dialCode: Plussign93 = js.native
  var id: AF = js.native
  var label: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis` = js.native
}

object DialCode {
  @scala.inline
  def apply(dialCode: Plussign93, id: AF, label: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`): DialCode = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCode]
  }
  @scala.inline
  implicit class DialCodeOps[Self <: DialCode] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign93): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: AF): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

