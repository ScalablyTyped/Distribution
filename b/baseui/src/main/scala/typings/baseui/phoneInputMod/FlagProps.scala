package typings.baseui.phoneInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagProps extends js.Object {
  var iso: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any
  var width: js.UndefOr[String] = js.undefined
}

object FlagProps {
  @scala.inline
  def apply(
    iso: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any,
    width: String = null
  ): FlagProps = {
    val __obj = js.Dynamic.literal(iso = iso.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagProps]
  }
}

