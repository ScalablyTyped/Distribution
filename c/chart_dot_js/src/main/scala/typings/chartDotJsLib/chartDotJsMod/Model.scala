package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var backgroundColor: java.lang.String
  var base: scala.Double
  var borderColor: java.lang.String
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var controlPointNextX: scala.Double
  var controlPointNextY: scala.Double
  var controlPointPreviousX: scala.Double
  var controlPointPreviousY: scala.Double
  var head: scala.Double
  var hitRadius: scala.Double
  var pointStyle: java.lang.String
  var radius: java.lang.String
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  var steppedLine: js.UndefOr[scala.Nothing] = js.undefined
  var tension: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Model {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    base: scala.Double,
    borderColor: java.lang.String,
    controlPointNextX: scala.Double,
    controlPointNextY: scala.Double,
    controlPointPreviousX: scala.Double,
    controlPointPreviousY: scala.Double,
    head: scala.Double,
    hitRadius: scala.Double,
    pointStyle: java.lang.String,
    radius: java.lang.String,
    tension: scala.Double,
    x: scala.Double,
    y: scala.Double,
    borderWidth: scala.Int | scala.Double = null,
    skip: js.UndefOr[scala.Boolean] = js.undefined,
    steppedLine: js.UndefOr[scala.Nothing] = js.undefined
  ): Model = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("borderColor")(borderColor)
    __obj.updateDynamic("controlPointNextX")(controlPointNextX)
    __obj.updateDynamic("controlPointNextY")(controlPointNextY)
    __obj.updateDynamic("controlPointPreviousX")(controlPointPreviousX)
    __obj.updateDynamic("controlPointPreviousY")(controlPointPreviousY)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("hitRadius")(hitRadius)
    __obj.updateDynamic("pointStyle")(pointStyle)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("tension")(tension)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (!js.isUndefined(steppedLine)) __obj.updateDynamic("steppedLine")(steppedLine)
    __obj.asInstanceOf[Model]
  }
}

