package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterIamRole extends js.Object {
  /**
    * A value that describes the status of the IAM role's association with an Amazon Redshift cluster. The following are possible statuses and descriptions.    in-sync: The role is available for use by the cluster.    adding: The role is in the process of being associated with the cluster.    removing: The role is in the process of being disassociated with the cluster.  
    */
  var ApplyStatus: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role, for example, arn:aws:iam::123456789012:role/RedshiftCopyUnload. 
    */
  var IamRoleArn: js.UndefOr[String] = js.native
}

object ClusterIamRole {
  @scala.inline
  def apply(): ClusterIamRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterIamRole]
  }
  @scala.inline
  implicit class ClusterIamRoleOps[Self <: ClusterIamRole] (val x: Self) extends AnyVal {
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
    def setApplyStatus(value: String): Self = this.set("ApplyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyStatus: Self = this.set("ApplyStatus", js.undefined)
    @scala.inline
    def setIamRoleArn(value: String): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
  }
  
}

