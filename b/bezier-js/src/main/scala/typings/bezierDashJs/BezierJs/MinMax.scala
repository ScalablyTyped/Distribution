package typings.bezierDashJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinMax extends js.Object {
  var max: Double
  var mid: js.UndefOr[Double] = js.undefined
  var min: Double
  var size: js.UndefOr[Double] = js.undefined
}

object MinMax {
  @scala.inline
  def apply(max: Double, min: Double, mid: Int | Double = null, size: Int | Double = null): MinMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMax]
  }
}

