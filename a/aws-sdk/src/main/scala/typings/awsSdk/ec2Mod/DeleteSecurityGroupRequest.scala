package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSecurityGroupRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the security group. Required for a nondefault VPC.
    */
  var GroupId: js.UndefOr[SecurityGroupId] = js.undefined
  
  /**
    * [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name or the security group ID.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.undefined
}
object DeleteSecurityGroupRequest {
  
  inline def apply(): DeleteSecurityGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSecurityGroupRequest]
  }
  
  extension [Self <: DeleteSecurityGroupRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroupId(value: SecurityGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: SecurityGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
