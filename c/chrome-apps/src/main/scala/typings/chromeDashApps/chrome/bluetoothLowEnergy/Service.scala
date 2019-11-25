package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * The device address of the remote peripheral that the GATT service belongs to.
    * Present, if this instance represents a remote service.
    */
  var deviceAddress: js.UndefOr[String] = js.undefined
  /**
    * Returns the identifier assigned to this service.
    * Use the instance ID to distinguish between services from a peripheral with the same UUID and to make function calls that take in a service identifier.
    * Present, if this instance represents a remote service.
    **/
  var instanceId: js.UndefOr[String] = js.undefined
  /** Indicates whether the type of this service is primary or secondary. */
  var isPrimary: Boolean
  /** The UUID of the service, e.g. 0000180d-0000-1000-8000-00805f9b34fb. */
  var uuid: String
}

object Service {
  @scala.inline
  def apply(isPrimary: Boolean, uuid: String, deviceAddress: String = null, instanceId: String = null): Service = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (deviceAddress != null) __obj.updateDynamic("deviceAddress")(deviceAddress.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

