package typings.baseui.anon

import typings.baseui.baseuiStrings.NO
import typings.baseui.baseuiStrings.Plussign47
import typings.baseui.baseuiStrings.`Norway LeftparenthesisNorgeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `154` extends js.Object {
  var dialCode: Plussign47 = js.native
  var id: NO = js.native
  var label: `Norway LeftparenthesisNorgeRightparenthesis` = js.native
}

object `154` {
  @scala.inline
  def apply(dialCode: Plussign47, id: NO, label: `Norway LeftparenthesisNorgeRightparenthesis`): `154` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`154`]
  }
  @scala.inline
  implicit class `154Ops`[Self <: `154`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign47): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: NO): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Norway LeftparenthesisNorgeRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

