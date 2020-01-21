package typings.cordovaPluginBatteryStatus

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatteryStatusEvent extends Event_ {
  /* A boolean that indicates whether the device is plugged in. */
  var isPlugged: Boolean = js.native
  /* The percentage of battery charge (0-100). */
  var level: Double = js.native
}

