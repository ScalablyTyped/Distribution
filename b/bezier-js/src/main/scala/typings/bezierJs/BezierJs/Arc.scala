package typings.bezierJs.BezierJs

import typings.bezierJs.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arc extends Point {
  var e: Double
  var interval: End
  var r: Double
  var s: Double
}

object Arc {
  @scala.inline
  def apply(
    e: Double,
    interval: End,
    r: Double,
    s: Double,
    x: Double,
    y: Double,
    z: js.UndefOr[Double] = js.undefined
  ): Arc = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
}

