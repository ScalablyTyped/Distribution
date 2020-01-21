package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICandleChartClasses extends js.Object {
  var candleNegative: js.UndefOr[String] = js.undefined
  var candlePositive: js.UndefOr[String] = js.undefined
  var chart: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var grid: js.UndefOr[String] = js.undefined
  var gridBackground: js.UndefOr[String] = js.undefined
  var gridGroup: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelGroup: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object ICandleChartClasses {
  @scala.inline
  def apply(
    candleNegative: String = null,
    candlePositive: String = null,
    chart: String = null,
    end: String = null,
    grid: String = null,
    gridBackground: String = null,
    gridGroup: String = null,
    horizontal: String = null,
    label: String = null,
    labelGroup: String = null,
    series: String = null,
    start: String = null,
    vertical: String = null
  ): ICandleChartClasses = {
    val __obj = js.Dynamic.literal()
    if (candleNegative != null) __obj.updateDynamic("candleNegative")(candleNegative.asInstanceOf[js.Any])
    if (candlePositive != null) __obj.updateDynamic("candlePositive")(candlePositive.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridBackground != null) __obj.updateDynamic("gridBackground")(gridBackground.asInstanceOf[js.Any])
    if (gridGroup != null) __obj.updateDynamic("gridGroup")(gridGroup.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelGroup != null) __obj.updateDynamic("labelGroup")(labelGroup.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICandleChartClasses]
  }
}

