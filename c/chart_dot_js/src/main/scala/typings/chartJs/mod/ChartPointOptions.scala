package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPointOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var hitRadius: js.UndefOr[Double] = js.undefined
  var hoverBorderWidth: js.UndefOr[Double] = js.undefined
  var hoverRadius: js.UndefOr[Double] = js.undefined
  var pointStyle: js.UndefOr[PointStyle] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object ChartPointOptions {
  @scala.inline
  def apply(
    backgroundColor: ChartColor = null,
    borderColor: ChartColor = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    hitRadius: js.UndefOr[Double] = js.undefined,
    hoverBorderWidth: js.UndefOr[Double] = js.undefined,
    hoverRadius: js.UndefOr[Double] = js.undefined,
    pointStyle: PointStyle = null,
    radius: js.UndefOr[Double] = js.undefined
  ): ChartPointOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hitRadius)) __obj.updateDynamic("hitRadius")(hitRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverBorderWidth)) __obj.updateDynamic("hoverBorderWidth")(hoverBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverRadius)) __obj.updateDynamic("hoverRadius")(hoverRadius.get.asInstanceOf[js.Any])
    if (pointStyle != null) __obj.updateDynamic("pointStyle")(pointStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPointOptions]
  }
}

