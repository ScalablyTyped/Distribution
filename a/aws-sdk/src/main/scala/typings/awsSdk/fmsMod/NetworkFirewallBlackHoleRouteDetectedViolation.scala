package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallBlackHoleRouteDetectedViolation extends StObject {
  
  /**
    * Information about the route table ID.
    */
  var RouteTableId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Information about the route or routes that are in violation.
    */
  var ViolatingRoutes: js.UndefOr[Routes] = js.undefined
  
  /**
    * The subnet that has an inactive state.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.undefined
  
  /**
    * Information about the VPC ID.
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object NetworkFirewallBlackHoleRouteDetectedViolation {
  
  inline def apply(): NetworkFirewallBlackHoleRouteDetectedViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallBlackHoleRouteDetectedViolation]
  }
  
  extension [Self <: NetworkFirewallBlackHoleRouteDetectedViolation](x: Self) {
    
    inline def setRouteTableId(value: ResourceId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setViolatingRoutes(value: Routes): Self = StObject.set(x, "ViolatingRoutes", value.asInstanceOf[js.Any])
    
    inline def setViolatingRoutesUndefined: Self = StObject.set(x, "ViolatingRoutes", js.undefined)
    
    inline def setViolatingRoutesVarargs(value: Route*): Self = StObject.set(x, "ViolatingRoutes", js.Array(value*))
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
