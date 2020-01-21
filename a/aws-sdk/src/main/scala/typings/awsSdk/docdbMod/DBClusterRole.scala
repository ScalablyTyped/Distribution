package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterRole extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * Describes the state of association between the IAM role and the DB cluster. The Status property returns one of the following values:    ACTIVE - The IAM role ARN is associated with the DB cluster and can be used to access other AWS services on your behalf.    PENDING - The IAM role ARN is being associated with the DB cluster.    INVALID - The IAM role ARN is associated with the DB cluster, but the DB cluster cannot assume the IAM role to access other AWS services on your behalf.  
    */
  var Status: js.UndefOr[String] = js.native
}

object DBClusterRole {
  @scala.inline
  def apply(RoleArn: String = null, Status: String = null): DBClusterRole = {
    val __obj = js.Dynamic.literal()
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterRole]
  }
}

