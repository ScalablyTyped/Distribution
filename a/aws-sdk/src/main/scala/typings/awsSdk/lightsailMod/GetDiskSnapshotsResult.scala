package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskSnapshotsResult extends js.Object {
  /**
    * An array of objects containing information about all block storage disk snapshots.
    */
  var diskSnapshots: js.UndefOr[DiskSnapshotList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDiskSnapshots request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetDiskSnapshotsResult {
  @scala.inline
  def apply(diskSnapshots: DiskSnapshotList = null, nextPageToken: String = null): GetDiskSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (diskSnapshots != null) __obj.updateDynamic("diskSnapshots")(diskSnapshots.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiskSnapshotsResult]
  }
}

