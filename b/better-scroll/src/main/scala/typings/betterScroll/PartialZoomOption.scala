package typings.betterScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.ZoomOption> */
trait PartialZoomOption extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object PartialZoomOption {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null, start: Int | Double = null): PartialZoomOption = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialZoomOption]
  }
}

