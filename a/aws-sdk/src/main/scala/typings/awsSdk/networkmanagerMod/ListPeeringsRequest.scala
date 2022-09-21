package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPeeringsRequest extends StObject {
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.networkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * Returns a list edge locations for the 
    */
  var EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.networkmanagerMod.NextToken] = js.undefined
  
  /**
    * Returns a list of a peering requests.
    */
  var PeeringType: js.UndefOr[typings.awsSdk.networkmanagerMod.PeeringType] = js.undefined
  
  /**
    * Returns a list of the peering request states.
    */
  var State: js.UndefOr[PeeringState] = js.undefined
}
object ListPeeringsRequest {
  
  inline def apply(): ListPeeringsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPeeringsRequest]
  }
  
  extension [Self <: ListPeeringsRequest](x: Self) {
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationUndefined: Self = StObject.set(x, "EdgeLocation", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPeeringType(value: PeeringType): Self = StObject.set(x, "PeeringType", value.asInstanceOf[js.Any])
    
    inline def setPeeringTypeUndefined: Self = StObject.set(x, "PeeringType", js.undefined)
    
    inline def setState(value: PeeringState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
