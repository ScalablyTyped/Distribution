package typings.baseui.anon

import typings.baseui.baseuiStrings.MO
import typings.baseui.baseuiStrings.Plussign853
import typings.baseui.baseuiStrings.`Macau Leftparenthesis澳門Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `118` extends js.Object {
  var dialCode: Plussign853 = js.native
  var id: MO = js.native
  var label: `Macau Leftparenthesis澳門Rightparenthesis` = js.native
}

object `118` {
  @scala.inline
  def apply(dialCode: Plussign853, id: MO, label: `Macau Leftparenthesis澳門Rightparenthesis`): `118` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`118`]
  }
  @scala.inline
  implicit class `118Ops`[Self <: `118`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign853): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: MO): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Macau Leftparenthesis澳門Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

