package typings.baseui.anon

import typings.baseui.baseuiStrings.GF
import typings.baseui.baseuiStrings.Plussign594
import typings.baseui.baseuiStrings.`French Guiana LeftparenthesisGuyane françaiseRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `68` extends js.Object {
  var dialCode: Plussign594 = js.native
  var id: GF = js.native
  var label: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis` = js.native
}

object `68` {
  @scala.inline
  def apply(
    dialCode: Plussign594,
    id: GF,
    label: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis`
  ): `68` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`68`]
  }
  @scala.inline
  implicit class `68Ops`[Self <: `68`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign594): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: GF): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

