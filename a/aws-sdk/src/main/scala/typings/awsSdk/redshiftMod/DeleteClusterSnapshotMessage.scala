package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterSnapshotMessage extends js.Object {
  /**
    * The unique identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints: Must be the name of valid cluster.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the manual snapshot to be deleted. Constraints: Must be the name of an existing snapshot that is in the available, failed, or cancelled state.
    */
  var SnapshotIdentifier: String = js.native
}

object DeleteClusterSnapshotMessage {
  @scala.inline
  def apply(SnapshotIdentifier: String, SnapshotClusterIdentifier: String = null): DeleteClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    if (SnapshotClusterIdentifier != null) __obj.updateDynamic("SnapshotClusterIdentifier")(SnapshotClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSnapshotMessage]
  }
}

