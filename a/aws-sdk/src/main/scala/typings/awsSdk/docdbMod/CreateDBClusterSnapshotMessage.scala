package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterSnapshotMessage extends js.Object {
  /**
    * The identifier of the cluster to create a snapshot for. This parameter is not case sensitive. Constraints:   Must match the identifier of an existing DBCluster.   Example: my-cluster 
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The identifier of the cluster snapshot. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-snapshot1 
    */
  var DBClusterSnapshotIdentifier: String = js.native
  /**
    * The tags to be assigned to the cluster snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBClusterSnapshotMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, DBClusterSnapshotIdentifier: String, Tags: TagList = null): CreateDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterSnapshotMessage]
  }
}

