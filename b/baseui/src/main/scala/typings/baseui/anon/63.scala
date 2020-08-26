package typings.baseui.anon

import typings.baseui.baseuiStrings.FK
import typings.baseui.baseuiStrings.Plussign500
import typings.baseui.baseuiStrings.`Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `63` extends js.Object {
  var dialCode: Plussign500 = js.native
  var id: FK = js.native
  var label: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis` = js.native
}

object `63` {
  @scala.inline
  def apply(
    dialCode: Plussign500,
    id: FK,
    label: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`
  ): `63` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`63`]
  }
  @scala.inline
  implicit class `63Ops`[Self <: `63`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign500): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: FK): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

