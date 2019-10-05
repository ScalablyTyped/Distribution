package typings.cordovaDashPluginDashIbeacon.cordovaDashPluginDashIbeaconMod.Global.BeaconPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginResult extends js.Object {
  var authorizationStatus: String
  var beacons: js.Array[Beacon]
  var error: String
  var eventType: String
  var region: Region
  var state: String
}

object PluginResult {
  @scala.inline
  def apply(
    authorizationStatus: String,
    beacons: js.Array[Beacon],
    error: String,
    eventType: String,
    region: Region,
    state: String
  ): PluginResult = {
    val __obj = js.Dynamic.literal(authorizationStatus = authorizationStatus, beacons = beacons, error = error, eventType = eventType, region = region, state = state)
  
    __obj.asInstanceOf[PluginResult]
  }
}

