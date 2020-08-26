package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issue extends js.Object {
  /**
    * A brief description of the error.    AutoScalingGroupNotFound: We couldn't find the Auto Scaling group associated with the managed node group. You may be able to recreate an Auto Scaling group with the same settings to recover.    Ec2SecurityGroupNotFound: We couldn't find the cluster security group for the cluster. You must recreate your cluster.    Ec2SecurityGroupDeletionFailure: We could not delete the remote access security group for your managed node group. Remove any dependencies from the security group.    Ec2LaunchTemplateNotFound: We couldn't find the Amazon EC2 launch template for your managed node group. You may be able to recreate a launch template with the same settings to recover.    Ec2LaunchTemplateVersionMismatch: The Amazon EC2 launch template version for your managed node group does not match the version that Amazon EKS created. You may be able to revert to the version that Amazon EKS created to recover.    IamInstanceProfileNotFound: We couldn't find the IAM instance profile for your managed node group. You may be able to recreate an instance profile with the same settings to recover.    IamNodeRoleNotFound: We couldn't find the IAM role for your managed node group. You may be able to recreate an IAM role with the same settings to recover.    AsgInstanceLaunchFailures: Your Auto Scaling group is experiencing failures while attempting to launch instances.    NodeCreationFailure: Your launched instances are unable to register with your Amazon EKS cluster. Common causes of this failure are insufficient worker node IAM role permissions or lack of outbound internet access for the nodes.     InstanceLimitExceeded: Your AWS account is unable to launch any more instances of the specified instance type. You may be able to request an Amazon EC2 instance limit increase to recover.    InsufficientFreeAddresses: One or more of the subnets associated with your managed node group does not have enough available IP addresses for new nodes.    AccessDenied: Amazon EKS or one or more of your managed nodes is unable to communicate with your cluster API server.    InternalFailure: These errors are usually caused by an Amazon EKS server-side issue.  
    */
  var code: js.UndefOr[NodegroupIssueCode] = js.native
  /**
    * The error message associated with the issue.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The AWS resources that are afflicted by this issue.
    */
  var resourceIds: js.UndefOr[StringList] = js.native
}

object Issue {
  @scala.inline
  def apply(): Issue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Issue]
  }
  @scala.inline
  implicit class IssueOps[Self <: Issue] (val x: Self) extends AnyVal {
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
    def setCode(value: NodegroupIssueCode): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setResourceIdsVarargs(value: String*): Self = this.set("resourceIds", js.Array(value :_*))
    @scala.inline
    def setResourceIds(value: StringList): Self = this.set("resourceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIds: Self = this.set("resourceIds", js.undefined)
  }
  
}

