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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], pushMessage = pushMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBeacon]
  }
}

