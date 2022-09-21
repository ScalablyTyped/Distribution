package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalGatewayRouteTableRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The ID of the local gateway. 
    */
  var LocalGatewayId: typings.awsSdk.ec2Mod.LocalGatewayId
  
  /**
    *  The mode of the local gateway route table. 
    */
  var Mode: js.UndefOr[LocalGatewayRouteTableMode] = js.undefined
  
  /**
    *  The tags assigned to the local gateway route table. 
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateLocalGatewayRouteTableRequest {
  
  inline def apply(LocalGatewayId: LocalGatewayId): CreateLocalGatewayRouteTableRequest = {
    val __obj = js.Dynamic.literal(LocalGatewayId = LocalGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteTableRequest]
  }
  
  extension [Self <: CreateLocalGatewayRouteTableRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLocalGatewayId(value: LocalGatewayId): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    inline def setMode(value: LocalGatewayRouteTableMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
