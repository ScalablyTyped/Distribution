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
  def apply(DBClusterIdentifier: String): FailoverDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverDBClusterMessage]
  }
  @scala.inline
  implicit class FailoverDBClusterMessageOps[Self <: FailoverDBClusterMessage] (val x: Self) extends AnyVal {
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
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDBInstanceIdentifier(value: String): Self = this.set("TargetDBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetDBInstanceIdentifier: Self = this.set("TargetDBInstanceIdentifier", js.undefined)
  }
  
}

