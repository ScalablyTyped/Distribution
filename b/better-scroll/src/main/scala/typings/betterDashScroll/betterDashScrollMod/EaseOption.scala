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
    if (bounce != null) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (swipe != null) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (swipeBounce != null) __obj.updateDynamic("swipeBounce")(swipeBounce.asInstanceOf[js.Any])
    __obj.asInstanceOf[EaseOption]
  }
}

