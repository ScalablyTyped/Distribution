package typings.baseui.anon

import typings.baseui.baseuiStrings.NP
import typings.baseui.baseuiStrings.Plussign977
import typings.baseui.baseuiStrings.`Nepal LeftparenthesisनेपालRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `143` extends js.Object {
  var dialCode: Plussign977 = js.native
  var id: NP = js.native
  var label: `Nepal LeftparenthesisनेपालRightparenthesis` = js.native
}

object `143` {
  @scala.inline
  def apply(dialCode: Plussign977, id: NP, label: `Nepal LeftparenthesisनेपालRightparenthesis`): `143` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`143`]
  }
  @scala.inline
  implicit class `143Ops`[Self <: `143`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign977): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: NP): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Nepal LeftparenthesisनेपालRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

