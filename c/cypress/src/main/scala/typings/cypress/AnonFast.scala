package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFast extends js.Object {
  var fast: Double
  var slow: Double
}

object AnonFast {
  @scala.inline
  def apply(fast: Double, slow: Double): AnonFast = {
    val __obj = js.Dynamic.literal(fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFast]
  }
}

