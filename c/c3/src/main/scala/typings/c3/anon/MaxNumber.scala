package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxNumber extends js.Object {
  /**
    * The number of tick texts will be adjusted to less than this value.
    */
  var max: Double
}

object MaxNumber {
  @scala.inline
  def apply(max: Double): MaxNumber = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxNumber]
  }
}

