package typings
package chartistLib.chartistMod.ChartistNs

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
  var candleWickWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
           * Width of candle body in pixel (IMO is 2 px best minimum value)
           */
  var candleWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
           * Padding of the chart drawing area to the container element and labels as a number or padding object {top: 5, right: 5, bottom: 5, left: 5}
           */
  var chartPadding: js.UndefOr[IChartPadding | scala.Double] = js.undefined
  /**
           * Override the class names that get used to generate the SVG structure of the chart
           */
  var classNames: js.UndefOr[ICandleChartClasses] = js.undefined
  /**
           * When set to true, the last grid line on the x-axis is not drawn and the chart elements will expand to the full available width of the chart. For the last label to be drawncorrectly you might need to add chart padding or offset the last label with a draw event handler.
           */
  var fullWidth: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
           * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
           */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
           * Overriding the natural high of the chart allows you to zoom in or limit the charts highest displayed value
           */
  var hight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
           * Overriding the natural low of the chart allows you to zoom in or limit the charts lowest displayed value
           */
  var low: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
           * Use 1/3 of candle body width as width for the candle wick, otherwise the candleWickWidth is being used.
           */
  var useOneThirdAsCandleWickWidth: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
           * Use calculated x-axis step length, depending on the number of quotes to display, as candle width. Otherwise the candleWidth is being used.
           */
  var useStepLengthAsCandleWidth: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
           * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
           */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

