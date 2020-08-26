package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign992
import typings.baseui.baseuiStrings.TJ
import typings.baseui.baseuiStrings.Tajikistan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `206` extends js.Object {
  var dialCode: Plussign992 = js.native
  var id: TJ = js.native
  var label: Tajikistan = js.native
}

object `206` {
  @scala.inline
  def apply(dialCode: Plussign992, id: TJ, label: Tajikistan): `206` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`206`]
  }
  @scala.inline
  implicit class `206Ops`[Self <: `206`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign992): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: TJ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Tajikistan): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

