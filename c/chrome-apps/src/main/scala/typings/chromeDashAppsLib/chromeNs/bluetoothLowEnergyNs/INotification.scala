package typings
package chromeDashAppsLib.chromeNs.bluetoothLowEnergyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotification extends js.Object {
  /** Optional flag for sending an indication instead of a notification. */
  var shouldIndicate: scala.Boolean
  /** New value of the characteristic. */
  var value: stdLib.ArrayBuffer
}

object INotification {
  @scala.inline
  def apply(shouldIndicate: scala.Boolean, value: stdLib.ArrayBuffer): INotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shouldIndicate")(shouldIndicate)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[INotification]
  }
}

