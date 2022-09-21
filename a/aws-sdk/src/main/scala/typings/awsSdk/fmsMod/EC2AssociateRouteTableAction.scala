package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2AssociateRouteTableAction extends StObject {
  
  /**
    * A description of the EC2 route table that is associated with the remediation action.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The ID of the gateway to be used with the EC2 route table that is associated with the remediation action.
    */
  var GatewayId: js.UndefOr[ActionTarget] = js.undefined
  
  /**
    * The ID of the EC2 route table that is associated with the remediation action.
    */
  var RouteTableId: ActionTarget
  
  /**
    * The ID of the subnet for the EC2 route table that is associated with the remediation action.
    */
  var SubnetId: js.UndefOr[ActionTarget] = js.undefined
}
object EC2AssociateRouteTableAction {
  
  inline def apply(RouteTableId: ActionTarget): EC2AssociateRouteTableAction = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2AssociateRouteTableAction]
  }
  
  extension [Self <: EC2AssociateRouteTableAction](x: Self) {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGatewayId(value: ActionTarget): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setRouteTableId(value: ActionTarget): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setSubnetId(value: ActionTarget): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
