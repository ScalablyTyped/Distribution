package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceObjectOption extends js.Object {
  var bottom: js.UndefOr[scala.Boolean] = js.undefined
  var left: js.UndefOr[scala.Boolean] = js.undefined
  var right: js.UndefOr[scala.Boolean] = js.undefined
  var top: js.UndefOr[scala.Boolean] = js.undefined
}

object BounceObjectOption {
  @scala.inline
  def apply(
    bottom: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.UndefOr[scala.Boolean] = js.undefined,
    right: js.UndefOr[scala.Boolean] = js.undefined,
    top: js.UndefOr[scala.Boolean] = js.undefined
  ): BounceObjectOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[BounceObjectOption]
  }
}

