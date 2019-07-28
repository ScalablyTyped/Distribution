package typings.bezierDashJs.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends Point {
  var d: js.UndefOr[Double] = js.undefined
  var t: js.UndefOr[Double] = js.undefined
}

object Projection {
  @scala.inline
  def apply(x: Double, y: Double, d: Int | Double = null, t: Int | Double = null, z: Int | Double = null): Projection = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

