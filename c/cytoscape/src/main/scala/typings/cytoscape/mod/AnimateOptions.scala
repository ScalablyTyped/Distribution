package typings.cytoscape.mod

import typings.cytoscape.mod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimateOptions extends AnimationOptions {
  /** complete - A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** queue - A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[Boolean] = js.undefined
  /** step - A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnimateOptions {
  @scala.inline
  def apply(
    center: CenterOptions = null,
    complete: () => Unit = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: TransitionTimingFunction = null,
    fit: AnimationFitOptions = null,
    pan: Position = null,
    panBy: Position = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    step: () => Unit = null,
    zoom: ZoomOptions = null
  ): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (panBy != null) __obj.updateDynamic("panBy")(panBy.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.get.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction0(step))
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateOptions]
  }
}

