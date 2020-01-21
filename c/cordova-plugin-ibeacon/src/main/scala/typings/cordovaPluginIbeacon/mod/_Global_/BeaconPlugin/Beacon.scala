package typings.cordovaPluginIbeacon.mod._Global_.BeaconPlugin

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
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Beacon]
  }
}

