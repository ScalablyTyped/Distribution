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

