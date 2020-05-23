package typings.bootstrapSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeHighlight extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object RangeHighlight {
  @scala.inline
  def apply(
    `class`: String = null,
    end: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): RangeHighlight = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeHighlight]
  }
}

