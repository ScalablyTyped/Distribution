package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallUnexpectedFirewallRoutesViolation extends StObject {
  
  /**
    * The endpoint of the firewall.
    */
  var FirewallEndpoint: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The subnet ID for the firewall.
    */
  var FirewallSubnetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The routes that are in violation.
    */
  var ViolatingRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * Information about the VPC ID.
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object NetworkFirewallUnexpectedFirewallRoutesViolation {
  
  inline def apply(): NetworkFirewallUnexpectedFirewallRoutesViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallUnexpectedFirewallRoutesViolation]
  }
  
  extension [Self <: NetworkFirewallUnexpectedFirewallRoutesViolation](x: Self) {
    
    inline def setFirewallEndpoint(value: ResourceId): Self = StObject.set(x, "FirewallEndpoint", value.asInstanceOf[js.Any])
    
    inline def setFirewallEndpointUndefined: Self = StObject.set(x, "FirewallEndpoint", js.undefined)
    
    inline def setFirewallSubnetId(value: ResourceId): Self = StObject.set(x, "FirewallSubnetId", value.asInstanceOf[js.Any])
    
    inline def setFirewallSubnetIdUndefined: Self = StObject.set(x, "FirewallSubnetId", js.undefined)
    
    inline def setRouteTableId(value: ResourceId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setViolatingRoutes(value: Routes): Self = StObject.set(x, "ViolatingRoutes", value.asInstanceOf[js.Any])
    
    inline def setViolatingRoutesUndefined: Self = StObject.set(x, "ViolatingRoutes", js.undefined)
    
    inline def setViolatingRoutesVarargs(value: Route*): Self = StObject.set(x, "ViolatingRoutes", js.Array(value*))
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
