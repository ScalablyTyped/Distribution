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
  def apply(MaintenanceTracks: TrackList = null, Marker: String = null): TrackListMessage = {
    val __obj = js.Dynamic.literal()
    if (MaintenanceTracks != null) __obj.updateDynamic("MaintenanceTracks")(MaintenanceTracks.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackListMessage]
  }
}

