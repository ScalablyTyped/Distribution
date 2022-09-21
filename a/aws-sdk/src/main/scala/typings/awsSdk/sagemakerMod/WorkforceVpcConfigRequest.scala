package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkforceVpcConfigRequest extends StObject {
  
  /**
    * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in the subnet.
    */
  var SecurityGroupIds: js.UndefOr[WorkforceSecurityGroupIds] = js.undefined
  
  /**
    * The ID of the subnets in the VPC that you want to connect.
    */
  var Subnets: js.UndefOr[WorkforceSubnets] = js.undefined
  
  /**
    * The ID of the VPC that the workforce uses for communication.
    */
  var VpcId: js.UndefOr[WorkforceVpcId] = js.undefined
}
object WorkforceVpcConfigRequest {
  
  inline def apply(): WorkforceVpcConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkforceVpcConfigRequest]
  }
  
  extension [Self <: WorkforceVpcConfigRequest](x: Self) {
    
    inline def setSecurityGroupIds(value: WorkforceSecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: WorkforceSecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnets(value: WorkforceSubnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: WorkforceSubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setVpcId(value: WorkforceVpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
