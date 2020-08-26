package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentLocation extends js.Object {
  /**
    * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
    */
  var Country: js.UndefOr[SetDimension] = js.native
  /**
    * The GPS location and range for the segment.
    */
  var GPSPoint: js.UndefOr[GPSPointDimension] = js.native
}

object SegmentLocation {
  @scala.inline
  def apply(): SegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentLocation]
  }
  @scala.inline
  implicit class SegmentLocationOps[Self <: SegmentLocation] (val x: Self) extends AnyVal {
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
    def setCountry(value: SetDimension): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    @scala.inline
    def setGPSPoint(value: GPSPointDimension): Self = this.set("GPSPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGPSPoint: Self = this.set("GPSPoint", js.undefined)
  }
  
}

