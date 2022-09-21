package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyEndpointAccessMessage extends StObject {
  
  /**
    * The endpoint to be modified.
    */
  var EndpointName: String
  
  /**
    * The complete list of VPC security groups associated with the endpoint after the endpoint is modified.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object ModifyEndpointAccessMessage {
  
  inline def apply(EndpointName: String): ModifyEndpointAccessMessage = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEndpointAccessMessage]
  }
  
  extension [Self <: ModifyEndpointAccessMessage](x: Self) {
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
  }
}
