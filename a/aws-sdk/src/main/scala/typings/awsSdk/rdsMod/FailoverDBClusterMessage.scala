package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailoverDBClusterMessage extends js.Object {
  /**
    * A DB cluster identifier to force a failover for. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The name of the instance to promote to the primary instance. You must specify the instance identifier for an Aurora Replica in the DB cluster. For example, mydbcluster-replica1.
    */
  var TargetDBInstanceIdentifier: js.UndefOr[String] = js.native
}

object FailoverDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, TargetDBInstanceIdentifier: String = null): FailoverDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    if (TargetDBInstanceIdentifier != null) __obj.updateDynamic("TargetDBInstanceIdentifier")(TargetDBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverDBClusterMessage]
  }
}

