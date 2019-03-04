package typings
package cordovaDashPluginDashDeviceDashNameLib.CordovaPluginDeviceNameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginDeviceName extends js.Object {
  /**
    * User-friendly name of the device.
    * @example cordova.plugins.deviceName.name // e.g: Larry's Android
    */
  var name: java.lang.String
}

object CordovaPluginDeviceName {
  @scala.inline
  def apply(name: java.lang.String): CordovaPluginDeviceName = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[CordovaPluginDeviceName]
  }
}

