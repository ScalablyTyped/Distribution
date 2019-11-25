package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var backgroundColor: String
  var base: Double
  var borderColor: String
  var borderWidth: js.UndefOr[Double] = js.undefined
  var controlPointNextX: Double
  var controlPointNextY: Double
  var controlPointPreviousX: Double
  var controlPointPreviousY: Double
  var head: Double
  var hitRadius: Double
  var pointStyle: String
  var radius: String
  var skip: js.UndefOr[Boolean] = js.undefined
  var steppedLine: js.UndefOr[scala.Nothing] = js.undefined
  var tension: Double
  var x: Double
  var y: Double
}

object Model {
  @scala.inline
  def apply(
    backgroundColor: String,
    base: Double,
    borderColor: String,
    controlPointNextX: Double,
    controlPointNextY: Double,
    controlPointPreviousX: Double,
    controlPointPreviousY: Double,
    head: Double,
    hitRadius: Double,
    pointStyle: String,
    radius: String,
    tension: Double,
    x: Double,
    y: Double,
    borderWidth: Int | Double = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    steppedLine: js.UndefOr[scala.Nothing] = js.undefined
  ): Model = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], controlPointNextX = controlPointNextX.asInstanceOf[js.Any], controlPointNextY = controlPointNextY.asInstanceOf[js.Any], controlPointPreviousX = controlPointPreviousX.asInstanceOf[js.Any], controlPointPreviousY = controlPointPreviousY.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hitRadius = hitRadius.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tension = tension.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(steppedLine)) __obj.updateDynamic("steppedLine")(steppedLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

