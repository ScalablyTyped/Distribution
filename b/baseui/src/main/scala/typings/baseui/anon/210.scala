package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign228
import typings.baseui.baseuiStrings.TG
import typings.baseui.baseuiStrings.Togo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `210` extends js.Object {
  var dialCode: Plussign228 = js.native
  var id: TG = js.native
  var label: Togo = js.native
}

object `210` {
  @scala.inline
  def apply(dialCode: Plussign228, id: TG, label: Togo): `210` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`210`]
  }
  @scala.inline
  implicit class `210Ops`[Self <: `210`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign228): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: TG): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Togo): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

