package typings.baseui.anon

import typings.baseui.baseuiStrings.GA
import typings.baseui.baseuiStrings.Gabon
import typings.baseui.baseuiStrings.Plussign241
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `70` extends js.Object {
  var dialCode: Plussign241 = js.native
  var id: GA = js.native
  var label: Gabon = js.native
}

object `70` {
  @scala.inline
  def apply(dialCode: Plussign241, id: GA, label: Gabon): `70` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`70`]
  }
  @scala.inline
  implicit class `70Ops`[Self <: `70`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign241): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: GA): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Gabon): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

