package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalGatewayRouteTableVirtualInterfaceGroupAssociation extends StObject {
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the local gateway route table for the virtual interface group.
    */
  var LocalGatewayRouteTableArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayId] = js.undefined
  
  /**
    * The ID of the association.
    */
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociationId] = js.undefined
  
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.undefined
  
  /**
    * The AWS account ID that owns the local gateway virtual interface group association.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The tags assigned to the association.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object LocalGatewayRouteTableVirtualInterfaceGroupAssociation {
  
  inline def apply(): LocalGatewayRouteTableVirtualInterfaceGroupAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]
  }
  
  extension [Self <: LocalGatewayRouteTableVirtualInterfaceGroupAssociation](x: Self) {
    
    inline def setLocalGatewayId(value: String): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    inline def setLocalGatewayRouteTableArn(value: ResourceArn): Self = StObject.set(x, "LocalGatewayRouteTableArn", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableArnUndefined: Self = StObject.set(x, "LocalGatewayRouteTableArn", js.undefined)
    
    inline def setLocalGatewayRouteTableId(value: LocalGatewayId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableId", js.undefined)
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociationId): Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociationId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociationId", js.undefined)
    
    inline def setLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayVirtualInterfaceGroupIdUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
