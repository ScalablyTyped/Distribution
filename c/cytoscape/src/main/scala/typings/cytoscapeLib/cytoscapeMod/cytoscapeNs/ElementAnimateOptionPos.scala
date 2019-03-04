package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementAnimateOptionPos extends ElementAnimateOptionsBase {
  /** A position to which the elements will be animated. */
  var position: Position
}

object ElementAnimateOptionPos {
  @scala.inline
  def apply(
    position: Position,
    complete: js.Function0[scala.Unit] = null,
    duration: scala.Int | scala.Double = null,
    easing: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction = null,
    queue: js.UndefOr[scala.Boolean] = js.undefined,
    step: js.Function0[scala.Unit] = null,
    style: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ElementAnimateOptionPos = {
    val __obj = js.Dynamic.literal(position = position)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue)
    if (step != null) __obj.updateDynamic("step")(step)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ElementAnimateOptionPos]
  }
}

