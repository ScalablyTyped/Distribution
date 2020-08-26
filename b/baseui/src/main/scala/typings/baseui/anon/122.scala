package typings.baseui.anon

import typings.baseui.baseuiStrings.MY
import typings.baseui.baseuiStrings.Malaysia
import typings.baseui.baseuiStrings.Plussign60
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `122` extends js.Object {
  var dialCode: Plussign60 = js.native
  var id: MY = js.native
  var label: Malaysia = js.native
}

object `122` {
  @scala.inline
  def apply(dialCode: Plussign60, id: MY, label: Malaysia): `122` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`122`]
  }
  @scala.inline
  implicit class `122Ops`[Self <: `122`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign60): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: MY): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Malaysia): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

