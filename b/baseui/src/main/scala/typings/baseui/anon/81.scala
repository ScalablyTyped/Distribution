package typings.baseui.anon

import typings.baseui.baseuiStrings.GT
import typings.baseui.baseuiStrings.Guatemala
import typings.baseui.baseuiStrings.Plussign502
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `81` extends js.Object {
  var dialCode: Plussign502 = js.native
  var id: GT = js.native
  var label: Guatemala = js.native
}

object `81` {
  @scala.inline
  def apply(dialCode: Plussign502, id: GT, label: Guatemala): `81` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`81`]
  }
  @scala.inline
  implicit class `81Ops`[Self <: `81`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign502): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: GT): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Guatemala): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

