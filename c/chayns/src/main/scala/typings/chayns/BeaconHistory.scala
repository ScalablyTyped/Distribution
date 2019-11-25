package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.getBeaconHistory()
trait BeaconHistory extends js.Object {
  var id: Double
  var timestamp: Double
}

object BeaconHistory {
  @scala.inline
  def apply(id: Double, timestamp: Double): BeaconHistory = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BeaconHistory]
  }
}

