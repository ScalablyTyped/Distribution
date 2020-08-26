package typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod

import typings.awsSdkClientPinpointBrowser.typesGpscoordinatesMod.GPSCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPSPointDimension extends js.Object {
  /**
    * Coordinate to measure distance from.
    */
  var Coordinates: js.UndefOr[GPSCoordinates] = js.native
  /**
    * Range in kilometers from the coordinate.
    */
  var RangeInKilometers: js.UndefOr[Double] = js.native
}

object GPSPointDimension {
  @scala.inline
  def apply(): GPSPointDimension = {
    val __obj = js.Dynamic.literal()
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
    def deleteCoordinates: Self = this.set("Coordinates", js.undefined)
    @scala.inline
    def setRangeInKilometers(value: Double): Self = this.set("RangeInKilometers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeInKilometers: Self = this.set("RangeInKilometers", js.undefined)
  }
  
}

