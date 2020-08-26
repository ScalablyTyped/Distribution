package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign90
import typings.baseui.baseuiStrings.TR
import typings.baseui.baseuiStrings.`Turkey LeftparenthesisTürkiyeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `215` extends js.Object {
  var dialCode: Plussign90 = js.native
  var id: TR = js.native
  var label: `Turkey LeftparenthesisTürkiyeRightparenthesis` = js.native
}

object `215` {
  @scala.inline
  def apply(dialCode: Plussign90, id: TR, label: `Turkey LeftparenthesisTürkiyeRightparenthesis`): `215` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`215`]
  }
  @scala.inline
  implicit class `215Ops`[Self <: `215`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign90): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: TR): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Turkey LeftparenthesisTürkiyeRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

