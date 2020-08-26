package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign65
import typings.baseui.baseuiStrings.SG
import typings.baseui.baseuiStrings.Singapore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `187` extends js.Object {
  var dialCode: Plussign65 = js.native
  var id: SG = js.native
  var label: Singapore = js.native
}

object `187` {
  @scala.inline
  def apply(dialCode: Plussign65, id: SG, label: Singapore): `187` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`187`]
  }
  @scala.inline
  implicit class `187Ops`[Self <: `187`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign65): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SG): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Singapore): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

