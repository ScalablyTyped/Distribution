package typings.chance.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerOptions extends js.Object {
  var max: Double
  var min: Double
}

object IntegerOptions {
  @scala.inline
  def apply(max: Double, min: Double): IntegerOptions = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[IntegerOptions]
  }
}

