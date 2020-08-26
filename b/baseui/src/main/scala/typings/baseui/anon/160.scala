package typings.baseui.anon

import typings.baseui.baseuiStrings.PG
import typings.baseui.baseuiStrings.Plussign675
import typings.baseui.baseuiStrings.`Papua New Guinea`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `160` extends js.Object {
  var dialCode: Plussign675 = js.native
  var id: PG = js.native
  var label: `Papua New Guinea` = js.native
}

object `160` {
  @scala.inline
  def apply(dialCode: Plussign675, id: PG, label: `Papua New Guinea`): `160` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`160`]
  }
  @scala.inline
  implicit class `160Ops`[Self <: `160`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign675): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: PG): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Papua New Guinea`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

