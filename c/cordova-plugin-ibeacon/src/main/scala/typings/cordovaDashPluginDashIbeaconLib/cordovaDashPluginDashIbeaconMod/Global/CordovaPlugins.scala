package typings
package cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var locationManager: cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs.LocationManager
}

object CordovaPlugins {
  @scala.inline
  def apply(
    locationManager: cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs.LocationManager
  ): CordovaPlugins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("locationManager")(locationManager)
    __obj.asInstanceOf[CordovaPlugins]
  }
}

