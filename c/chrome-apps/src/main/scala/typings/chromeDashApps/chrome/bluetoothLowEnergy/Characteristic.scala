package typings.chromeDashApps.chrome.bluetoothLowEnergy

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Characteristic extends js.Object {
  /** Returns the identifier assigned to this characteristic. Use the instance ID to distinguish between characteristics from a peripheral with the same UUID and to make function calls that take in a characteristic identifier. Present, if this instance represents a remote characteristic. */
  var instanceId: js.UndefOr[String] = js.undefined
  /** The properties of this characteristic. */
  var properties: js.Array[CharacteristicProperties]
  /** The GATT service this characteristic belongs to. */
  var service: js.UndefOr[Service] = js.undefined
  /** The UUID of the characteristic, e.g. 00002a37-0000-1000-8000-00805f9b34fb. */
  var uuid: String
  /** The currently cached characteristic value. This value gets updated when the value of the characteristic is read or updated via a notification or indication. */
  var value: js.UndefOr[ArrayBuffer] = js.undefined
}

object Characteristic {
  @scala.inline
  def apply(
    properties: js.Array[CharacteristicProperties],
    uuid: String,
    instanceId: String = null,
    service: Service = null,
    value: ArrayBuffer = null
  ): Characteristic = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
}

