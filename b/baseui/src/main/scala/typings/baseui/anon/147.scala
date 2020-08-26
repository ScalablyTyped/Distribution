package typings.baseui.anon

import typings.baseui.baseuiStrings.NI
import typings.baseui.baseuiStrings.Nicaragua
import typings.baseui.baseuiStrings.Plussign505
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `147` extends js.Object {
  var dialCode: Plussign505 = js.native
  var id: NI = js.native
  var label: Nicaragua = js.native
}

object `147` {
  @scala.inline
  def apply(dialCode: Plussign505, id: NI, label: Nicaragua): `147` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`147`]
  }
  @scala.inline
  implicit class `147Ops`[Self <: `147`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign505): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: NI): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Nicaragua): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

