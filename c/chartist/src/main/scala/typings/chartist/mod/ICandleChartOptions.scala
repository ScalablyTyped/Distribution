package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICandleChartOptions extends IChartOptions {
  /**
    * Options for X-Axis
    */
  var axisX: js.UndefOr[ICandleChartAxis] = js.undefined
  /**
    * Options for Y-Axis
    */
  var axisY: js.UndefOr[ICandleChartAxis] = js.undefined
  /**
    * Width of candle wick in pixel (IMO is 1 px best minimum value)
    */
  var candleWickWidth: js.UndefOr[Double | String] = js.undefined
  /**
    * Width of candle body in pixel (IMO is 2 px best minimum value)
    */
  var candleWidth: js.UndefOr[Double | String] = js.undefined
  /**
    * Padding of the chart drawing area to the container element and labels as a number or padding object {top: 5, right: 5, bottom: 5, left: 5}
    */
  var chartPadding: js.UndefOr[IChartPadding | Double] = js.undefined
  /**
    * Override the class names that get used to generate the SVG structure of the chart
    */
  var classNames: js.UndefOr[ICandleChartClasses] = js.undefined
  /**
    * When set to true, the last grid line on the x-axis is not drawn and the chart elements will expand to the full available width of the chart. For the last label to be drawncorrectly you might need to add chart padding or offset the last label with a draw event handler.
    */
  var fullWidth: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Overriding the natural high of the chart allows you to zoom in or limit the charts highest displayed value
    */
  var hight: js.UndefOr[Double | String] = js.undefined
  /**
    * Overriding the natural low of the chart allows you to zoom in or limit the charts lowest displayed value
    */
  var low: js.UndefOr[Double | String] = js.undefined
  /**
    * Use 1/3 of candle body width as width for the candle wick, otherwise the candleWickWidth is being used.
    */
  var useOneThirdAsCandleWickWidth: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Use calculated x-axis step length, depending on the number of quotes to display, as candle width. Otherwise the candleWidth is being used.
    */
  var useStepLengthAsCandleWidth: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object ICandleChartOptions {
  @scala.inline
  def apply(
    axisX: ICandleChartAxis = null,
    axisY: ICandleChartAxis = null,
    candleWickWidth: Double | String = null,
    candleWidth: Double | String = null,
    chartPadding: IChartPadding | Double = null,
    classNames: ICandleChartClasses = null,
    fullWidth: Boolean | String = null,
    height: Double | String = null,
    hight: Double | String = null,
    low: Double | String = null,
    plugins: js.Array[_] = null,
    reverseData: js.UndefOr[Boolean] = js.undefined,
    useOneThirdAsCandleWickWidth: Boolean | String = null,
    useStepLengthAsCandleWidth: Boolean | String = null,
    width: Double | String = null
  ): ICandleChartOptions = {
    val __obj = js.Dynamic.literal()
    if (axisX != null) __obj.updateDynamic("axisX")(axisX.asInstanceOf[js.Any])
    if (axisY != null) __obj.updateDynamic("axisY")(axisY.asInstanceOf[js.Any])
    if (candleWickWidth != null) __obj.updateDynamic("candleWickWidth")(candleWickWidth.asInstanceOf[js.Any])
    if (candleWidth != null) __obj.updateDynamic("candleWidth")(candleWidth.asInstanceOf[js.Any])
    if (chartPadding != null) __obj.updateDynamic("chartPadding")(chartPadding.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hight != null) __obj.updateDynamic("hight")(hight.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseData)) __obj.updateDynamic("reverseData")(reverseData.get.asInstanceOf[js.Any])
    if (useOneThirdAsCandleWickWidth != null) __obj.updateDynamic("useOneThirdAsCandleWickWidth")(useOneThirdAsCandleWickWidth.asInstanceOf[js.Any])
    if (useStepLengthAsCandleWidth != null) __obj.updateDynamic("useStepLengthAsCandleWidth")(useStepLengthAsCandleWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICandleChartOptions]
  }
}

