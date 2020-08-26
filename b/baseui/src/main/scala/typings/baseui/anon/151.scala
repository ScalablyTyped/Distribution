package typings.baseui.anon

import typings.baseui.baseuiStrings.NF
import typings.baseui.baseuiStrings.Plussign672
import typings.baseui.baseuiStrings.`Norfolk Island`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `151` extends js.Object {
  var dialCode: Plussign672 = js.native
  var id: NF = js.native
  var label: `Norfolk Island` = js.native
}

object `151` {
  @scala.inline
  def apply(dialCode: Plussign672, id: NF, label: `Norfolk Island`): `151` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`151`]
  }
  @scala.inline
  implicit class `151Ops`[Self <: `151`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign672): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: NF): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Norfolk Island`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

