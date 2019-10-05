package typings.cordovaDashPluginDashDeviceDashName

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  /**
    * cordova-plugin-device-name interface
    */
  var deviceName: typings.cordovaDashPluginDashDeviceDashName.CordovaPluginDeviceName.CordovaPluginDeviceName
}

object CordovaPlugins {
  @scala.inline
  def apply(
    deviceName: typings.cordovaDashPluginDashDeviceDashName.CordovaPluginDeviceName.CordovaPluginDeviceName
  ): CordovaPlugins = {
    val __obj = js.Dynamic.literal(deviceName = deviceName)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

