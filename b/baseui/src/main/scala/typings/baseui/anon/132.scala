package typings.baseui.anon

import typings.baseui.baseuiStrings.FM
import typings.baseui.baseuiStrings.Micronesia
import typings.baseui.baseuiStrings.Plussign691
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `132` extends js.Object {
  var dialCode: Plussign691 = js.native
  var id: FM = js.native
  var label: Micronesia = js.native
}

object `132` {
  @scala.inline
  def apply(dialCode: Plussign691, id: FM, label: Micronesia): `132` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`132`]
  }
  @scala.inline
  implicit class `132Ops`[Self <: `132`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign691): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: FM): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Micronesia): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

