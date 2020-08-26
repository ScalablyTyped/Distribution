package typings.baseui.anon

import typings.baseui.baseuiStrings.AU
import typings.baseui.baseuiStrings.Australia
import typings.baseui.baseuiStrings.Plussign61
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `6` extends js.Object {
  var dialCode: Plussign61 = js.native
  var id: AU = js.native
  var label: Australia = js.native
}

object `6` {
  @scala.inline
  def apply(dialCode: Plussign61, id: AU, label: Australia): `6` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  @scala.inline
  implicit class `6Ops`[Self <: `6`] (val x: Self) extends AnyVal {
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
    def setId(value: AU): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Australia): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

