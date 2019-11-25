package typings.chartist.chartistMod

import typings.chartist.chartistStrings.accumulate
import typings.chartist.chartistStrings.overlap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarChartOptions extends IChartOptions {
  var axisX: js.UndefOr[IBarChartAxis] = js.undefined
  var axisY: js.UndefOr[IBarChartAxis] = js.undefined
  var chartPadding: js.UndefOr[IChartPadding] = js.undefined
  var distributeSeries: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var horizontalBars: js.UndefOr[Boolean] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var onlyInteger: js.UndefOr[Boolean] = js.undefined
  var seriesBarDistance: js.UndefOr[Double] = js.undefined
  /**
    * If set to true this property will cause the series bars to be stacked and form a total for each series point. This will also influence the y-axis and the overall bounds of the chart. In stacked mode the seriesBarDistance property will have no effect.
    */
  var stackBars: js.UndefOr[Boolean] = js.undefined
  var stackMode: js.UndefOr[overlap | accumulate] = js.undefined
  var ticks: js.UndefOr[js.Array[String | Double]] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object IBarChartOptions {
  @scala.inline
  def apply(
    axisX: IBarChartAxis = null,
    axisY: IBarChartAxis = null,
    chartPadding: IChartPadding = null,
    distributeSeries: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    high: Int | Double = null,
    horizontalBars: js.UndefOr[Boolean] = js.undefined,
    low: Int | Double = null,
    onlyInteger: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[_] = null,
    reverseData: js.UndefOr[Boolean] = js.undefined,
    seriesBarDistance: Int | Double = null,
    stackBars: js.UndefOr[Boolean] = js.undefined,
    stackMode: overlap | accumulate = null,
    ticks: js.Array[String | Double] = null,
    width: Double | String = null
  ): IBarChartOptions = {
    val __obj = js.Dynamic.literal()
    if (axisX != null) __obj.updateDynamic("axisX")(axisX.asInstanceOf[js.Any])
    if (axisY != null) __obj.updateDynamic("axisY")(axisY.asInstanceOf[js.Any])
    if (chartPadding != null) __obj.updateDynamic("chartPadding")(chartPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(distributeSeries)) __obj.updateDynamic("distributeSeries")(distributeSeries.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalBars)) __obj.updateDynamic("horizontalBars")(horizontalBars.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInteger)) __obj.updateDynamic("onlyInteger")(onlyInteger.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseData)) __obj.updateDynamic("reverseData")(reverseData.asInstanceOf[js.Any])
    if (seriesBarDistance != null) __obj.updateDynamic("seriesBarDistance")(seriesBarDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(stackBars)) __obj.updateDynamic("stackBars")(stackBars.asInstanceOf[js.Any])
    if (stackMode != null) __obj.updateDynamic("stackMode")(stackMode.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarChartOptions]
  }
}

