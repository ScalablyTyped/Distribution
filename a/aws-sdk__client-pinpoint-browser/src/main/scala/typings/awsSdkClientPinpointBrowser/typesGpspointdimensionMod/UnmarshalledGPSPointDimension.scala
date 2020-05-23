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
  def apply(
    Coordinates: UnmarshalledGPSCoordinates = null,
    RangeInKilometers: js.UndefOr[Double] = js.undefined
  ): UnmarshalledGPSPointDimension = {
    val __obj = js.Dynamic.literal()
    if (Coordinates != null) __obj.updateDynamic("Coordinates")(Coordinates.asInstanceOf[js.Any])
    if (!js.isUndefined(RangeInKilometers)) __obj.updateDynamic("RangeInKilometers")(RangeInKilometers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGPSPointDimension]
  }
}

