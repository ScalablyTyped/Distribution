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
  def apply(Coordinates: GPSCoordinates): GPSPointDimension = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSPointDimension]
  }
  @scala.inline
  implicit class GPSPointDimensionOps[Self <: GPSPointDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoordinates(value: GPSCoordinates): Self = this.set("Coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeInKilometers(value: double): Self = this.set("RangeInKilometers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeInKilometers: Self = this.set("RangeInKilometers", js.undefined)
  }
  
}

