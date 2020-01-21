package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBClusterSnapshotMessage extends js.Object {
  /**
    * The identifier of the DB cluster snapshot to delete. Constraints: Must be the name of an existing DB cluster snapshot in the available state.
    */
  var DBClusterSnapshotIdentifier: String = js.native
}

object DeleteDBClusterSnapshotMessage {
  @scala.inline
  def apply(DBClusterSnapshotIdentifier: String): DeleteDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDBClusterSnapshotMessage]
  }
}

