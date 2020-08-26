package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign380
import typings.baseui.baseuiStrings.UA
import typings.baseui.baseuiStrings.`Ukraine LeftparenthesisУкраїнаRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `221` extends js.Object {
  var dialCode: Plussign380 = js.native
  var id: UA = js.native
  var label: `Ukraine LeftparenthesisУкраїнаRightparenthesis` = js.native
}

object `221` {
  @scala.inline
  def apply(dialCode: Plussign380, id: UA, label: `Ukraine LeftparenthesisУкраїнаRightparenthesis`): `221` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`221`]
  }
  @scala.inline
  implicit class `221Ops`[Self <: `221`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign380): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: UA): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Ukraine LeftparenthesisУкраїнаRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

