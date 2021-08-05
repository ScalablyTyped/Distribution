package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDetails extends StObject {
  
  /**
    * ARN to a role needed for connecting streams to your instances. 
    */
  var roleArn: RoleArn
  
  /**
    * The security groups to attach to the elastic network interfaces.
    */
  var securityGroupIds: SecurityGroupIdList
  
  /**
    * A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your instances.
    */
  var subnetIds: SubnetList
}
object SecurityDetails {
  
  inline def apply(roleArn: RoleArn, securityGroupIds: SecurityGroupIdList, subnetIds: SubnetList): SecurityDetails = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDetails]
  }
  
  extension [Self <: SecurityDetails](x: Self) {
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    inline def setSubnetIds(value: SubnetList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
  }
}
