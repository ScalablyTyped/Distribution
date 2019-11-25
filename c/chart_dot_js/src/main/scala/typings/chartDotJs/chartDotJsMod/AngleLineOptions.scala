package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngleLineOptions extends js.Object {
  var borderDash: js.UndefOr[js.Array[Double]] = js.undefined
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[ChartColor] = js.undefined
  var display: js.UndefOr[Boolean] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object AngleLineOptions {
  @scala.inline
  def apply(
    borderDash: js.Array[Double] = null,
    borderDashOffset: Int | Double = null,
    color: ChartColor = null,
    display: js.UndefOr[Boolean] = js.undefined,
    lineWidth: Int | Double = null
  ): AngleLineOptions = {
    val __obj = js.Dynamic.literal()
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash.asInstanceOf[js.Any])
    if (borderDashOffset != null) __obj.updateDynamic("borderDashOffset")(borderDashOffset.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleLineOptions]
  }
}

