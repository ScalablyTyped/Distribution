package typings
package chromeDashAppsLib.chromeNs.bluetoothLowEnergyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Characteristic extends js.Object {
  /** Returns the identifier assigned to this characteristic. Use the instance ID to distinguish between characteristics from a peripheral with the same UUID and to make function calls that take in a characteristic identifier. Present, if this instance represents a remote characteristic. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** The properties of this characteristic. */
  var properties: js.Array[CharacteristicProperties]
  /** The GATT service this characteristic belongs to. */
  var service: js.UndefOr[Service] = js.undefined
  /** The UUID of the characteristic, e.g. 00002a37-0000-1000-8000-00805f9b34fb. */
  var uuid: java.lang.String
  /** The currently cached characteristic value. This value gets updated when the value of the characteristic is read or updated via a notification or indication. */
  var value: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
}

