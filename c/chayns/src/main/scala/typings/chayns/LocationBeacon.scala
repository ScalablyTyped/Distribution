package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.getLocationBeacons()
trait LocationBeacon extends js.Object {
  var id: Double
  var latitude: Double
  var longitude: Double
  var pushMessage: String
}

object LocationBeacon {
  @scala.inline
  def apply(id: Double, latitude: Double, longitude: Double, pushMessage: String): LocationBeacon = {
    val __obj = js.Dynamic.literal(id = id, latitude = latitude, longitude = longitude, pushMessage = pushMessage)
  
    __obj.asInstanceOf[LocationBeacon]
  }
}

