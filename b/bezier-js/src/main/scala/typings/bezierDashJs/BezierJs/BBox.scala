package typings.bezierDashJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BBox extends js.Object {
  var x: MinMax
  var y: MinMax
  var z: js.UndefOr[MinMax] = js.undefined
}

object BBox {
  @scala.inline
  def apply(x: MinMax, y: MinMax, z: MinMax = null): BBox = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBox]
  }
}

