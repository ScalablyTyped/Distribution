package typings.baseui.anon

import typings.baseui.baseuiStrings.LU
import typings.baseui.baseuiStrings.Luxembourg
import typings.baseui.baseuiStrings.Plussign352
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `117` extends js.Object {
  var dialCode: Plussign352 = js.native
  var id: LU = js.native
  var label: Luxembourg = js.native
}

object `117` {
  @scala.inline
  def apply(dialCode: Plussign352, id: LU, label: Luxembourg): `117` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`117`]
  }
  @scala.inline
  implicit class `117Ops`[Self <: `117`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign352): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: LU): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Luxembourg): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

