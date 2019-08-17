package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGPSPointDimensionMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGPSCoordinatesMod._UnmarshalledGPSCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGPSPointDimension extends _GPSPointDimension {
  /**
    * Coordinate to measure distance from.
    */
  @JSName("Coordinates")
  var Coordinates__UnmarshalledGPSPointDimension: js.UndefOr[_UnmarshalledGPSCoordinates] = js.undefined
}

object _UnmarshalledGPSPointDimension {
  @scala.inline
  def apply(Coordinates: _UnmarshalledGPSCoordinates = null, RangeInKilometers: Int | Double = null): _UnmarshalledGPSPointDimension = {
    val __obj = js.Dynamic.literal()
    if (Coordinates != null) __obj.updateDynamic("Coordinates")(Coordinates)
    if (RangeInKilometers != null) __obj.updateDynamic("RangeInKilometers")(RangeInKilometers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledGPSPointDimension]
  }
}

