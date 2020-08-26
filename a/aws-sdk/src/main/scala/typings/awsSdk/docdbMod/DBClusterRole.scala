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
    * Describes the state of association between the IAM role and the cluster. The Status property returns one of the following values:    ACTIVE - The IAM role ARN is associated with the cluster and can be used to access other AWS services on your behalf.    PENDING - The IAM role ARN is being associated with the DB cluster.    INVALID - The IAM role ARN is associated with the cluster, but the cluster cannot assume the IAM role to access other AWS services on your behalf.  
    */
  var Status: js.UndefOr[String] = js.native
}

object DBClusterRole {
  @scala.inline
  def apply(): DBClusterRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterRole]
  }
  @scala.inline
  implicit class DBClusterRoleOps[Self <: DBClusterRole] (val x: Self) extends AnyVal {
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
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

