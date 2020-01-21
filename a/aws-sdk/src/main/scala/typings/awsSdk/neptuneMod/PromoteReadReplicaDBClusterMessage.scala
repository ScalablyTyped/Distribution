package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteReadReplicaDBClusterMessage extends js.Object {
  /**
    * Not supported.
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

