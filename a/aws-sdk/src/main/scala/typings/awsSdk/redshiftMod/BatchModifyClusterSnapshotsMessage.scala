package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchModifyClusterSnapshotsMessage extends js.Object {
  /**
    * A boolean value indicating whether to override an exception if the retention period has passed. 
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot is retained indefinitely. The number must be either -1 or an integer between 1 and 3,653. If you decrease the manual snapshot retention period from its current value, existing manual snapshots that fall outside of the new retention period will return an error. If you want to suppress the errors and delete the snapshots, use the force option. 
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of snapshot identifiers you want to modify.
    */
  var SnapshotIdentifierList: typings.awsSdk.redshiftMod.SnapshotIdentifierList = js.native
}

object BatchModifyClusterSnapshotsMessage {
  @scala.inline
  def apply(
    SnapshotIdentifierList: SnapshotIdentifierList,
    Force: js.UndefOr[Boolean] = js.undefined,
    ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  ): BatchModifyClusterSnapshotsMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifierList = SnapshotIdentifierList.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ManualSnapshotRetentionPeriod)) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchModifyClusterSnapshotsMessage]
  }
}

