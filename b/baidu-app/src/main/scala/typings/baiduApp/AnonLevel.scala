package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  /**
  		 * TRIM_MEMORY_RUNNING_MODERATE = 5
  		 * TRIM_MEMORY_RUNNING_LOW = 10
  		 * TRIM_MEMORY_RUNNING_CRITICAL = 15
  		 */
  var level: Double
}

object AnonLevel {
  @scala.inline
  def apply(level: Double): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
}

