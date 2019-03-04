package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.getGeoLocation()
trait GeoLocationResult extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object GeoLocationResult {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): GeoLocationResult = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[GeoLocationResult]
  }
}

