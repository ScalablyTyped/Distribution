package typings.bezierDashJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inflection extends js.Object {
  var values: js.Array[Double]
  var x: js.Array[Double]
  var y: js.Array[Double]
  var z: js.UndefOr[js.Array[Double]] = js.undefined
}

object Inflection {
  @scala.inline
  def apply(values: js.Array[Double], x: js.Array[Double], y: js.Array[Double], z: js.Array[Double] = null): Inflection = {
    val __obj = js.Dynamic.literal(values = values, x = x, y = y)
    if (z != null) __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[Inflection]
  }
}

