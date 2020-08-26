package typings.baseui.anon

import typings.baseui.baseuiStrings.AZ
import typings.baseui.baseuiStrings.Plussign994
import typings.baseui.baseuiStrings.`Azerbaijan LeftparenthesisAzərbaycanRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `8` extends js.Object {
  var dialCode: Plussign994 = js.native
  var id: AZ = js.native
  var label: `Azerbaijan LeftparenthesisAzərbaycanRightparenthesis` = js.native
}

object `8` {
  @scala.inline
  def apply(dialCode: Plussign994, id: AZ, label: `Azerbaijan LeftparenthesisAzərbaycanRightparenthesis`): `8` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  @scala.inline
  implicit class `8Ops`[Self <: `8`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign994): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: AZ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Azerbaijan LeftparenthesisAzərbaycanRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

