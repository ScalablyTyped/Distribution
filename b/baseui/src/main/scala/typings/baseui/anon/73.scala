package typings.baseui.anon

import typings.baseui.baseuiStrings.DE
import typings.baseui.baseuiStrings.Plussign49
import typings.baseui.baseuiStrings.`Germany LeftparenthesisDeutschlandRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `73` extends js.Object {
  var dialCode: Plussign49 = js.native
  var id: DE = js.native
  var label: `Germany LeftparenthesisDeutschlandRightparenthesis` = js.native
}

object `73` {
  @scala.inline
  def apply(dialCode: Plussign49, id: DE, label: `Germany LeftparenthesisDeutschlandRightparenthesis`): `73` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`73`]
  }
  @scala.inline
  implicit class `73Ops`[Self <: `73`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign49): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: DE): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Germany LeftparenthesisDeutschlandRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

