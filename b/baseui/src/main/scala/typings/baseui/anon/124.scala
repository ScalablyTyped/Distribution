package typings.baseui.anon

import typings.baseui.baseuiStrings.ML
import typings.baseui.baseuiStrings.Mali
import typings.baseui.baseuiStrings.Plussign223
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `124` extends js.Object {
  var dialCode: Plussign223 = js.native
  var id: ML = js.native
  var label: Mali = js.native
}

object `124` {
  @scala.inline
  def apply(dialCode: Plussign223, id: ML, label: Mali): `124` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`124`]
  }
  @scala.inline
  implicit class `124Ops`[Self <: `124`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign223): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: ML): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Mali): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

