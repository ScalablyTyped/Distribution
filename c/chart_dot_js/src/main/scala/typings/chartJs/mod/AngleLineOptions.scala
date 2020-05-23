package typings.chartJs.mod

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
    borderDashOffset: js.UndefOr[Double] = js.undefined,
    color: ChartColor = null,
    display: js.UndefOr[Boolean] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined
  ): AngleLineOptions = {
    val __obj = js.Dynamic.literal()
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash.asInstanceOf[js.Any])
    if (!js.isUndefined(borderDashOffset)) __obj.updateDynamic("borderDashOffset")(borderDashOffset.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleLineOptions]
  }
}

