package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.getLocationBeacons()
trait LocationBeacon extends js.Object {
  var id: scala.Double
  var latitude: scala.Double
  var longitude: scala.Double
  var pushMessage: java.lang.String
}

object LocationBeacon {
  @scala.inline
  def apply(id: scala.Double, latitude: scala.Double, longitude: scala.Double, pushMessage: java.lang.String): LocationBeacon = {
    val __obj = js.Dynamic.literal(id = id, latitude = latitude, longitude = longitude, pushMessage = pushMessage)
  
    __obj.asInstanceOf[LocationBeacon]
  }
}

