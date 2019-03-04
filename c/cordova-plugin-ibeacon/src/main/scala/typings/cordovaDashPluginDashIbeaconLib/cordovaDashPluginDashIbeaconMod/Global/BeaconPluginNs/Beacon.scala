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
    val __obj = js.Dynamic.literal(accuracy = accuracy, major = major, minor = minor, proximity = proximity, rssi = rssi, tx = tx, uuid = uuid)
  
    __obj.asInstanceOf[Beacon]
  }
}

