package typings.cordovaDashPluginDashIbeacon.cordovaDashPluginDashIbeaconMod._Global_.BeaconPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacon extends js.Object {
  var accuracy: Double
  var major: String
  var minor: String
  var proximity: String
  var rssi: Double
  var tx: Double
  var uuid: String
}

object Beacon {
  @scala.inline
  def apply(
    accuracy: Double,
    major: String,
    minor: String,
    proximity: String,
    rssi: Double,
    tx: Double,
    uuid: String
  ): Beacon = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, major = major, minor = minor, proximity = proximity, rssi = rssi, tx = tx, uuid = uuid)
  
    __obj.asInstanceOf[Beacon]
  }
}

