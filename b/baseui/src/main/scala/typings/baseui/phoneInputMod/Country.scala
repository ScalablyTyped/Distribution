package typings.baseui.phoneInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var dialCode: String
  var id: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any
  var label: String
}

object Country {
  @scala.inline
  def apply(
    dialCode: String,
    id: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any,
    label: String
  ): Country = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
}

