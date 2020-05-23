package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var x: Double
  var y: Double
  var z: js.UndefOr[Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(x: Double, y: Double, z: js.UndefOr[Double] = js.undefined): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

