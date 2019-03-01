package typings
package chromeDashAppsLib.chromeNs.signedInDevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInfo extends js.Object {
  /** Version of chrome running in this device. */
  var chromeVersion: java.lang.String
  /**
    * Unique Id for this device.
    * Note: The id is meaningful only in the current device.
    * This id cannot be used to refer to the same device from
    * another device or extension.
    */
  var id: java.lang.String
  /**
    * Name of the device.
    * This name is usually set by the user when setting up a device.
    */
  var name: java.lang.String
  /** The OS of the device. */
  var os: OS
  /** Device type */
  var `type`: DeviceType
}

object DeviceInfo {
  @scala.inline
  def apply(
    chromeVersion: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    os: OS,
    `type`: DeviceType
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("chromeVersion")(chromeVersion)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("os")(os)
    __obj.asInstanceOf[DeviceInfo]
  }
}

