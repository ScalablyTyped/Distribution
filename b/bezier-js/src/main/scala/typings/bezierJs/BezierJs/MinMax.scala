package typings.bezierJs.BezierJs

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
  def apply(
    max: Double,
    min: Double,
    mid: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): MinMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    if (!js.isUndefined(mid)) __obj.updateDynamic("mid")(mid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMax]
  }
}

