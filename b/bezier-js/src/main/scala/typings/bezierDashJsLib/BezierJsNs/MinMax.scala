package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinMax extends js.Object {
  var max: scala.Double
  var mid: js.UndefOr[scala.Double] = js.undefined
  var min: scala.Double
  var size: js.UndefOr[scala.Double] = js.undefined
}

object MinMax {
  @scala.inline
  def apply(
    max: scala.Double,
    min: scala.Double,
    mid: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
  ): MinMax = {
    val __obj = js.Dynamic.literal(max = max, min = min)
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMax]
  }
}

