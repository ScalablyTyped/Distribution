package typings
package baseuiLib.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOverrides extends js.Object {
  var Svg: js.UndefOr[baseuiLib.Override[StyledComponentArgsT]] = js.undefined
}

object IconOverrides {
  @scala.inline
  def apply(Svg: baseuiLib.Override[StyledComponentArgsT] = null): IconOverrides = {
    val __obj = js.Dynamic.literal()
    if (Svg != null) __obj.updateDynamic("Svg")(Svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOverrides]
  }
}

