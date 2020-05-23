package typings.awsSdkClientPinpointBrowser.typesGpscoordinatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPSCoordinates extends js.Object {
  /**
    * Latitude
    */
  var Latitude: js.UndefOr[Double] = js.undefined
  /**
    * Longitude
    */
  var Longitude: js.UndefOr[Double] = js.undefined
}

object GPSCoordinates {
  @scala.inline
  def apply(Latitude: js.UndefOr[Double] = js.undefined, Longitude: js.UndefOr[Double] = js.undefined): GPSCoordinates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Latitude)) __obj.updateDynamic("Latitude")(Latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Longitude)) __obj.updateDynamic("Longitude")(Longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSCoordinates]
  }
}

