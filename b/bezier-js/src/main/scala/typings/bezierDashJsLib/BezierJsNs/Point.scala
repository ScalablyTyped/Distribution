package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var x: scala.Double
  var y: scala.Double
  var z: js.UndefOr[scala.Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Int | scala.Double = null): Point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

