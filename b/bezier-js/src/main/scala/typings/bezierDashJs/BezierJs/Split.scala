package typings.bezierDashJs.BezierJs

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
    _t1: Int | Double = null,
    _t2: Int | Double = null
  ): Split = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    if (_t1 != null) __obj.updateDynamic("_t1")(_t1.asInstanceOf[js.Any])
    if (_t2 != null) __obj.updateDynamic("_t2")(_t2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Split]
  }
}

