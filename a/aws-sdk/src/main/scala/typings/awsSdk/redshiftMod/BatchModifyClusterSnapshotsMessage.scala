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
  def apply(SnapshotIdentifierList: SnapshotIdentifierList): BatchModifyClusterSnapshotsMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifierList = SnapshotIdentifierList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchModifyClusterSnapshotsMessage]
  }
  @scala.inline
  implicit class BatchModifyClusterSnapshotsMessageOps[Self <: BatchModifyClusterSnapshotsMessage] (val x: Self) extends AnyVal {
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
    def setSnapshotIdentifierListVarargs(value: String*): Self = this.set("SnapshotIdentifierList", js.Array(value :_*))
    @scala.inline
    def setSnapshotIdentifierList(value: SnapshotIdentifierList): Self = this.set("SnapshotIdentifierList", value.asInstanceOf[js.Any])
    @scala.inline
    def setForce(value: Boolean): Self = this.set("Force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("Force", js.undefined)
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
  }
  
}

