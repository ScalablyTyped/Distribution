package typings.baseui.anon

import typings.baseui.baseuiStrings.BI
import typings.baseui.baseuiStrings.Plussign257
import typings.baseui.baseuiStrings.`Burundi LeftparenthesisUburundiRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `28` extends js.Object {
  var dialCode: Plussign257 = js.native
  var id: BI = js.native
  var label: `Burundi LeftparenthesisUburundiRightparenthesis` = js.native
}

object `28` {
  @scala.inline
  def apply(dialCode: Plussign257, id: BI, label: `Burundi LeftparenthesisUburundiRightparenthesis`): `28` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`28`]
  }
  @scala.inline
  implicit class `28Ops`[Self <: `28`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign257): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: BI): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Burundi LeftparenthesisUburundiRightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

