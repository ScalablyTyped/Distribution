package typings.baseui.anon

import typings.baseui.baseuiStrings.CX
import typings.baseui.baseuiStrings.Plussign61
import typings.baseui.baseuiStrings.`Christmas Island`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `38` extends js.Object {
  var dialCode: Plussign61 = js.native
  var id: CX = js.native
  var label: `Christmas Island` = js.native
}

object `38` {
  @scala.inline
  def apply(dialCode: Plussign61, id: CX, label: `Christmas Island`): `38` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`38`]
  }
  @scala.inline
  implicit class `38Ops`[Self <: `38`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign61): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: CX): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Christmas Island`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

