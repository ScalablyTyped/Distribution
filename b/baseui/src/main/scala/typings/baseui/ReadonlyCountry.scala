package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/phone-input.Country> */
trait ReadonlyCountry extends js.Object {
  val dialCode: String
  val id: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any
  val label: String
}

object ReadonlyCountry {
  @scala.inline
  def apply(
    dialCode: String,
    id: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any,
    label: String
  ): ReadonlyCountry = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCountry]
  }
}

