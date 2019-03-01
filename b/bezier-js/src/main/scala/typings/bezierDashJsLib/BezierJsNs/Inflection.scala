package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inflection extends js.Object {
  var values: js.Array[scala.Double]
  var x: js.Array[scala.Double]
  var y: js.Array[scala.Double]
  var z: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Inflection {
  @scala.inline
  def apply(
    values: js.Array[scala.Double],
    x: js.Array[scala.Double],
    y: js.Array[scala.Double],
    z: js.Array[scala.Double] = null
  ): Inflection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("values")(values)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (z != null) __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[Inflection]
  }
}

