package typings
package chartistLib.chartistMod

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

object IBarChartOptions {
  @scala.inline
  def apply(
    axisX: IBarChartAxis = null,
    axisY: IBarChartAxis = null,
    chartPadding: IChartPadding = null,
    distributeSeries: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    high: scala.Int | scala.Double = null,
    horizontalBars: js.UndefOr[scala.Boolean] = js.undefined,
    low: scala.Int | scala.Double = null,
    onlyInteger: js.UndefOr[scala.Boolean] = js.undefined,
    plugins: js.Array[_] = null,
    reverseData: js.UndefOr[scala.Boolean] = js.undefined,
    seriesBarDistance: scala.Int | scala.Double = null,
    stackBars: js.UndefOr[scala.Boolean] = js.undefined,
    stackMode: chartistLib.chartistLibStrings.overlap | chartistLib.chartistLibStrings.accumulate = null,
    ticks: js.Array[java.lang.String | scala.Double] = null,
    width: scala.Double | java.lang.String = null
  ): IBarChartOptions = {
    val __obj = js.Dynamic.literal()
    if (axisX != null) __obj.updateDynamic("axisX")(axisX)
    if (axisY != null) __obj.updateDynamic("axisY")(axisY)
    if (chartPadding != null) __obj.updateDynamic("chartPadding")(chartPadding)
    if (!js.isUndefined(distributeSeries)) __obj.updateDynamic("distributeSeries")(distributeSeries)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalBars)) __obj.updateDynamic("horizontalBars")(horizontalBars)
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInteger)) __obj.updateDynamic("onlyInteger")(onlyInteger)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(reverseData)) __obj.updateDynamic("reverseData")(reverseData)
    if (seriesBarDistance != null) __obj.updateDynamic("seriesBarDistance")(seriesBarDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(stackBars)) __obj.updateDynamic("stackBars")(stackBars)
    if (stackMode != null) __obj.updateDynamic("stackMode")(stackMode.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarChartOptions]
  }
}

