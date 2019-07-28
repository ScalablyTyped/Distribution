package typings.cordovaDashPluginDashDeviceDashName

import typings.cordovaDashPluginDashDeviceDashName.CordovaPluginDeviceNameNs.CordovaPluginDeviceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  /**
    * cordova-plugin-device-name interface
    */
  var deviceName: CordovaPluginDeviceName
}

object CordovaPlugins {
  @scala.inline
  def apply(deviceName: CordovaPluginDeviceName): CordovaPlugins = {
    val __obj = js.Dynamic.literal(deviceName = deviceName)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

