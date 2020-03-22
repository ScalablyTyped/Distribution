package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxNumber extends js.Object {
  /**
    * The number of tick texts will be adjusted to less than this value.
    */
  var max: Double
}

object AnonMaxNumber {
  @scala.inline
  def apply(max: Double): AnonMaxNumber = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaxNumber]
  }
}

