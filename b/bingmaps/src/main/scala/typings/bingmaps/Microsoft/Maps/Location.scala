package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** The location north or south of the equator from +90 to -90 */
  var latitude: Double
  /** The location east or west of the prime meridian +180 to -180 */
  var longitude: Double
}

object Location {
  @scala.inline
  def apply(latitude: Double, longitude: Double): Location = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

