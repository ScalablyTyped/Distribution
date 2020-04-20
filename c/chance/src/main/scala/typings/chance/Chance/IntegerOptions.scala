package typings.chance.Chance

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
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerOptions]
  }
}

