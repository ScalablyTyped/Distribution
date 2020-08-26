package typings.baseui.anon

import typings.baseui.baseuiStrings.NR
import typings.baseui.baseuiStrings.Nauru
import typings.baseui.baseuiStrings.Plussign674
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `142` extends js.Object {
  var dialCode: Plussign674 = js.native
  var id: NR = js.native
  var label: Nauru = js.native
}

object `142` {
  @scala.inline
  def apply(dialCode: Plussign674, id: NR, label: Nauru): `142` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`142`]
  }
  @scala.inline
  implicit class `142Ops`[Self <: `142`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign674): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: NR): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Nauru): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

