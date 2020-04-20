package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteClusterSnapshotsRequest extends js.Object {
  /**
    * A list of identifiers for the snapshots that you want to delete.
    */
  var Identifiers: DeleteClusterSnapshotMessageList = js.native
}

object BatchDeleteClusterSnapshotsRequest {
  @scala.inline
  def apply(Identifiers: DeleteClusterSnapshotMessageList): BatchDeleteClusterSnapshotsRequest = {
    val __obj = js.Dynamic.literal(Identifiers = Identifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsRequest]
  }
}

