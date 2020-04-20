package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPSCoordinates extends js.Object {
  /**
    * The latitude coordinate of the location.
    */
  var Latitude: double = js.native
  /**
    * The longitude coordinate of the location.
    */
  var Longitude: double = js.native
}

object GPSCoordinates {
  @scala.inline
  def apply(Latitude: double, Longitude: double): GPSCoordinates = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSCoordinates]
  }
}

