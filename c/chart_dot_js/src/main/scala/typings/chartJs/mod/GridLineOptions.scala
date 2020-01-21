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
    borderDashOffset: Int | Double = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    color: ChartColor = null,
    display: js.UndefOr[Boolean] = js.undefined,
    drawBorder: js.UndefOr[Boolean] = js.undefined,
    drawOnChartArea: js.UndefOr[Boolean] = js.undefined,
    drawTicks: js.UndefOr[Boolean] = js.undefined,
    lineWidth: Double | js.Array[Double] = null,
    offsetGridLines: js.UndefOr[Boolean] = js.undefined,
    tickMarkLength: Int | Double = null,
    z: Int | Double = null,
    zeroLineBorderDash: js.Array[Double] = null,
    zeroLineBorderDashOffset: Int | Double = null,
    zeroLineColor: ChartColor = null,
    zeroLineWidth: Int | Double = null
  ): GridLineOptions = {
    val __obj = js.Dynamic.literal()
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash.asInstanceOf[js.Any])
    if (borderDashOffset != null) __obj.updateDynamic("borderDashOffset")(borderDashOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(drawBorder)) __obj.updateDynamic("drawBorder")(drawBorder.asInstanceOf[js.Any])
    if (!js.isUndefined(drawOnChartArea)) __obj.updateDynamic("drawOnChartArea")(drawOnChartArea.asInstanceOf[js.Any])
    if (!js.isUndefined(drawTicks)) __obj.updateDynamic("drawTicks")(drawTicks.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetGridLines)) __obj.updateDynamic("offsetGridLines")(offsetGridLines.asInstanceOf[js.Any])
    if (tickMarkLength != null) __obj.updateDynamic("tickMarkLength")(tickMarkLength.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zeroLineBorderDash != null) __obj.updateDynamic("zeroLineBorderDash")(zeroLineBorderDash.asInstanceOf[js.Any])
    if (zeroLineBorderDashOffset != null) __obj.updateDynamic("zeroLineBorderDashOffset")(zeroLineBorderDashOffset.asInstanceOf[js.Any])
    if (zeroLineColor != null) __obj.updateDynamic("zeroLineColor")(zeroLineColor.asInstanceOf[js.Any])
    if (zeroLineWidth != null) __obj.updateDynamic("zeroLineWidth")(zeroLineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptions]
  }
}

