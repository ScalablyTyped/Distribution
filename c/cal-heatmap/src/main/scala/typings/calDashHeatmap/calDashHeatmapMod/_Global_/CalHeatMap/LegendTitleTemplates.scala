package typings.calDashHeatmap.calDashHeatmapMod._Global_.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendTitleTemplates extends js.Object {
  /** Formatting of all the value but the first and the last. Default value: "between {down} and {up} {name}" */
  var inner: js.UndefOr[String] = js.undefined
  /** Formatting of the smallest (leftmost) value of the legend. Default value: "less than {min} {name}" */
  var lower: js.UndefOr[String] = js.undefined
  /** Formatting of the biggest (rightmost) value of the legend. Default value: "more than {max} {name}" */
  var upper: js.UndefOr[String] = js.undefined
}

object LegendTitleTemplates {
  @scala.inline
  def apply(inner: String = null, lower: String = null, upper: String = null): LegendTitleTemplates = {
    val __obj = js.Dynamic.literal()
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (lower != null) __obj.updateDynamic("lower")(lower.asInstanceOf[js.Any])
    if (upper != null) __obj.updateDynamic("upper")(upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendTitleTemplates]
  }
}

