package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Peering extends StObject {
  
  /**
    * The ARN of a core network.
    */
  var CoreNetworkArn: js.UndefOr[typings.awsSdk.networkmanagerMod.CoreNetworkArn] = js.undefined
  
  /**
    * The ID of the core network for the peering request.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.networkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The timestamp when the attachment peer was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The edge location for the peer.
    */
  var EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The ID of the account owner.
    */
  var OwnerAccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The ID of the peering attachment. 
    */
  var PeeringId: js.UndefOr[typings.awsSdk.networkmanagerMod.PeeringId] = js.undefined
  
  /**
    * The type of peering. This will be TRANSIT_GATEWAY.
    */
  var PeeringType: js.UndefOr[typings.awsSdk.networkmanagerMod.PeeringType] = js.undefined
  
  /**
    * The resource ARN of the peer.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.networkmanagerMod.ResourceArn] = js.undefined
  
  /**
    * The current state of the peering connection. 
    */
  var State: js.UndefOr[PeeringState] = js.undefined
  
  /**
    * The list of key-value tags associated with the peering.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Peering {
  
  inline def apply(): Peering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Peering]
  }
  
  extension [Self <: Peering](x: Self) {
    
    inline def setCoreNetworkArn(value: CoreNetworkArn): Self = StObject.set(x, "CoreNetworkArn", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkArnUndefined: Self = StObject.set(x, "CoreNetworkArn", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationUndefined: Self = StObject.set(x, "EdgeLocation", js.undefined)
    
    inline def setOwnerAccountId(value: AWSAccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setPeeringId(value: PeeringId): Self = StObject.set(x, "PeeringId", value.asInstanceOf[js.Any])
    
    inline def setPeeringIdUndefined: Self = StObject.set(x, "PeeringId", js.undefined)
    
    inline def setPeeringType(value: PeeringType): Self = StObject.set(x, "PeeringType", value.asInstanceOf[js.Any])
    
    inline def setPeeringTypeUndefined: Self = StObject.set(x, "PeeringType", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setState(value: PeeringState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
