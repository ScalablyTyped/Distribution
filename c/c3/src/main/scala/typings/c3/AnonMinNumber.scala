package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinNumber extends js.Object {
  var max: Double
  var min: Double
}

object AnonMinNumber {
  @scala.inline
  def apply(max: Double, min: Double): AnonMinNumber = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinNumber]
  }
}

