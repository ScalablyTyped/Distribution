package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterTracksMessage extends js.Object {
  /**
    * The name of the maintenance track. 
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterTracks request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * An integer value for the maximum number of maintenance tracks to return.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeClusterTracksMessage {
  @scala.inline
  def apply(): DescribeClusterTracksMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterTracksMessage]
  }
  @scala.inline
  implicit class DescribeClusterTracksMessageOps[Self <: DescribeClusterTracksMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaintenanceTrackName(value: String): Self = this.set("MaintenanceTrackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceTrackName: Self = this.set("MaintenanceTrackName", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
  }
  
}

