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
    borderWidth: Int | Double = null,
    hitRadius: Int | Double = null,
    hoverBorderWidth: Int | Double = null,
    hoverRadius: Int | Double = null,
    pointStyle: PointStyle = null,
    radius: Int | Double = null
  ): ChartPointOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (hitRadius != null) __obj.updateDynamic("hitRadius")(hitRadius.asInstanceOf[js.Any])
    if (hoverBorderWidth != null) __obj.updateDynamic("hoverBorderWidth")(hoverBorderWidth.asInstanceOf[js.Any])
    if (hoverRadius != null) __obj.updateDynamic("hoverRadius")(hoverRadius.asInstanceOf[js.Any])
    if (pointStyle != null) __obj.updateDynamic("pointStyle")(pointStyle.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPointOptions]
  }
}

