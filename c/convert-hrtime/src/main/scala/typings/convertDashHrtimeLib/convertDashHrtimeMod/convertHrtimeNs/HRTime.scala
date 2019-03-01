package typings
package convertDashHrtimeLib.convertDashHrtimeMod.convertHrtimeNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("milliseconds")(milliseconds)
    __obj.updateDynamic("nanoseconds")(nanoseconds)
    __obj.updateDynamic("seconds")(seconds)
    __obj.asInstanceOf[HRTime]
  }
}

