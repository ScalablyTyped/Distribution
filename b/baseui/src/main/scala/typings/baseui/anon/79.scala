package typings.baseui.anon

import typings.baseui.baseuiStrings.GP
import typings.baseui.baseuiStrings.Guadeloupe
import typings.baseui.baseuiStrings.Plussign590
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `79` extends js.Object {
  var dialCode: Plussign590 = js.native
  var id: GP = js.native
  var label: Guadeloupe = js.native
}

object `79` {
  @scala.inline
  def apply(dialCode: Plussign590, id: GP, label: Guadeloupe): `79` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`79`]
  }
  @scala.inline
  implicit class `79Ops`[Self <: `79`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign590): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: GP): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Guadeloupe): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

