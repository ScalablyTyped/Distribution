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
  def apply(): GetDiskSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskSnapshotsResult]
  }
  @scala.inline
  implicit class GetDiskSnapshotsResultOps[Self <: GetDiskSnapshotsResult] (val x: Self) extends AnyVal {
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
    def setDiskSnapshotsVarargs(value: DiskSnapshot*): Self = this.set("diskSnapshots", js.Array(value :_*))
    @scala.inline
    def setDiskSnapshots(value: DiskSnapshotList): Self = this.set("diskSnapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskSnapshots: Self = this.set("diskSnapshots", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

