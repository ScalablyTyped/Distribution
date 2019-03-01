package typings
package cordovaDashPluginDashDeviceDashNameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  /**
    * cordova-plugin-device-name interface
    */
  var deviceName: cordovaDashPluginDashDeviceDashNameLib.CordovaPluginDeviceNameNs.CordovaPluginDeviceName
}

object CordovaPlugins {
  @scala.inline
  def apply(
    deviceName: cordovaDashPluginDashDeviceDashNameLib.CordovaPluginDeviceNameNs.CordovaPluginDeviceName
  ): CordovaPlugins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceName")(deviceName)
    __obj.asInstanceOf[CordovaPlugins]
  }
}

