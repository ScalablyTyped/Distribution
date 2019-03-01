package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICandleChartClasses extends js.Object {
  var candleNegative: js.UndefOr[java.lang.String] = js.undefined
  var candlePositive: js.UndefOr[java.lang.String] = js.undefined
  var chart: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[java.lang.String] = js.undefined
  var grid: js.UndefOr[java.lang.String] = js.undefined
  var gridBackground: js.UndefOr[java.lang.String] = js.undefined
  var gridGroup: js.UndefOr[java.lang.String] = js.undefined
  var horizontal: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelGroup: js.UndefOr[java.lang.String] = js.undefined
  var series: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var vertical: js.UndefOr[java.lang.String] = js.undefined
}

object ICandleChartClasses {
  @scala.inline
  def apply(
    candleNegative: java.lang.String = null,
    candlePositive: java.lang.String = null,
    chart: java.lang.String = null,
    end: java.lang.String = null,
    grid: java.lang.String = null,
    gridBackground: java.lang.String = null,
    gridGroup: java.lang.String = null,
    horizontal: java.lang.String = null,
    label: java.lang.String = null,
    labelGroup: java.lang.String = null,
    series: java.lang.String = null,
    start: java.lang.String = null,
    vertical: java.lang.String = null
  ): ICandleChartClasses = {
    val __obj = js.Dynamic.literal()
    if (candleNegative != null) __obj.updateDynamic("candleNegative")(candleNegative)
    if (candlePositive != null) __obj.updateDynamic("candlePositive")(candlePositive)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (end != null) __obj.updateDynamic("end")(end)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (gridBackground != null) __obj.updateDynamic("gridBackground")(gridBackground)
    if (gridGroup != null) __obj.updateDynamic("gridGroup")(gridGroup)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelGroup != null) __obj.updateDynamic("labelGroup")(labelGroup)
    if (series != null) __obj.updateDynamic("series")(series)
    if (start != null) __obj.updateDynamic("start")(start)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ICandleChartClasses]
  }
}

