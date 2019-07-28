package typings.convertDashHrtime.convertDashHrtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HRTime extends js.Object {
  var milliseconds: Double
  var nanoseconds: Double
  var seconds: Double
}

object HRTime {
  @scala.inline
  def apply(milliseconds: Double, nanoseconds: Double, seconds: Double): HRTime = {
    val __obj = js.Dynamic.literal(milliseconds = milliseconds, nanoseconds = nanoseconds, seconds = seconds)
  
    __obj.asInstanceOf[HRTime]
  }
}

