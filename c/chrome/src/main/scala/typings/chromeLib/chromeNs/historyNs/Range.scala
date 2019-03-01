package typings
package chromeLib.chromeNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /** Items added to history before this date, represented in milliseconds since the epoch. */
  var endTime: scala.Double
  /** Items added to history after this date, represented in milliseconds since the epoch. */
  var startTime: scala.Double
}

object Range {
  @scala.inline
  def apply(endTime: scala.Double, startTime: scala.Double): Range = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endTime")(endTime)
    __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[Range]
  }
}

