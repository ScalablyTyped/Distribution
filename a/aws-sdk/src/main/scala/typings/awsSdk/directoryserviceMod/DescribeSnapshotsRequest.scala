package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotsRequest extends js.Object {
  /**
    * The identifier of the directory for which to retrieve snapshot information.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The maximum number of objects to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.native
  /**
    * The DescribeSnapshotsResult.NextToken value from a previous call to DescribeSnapshots. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all snapshots are returned using the Limit and NextToken members.
    */
  var SnapshotIds: js.UndefOr[typings.awsSdk.directoryserviceMod.SnapshotIds] = js.native
}

object DescribeSnapshotsRequest {
  @scala.inline
  def apply(): DescribeSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsRequest]
  }
  @scala.inline
  implicit class DescribeSnapshotsRequestOps[Self <: DescribeSnapshotsRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSnapshotIdsVarargs(value: SnapshotId*): Self = this.set("SnapshotIds", js.Array(value :_*))
    @scala.inline
    def setSnapshotIds(value: SnapshotIds): Self = this.set("SnapshotIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotIds: Self = this.set("SnapshotIds", js.undefined)
  }
  
}

