package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchModifyClusterSnapshotsOutputMessage extends js.Object {
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.native
  /**
    * A list of the snapshots that were modified.
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.native
}

object BatchModifyClusterSnapshotsOutputMessage {
  @scala.inline
  def apply(Errors: BatchSnapshotOperationErrors = null, Resources: SnapshotIdentifierList = null): BatchModifyClusterSnapshotsOutputMessage = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchModifyClusterSnapshotsOutputMessage]
  }
}

