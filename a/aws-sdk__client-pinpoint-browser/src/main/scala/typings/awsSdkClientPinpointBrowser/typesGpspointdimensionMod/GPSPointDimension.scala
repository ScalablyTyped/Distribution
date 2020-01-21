package typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod

import typings.awsSdkClientPinpointBrowser.typesGpscoordinatesMod.GPSCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPSPointDimension extends js.Object {
  /**
    * Coordinate to measure distance from.
    */
  var Coordinates: js.UndefOr[GPSCoordinates] = js.undefined
  /**
    * Range in kilometers from the coordinate.
    */
  var RangeInKilometers: js.UndefOr[Double] = js.undefined
}

object GPSPointDimension {
  @scala.inline
  def apply(Coordinates: GPSCoordinates = null, RangeInKilometers: Int | Double = null): GPSPointDimension = {
    val __obj = js.Dynamic.literal()
    if (Coordinates != null) __obj.updateDynamic("Coordinates")(Coordinates.asInstanceOf[js.Any])
    if (RangeInKilometers != null) __obj.updateDynamic("RangeInKilometers")(RangeInKilometers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSPointDimension]
  }
}

