package typings.bezierJs.BezierJs

import typings.bezierJs.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arc extends Point {
  var e: Double
  var interval: AnonEnd
  var r: Double
  var s: Double
}

object Arc {
  @scala.inline
  def apply(e: Double, interval: AnonEnd, r: Double, s: Double, x: Double, y: Double, z: Int | Double = null): Arc = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
}

