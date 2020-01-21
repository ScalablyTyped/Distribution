package typings.betterScroll.mod

import typings.betterScroll.AnonFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EaseOption extends js.Object {
  var bounce: js.UndefOr[AnonFn] = js.undefined
  var swipe: js.UndefOr[AnonFn] = js.undefined
  var swipeBounce: js.UndefOr[AnonFn] = js.undefined
}

object EaseOption {
  @scala.inline
  def apply(bounce: AnonFn = null, swipe: AnonFn = null, swipeBounce: AnonFn = null): EaseOption = {
    val __obj = js.Dynamic.literal()
    if (bounce != null) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (swipe != null) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (swipeBounce != null) __obj.updateDynamic("swipeBounce")(swipeBounce.asInstanceOf[js.Any])
    __obj.asInstanceOf[EaseOption]
  }
}

