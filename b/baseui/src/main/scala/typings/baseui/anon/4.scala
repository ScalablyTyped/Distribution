package typings.baseui.anon

import typings.baseui.baseuiStrings.AM
import typings.baseui.baseuiStrings.Plussign374
import typings.baseui.baseuiStrings.`Armenia LeftparenthesisՀայաստանRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `4` extends js.Object {
  var dialCode: Plussign374 = js.native
  var id: AM = js.native
  var label: `Armenia LeftparenthesisՀայաստանRightparenthesis` = js.native
}

object `4` {
  @scala.inline
  def apply(dialCode: Plussign374, id: AM, label: `Armenia LeftparenthesisՀայաստանRightparenthesis`): `4` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  @scala.inline
  implicit class `4Ops`[Self <: `4`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign374): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: AM): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Armenia LeftparenthesisՀայաստանRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

