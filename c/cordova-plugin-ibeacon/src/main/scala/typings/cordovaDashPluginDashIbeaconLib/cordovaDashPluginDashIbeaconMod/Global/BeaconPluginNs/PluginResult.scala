package typings
package cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginResult extends js.Object {
  var authorizationStatus: java.lang.String
  var beacons: js.Array[Beacon]
  var error: java.lang.String
  var eventType: java.lang.String
  var region: Region
  var state: java.lang.String
}

object PluginResult {
  @scala.inline
  def apply(
    authorizationStatus: java.lang.String,
    beacons: js.Array[Beacon],
    error: java.lang.String,
    eventType: java.lang.String,
    region: Region,
    state: java.lang.String
  ): PluginResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizationStatus")(authorizationStatus)
    __obj.updateDynamic("beacons")(beacons)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("eventType")(eventType)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PluginResult]
  }
}

