package typings
package calDashHeatmapLib.calDashHeatmapMod.Global.CalHeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendColor extends js.Object {
  /** Base color of the date cells */
  var base: js.UndefOr[java.lang.String] = js.undefined
  /** Color for the dates with value == 0 */
  var empty: js.UndefOr[java.lang.String] = js.undefined
  /** Color of the highest value on the legend */
  var max: java.lang.String
  /** Color of the smallest value on the legend */
  var min: java.lang.String
  /** Color for the special value */
  var overflow: js.UndefOr[java.lang.String] = js.undefined
}

object LegendColor {
  @scala.inline
  def apply(
    max: java.lang.String,
    min: java.lang.String,
    base: java.lang.String = null,
    empty: java.lang.String = null,
    overflow: java.lang.String = null
  ): LegendColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    if (base != null) __obj.updateDynamic("base")(base)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    __obj.asInstanceOf[LegendColor]
  }
}

