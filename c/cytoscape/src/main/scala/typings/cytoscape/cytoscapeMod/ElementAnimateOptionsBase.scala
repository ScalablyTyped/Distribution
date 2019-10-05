package typings.cytoscape.cytoscapeMod

import org.scalablytyped.runtime.StringDictionary
import typings.cytoscape.cytoscapeMod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/animation
  */
trait ElementAnimateOptionsBase extends js.Object {
  /** A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** The duration of the animation in milliseconds. */
  var duration: js.UndefOr[Double] = js.undefined
  /** A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: js.UndefOr[TransitionTimingFunction] = js.undefined
  /** A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[Boolean] = js.undefined
  /** A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** An object containing name-value pairs of style properties to animate. */
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object ElementAnimateOptionsBase {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    duration: Int | Double = null,
    easing: TransitionTimingFunction = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    step: () => Unit = null,
    style: StringDictionary[js.Any] = null
  ): ElementAnimateOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue)
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction0(step))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ElementAnimateOptionsBase]
  }
}

