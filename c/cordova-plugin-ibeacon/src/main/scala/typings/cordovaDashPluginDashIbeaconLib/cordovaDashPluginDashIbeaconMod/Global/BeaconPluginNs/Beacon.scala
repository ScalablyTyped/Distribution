package typings
package cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacon extends js.Object {
  var accuracy: scala.Double
  var major: java.lang.String
  var minor: java.lang.String
  var proximity: java.lang.String
  var rssi: scala.Double
  var tx: scala.Double
  var uuid: java.lang.String
}

object Beacon {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    major: java.lang.String,
    minor: java.lang.String,
    proximity: java.lang.String,
    rssi: scala.Double,
    tx: scala.Double,
    uuid: java.lang.String
  ): Beacon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("proximity")(proximity)
    __obj.updateDynamic("rssi")(rssi)
    __obj.updateDynamic("tx")(tx)
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[Beacon]
  }
}

