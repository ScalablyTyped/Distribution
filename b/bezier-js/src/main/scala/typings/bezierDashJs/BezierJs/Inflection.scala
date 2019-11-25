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
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inflection]
  }
}

