package typings.cordovaPluginIbeacon.mod.global

import typings.cordovaPluginIbeacon.mod.global.BeaconPlugin.LocationManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var locationManager: LocationManager
}

object CordovaPlugins {
  @scala.inline
  def apply(locationManager: LocationManager): CordovaPlugins = {
    val __obj = js.Dynamic.literal(locationManager = locationManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
}

