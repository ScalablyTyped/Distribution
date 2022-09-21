package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteTableIdentifier extends StObject {
  
  /**
    * The segment edge in a core network.
    */
  var CoreNetworkSegmentEdge: js.UndefOr[CoreNetworkSegmentEdgeIdentifier] = js.undefined
  
  /**
    * The ARN of the transit gateway route table.
    */
  var TransitGatewayRouteTableArn: js.UndefOr[typings.awsSdk.networkmanagerMod.TransitGatewayRouteTableArn] = js.undefined
}
object RouteTableIdentifier {
  
  inline def apply(): RouteTableIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTableIdentifier]
  }
  
  extension [Self <: RouteTableIdentifier](x: Self) {
    
    inline def setCoreNetworkSegmentEdge(value: CoreNetworkSegmentEdgeIdentifier): Self = StObject.set(x, "CoreNetworkSegmentEdge", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkSegmentEdgeUndefined: Self = StObject.set(x, "CoreNetworkSegmentEdge", js.undefined)
    
    inline def setTransitGatewayRouteTableArn(value: TransitGatewayRouteTableArn): Self = StObject.set(x, "TransitGatewayRouteTableArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableArnUndefined: Self = StObject.set(x, "TransitGatewayRouteTableArn", js.undefined)
  }
}
