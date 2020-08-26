package typings.baseui.anon

import typings.baseui.baseuiStrings.BD
import typings.baseui.baseuiStrings.Plussign880
import typings.baseui.baseuiStrings.`Bangladesh LeftparenthesisবাংলাদেশRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `11` extends js.Object {
  var dialCode: Plussign880 = js.native
  var id: BD = js.native
  var label: `Bangladesh LeftparenthesisবাংলাদেশRightparenthesis` = js.native
}

object `11` {
  @scala.inline
  def apply(dialCode: Plussign880, id: BD, label: `Bangladesh LeftparenthesisবাংলাদেশRightparenthesis`): `11` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  @scala.inline
  implicit class `11Ops`[Self <: `11`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign880): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: BD): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Bangladesh LeftparenthesisবাংলাদেশRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

