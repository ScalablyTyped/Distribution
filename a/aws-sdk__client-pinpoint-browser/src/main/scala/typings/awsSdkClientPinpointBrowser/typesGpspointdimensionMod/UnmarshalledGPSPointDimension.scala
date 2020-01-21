package typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod

import typings.awsSdkClientPinpointBrowser.typesGpscoordinatesMod.UnmarshalledGPSCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGPSPointDimension extends GPSPointDimension {
  /**
    * Coordinate to measure distance from.
    */
  @JSName("Coordinates")
  var Coordinates_UnmarshalledGPSPointDimension: js.UndefOr[UnmarshalledGPSCoordinates] = js.undefined
}

object UnmarshalledGPSPointDimension {
  @scala.inline
  def apply(Coordinates: UnmarshalledGPSCoordinates = null, RangeInKilometers: Int | Double = null): UnmarshalledGPSPointDimension = {
    val __obj = js.Dynamic.literal()
    if (Coordinates != null) __obj.updateDynamic("Coordinates")(Coordinates.asInstanceOf[js.Any])
    if (RangeInKilometers != null) __obj.updateDynamic("RangeInKilometers")(RangeInKilometers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGPSPointDimension]
  }
}

