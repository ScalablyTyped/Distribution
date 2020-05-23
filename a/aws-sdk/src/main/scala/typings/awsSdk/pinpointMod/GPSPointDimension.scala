package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPSPointDimension extends js.Object {
  /**
    * The GPS coordinates to measure distance from.
    */
  var Coordinates: GPSCoordinates = js.native
  /**
    * The range, in kilometers, from the GPS coordinates.
    */
  var RangeInKilometers: js.UndefOr[double] = js.native
}

object GPSPointDimension {
  @scala.inline
  def apply(Coordinates: GPSCoordinates, RangeInKilometers: js.UndefOr[double] = js.undefined): GPSPointDimension = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any])
    if (!js.isUndefined(RangeInKilometers)) __obj.updateDynamic("RangeInKilometers")(RangeInKilometers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSPointDimension]
  }
}

