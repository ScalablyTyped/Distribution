package typings
package bezierDashJsLib.BezierJsNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (z != null) __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[BBox]
  }
}

