package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallInternetTrafficNotInspectedViolation extends StObject {
  
  /**
    * The actual firewall subnet routes.
    */
  var ActualFirewallSubnetRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * The actual internet gateway routes.
    */
  var ActualInternetGatewayRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * Information about the subnet route table for the current firewall.
    */
  var CurrentFirewallSubnetRouteTable: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The current route table for the internet gateway.
    */
  var CurrentInternetGatewayRouteTable: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The expected endpoint for the current firewall.
    */
  var ExpectedFirewallEndpoint: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The firewall subnet routes that are expected.
    */
  var ExpectedFirewallSubnetRoutes: js.UndefOr[ExpectedRoutes] = js.undefined
  
  /**
    * The internet gateway routes that are expected.
    */
  var ExpectedInternetGatewayRoutes: js.UndefOr[ExpectedRoutes] = js.undefined
  
  /**
    * The firewall subnet ID.
    */
  var FirewallSubnetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The internet gateway ID.
    */
  var InternetGatewayId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Information about whether the route table is used in another Availability Zone.
    */
  var IsRouteTableUsedInDifferentAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the route table ID.
    */
  var RouteTableId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The subnet Availability Zone.
    */
  var SubnetAvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The subnet ID.
    */
  var SubnetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The route or routes that are in violation.
    */
  var ViolatingRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * Information about the VPC ID.
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object NetworkFirewallInternetTrafficNotInspectedViolation {
  
  inline def apply(): NetworkFirewallInternetTrafficNotInspectedViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallInternetTrafficNotInspectedViolation]
  }
  
  extension [Self <: NetworkFirewallInternetTrafficNotInspectedViolation](x: Self) {
    
    inline def setActualFirewallSubnetRoutes(value: Routes): Self = StObject.set(x, "ActualFirewallSubnetRoutes", value.asInstanceOf[js.Any])
    
    inline def setActualFirewallSubnetRoutesUndefined: Self = StObject.set(x, "ActualFirewallSubnetRoutes", js.undefined)
    
    inline def setActualFirewallSubnetRoutesVarargs(value: Route*): Self = StObject.set(x, "ActualFirewallSubnetRoutes", js.Array(value*))
    
    inline def setActualInternetGatewayRoutes(value: Routes): Self = StObject.set(x, "ActualInternetGatewayRoutes", value.asInstanceOf[js.Any])
    
    inline def setActualInternetGatewayRoutesUndefined: Self = StObject.set(x, "ActualInternetGatewayRoutes", js.undefined)
    
    inline def setActualInternetGatewayRoutesVarargs(value: Route*): Self = StObject.set(x, "ActualInternetGatewayRoutes", js.Array(value*))
    
    inline def setCurrentFirewallSubnetRouteTable(value: ResourceId): Self = StObject.set(x, "CurrentFirewallSubnetRouteTable", value.asInstanceOf[js.Any])
    
    inline def setCurrentFirewallSubnetRouteTableUndefined: Self = StObject.set(x, "CurrentFirewallSubnetRouteTable", js.undefined)
    
    inline def setCurrentInternetGatewayRouteTable(value: ResourceId): Self = StObject.set(x, "CurrentInternetGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setCurrentInternetGatewayRouteTableUndefined: Self = StObject.set(x, "CurrentInternetGatewayRouteTable", js.undefined)
    
    inline def setExpectedFirewallEndpoint(value: ResourceId): Self = StObject.set(x, "ExpectedFirewallEndpoint", value.asInstanceOf[js.Any])
    
    inline def setExpectedFirewallEndpointUndefined: Self = StObject.set(x, "ExpectedFirewallEndpoint", js.undefined)
    
    inline def setExpectedFirewallSubnetRoutes(value: ExpectedRoutes): Self = StObject.set(x, "ExpectedFirewallSubnetRoutes", value.asInstanceOf[js.Any])
    
    inline def setExpectedFirewallSubnetRoutesUndefined: Self = StObject.set(x, "ExpectedFirewallSubnetRoutes", js.undefined)
    
    inline def setExpectedFirewallSubnetRoutesVarargs(value: ExpectedRoute*): Self = StObject.set(x, "ExpectedFirewallSubnetRoutes", js.Array(value*))
    
    inline def setExpectedInternetGatewayRoutes(value: ExpectedRoutes): Self = StObject.set(x, "ExpectedInternetGatewayRoutes", value.asInstanceOf[js.Any])
    
    inline def setExpectedInternetGatewayRoutesUndefined: Self = StObject.set(x, "ExpectedInternetGatewayRoutes", js.undefined)
    
    inline def setExpectedInternetGatewayRoutesVarargs(value: ExpectedRoute*): Self = StObject.set(x, "ExpectedInternetGatewayRoutes", js.Array(value*))
    
    inline def setFirewallSubnetId(value: ResourceId): Self = StObject.set(x, "FirewallSubnetId", value.asInstanceOf[js.Any])
    
    inline def setFirewallSubnetIdUndefined: Self = StObject.set(x, "FirewallSubnetId", js.undefined)
    
    inline def setInternetGatewayId(value: ResourceId): Self = StObject.set(x, "InternetGatewayId", value.asInstanceOf[js.Any])
    
    inline def setInternetGatewayIdUndefined: Self = StObject.set(x, "InternetGatewayId", js.undefined)
    
    inline def setIsRouteTableUsedInDifferentAZ(value: Boolean): Self = StObject.set(x, "IsRouteTableUsedInDifferentAZ", value.asInstanceOf[js.Any])
    
    inline def setIsRouteTableUsedInDifferentAZUndefined: Self = StObject.set(x, "IsRouteTableUsedInDifferentAZ", js.undefined)
    
    inline def setRouteTableId(value: ResourceId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setSubnetAvailabilityZone(value: LengthBoundedString): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    inline def setSubnetId(value: ResourceId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setViolatingRoutes(value: Routes): Self = StObject.set(x, "ViolatingRoutes", value.asInstanceOf[js.Any])
    
    inline def setViolatingRoutesUndefined: Self = StObject.set(x, "ViolatingRoutes", js.undefined)
    
    inline def setViolatingRoutesVarargs(value: Route*): Self = StObject.set(x, "ViolatingRoutes", js.Array(value*))
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
