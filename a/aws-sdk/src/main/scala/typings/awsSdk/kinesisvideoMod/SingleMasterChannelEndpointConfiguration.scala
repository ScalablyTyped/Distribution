package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleMasterChannelEndpointConfiguration extends StObject {
  
  /**
    * This property is used to determine the nature of communication over this SINGLE_MASTER signaling channel. If WSS is specified, this API returns a websocket endpoint. If HTTPS is specified, this API returns an HTTPS endpoint.
    */
  var Protocols: js.UndefOr[ListOfProtocols] = js.undefined
  
  /**
    * This property is used to determine messaging permissions in this SINGLE_MASTER signaling channel. If MASTER is specified, this API returns an endpoint that a client can use to receive offers from and send answers to any of the viewers on this signaling channel. If VIEWER is specified, this API returns an endpoint that a client can use only to send offers to another MASTER client on this signaling channel. 
    */
  var Role: js.UndefOr[ChannelRole] = js.undefined
}
object SingleMasterChannelEndpointConfiguration {
  
  inline def apply(): SingleMasterChannelEndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMasterChannelEndpointConfiguration]
  }
  
  extension [Self <: SingleMasterChannelEndpointConfiguration](x: Self) {
    
    inline def setProtocols(value: ListOfProtocols): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: ChannelProtocol*): Self = StObject.set(x, "Protocols", js.Array(value :_*))
    
    inline def setRole(value: ChannelRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
