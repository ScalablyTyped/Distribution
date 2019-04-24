package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridLineOptions extends js.Object {
  var borderDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var borderDashOffset: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[ChartColor] = js.undefined
  var display: js.UndefOr[scala.Boolean] = js.undefined
  var drawBorder: js.UndefOr[scala.Boolean] = js.undefined
  var drawOnChartArea: js.UndefOr[scala.Boolean] = js.undefined
  var drawTicks: js.UndefOr[scala.Boolean] = js.undefined
  var lineWidth: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var offsetGridLines: js.UndefOr[scala.Boolean] = js.undefined
  var tickMarkLength: js.UndefOr[scala.Double] = js.undefined
  var zeroLineBorderDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var zeroLineBorderDashOffset: js.UndefOr[scala.Double] = js.undefined
  var zeroLineColor: js.UndefOr[ChartColor] = js.undefined
  var zeroLineWidth: js.UndefOr[scala.Double] = js.undefined
}

object GridLineOptions {
  @scala.inline
  def apply(
    borderDash: js.Array[scala.Double] = null,
    borderDashOffset: scala.Int | scala.Double = null,
    color: ChartColor = null,
    display: js.UndefOr[scala.Boolean] = js.undefined,
    drawBorder: js.UndefOr[scala.Boolean] = js.undefined,
    drawOnChartArea: js.UndefOr[scala.Boolean] = js.undefined,
    drawTicks: js.UndefOr[scala.Boolean] = js.undefined,
    lineWidth: scala.Double | js.Array[scala.Double] = null,
    offsetGridLines: js.UndefOr[scala.Boolean] = js.undefined,
    tickMarkLength: scala.Int | scala.Double = null,
    zeroLineBorderDash: js.Array[scala.Double] = null,
    zeroLineBorderDashOffset: scala.Int | scala.Double = null,
    zeroLineColor: ChartColor = null,
    zeroLineWidth: scala.Int | scala.Double = null
  ): GridLineOptions = {
    val __obj = js.Dynamic.literal()
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash)
    if (borderDashOffset != null) __obj.updateDynamic("borderDashOffset")(borderDashOffset.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (!js.isUndefined(drawBorder)) __obj.updateDynamic("drawBorder")(drawBorder)
    if (!js.isUndefined(drawOnChartArea)) __obj.updateDynamic("drawOnChartArea")(drawOnChartArea)
    if (!js.isUndefined(drawTicks)) __obj.updateDynamic("drawTicks")(drawTicks)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetGridLines)) __obj.updateDynamic("offsetGridLines")(offsetGridLines)
    if (tickMarkLength != null) __obj.updateDynamic("tickMarkLength")(tickMarkLength.asInstanceOf[js.Any])
    if (zeroLineBorderDash != null) __obj.updateDynamic("zeroLineBorderDash")(zeroLineBorderDash)
    if (zeroLineBorderDashOffset != null) __obj.updateDynamic("zeroLineBorderDashOffset")(zeroLineBorderDashOffset.asInstanceOf[js.Any])
    if (zeroLineColor != null) __obj.updateDynamic("zeroLineColor")(zeroLineColor.asInstanceOf[js.Any])
    if (zeroLineWidth != null) __obj.updateDynamic("zeroLineWidth")(zeroLineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptions]
  }
}

