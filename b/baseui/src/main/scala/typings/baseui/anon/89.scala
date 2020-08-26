package typings.baseui.anon

import typings.baseui.baseuiStrings.HU
import typings.baseui.baseuiStrings.Plussign36
import typings.baseui.baseuiStrings.`Hungary LeftparenthesisMagyarországRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `89` extends js.Object {
  var dialCode: Plussign36 = js.native
  var id: HU = js.native
  var label: `Hungary LeftparenthesisMagyarországRightparenthesis` = js.native
}

object `89` {
  @scala.inline
  def apply(dialCode: Plussign36, id: HU, label: `Hungary LeftparenthesisMagyarországRightparenthesis`): `89` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`89`]
  }
  @scala.inline
  implicit class `89Ops`[Self <: `89`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign36): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: HU): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Hungary LeftparenthesisMagyarországRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

