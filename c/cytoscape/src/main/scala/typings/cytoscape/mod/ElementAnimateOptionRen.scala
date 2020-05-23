package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cytoscape.mod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementAnimateOptionRen extends ElementAnimateOptionsBase {
  /** A rendered position to which the elements will be animated. */
  var renderedPosition: js.UndefOr[Position] = js.undefined
}

object ElementAnimateOptionRen {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: TransitionTimingFunction = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    renderedPosition: Position = null,
    step: () => Unit = null,
    style: StringDictionary[js.Any] = null
  ): ElementAnimateOptionRen = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.get.asInstanceOf[js.Any])
    if (renderedPosition != null) __obj.updateDynamic("renderedPosition")(renderedPosition.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction0(step))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAnimateOptionRen]
  }
}

