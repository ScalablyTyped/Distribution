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
  def apply(
    DirectoryId: DirectoryId = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null,
    SnapshotIds: SnapshotIds = null
  ): DescribeSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SnapshotIds != null) __obj.updateDynamic("SnapshotIds")(SnapshotIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotsRequest]
  }
}

