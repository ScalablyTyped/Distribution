package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackListMessage extends js.Object {
  /**
    * A list of maintenance tracks output by the DescribeClusterTracks operation. 
    */
  var MaintenanceTracks: js.UndefOr[TrackList] = js.native
  /**
    * The starting point to return a set of response tracklist records. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.
    */
  var Marker: js.UndefOr[String] = js.native
}

object TrackListMessage {
  @scala.inline
  def apply(): TrackListMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackListMessage]
  }
  @scala.inline
  implicit class TrackListMessageOps[Self <: TrackListMessage] (val x: Self) extends AnyVal {
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
    def setMaintenanceTracksVarargs(value: MaintenanceTrack*): Self = this.set("MaintenanceTracks", js.Array(value :_*))
    @scala.inline
    def setMaintenanceTracks(value: TrackList): Self = this.set("MaintenanceTracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceTracks: Self = this.set("MaintenanceTracks", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

