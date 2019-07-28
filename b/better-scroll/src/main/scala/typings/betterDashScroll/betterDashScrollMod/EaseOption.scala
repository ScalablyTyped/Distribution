package typings.betterDashScroll.betterDashScrollMod

import typings.betterDashScroll.Anon_Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EaseOption extends js.Object {
  var bounce: js.UndefOr[Anon_Fn] = js.undefined
  var swipe: js.UndefOr[Anon_Fn] = js.undefined
  var swipeBounce: js.UndefOr[Anon_Fn] = js.undefined
}

object EaseOption {
  @scala.inline
  def apply(bounce: Anon_Fn = null, swipe: Anon_Fn = null, swipeBounce: Anon_Fn = null): EaseOption = {
    val __obj = js.Dynamic.literal()
    if (bounce != null) __obj.updateDynamic("bounce")(bounce)
    if (swipe != null) __obj.updateDynamic("swipe")(swipe)
    if (swipeBounce != null) __obj.updateDynamic("swipeBounce")(swipeBounce)
    __obj.asInstanceOf[EaseOption]
  }
}

