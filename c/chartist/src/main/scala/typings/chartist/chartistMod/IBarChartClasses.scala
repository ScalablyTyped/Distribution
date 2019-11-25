package typings.chartist.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarChartClasses extends js.Object {
  var bar: js.UndefOr[String] = js.undefined
  var chart: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var grid: js.UndefOr[String] = js.undefined
  var gridGroup: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var horizontalBars: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelGroup: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object IBarChartClasses {
  @scala.inline
  def apply(
    bar: String = null,
    chart: String = null,
    end: String = null,
    grid: String = null,
    gridGroup: String = null,
    horizontal: String = null,
    horizontalBars: String = null,
    label: String = null,
    labelGroup: String = null,
    series: String = null,
    start: String = null,
    vertical: String = null
  ): IBarChartClasses = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridGroup != null) __obj.updateDynamic("gridGroup")(gridGroup.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (horizontalBars != null) __obj.updateDynamic("horizontalBars")(horizontalBars.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelGroup != null) __obj.updateDynamic("labelGroup")(labelGroup.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarChartClasses]
  }
}

