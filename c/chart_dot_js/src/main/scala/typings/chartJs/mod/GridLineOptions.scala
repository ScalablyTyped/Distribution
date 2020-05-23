package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridLineOptions extends js.Object {
  var borderDash: js.UndefOr[js.Array[Double]] = js.undefined
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  var circular: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[ChartColor] = js.undefined
  var display: js.UndefOr[Boolean] = js.undefined
  var drawBorder: js.UndefOr[Boolean] = js.undefined
  var drawOnChartArea: js.UndefOr[Boolean] = js.undefined
  var drawTicks: js.UndefOr[Boolean] = js.undefined
  var lineWidth: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var offsetGridLines: js.UndefOr[Boolean] = js.undefined
  var tickMarkLength: js.UndefOr[Double] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
  var zeroLineBorderDash: js.UndefOr[js.Array[Double]] = js.undefined
  var zeroLineBorderDashOffset: js.UndefOr[Double] = js.undefined
  var zeroLineColor: js.UndefOr[ChartColor] = js.undefined
  var zeroLineWidth: js.UndefOr[Double] = js.undefined
}

object GridLineOptions {
  @scala.inline
  def apply(
    borderDash: js.Array[Double] = null,
    borderDashOffset: js.UndefOr[Double] = js.undefined,
    circular: js.UndefOr[Boolean] = js.undefined,
    color: ChartColor = null,
    display: js.UndefOr[Boolean] = js.undefined,
    drawBorder: js.UndefOr[Boolean] = js.undefined,
    drawOnChartArea: js.UndefOr[Boolean] = js.undefined,
    drawTicks: js.UndefOr[Boolean] = js.undefined,
    lineWidth: Double | js.Array[Double] = null,
    offsetGridLines: js.UndefOr[Boolean] = js.undefined,
    tickMarkLength: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined,
    zeroLineBorderDash: js.Array[Double] = null,
    zeroLineBorderDashOffset: js.UndefOr[Double] = js.undefined,
    zeroLineColor: ChartColor = null,
    zeroLineWidth: js.UndefOr[Double] = js.undefined
  ): GridLineOptions = {
    val __obj = js.Dynamic.literal()
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash.asInstanceOf[js.Any])
    if (!js.isUndefined(borderDashOffset)) __obj.updateDynamic("borderDashOffset")(borderDashOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawBorder)) __obj.updateDynamic("drawBorder")(drawBorder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawOnChartArea)) __obj.updateDynamic("drawOnChartArea")(drawOnChartArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawTicks)) __obj.updateDynamic("drawTicks")(drawTicks.get.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetGridLines)) __obj.updateDynamic("offsetGridLines")(offsetGridLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickMarkLength)) __obj.updateDynamic("tickMarkLength")(tickMarkLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    if (zeroLineBorderDash != null) __obj.updateDynamic("zeroLineBorderDash")(zeroLineBorderDash.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroLineBorderDashOffset)) __obj.updateDynamic("zeroLineBorderDashOffset")(zeroLineBorderDashOffset.get.asInstanceOf[js.Any])
    if (zeroLineColor != null) __obj.updateDynamic("zeroLineColor")(zeroLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroLineWidth)) __obj.updateDynamic("zeroLineWidth")(zeroLineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptions]
  }
}

