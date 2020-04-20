package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreRules extends js.Object {
  var lowerPriorityThan: Double
}

object IgnoreRules {
  @scala.inline
  def apply(lowerPriorityThan: Double): IgnoreRules = {
    val __obj = js.Dynamic.literal(lowerPriorityThan = lowerPriorityThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreRules]
  }
}

