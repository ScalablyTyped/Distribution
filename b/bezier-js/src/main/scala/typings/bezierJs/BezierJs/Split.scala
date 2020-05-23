package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Split extends Pair {
  var _t1: js.UndefOr[Double] = js.undefined
  var _t2: js.UndefOr[Double] = js.undefined
  var span: js.Array[Point]
}

object Split {
  @scala.inline
  def apply(
    left: Bezier,
    right: Bezier,
    span: js.Array[Point],
    _t1: js.UndefOr[Double] = js.undefined,
    _t2: js.UndefOr[Double] = js.undefined
  ): Split = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    if (!js.isUndefined(_t1)) __obj.updateDynamic("_t1")(_t1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(_t2)) __obj.updateDynamic("_t2")(_t2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Split]
  }
}

