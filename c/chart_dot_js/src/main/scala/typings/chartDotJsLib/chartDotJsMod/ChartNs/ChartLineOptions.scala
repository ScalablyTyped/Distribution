package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLineOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  var borderCapStyle: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  var borderDash: js.UndefOr[js.Array[_]] = js.undefined
  var borderDashOffset: js.UndefOr[scala.Double] = js.undefined
  var borderJoinStyle: js.UndefOr[java.lang.String] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var capBezierPoints: js.UndefOr[scala.Boolean] = js.undefined
  var cubicInterpolationMode: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.default | chartDotJsLib.chartDotJsLibStrings.monotone
  ] = js.undefined
  var fill: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.zero | chartDotJsLib.chartDotJsLibStrings.top | chartDotJsLib.chartDotJsLibStrings.bottom | scala.Boolean
  ] = js.undefined
  var stepped: js.UndefOr[scala.Boolean] = js.undefined
  var tension: js.UndefOr[scala.Double] = js.undefined
}

object ChartLineOptions {
  @scala.inline
  def apply(
    backgroundColor: ChartColor = null,
    borderCapStyle: java.lang.String = null,
    borderColor: ChartColor = null,
    borderDash: js.Array[_] = null,
    borderDashOffset: scala.Int | scala.Double = null,
    borderJoinStyle: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    capBezierPoints: js.UndefOr[scala.Boolean] = js.undefined,
    cubicInterpolationMode: chartDotJsLib.chartDotJsLibStrings.default | chartDotJsLib.chartDotJsLibStrings.monotone = null,
    fill: chartDotJsLib.chartDotJsLibStrings.zero | chartDotJsLib.chartDotJsLibStrings.top | chartDotJsLib.chartDotJsLibStrings.bottom | scala.Boolean = null,
    stepped: js.UndefOr[scala.Boolean] = js.undefined,
    tension: scala.Int | scala.Double = null
  ): ChartLineOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderCapStyle != null) __obj.updateDynamic("borderCapStyle")(borderCapStyle)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash)
    if (borderDashOffset != null) __obj.updateDynamic("borderDashOffset")(borderDashOffset.asInstanceOf[js.Any])
    if (borderJoinStyle != null) __obj.updateDynamic("borderJoinStyle")(borderJoinStyle)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(capBezierPoints)) __obj.updateDynamic("capBezierPoints")(capBezierPoints)
    if (cubicInterpolationMode != null) __obj.updateDynamic("cubicInterpolationMode")(cubicInterpolationMode.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(stepped)) __obj.updateDynamic("stepped")(stepped)
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLineOptions]
  }
}

