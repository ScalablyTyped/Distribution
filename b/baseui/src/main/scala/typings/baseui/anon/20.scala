package typings.baseui.anon

import typings.baseui.baseuiStrings.BA
import typings.baseui.baseuiStrings.Plussign387
import typings.baseui.baseuiStrings.`Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `20` extends js.Object {
  var dialCode: Plussign387 = js.native
  var id: BA = js.native
  var label: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis` = js.native
}

object `20` {
  @scala.inline
  def apply(
    dialCode: Plussign387,
    id: BA,
    label: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`
  ): `20` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  @scala.inline
  implicit class `20Ops`[Self <: `20`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign387): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: BA): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

