package typings.baseui.anon

import typings.baseui.baseuiStrings.CN
import typings.baseui.baseuiStrings.Plussign86
import typings.baseui.baseuiStrings.`China Leftparenthesis中国Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `37` extends js.Object {
  var dialCode: Plussign86 = js.native
  var id: CN = js.native
  var label: `China Leftparenthesis中国Rightparenthesis` = js.native
}

object `37` {
  @scala.inline
  def apply(dialCode: Plussign86, id: CN, label: `China Leftparenthesis中国Rightparenthesis`): `37` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`37`]
  }
  @scala.inline
  implicit class `37Ops`[Self <: `37`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign86): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: CN): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `China Leftparenthesis中国Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

