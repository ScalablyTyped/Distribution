package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCounts extends js.Object {
  var active: scala.Double
  var completed: scala.Double
  var delayed: scala.Double
  var failed: scala.Double
  var waiting: scala.Double
}

object JobCounts {
  @scala.inline
  def apply(
    active: scala.Double,
    completed: scala.Double,
    delayed: scala.Double,
    failed: scala.Double,
    waiting: scala.Double
  ): JobCounts = {
    val __obj = js.Dynamic.literal(active = active, completed = completed, delayed = delayed, failed = failed, waiting = waiting)
  
    __obj.asInstanceOf[JobCounts]
  }
}

