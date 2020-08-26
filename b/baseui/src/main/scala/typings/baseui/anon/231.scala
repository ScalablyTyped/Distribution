package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign681
import typings.baseui.baseuiStrings.WF
import typings.baseui.baseuiStrings.`Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `231` extends js.Object {
  var dialCode: Plussign681 = js.native
  var id: WF = js.native
  var label: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis` = js.native
}

object `231` {
  @scala.inline
  def apply(
    dialCode: Plussign681,
    id: WF,
    label: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`
  ): `231` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`231`]
  }
  @scala.inline
  implicit class `231Ops`[Self <: `231`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign681): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: WF): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

