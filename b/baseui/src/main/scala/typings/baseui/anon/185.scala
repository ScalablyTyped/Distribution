package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign248
import typings.baseui.baseuiStrings.SC
import typings.baseui.baseuiStrings.Seychelles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `185` extends js.Object {
  var dialCode: Plussign248 = js.native
  var id: SC = js.native
  var label: Seychelles = js.native
}

object `185` {
  @scala.inline
  def apply(dialCode: Plussign248, id: SC, label: Seychelles): `185` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`185`]
  }
  @scala.inline
  implicit class `185Ops`[Self <: `185`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign248): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: SC): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Seychelles): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

