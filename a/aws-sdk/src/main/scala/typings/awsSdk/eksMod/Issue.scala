package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issue extends StObject {
  
  /**
    * A brief description of the error.    AutoScalingGroupNotFound: We couldn't find the Auto Scaling group associated with the managed node group. You may be able to recreate an Auto Scaling group with the same settings to recover.    Ec2SecurityGroupNotFound: We couldn't find the cluster security group for the cluster. You must recreate your cluster.    Ec2SecurityGroupDeletionFailure: We could not delete the remote access security group for your managed node group. Remove any dependencies from the security group.    Ec2LaunchTemplateNotFound: We couldn't find the Amazon EC2 launch template for your managed node group. You may be able to recreate a launch template with the same settings to recover.    Ec2LaunchTemplateVersionMismatch: The Amazon EC2 launch template version for your managed node group does not match the version that Amazon EKS created. You may be able to revert to the version that Amazon EKS created to recover.    Ec2SubnetInvalidConfiguration: One or more Amazon EC2 subnets specified for a node group do not automatically assign public IP addresses to instances launched into it. If you want your instances to be assigned a public IP address, then you need to enable the auto-assign public IP address setting for the subnet. See Modifying the public IPv4 addressing attribute for your subnet in the Amazon VPC User Guide.    IamInstanceProfileNotFound: We couldn't find the IAM instance profile for your managed node group. You may be able to recreate an instance profile with the same settings to recover.    IamNodeRoleNotFound: We couldn't find the IAM role for your managed node group. You may be able to recreate an IAM role with the same settings to recover.    AsgInstanceLaunchFailures: Your Auto Scaling group is experiencing failures while attempting to launch instances.    NodeCreationFailure: Your launched instances are unable to register with your Amazon EKS cluster. Common causes of this failure are insufficient worker node IAM role permissions or lack of outbound internet access for the nodes.     InstanceLimitExceeded: Your AWS account is unable to launch any more instances of the specified instance type. You may be able to request an Amazon EC2 instance limit increase to recover.    InsufficientFreeAddresses: One or more of the subnets associated with your managed node group does not have enough available IP addresses for new nodes.    AccessDenied: Amazon EKS or one or more of your managed nodes is unable to communicate with your cluster API server.    InternalFailure: These errors are usually caused by an Amazon EKS server-side issue.  
    */
  var code: js.UndefOr[NodegroupIssueCode] = js.undefined
  
  /**
    * The error message associated with the issue.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS resources that are afflicted by this issue.
    */
  var resourceIds: js.UndefOr[StringList] = js.undefined
}
object Issue {
  
  inline def apply(): Issue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Issue]
  }
  
  extension [Self <: Issue](x: Self) {
    
    inline def setCode(value: NodegroupIssueCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResourceIds(value: StringList): Self = StObject.set(x, "resourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "resourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: String*): Self = StObject.set(x, "resourceIds", js.Array(value :_*))
  }
}
