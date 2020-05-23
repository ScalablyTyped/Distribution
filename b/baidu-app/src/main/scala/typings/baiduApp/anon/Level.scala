package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /**
    * TRIM_MEMORY_RUNNING_MODERATE = 5
    * TRIM_MEMORY_RUNNING_LOW = 10
    * TRIM_MEMORY_RUNNING_CRITICAL = 15
    */
  var level: Double
}

object Level {
  @scala.inline
  def apply(level: Double): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

