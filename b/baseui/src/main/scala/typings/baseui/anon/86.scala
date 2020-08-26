package typings.baseui.anon

import typings.baseui.baseuiStrings.HT
import typings.baseui.baseuiStrings.Haiti
import typings.baseui.baseuiStrings.Plussign509
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `86` extends js.Object {
  var dialCode: Plussign509 = js.native
  var id: HT = js.native
  var label: Haiti = js.native
}

object `86` {
  @scala.inline
  def apply(dialCode: Plussign509, id: HT, label: Haiti): `86` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`86`]
  }
  @scala.inline
  implicit class `86Ops`[Self <: `86`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign509): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: HT): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Haiti): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

