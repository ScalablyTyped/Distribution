package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpectedRoute extends StObject {
  
  /**
    * Information about the allowed targets.
    */
  var AllowedTargets: js.UndefOr[LengthBoundedStringList] = js.undefined
  
  /**
    * Information about the contributing subnets.
    */
  var ContributingSubnets: js.UndefOr[ResourceIdList] = js.undefined
  
  /**
    * Information about the IPv4 CIDR block.
    */
  var IpV4Cidr: js.UndefOr[CIDR] = js.undefined
  
  /**
    * Information about the IPv6 CIDR block.
    */
  var IpV6Cidr: js.UndefOr[CIDR] = js.undefined
  
  /**
    * Information about the ID of the prefix list for the route.
    */
  var PrefixListId: js.UndefOr[CIDR] = js.undefined
  
  /**
    * Information about the route table ID.
    */
  var RouteTableId: js.UndefOr[ResourceId] = js.undefined
}
object ExpectedRoute {
  
  inline def apply(): ExpectedRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpectedRoute]
  }
  
  extension [Self <: ExpectedRoute](x: Self) {
    
    inline def setAllowedTargets(value: LengthBoundedStringList): Self = StObject.set(x, "AllowedTargets", value.asInstanceOf[js.Any])
    
    inline def setAllowedTargetsUndefined: Self = StObject.set(x, "AllowedTargets", js.undefined)
    
    inline def setAllowedTargetsVarargs(value: LengthBoundedString*): Self = StObject.set(x, "AllowedTargets", js.Array(value*))
    
    inline def setContributingSubnets(value: ResourceIdList): Self = StObject.set(x, "ContributingSubnets", value.asInstanceOf[js.Any])
    
    inline def setContributingSubnetsUndefined: Self = StObject.set(x, "ContributingSubnets", js.undefined)
    
    inline def setContributingSubnetsVarargs(value: ResourceId*): Self = StObject.set(x, "ContributingSubnets", js.Array(value*))
    
    inline def setIpV4Cidr(value: CIDR): Self = StObject.set(x, "IpV4Cidr", value.asInstanceOf[js.Any])
    
    inline def setIpV4CidrUndefined: Self = StObject.set(x, "IpV4Cidr", js.undefined)
    
    inline def setIpV6Cidr(value: CIDR): Self = StObject.set(x, "IpV6Cidr", value.asInstanceOf[js.Any])
    
    inline def setIpV6CidrUndefined: Self = StObject.set(x, "IpV6Cidr", js.undefined)
    
    inline def setPrefixListId(value: CIDR): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setRouteTableId(value: ResourceId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
  }
}
