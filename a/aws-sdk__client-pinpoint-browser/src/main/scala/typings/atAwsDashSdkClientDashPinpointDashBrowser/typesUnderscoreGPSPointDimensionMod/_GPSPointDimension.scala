package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGPSPointDimensionMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGPSCoordinatesMod._GPSCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GPSPointDimension extends js.Object {
  /**
    * Coordinate to measure distance from.
    */
  var Coordinates: js.UndefOr[_GPSCoordinates] = js.undefined
  /**
    * Range in kilometers from the coordinate.
    */
  var RangeInKilometers: js.UndefOr[Double] = js.undefined
}

object _GPSPointDimension {
  @scala.inline
  def apply(Coordinates: _GPSCoordinates = null, RangeInKilometers: Int | Double = null): _GPSPointDimension = {
    val __obj = js.Dynamic.literal()
    if (Coordinates != null) __obj.updateDynamic("Coordinates")(Coordinates.asInstanceOf[js.Any])
    if (RangeInKilometers != null) __obj.updateDynamic("RangeInKilometers")(RangeInKilometers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_GPSPointDimension]
  }
}

