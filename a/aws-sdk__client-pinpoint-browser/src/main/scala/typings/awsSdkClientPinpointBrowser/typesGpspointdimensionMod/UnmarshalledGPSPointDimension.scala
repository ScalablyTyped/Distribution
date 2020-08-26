package typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod

import typings.awsSdkClientPinpointBrowser.typesGpscoordinatesMod.UnmarshalledGPSCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGPSPointDimension extends GPSPointDimension {
  /**
    * Coordinate to measure distance from.
    */
  @JSName("Coordinates")
  var Coordinates_UnmarshalledGPSPointDimension: js.UndefOr[UnmarshalledGPSCoordinates] = js.native
}

object UnmarshalledGPSPointDimension {
  @scala.inline
  def apply(): UnmarshalledGPSPointDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGPSPointDimension]
  }
  @scala.inline
  implicit class UnmarshalledGPSPointDimensionOps[Self <: UnmarshalledGPSPointDimension] (val x: Self) extends AnyVal {
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
    def setCoordinates(value: UnmarshalledGPSCoordinates): Self = this.set("Coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinates: Self = this.set("Coordinates", js.undefined)
  }
  
}

