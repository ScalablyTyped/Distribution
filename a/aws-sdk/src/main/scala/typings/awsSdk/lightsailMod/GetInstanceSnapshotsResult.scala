package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceSnapshotsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your get instance snapshots request.
    */
  var instanceSnapshots: js.UndefOr[InstanceSnapshotList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetInstanceSnapshots request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetInstanceSnapshotsResult {
  @scala.inline
  def apply(instanceSnapshots: InstanceSnapshotList = null, nextPageToken: String = null): GetInstanceSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (instanceSnapshots != null) __obj.updateDynamic("instanceSnapshots")(instanceSnapshots.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceSnapshotsResult]
  }
}

