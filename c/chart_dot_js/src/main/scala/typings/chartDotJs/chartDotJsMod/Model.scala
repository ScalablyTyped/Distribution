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
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, base = base, borderColor = borderColor, controlPointNextX = controlPointNextX, controlPointNextY = controlPointNextY, controlPointPreviousX = controlPointPreviousX, controlPointPreviousY = controlPointPreviousY, head = head, hitRadius = hitRadius, pointStyle = pointStyle, radius = radius, tension = tension, x = x, y = y)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (!js.isUndefined(steppedLine)) __obj.updateDynamic("steppedLine")(steppedLine)
    __obj.asInstanceOf[Model]
  }
}

