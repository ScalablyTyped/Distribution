package typings.betterScroll.mod

import typings.betterScroll.anon.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EaseOption extends js.Object {
  var bounce: js.UndefOr[Fn] = js.undefined
  var swipe: js.UndefOr[Fn] = js.undefined
  var swipeBounce: js.UndefOr[Fn] = js.undefined
}

object EaseOption {
  @scala.inline
  def apply(bounce: Fn = null, swipe: Fn = null, swipeBounce: Fn = null): EaseOption = {
    val __obj = js.Dynamic.literal()
    if (bounce != null) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (swipe != null) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (swipeBounce != null) __obj.updateDynamic("swipeBounce")(swipeBounce.asInstanceOf[js.Any])
    __obj.asInstanceOf[EaseOption]
  }
}

