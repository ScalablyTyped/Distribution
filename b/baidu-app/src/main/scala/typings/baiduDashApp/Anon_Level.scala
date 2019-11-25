package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  /**
  		 * TRIM_MEMORY_RUNNING_MODERATE = 5
  		 * TRIM_MEMORY_RUNNING_LOW = 10
  		 * TRIM_MEMORY_RUNNING_CRITICAL = 15
  		 */
  var level: Double
}

object Anon_Level {
  @scala.inline
  def apply(level: Double): Anon_Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Level]
  }
}

