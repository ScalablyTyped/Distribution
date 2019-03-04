package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arc extends Point {
  var e: scala.Double
  var interval: bezierDashJsLib.Anon_End
  var r: scala.Double
  var s: scala.Double
}

object Arc {
  @scala.inline
  def apply(
    e: scala.Double,
    interval: bezierDashJsLib.Anon_End,
    r: scala.Double,
    s: scala.Double,
    x: scala.Double,
    y: scala.Double,
    z: scala.Int | scala.Double = null
  ): Arc = {
    val __obj = js.Dynamic.literal(e = e, interval = interval, r = r, s = s, x = x, y = y)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
}

