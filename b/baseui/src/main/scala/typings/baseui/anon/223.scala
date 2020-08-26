package typings.baseui.anon

import typings.baseui.baseuiStrings.GB
import typings.baseui.baseuiStrings.Plussign44
import typings.baseui.baseuiStrings.`United Kingdom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `223` extends js.Object {
  var dialCode: Plussign44 = js.native
  var id: GB = js.native
  var label: `United Kingdom` = js.native
}

object `223` {
  @scala.inline
  def apply(dialCode: Plussign44, id: GB, label: `United Kingdom`): `223` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`223`]
  }
  @scala.inline
  implicit class `223Ops`[Self <: `223`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign44): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: GB): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `United Kingdom`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

