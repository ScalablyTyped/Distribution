package typings.baseui.anon

import typings.baseui.baseuiStrings.LC
import typings.baseui.baseuiStrings.Plussign1758
import typings.baseui.baseuiStrings.`Saint Lucia`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `175` extends js.Object {
  var dialCode: Plussign1758 = js.native
  var id: LC = js.native
  var label: `Saint Lucia` = js.native
}

object `175` {
  @scala.inline
  def apply(dialCode: Plussign1758, id: LC, label: `Saint Lucia`): `175` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`175`]
  }
  @scala.inline
  implicit class `175Ops`[Self <: `175`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign1758): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: LC): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Saint Lucia`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

