package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends Point {
  var d: js.UndefOr[Double] = js.undefined
  var t: js.UndefOr[Double] = js.undefined
}

object Projection {
  @scala.inline
  def apply(
    x: Double,
    y: Double,
    d: js.UndefOr[Double] = js.undefined,
    t: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): Projection = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(d)) __obj.updateDynamic("d")(d.get.asInstanceOf[js.Any])
    if (!js.isUndefined(t)) __obj.updateDynamic("t")(t.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

