package typings.cordovaPluginDeviceName.CordovaPluginDeviceName

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginDeviceName extends js.Object {
  /**
    * User-friendly name of the device.
    * @example cordova.plugins.deviceName.name // e.g: Larry's Android
    */
  var name: String
}

object CordovaPluginDeviceName {
  @scala.inline
  def apply(name: String): CordovaPluginDeviceName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPluginDeviceName]
  }
}

