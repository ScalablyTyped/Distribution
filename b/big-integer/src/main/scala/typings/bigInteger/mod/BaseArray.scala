package typings.bigInteger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseArray extends js.Object {
  var isNegative: Boolean
  var value: js.Array[Double]
}

object BaseArray {
  @scala.inline
  def apply(isNegative: Boolean, value: js.Array[Double]): BaseArray = {
    val __obj = js.Dynamic.literal(isNegative = isNegative.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseArray]
  }
}

