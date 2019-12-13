package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This model is generic with a bunch of optional properties to represent all types of chart models.
// Each chart type defines their own unique model structure so some of these optional properties
// might always have values depending on the chart type.
trait Model extends js.Object {
  var backgroundColor: String
  var base: Double
  var borderAlign: js.UndefOr[BorderAlignment] = js.undefined
  var borderColor: String
  var borderWidth: js.UndefOr[Double] = js.undefined
  var circumference: js.UndefOr[Double] = js.undefined
  var controlPointNextX: Double
  var controlPointNextY: Double
  var controlPointPreviousX: Double
  var controlPointPreviousY: Double
  var endAngle: js.UndefOr[Double] = js.undefined
  var head: Double
  var hitRadius: Double
  var innerRadius: js.UndefOr[Double] = js.undefined
  var outerRadius: js.UndefOr[Double] = js.undefined
  var pointStyle: String
  var radius: String
  var skip: js.UndefOr[Boolean] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
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
    borderAlign: BorderAlignment = null,
    borderWidth: Int | Double = null,
    circumference: Int | Double = null,
    endAngle: Int | Double = null,
    innerRadius: Int | Double = null,
    outerRadius: Int | Double = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null,
    steppedLine: js.UndefOr[scala.Nothing] = js.undefined
  ): Model = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], controlPointNextX = controlPointNextX.asInstanceOf[js.Any], controlPointNextY = controlPointNextY.asInstanceOf[js.Any], controlPointPreviousX = controlPointPreviousX.asInstanceOf[js.Any], controlPointPreviousY = controlPointPreviousY.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hitRadius = hitRadius.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tension = tension.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (borderAlign != null) __obj.updateDynamic("borderAlign")(borderAlign.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (circumference != null) __obj.updateDynamic("circumference")(circumference.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(steppedLine)) __obj.updateDynamic("steppedLine")(steppedLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

