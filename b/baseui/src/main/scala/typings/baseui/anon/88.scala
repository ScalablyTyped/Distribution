package typings.baseui.anon

import typings.baseui.baseuiStrings.HK
import typings.baseui.baseuiStrings.Plussign852
import typings.baseui.baseuiStrings.`Hong Kong Leftparenthesis香港Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `88` extends js.Object {
  var dialCode: Plussign852 = js.native
  var id: HK = js.native
  var label: `Hong Kong Leftparenthesis香港Rightparenthesis` = js.native
}

object `88` {
  @scala.inline
  def apply(dialCode: Plussign852, id: HK, label: `Hong Kong Leftparenthesis香港Rightparenthesis`): `88` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`88`]
  }
  @scala.inline
  implicit class `88Ops`[Self <: `88`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign852): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: HK): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: `Hong Kong Leftparenthesis香港Rightparenthesis`): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

