package typings.baseui.anon

import typings.baseui.baseuiStrings.BS
import typings.baseui.baseuiStrings.Bahamas
import typings.baseui.baseuiStrings.Plussign1242
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `9` extends js.Object {
  var dialCode: Plussign1242 = js.native
  var id: BS = js.native
  var label: Bahamas = js.native
}

object `9` {
  @scala.inline
  def apply(dialCode: Plussign1242, id: BS, label: Bahamas): `9` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  @scala.inline
  implicit class `9Ops`[Self <: `9`] (val x: Self) extends AnyVal {
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
    def setDialCode(value: Plussign1242): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: BS): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Bahamas): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

