package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EaseOption extends js.Object {
  var bounce: js.UndefOr[betterDashScrollLib.Anon_Fn] = js.undefined
  var swipe: js.UndefOr[betterDashScrollLib.Anon_Fn] = js.undefined
  var swipeBounce: js.UndefOr[betterDashScrollLib.Anon_Fn] = js.undefined
}

object EaseOption {
  @scala.inline
  def apply(
    bounce: betterDashScrollLib.Anon_Fn = null,
    swipe: betterDashScrollLib.Anon_Fn = null,
    swipeBounce: betterDashScrollLib.Anon_Fn = null
  ): EaseOption = {
    val __obj = js.Dynamic.literal()
    if (bounce != null) __obj.updateDynamic("bounce")(bounce)
    if (swipe != null) __obj.updateDynamic("swipe")(swipe)
    if (swipeBounce != null) __obj.updateDynamic("swipeBounce")(swipeBounce)
    __obj.asInstanceOf[EaseOption]
  }
}

