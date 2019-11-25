package typings.cytoscape.cytoscapeMod

import org.scalablytyped.runtime.StringDictionary
import typings.cytoscape.cytoscapeMod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementAnimateOptionPos extends ElementAnimateOptionsBase {
  /** A position to which the elements will be animated. */
  var position: js.UndefOr[Position] = js.undefined
}

object ElementAnimateOptionPos {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    duration: Int | Double = null,
    easing: TransitionTimingFunction = null,
    position: Position = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    step: () => Unit = null,
    style: StringDictionary[js.Any] = null
  ): ElementAnimateOptionPos = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction0(step))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAnimateOptionPos]
  }
}

