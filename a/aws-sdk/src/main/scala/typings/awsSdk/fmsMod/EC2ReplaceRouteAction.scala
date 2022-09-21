package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2ReplaceRouteAction extends StObject {
  
  /**
    * A description of the ReplaceRoute action in Amazon EC2.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * Information about the IPv4 CIDR address block used for the destination match. The value that you provide must match the CIDR of an existing route in the table.
    */
  var DestinationCidrBlock: js.UndefOr[CIDR] = js.undefined
  
  /**
    * Information about the IPv6 CIDR address block used for the destination match. The value that you provide must match the CIDR of an existing route in the table.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[CIDR] = js.undefined
  
  /**
    * Information about the ID of the prefix list for the route.
    */
  var DestinationPrefixListId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Information about the ID of an internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[ActionTarget] = js.undefined
  
  /**
    * Information about the ID of the route table.
    */
  var RouteTableId: ActionTarget
}
object EC2ReplaceRouteAction {
  
  inline def apply(RouteTableId: ActionTarget): EC2ReplaceRouteAction = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2ReplaceRouteAction]
  }
  
  extension [Self <: EC2ReplaceRouteAction](x: Self) {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationCidrBlock(value: CIDR): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setDestinationIpv6CidrBlock(value: CIDR): Self = StObject.set(x, "DestinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "DestinationIpv6CidrBlock", js.undefined)
    
    inline def setDestinationPrefixListId(value: ResourceId): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    inline def setGatewayId(value: ActionTarget): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setRouteTableId(value: ActionTarget): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
  }
}
