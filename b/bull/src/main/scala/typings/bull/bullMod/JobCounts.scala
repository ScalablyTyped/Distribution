package typings.bull.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCounts extends js.Object {
  var active: Double
  var completed: Double
  var delayed: Double
  var failed: Double
  var waiting: Double
}

object JobCounts {
  @scala.inline
  def apply(active: Double, completed: Double, delayed: Double, failed: Double, waiting: Double): JobCounts = {
    val __obj = js.Dynamic.literal(active = active, completed = completed, delayed = delayed, failed = failed, waiting = waiting)
  
    __obj.asInstanceOf[JobCounts]
  }
}

