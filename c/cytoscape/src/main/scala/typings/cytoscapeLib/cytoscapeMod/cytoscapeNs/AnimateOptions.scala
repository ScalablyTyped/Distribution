package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimateOptions extends AnimationOptions {
  /** complete - A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** queue - A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[scala.Boolean] = js.undefined
  /** step - A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object AnimateOptions {
  @scala.inline
  def apply(
    center: CenterOptions = null,
    complete: () => scala.Unit = null,
    duration: scala.Int | scala.Double = null,
    easing: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction = null,
    fit: AnimationFitOptions = null,
    pan: Position = null,
    panBy: Position = null,
    queue: js.UndefOr[scala.Boolean] = js.undefined,
    step: () => scala.Unit = null,
    zoom: ZoomOptions = null
  ): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (fit != null) __obj.updateDynamic("fit")(fit)
    if (pan != null) __obj.updateDynamic("pan")(pan)
    if (panBy != null) __obj.updateDynamic("panBy")(panBy)
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue)
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction0(step))
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[AnimateOptions]
  }
}

