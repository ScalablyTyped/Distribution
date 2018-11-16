package typings
package cordovaDashPluginDashBatteryDashStatusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object, that passed into battery event listener */
@js.native
trait BatteryStatusEvent
  extends stdLib.Event {
  /* A boolean that indicates whether the device is plugged in. */
  var isPlugged: scala.Boolean = js.native
  /* The percentage of battery charge (0-100). */
  var level: scala.Double = js.native
}

