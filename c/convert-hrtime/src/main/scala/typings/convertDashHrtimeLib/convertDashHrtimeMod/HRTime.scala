package typings
package convertDashHrtimeLib.convertDashHrtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HRTime extends js.Object {
  var milliseconds: scala.Double
  var nanoseconds: scala.Double
  var seconds: scala.Double
}

object HRTime {
  @scala.inline
  def apply(milliseconds: scala.Double, nanoseconds: scala.Double, seconds: scala.Double): HRTime = {
    val __obj = js.Dynamic.literal(milliseconds = milliseconds, nanoseconds = nanoseconds, seconds = seconds)
  
    __obj.asInstanceOf[HRTime]
  }
}

