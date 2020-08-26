package typings.baseui.anon

import typings.baseui.baseuiStrings.HN
import typings.baseui.baseuiStrings.Honduras
import typings.baseui.baseuiStrings.Plussign504
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `87` extends js.Object {
  var dialCode: Plussign504 = js.native
  var id: HN = js.native
  var label: Honduras = js.native
}

object `87` {
  @scala.inline
  def apply(dialCode: Plussign504, id: HN, label: Honduras): `87` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`87`]
  }
  @scala.inline
  implicit class `87Ops`[Self <: `87`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign504): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: HN): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Honduras): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

