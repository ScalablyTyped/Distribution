package typings.chartist.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineChartClasses extends js.Object {
  var area: js.UndefOr[String] = js.undefined
  /**
    * Default is 'ct-chart-line'
    */
  var chart: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var grid: js.UndefOr[String] = js.undefined
  var gridBackground: js.UndefOr[String] = js.undefined
  var gridGroup: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelGroup: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[String] = js.undefined
  var point: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object ILineChartClasses {
  @scala.inline
  def apply(
    area: String = null,
    chart: String = null,
    end: String = null,
    grid: String = null,
    gridBackground: String = null,
    gridGroup: String = null,
    horizontal: String = null,
    label: String = null,
    labelGroup: String = null,
    line: String = null,
    point: String = null,
    series: String = null,
    start: String = null,
    vertical: String = null
  ): ILineChartClasses = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (end != null) __obj.updateDynamic("end")(end)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (gridBackground != null) __obj.updateDynamic("gridBackground")(gridBackground)
    if (gridGroup != null) __obj.updateDynamic("gridGroup")(gridGroup)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelGroup != null) __obj.updateDynamic("labelGroup")(labelGroup)
    if (line != null) __obj.updateDynamic("line")(line)
    if (point != null) __obj.updateDynamic("point")(point)
    if (series != null) __obj.updateDynamic("series")(series)
    if (start != null) __obj.updateDynamic("start")(start)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ILineChartClasses]
  }
}

