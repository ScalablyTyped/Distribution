package typings.baseui.anon

import typings.baseui.baseuiStrings.CC
import typings.baseui.baseuiStrings.Plussign61
import typings.baseui.baseuiStrings.`Cocos LeftparenthesisKeelingRightparenthesis Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `39` extends js.Object {
  var dialCode: Plussign61 = js.native
  var id: CC = js.native
  var label: `Cocos LeftparenthesisKeelingRightparenthesis Islands` = js.native
}

object `39` {
  @scala.inline
  def apply(dialCode: Plussign61, id: CC, label: `Cocos LeftparenthesisKeelingRightparenthesis Islands`): `39` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`39`]
  }
  @scala.inline
  implicit class `39Ops`[Self <: `39`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign61): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: CC): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Cocos LeftparenthesisKeelingRightparenthesis Islands`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

