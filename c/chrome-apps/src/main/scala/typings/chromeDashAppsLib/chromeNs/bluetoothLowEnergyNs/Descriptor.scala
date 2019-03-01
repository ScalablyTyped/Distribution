package typings
package chromeDashAppsLib.chromeNs.bluetoothLowEnergyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  /** The GATT characteristic this descriptor belongs to. */
  var characteristic: js.UndefOr[Characteristic] = js.undefined
  /** Returns the identifier assigned to this descriptor. Use the instance ID to distinguish between descriptors from a peripheral with the same UUID and to make function calls that take in a descriptor identifier. Present, if this instance represents a remote characteristic. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The permissions of this descriptor.
    * @since Chrome 52.
    */
  var permissions: js.Array[DescriptorPermissions]
  /** The UUID of the characteristic descriptor, e.g. 00002902-0000-1000-8000-00805f9b34fb. */
  var uuid: java.lang.String
  /** The currently cached descriptor value. This value gets updated when the value of the descriptor is read. */
  var value: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
}

object Descriptor {
  @scala.inline
  def apply(
    permissions: js.Array[DescriptorPermissions],
    uuid: java.lang.String,
    characteristic: Characteristic = null,
    instanceId: java.lang.String = null,
    value: stdLib.ArrayBuffer = null
  ): Descriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("permissions")(permissions)
    __obj.updateDynamic("uuid")(uuid)
    if (characteristic != null) __obj.updateDynamic("characteristic")(characteristic)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Descriptor]
  }
}

