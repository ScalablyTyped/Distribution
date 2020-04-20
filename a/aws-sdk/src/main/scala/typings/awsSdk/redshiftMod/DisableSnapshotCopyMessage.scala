package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableSnapshotCopyMessage extends js.Object {
  /**
    * The unique identifier of the source cluster that you want to disable copying of snapshots to a destination region. Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
    */
  var ClusterIdentifier: String = js.native
}

object DisableSnapshotCopyMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): DisableSnapshotCopyMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableSnapshotCopyMessage]
  }
}

