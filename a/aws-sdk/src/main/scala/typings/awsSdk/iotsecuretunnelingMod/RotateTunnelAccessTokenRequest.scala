package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateTunnelAccessTokenRequest extends StObject {
  
  /**
    * The mode of the client that will use the client token, which can be either the source or destination, or both source and destination.
    */
  var clientMode: ClientMode
  
  var destinationConfig: js.UndefOr[DestinationConfig] = js.undefined
  
  /**
    * The tunnel for which you want to rotate the access tokens.
    */
  var tunnelId: TunnelId
}
object RotateTunnelAccessTokenRequest {
  
  inline def apply(clientMode: ClientMode, tunnelId: TunnelId): RotateTunnelAccessTokenRequest = {
    val __obj = js.Dynamic.literal(clientMode = clientMode.asInstanceOf[js.Any], tunnelId = tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateTunnelAccessTokenRequest]
  }
  
  extension [Self <: RotateTunnelAccessTokenRequest](x: Self) {
    
    inline def setClientMode(value: ClientMode): Self = StObject.set(x, "clientMode", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
    
    inline def setTunnelId(value: TunnelId): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
  }
}
