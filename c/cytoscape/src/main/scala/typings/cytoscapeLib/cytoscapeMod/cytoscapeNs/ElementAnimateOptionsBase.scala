package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/animation
  */
trait ElementAnimateOptionsBase extends js.Object {
  /** A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** The duration of the animation in milliseconds. */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: js.UndefOr[cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction] = js.undefined
  /** A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[scala.Boolean] = js.undefined
  /** A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** An object containing name-value pairs of style properties to animate. */
  var style: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object ElementAnimateOptionsBase {
  @scala.inline
  def apply(
    complete: js.Function0[scala.Unit] = null,
    duration: scala.Int | scala.Double = null,
    easing: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction = null,
    queue: js.UndefOr[scala.Boolean] = js.undefined,
    step: js.Function0[scala.Unit] = null,
    style: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ElementAnimateOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue)
    if (step != null) __obj.updateDynamic("step")(step)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ElementAnimateOptionsBase]
  }
}

