package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeFabricAttributes extends StObject {
  
  /**
    * The endpoint that identifies the peer node for all services except peer channel-based event services.
    */
  var PeerEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The endpoint that identifies the peer node for peer channel-based event services.
    */
  var PeerEventEndpoint: js.UndefOr[String] = js.undefined
}
object NodeFabricAttributes {
  
  inline def apply(): NodeFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeFabricAttributes]
  }
  
  extension [Self <: NodeFabricAttributes](x: Self) {
    
    inline def setPeerEndpoint(value: String): Self = StObject.set(x, "PeerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPeerEndpointUndefined: Self = StObject.set(x, "PeerEndpoint", js.undefined)
    
    inline def setPeerEventEndpoint(value: String): Self = StObject.set(x, "PeerEventEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPeerEventEndpointUndefined: Self = StObject.set(x, "PeerEventEndpoint", js.undefined)
  }
}
