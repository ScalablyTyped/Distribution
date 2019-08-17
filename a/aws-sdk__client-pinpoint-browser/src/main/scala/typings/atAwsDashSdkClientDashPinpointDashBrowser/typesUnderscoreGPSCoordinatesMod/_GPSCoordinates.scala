package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGPSCoordinatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GPSCoordinates extends js.Object {
  /**
    * Latitude
    */
  var Latitude: js.UndefOr[Double] = js.undefined
  /**
    * Longitude
    */
  var Longitude: js.UndefOr[Double] = js.undefined
}

object _GPSCoordinates {
  @scala.inline
  def apply(Latitude: Int | Double = null, Longitude: Int | Double = null): _GPSCoordinates = {
    val __obj = js.Dynamic.literal()
    if (Latitude != null) __obj.updateDynamic("Latitude")(Latitude.asInstanceOf[js.Any])
    if (Longitude != null) __obj.updateDynamic("Longitude")(Longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[_GPSCoordinates]
  }
}

