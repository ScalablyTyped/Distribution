package typings.calDashHeatmap.calDashHeatmapMod.Global.CalHeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendColor extends js.Object {
  /** Base color of the date cells */
  var base: js.UndefOr[String] = js.undefined
  /** Color for the dates with value == 0 */
  var empty: js.UndefOr[String] = js.undefined
  /** Color of the highest value on the legend */
  var max: String
  /** Color of the smallest value on the legend */
  var min: String
  /** Color for the special value */
  var overflow: js.UndefOr[String] = js.undefined
}

object LegendColor {
  @scala.inline
  def apply(max: String, min: String, base: String = null, empty: String = null, overflow: String = null): LegendColor = {
    val __obj = js.Dynamic.literal(max = max, min = min)
    if (base != null) __obj.updateDynamic("base")(base)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    __obj.asInstanceOf[LegendColor]
  }
}

