package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalGatewayRoute extends StObject {
  
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the local gateway route table.
    */
  var LocalGatewayRouteTableArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayRoutetableId] = js.undefined
  
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.undefined
  
  /**
    * The AWS account ID that owns the local gateway route.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the route.
    */
  var State: js.UndefOr[LocalGatewayRouteState] = js.undefined
  
  /**
    * The route type.
    */
  var Type: js.UndefOr[LocalGatewayRouteType] = js.undefined
}
object LocalGatewayRoute {
  
  inline def apply(): LocalGatewayRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRoute]
  }
  
  extension [Self <: LocalGatewayRoute](x: Self) {
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setLocalGatewayRouteTableArn(value: ResourceArn): Self = StObject.set(x, "LocalGatewayRouteTableArn", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableArnUndefined: Self = StObject.set(x, "LocalGatewayRouteTableArn", js.undefined)
    
    inline def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableId", js.undefined)
    
    inline def setLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayVirtualInterfaceGroupIdUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setState(value: LocalGatewayRouteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: LocalGatewayRouteType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
