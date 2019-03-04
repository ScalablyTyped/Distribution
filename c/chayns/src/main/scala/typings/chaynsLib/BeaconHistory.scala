package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.getBeaconHistory()
trait BeaconHistory extends js.Object {
  var id: scala.Double
  var timestamp: scala.Double
}

object BeaconHistory {
  @scala.inline
  def apply(id: scala.Double, timestamp: scala.Double): BeaconHistory = {
    val __obj = js.Dynamic.literal(id = id, timestamp = timestamp)
  
    __obj.asInstanceOf[BeaconHistory]
  }
}

