package typings
package chartDotJsLib.chartDotJsMod

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
  var hoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor]] = js.undefined
  var hoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor]] = js.undefined
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
    chartDotJsLib.chartDotJsLibStrings.before | chartDotJsLib.chartDotJsLibStrings.after | chartDotJsLib.chartDotJsLibStrings.middle | scala.Boolean
  ] = js.undefined
  var `type`: js.UndefOr[ChartType | java.lang.String] = js.undefined
  var xAxisID: js.UndefOr[java.lang.String] = js.undefined
  var yAxisID: js.UndefOr[java.lang.String] = js.undefined
}

object ChartDataSets {
  @scala.inline
  def apply(
    backgroundColor: ChartColor | js.Array[ChartColor] = null,
    borderCapStyle: chartDotJsLib.chartDotJsLibStrings.butt | chartDotJsLib.chartDotJsLibStrings.round | chartDotJsLib.chartDotJsLibStrings.square = null,
    borderColor: ChartColor | js.Array[ChartColor] = null,
    borderDash: js.Array[scala.Double] = null,
    borderDashOffset: scala.Int | scala.Double = null,
    borderJoinStyle: chartDotJsLib.chartDotJsLibStrings.bevel | chartDotJsLib.chartDotJsLibStrings.round | chartDotJsLib.chartDotJsLibStrings.miter = null,
    borderSkipped: PositionType = null,
    borderWidth: scala.Double | js.Array[scala.Double] = null,
    cubicInterpolationMode: chartDotJsLib.chartDotJsLibStrings.default | chartDotJsLib.chartDotJsLibStrings.monotone = null,
    data: (js.Array[js.UndefOr[scala.Double | scala.Null]]) | js.Array[ChartPoint] = null,
    fill: scala.Boolean | scala.Double | java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hideInLegendAndTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    hoverBackgroundColor: ChartColor | js.Array[ChartColor] = null,
    hoverBorderColor: ChartColor | js.Array[ChartColor] = null,
    hoverBorderWidth: scala.Double | js.Array[scala.Double] = null,
    label: java.lang.String = null,
    lineTension: scala.Int | scala.Double = null,
    pointBackgroundColor: ChartColor | js.Array[ChartColor] = null,
    pointBorderColor: ChartColor | js.Array[ChartColor] = null,
    pointBorderWidth: scala.Double | js.Array[scala.Double] = null,
    pointHitRadius: scala.Double | js.Array[scala.Double] = null,
    pointHoverBackgroundColor: ChartColor | js.Array[ChartColor] = null,
    pointHoverBorderColor: ChartColor | js.Array[ChartColor] = null,
    pointHoverBorderWidth: scala.Double | js.Array[scala.Double] = null,
    pointHoverRadius: scala.Double | js.Array[scala.Double] = null,
    pointRadius: scala.Double | js.Array[scala.Double] = null,
    pointStyle: PointStyle | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | (js.Array[PointStyle | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement]) = null,
    showLine: js.UndefOr[scala.Boolean] = js.undefined,
    spanGaps: js.UndefOr[scala.Boolean] = js.undefined,
    stack: java.lang.String = null,
    steppedLine: chartDotJsLib.chartDotJsLibStrings.before | chartDotJsLib.chartDotJsLibStrings.after | chartDotJsLib.chartDotJsLibStrings.middle | scala.Boolean = null,
    `type`: ChartType | java.lang.String = null,
    xAxisID: java.lang.String = null,
    yAxisID: java.lang.String = null
  ): ChartDataSets = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderCapStyle != null) __obj.updateDynamic("borderCapStyle")(borderCapStyle.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash)
    if (borderDashOffset != null) __obj.updateDynamic("borderDashOffset")(borderDashOffset.asInstanceOf[js.Any])
    if (borderJoinStyle != null) __obj.updateDynamic("borderJoinStyle")(borderJoinStyle.asInstanceOf[js.Any])
    if (borderSkipped != null) __obj.updateDynamic("borderSkipped")(borderSkipped)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (cubicInterpolationMode != null) __obj.updateDynamic("cubicInterpolationMode")(cubicInterpolationMode.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(hideInLegendAndTooltip)) __obj.updateDynamic("hideInLegendAndTooltip")(hideInLegendAndTooltip)
    if (hoverBackgroundColor != null) __obj.updateDynamic("hoverBackgroundColor")(hoverBackgroundColor.asInstanceOf[js.Any])
    if (hoverBorderColor != null) __obj.updateDynamic("hoverBorderColor")(hoverBorderColor.asInstanceOf[js.Any])
    if (hoverBorderWidth != null) __obj.updateDynamic("hoverBorderWidth")(hoverBorderWidth.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineTension != null) __obj.updateDynamic("lineTension")(lineTension.asInstanceOf[js.Any])
    if (pointBackgroundColor != null) __obj.updateDynamic("pointBackgroundColor")(pointBackgroundColor.asInstanceOf[js.Any])
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor.asInstanceOf[js.Any])
    if (pointBorderWidth != null) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.asInstanceOf[js.Any])
    if (pointHitRadius != null) __obj.updateDynamic("pointHitRadius")(pointHitRadius.asInstanceOf[js.Any])
    if (pointHoverBackgroundColor != null) __obj.updateDynamic("pointHoverBackgroundColor")(pointHoverBackgroundColor.asInstanceOf[js.Any])
    if (pointHoverBorderColor != null) __obj.updateDynamic("pointHoverBorderColor")(pointHoverBorderColor.asInstanceOf[js.Any])
    if (pointHoverBorderWidth != null) __obj.updateDynamic("pointHoverBorderWidth")(pointHoverBorderWidth.asInstanceOf[js.Any])
    if (pointHoverRadius != null) __obj.updateDynamic("pointHoverRadius")(pointHoverRadius.asInstanceOf[js.Any])
    if (pointRadius != null) __obj.updateDynamic("pointRadius")(pointRadius.asInstanceOf[js.Any])
    if (pointStyle != null) __obj.updateDynamic("pointStyle")(pointStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine)
    if (!js.isUndefined(spanGaps)) __obj.updateDynamic("spanGaps")(spanGaps)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (steppedLine != null) __obj.updateDynamic("steppedLine")(steppedLine.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xAxisID != null) __obj.updateDynamic("xAxisID")(xAxisID)
    if (yAxisID != null) __obj.updateDynamic("yAxisID")(yAxisID)
    __obj.asInstanceOf[ChartDataSets]
  }
}

