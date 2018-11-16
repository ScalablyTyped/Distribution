package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChartDataSets extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor]] = js.undefined
  var borderCapStyle: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.butt | chartDotJsLib.chartDotJsLibStrings.round | chartDotJsLib.chartDotJsLibStrings.square
  ] = js.undefined
  var borderColor: js.UndefOr[ChartColor | js.Array[ChartColor]] = js.undefined
  var borderDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var borderDashOffset: js.UndefOr[scala.Double] = js.undefined
  var borderJoinStyle: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.bevel | chartDotJsLib.chartDotJsLibStrings.round | chartDotJsLib.chartDotJsLibStrings.miter
  ] = js.undefined
  var borderSkipped: js.UndefOr[PositionType] = js.undefined
  var borderWidth: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var cubicInterpolationMode: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.default | chartDotJsLib.chartDotJsLibStrings.monotone
  ] = js.undefined
  var data: js.UndefOr[(js.Array[js.UndefOr[scala.Double | scala.Null]]) | js.Array[ChartPoint]] = js.undefined
  var fill: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var hideInLegendAndTooltip: js.UndefOr[scala.Boolean] = js.undefined
  var hoverBackgroundColor: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var hoverBorderColor: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var hoverBorderWidth: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var lineTension: js.UndefOr[scala.Double] = js.undefined
  var pointBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor]] = js.undefined
  var pointBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor]] = js.undefined
  var pointBorderWidth: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var pointHitRadius: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var pointHoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor]] = js.undefined
  var pointHoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor]] = js.undefined
  var pointHoverBorderWidth: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var pointHoverRadius: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var pointRadius: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var pointStyle: js.UndefOr[
    PointStyle | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | (js.Array[PointStyle | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement])
  ] = js.undefined
  var showLine: js.UndefOr[scala.Boolean] = js.undefined
  var spanGaps: js.UndefOr[scala.Boolean] = js.undefined
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var steppedLine: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.before | chartDotJsLib.chartDotJsLibStrings.after | scala.Boolean
  ] = js.undefined
  var `type`: js.UndefOr[ChartType | java.lang.String] = js.undefined
  var xAxisID: js.UndefOr[java.lang.String] = js.undefined
  var yAxisID: js.UndefOr[java.lang.String] = js.undefined
}

