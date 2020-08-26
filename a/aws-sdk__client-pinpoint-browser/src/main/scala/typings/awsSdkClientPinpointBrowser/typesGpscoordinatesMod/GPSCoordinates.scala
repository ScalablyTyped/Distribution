package typings.awsSdkClientPinpointBrowser.typesGpscoordinatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPSCoordinates extends js.Object {
  /**
    * Latitude
    */
  var Latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude
    */
  var Longitude: js.UndefOr[Double] = js.native
}

object GPSCoordinates {
  @scala.inline
  def apply(): GPSCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPSCoordinates]
  }
  @scala.inline
  implicit class GPSCoordinatesOps[Self <: GPSCoordinates] (val x: Self) extends AnyVal {
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
    def setLatitude(value: Double): Self = this.set("Latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("Latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("Longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("Longitude", js.undefined)
  }
  
}

