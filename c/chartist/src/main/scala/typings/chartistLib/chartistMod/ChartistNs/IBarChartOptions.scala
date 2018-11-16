package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBarChartOptions extends IChartOptions {
  var axisX: js.UndefOr[IBarChartAxis] = js.undefined
  var axisY: js.UndefOr[IBarChartAxis] = js.undefined
  var chartPadding: js.UndefOr[IChartPadding] = js.undefined
  var distributeSeries: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var high: js.UndefOr[scala.Double] = js.undefined
  var horizontalBars: js.UndefOr[scala.Boolean] = js.undefined
  var low: js.UndefOr[scala.Double] = js.undefined
  var onlyInteger: js.UndefOr[scala.Boolean] = js.undefined
  var seriesBarDistance: js.UndefOr[scala.Double] = js.undefined
  /**
           * If set to true this property will cause the series bars to be stacked and form a total for each series point. This will also influence the y-axis and the overall bounds of the chart. In stacked mode the seriesBarDistance property will have no effect.
           */
  var stackBars: js.UndefOr[scala.Boolean] = js.undefined
  var stackMode: js.UndefOr[
    chartistLib.chartistLibStrings.overlap | chartistLib.chartistLibStrings.accumulate
  ] = js.undefined
  var ticks: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

