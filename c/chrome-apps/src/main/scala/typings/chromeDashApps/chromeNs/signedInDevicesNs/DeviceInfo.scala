package typings.chromeDashApps.chromeNs.signedInDevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInfo extends js.Object {
  /** Version of chrome running in this device. */
  var chromeVersion: String
  /**
    * Unique Id for this device.
    * Note: The id is meaningful only in the current device.
    * This id cannot be used to refer to the same device from
    * another device or extension.
    */
  var id: String
  /**
    * Name of the device.
    * This name is usually set by the user when setting up a device.
    */
  var name: String
  /** The OS of the device. */
  var os: OS
  /** Device type */
  var `type`: DeviceType
}

object DeviceInfo {
  @scala.inline
  def apply(chromeVersion: String, id: String, name: String, os: OS, `type`: DeviceType): DeviceInfo = {
    val __obj = js.Dynamic.literal(chromeVersion = chromeVersion, id = id, name = name, os = os)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeviceInfo]
  }
}

