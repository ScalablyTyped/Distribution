package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRouteTableRoute extends StObject {
  
  /**
    * The ID of the route attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the resource for the route attachment.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type for the route attachment.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The route origin. The following are the possible values:   static   propagated  
    */
  var RouteOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the route.
    */
  var State: js.UndefOr[String] = js.undefined
}
object TransitGatewayRouteTableRoute {
  
  inline def apply(): TransitGatewayRouteTableRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRouteTableRoute]
  }
  
  extension [Self <: TransitGatewayRouteTableRoute](x: Self) {
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    inline def setDestinationCidr(value: String): Self = StObject.set(x, "DestinationCidr", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrUndefined: Self = StObject.set(x, "DestinationCidr", js.undefined)
    
    inline def setPrefixListId(value: String): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setRouteOrigin(value: String): Self = StObject.set(x, "RouteOrigin", value.asInstanceOf[js.Any])
    
    inline def setRouteOriginUndefined: Self = StObject.set(x, "RouteOrigin", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
