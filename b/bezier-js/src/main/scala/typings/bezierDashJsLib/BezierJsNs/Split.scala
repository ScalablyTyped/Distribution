package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Split extends Pair {
  var _t1: js.UndefOr[scala.Double] = js.undefined
  var _t2: js.UndefOr[scala.Double] = js.undefined
  var span: js.Array[Point]
}

object Split {
  @scala.inline
  def apply(
    left: Bezier,
    right: Bezier,
    span: js.Array[Point],
    _t1: scala.Int | scala.Double = null,
    _t2: scala.Int | scala.Double = null
  ): Split = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("span")(span)
    if (_t1 != null) __obj.updateDynamic("_t1")(_t1.asInstanceOf[js.Any])
    if (_t2 != null) __obj.updateDynamic("_t2")(_t2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Split]
  }
}

