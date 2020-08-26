package typings.baseui.anon

import typings.baseui.baseuiStrings.KP
import typings.baseui.baseuiStrings.Plussign850
import typings.baseui.baseuiStrings.`North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `152` extends js.Object {
  var dialCode: Plussign850 = js.native
  var id: KP = js.native
  var label: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis` = js.native
}

object `152` {
  @scala.inline
  def apply(dialCode: Plussign850, id: KP, label: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`): `152` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`152`]
  }
  @scala.inline
  implicit class `152Ops`[Self <: `152`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign850): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: KP): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

