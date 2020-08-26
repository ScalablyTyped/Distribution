package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign690
import typings.baseui.baseuiStrings.TK
import typings.baseui.baseuiStrings.Tokelau
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `211` extends js.Object {
  var dialCode: Plussign690 = js.native
  var id: TK = js.native
  var label: Tokelau = js.native
}

object `211` {
  @scala.inline
  def apply(dialCode: Plussign690, id: TK, label: Tokelau): `211` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`211`]
  }
  @scala.inline
  implicit class `211Ops`[Self <: `211`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign690): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: TK): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Tokelau): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

