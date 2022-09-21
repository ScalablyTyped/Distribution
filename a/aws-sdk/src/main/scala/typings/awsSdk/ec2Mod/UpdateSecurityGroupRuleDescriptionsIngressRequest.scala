package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityGroupRuleDescriptionsIngressRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
    */
  var GroupId: js.UndefOr[SecurityGroupId] = js.undefined
  
  /**
    * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the security group name in the request.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.undefined
  
  /**
    * The IP permissions for the security group rule. You must specify either IP permissions or a description.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  
  /**
    * [VPC only] The description for the ingress security group rules. You must specify either a description or IP permissions.
    */
  var SecurityGroupRuleDescriptions: js.UndefOr[SecurityGroupRuleDescriptionList] = js.undefined
}
object UpdateSecurityGroupRuleDescriptionsIngressRequest {
  
  inline def apply(): UpdateSecurityGroupRuleDescriptionsIngressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecurityGroupRuleDescriptionsIngressRequest]
  }
  
  extension [Self <: UpdateSecurityGroupRuleDescriptionsIngressRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroupId(value: SecurityGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: SecurityGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setIpPermissions(value: IpPermissionList): Self = StObject.set(x, "IpPermissions", value.asInstanceOf[js.Any])
    
    inline def setIpPermissionsUndefined: Self = StObject.set(x, "IpPermissions", js.undefined)
    
    inline def setIpPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "IpPermissions", js.Array(value*))
    
    inline def setSecurityGroupRuleDescriptions(value: SecurityGroupRuleDescriptionList): Self = StObject.set(x, "SecurityGroupRuleDescriptions", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleDescriptionsUndefined: Self = StObject.set(x, "SecurityGroupRuleDescriptions", js.undefined)
    
    inline def setSecurityGroupRuleDescriptionsVarargs(value: SecurityGroupRuleDescription*): Self = StObject.set(x, "SecurityGroupRuleDescriptions", js.Array(value*))
  }
}
