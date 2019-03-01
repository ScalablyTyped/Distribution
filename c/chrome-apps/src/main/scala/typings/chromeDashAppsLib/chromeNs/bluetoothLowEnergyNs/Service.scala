package typings
package chromeDashAppsLib.chromeNs.bluetoothLowEnergyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * The device address of the remote peripheral that the GATT service belongs to.
    * Present, if this instance represents a remote service.
    */
  var deviceAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returns the identifier assigned to this service.
    * Use the instance ID to distinguish between services from a peripheral with the same UUID and to make function calls that take in a service identifier.
    * Present, if this instance represents a remote service.
    **/
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the type of this service is primary or secondary. */
  var isPrimary: scala.Boolean
  /** The UUID of the service, e.g. 0000180d-0000-1000-8000-00805f9b34fb. */
  var uuid: java.lang.String
}

object Service {
  @scala.inline
  def apply(
    isPrimary: scala.Boolean,
    uuid: java.lang.String,
    deviceAddress: java.lang.String = null,
    instanceId: java.lang.String = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isPrimary")(isPrimary)
    __obj.updateDynamic("uuid")(uuid)
    if (deviceAddress != null) __obj.updateDynamic("deviceAddress")(deviceAddress)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    __obj.asInstanceOf[Service]
  }
}

