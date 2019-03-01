package typings
package bigDashIntegerLib.bigDashIntegerMod.bigIntNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseArray extends js.Object {
  var isNegative: scala.Boolean
  var value: js.Array[scala.Double]
}

object BaseArray {
  @scala.inline
  def apply(isNegative: scala.Boolean, value: js.Array[scala.Double]): BaseArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isNegative")(isNegative)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BaseArray]
  }
}

