package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagProps extends js.Object {
  var iso: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 241 */ js.Any
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object FlagProps {
  @scala.inline
  def apply(
    iso: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 241 */ js.Any,
    width: java.lang.String = null
  ): FlagProps = {
    val __obj = js.Dynamic.literal(iso = iso)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[FlagProps]
  }
}

