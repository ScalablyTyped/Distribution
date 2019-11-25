package typings.bezierDashJs.BezierJs

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
  def apply(x: Double, y: Double, z: Int | Double = null): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

