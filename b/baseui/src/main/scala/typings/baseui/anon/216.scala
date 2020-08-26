package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign993
import typings.baseui.baseuiStrings.TM
import typings.baseui.baseuiStrings.Turkmenistan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `216` extends js.Object {
  var dialCode: Plussign993 = js.native
  var id: TM = js.native
  var label: Turkmenistan = js.native
}

object `216` {
  @scala.inline
  def apply(dialCode: Plussign993, id: TM, label: Turkmenistan): `216` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`216`]
  }
  @scala.inline
  implicit class `216Ops`[Self <: `216`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign993): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: TM): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Turkmenistan): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

