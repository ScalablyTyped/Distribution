package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.getGeoLocation()
trait GeoLocationResult extends js.Object {
  var latitude: Double
  var longitude: Double
}

object GeoLocationResult {
  @scala.inline
  def apply(latitude: Double, longitude: Double): GeoLocationResult = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[GeoLocationResult]
  }
}

