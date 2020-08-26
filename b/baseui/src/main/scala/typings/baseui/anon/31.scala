package typings.baseui.anon

import typings.baseui.baseuiStrings.CA
import typings.baseui.baseuiStrings.Canada
import typings.baseui.baseuiStrings.Plussign1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `31` extends js.Object {
  var dialCode: Plussign1 = js.native
  var id: CA = js.native
  var label: Canada = js.native
}

object `31` {
  @scala.inline
  def apply(dialCode: Plussign1, id: CA, label: Canada): `31` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`31`]
  }
  @scala.inline
  implicit class `31Ops`[Self <: `31`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign1): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: CA): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Canada): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

