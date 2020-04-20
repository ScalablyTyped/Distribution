package typings.cordovaPluginDeviceName

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  /**
    * cordova-plugin-device-name interface
    */
  var deviceName: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName
}

object CordovaPlugins {
  @scala.inline
  def apply(deviceName: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName): CordovaPlugins = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
}

