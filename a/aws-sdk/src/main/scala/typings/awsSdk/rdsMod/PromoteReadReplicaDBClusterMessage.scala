package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteReadReplicaDBClusterMessage extends js.Object {
  /**
    * The identifier of the DB cluster read replica to promote. This parameter isn't case-sensitive.  Constraints:   Must match the identifier of an existing DB cluster read replica.   Example: my-cluster-replica1 
    */
  var DBClusterIdentifier: String = js.native
}

object PromoteReadReplicaDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): PromoteReadReplicaDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromoteReadReplicaDBClusterMessage]
  }
}

