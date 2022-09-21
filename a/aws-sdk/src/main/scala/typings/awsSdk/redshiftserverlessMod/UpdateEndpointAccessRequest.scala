package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointAccessRequest extends StObject {
  
  /**
    * The name of the VPC endpoint to update.
    */
  var endpointName: String
  
  /**
    * The list of VPC security groups associated with the endpoint after the endpoint is modified.
    */
  var vpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object UpdateEndpointAccessRequest {
  
  inline def apply(endpointName: String): UpdateEndpointAccessRequest = {
    val __obj = js.Dynamic.literal(endpointName = endpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointAccessRequest]
  }
  
  extension [Self <: UpdateEndpointAccessRequest](x: Self) {
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "endpointName", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: VpcSecurityGroupId*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value*))
  }
}
