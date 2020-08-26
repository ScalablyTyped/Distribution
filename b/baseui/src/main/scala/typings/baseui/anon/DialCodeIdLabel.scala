package typings.baseui.anon

import typings.baseui.baseuiStrings.AD
import typings.baseui.baseuiStrings.Andorra
import typings.baseui.baseuiStrings.Plussign376
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialCodeIdLabel extends js.Object {
  var dialCode: Plussign376 = js.native
  var id: AD = js.native
  var label: Andorra = js.native
}

object DialCodeIdLabel {
  @scala.inline
  def apply(dialCode: Plussign376, id: AD, label: Andorra): DialCodeIdLabel = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCodeIdLabel]
  }
  @scala.inline
  implicit class DialCodeIdLabelOps[Self <: DialCodeIdLabel] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign376): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: AD): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Andorra): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

