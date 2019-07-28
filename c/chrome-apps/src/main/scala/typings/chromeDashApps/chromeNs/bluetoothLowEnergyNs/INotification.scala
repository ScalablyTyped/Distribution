package typings.chromeDashApps.chromeNs.bluetoothLowEnergyNs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotification extends js.Object {
  /** Optional flag for sending an indication instead of a notification. */
  var shouldIndicate: Boolean
  /** New value of the characteristic. */
  var value: ArrayBuffer
}

object INotification {
  @scala.inline
  def apply(shouldIndicate: Boolean, value: ArrayBuffer): INotification = {
    val __obj = js.Dynamic.literal(shouldIndicate = shouldIndicate, value = value)
  
    __obj.asInstanceOf[INotification]
  }
}

