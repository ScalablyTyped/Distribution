package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleMasterChannelEndpointConfiguration extends StObject {
  
  /**
    * This property is used to determine the nature of communication over this SINGLE_MASTER signaling channel. If WSS is specified, this API returns a websocket endpoint. If HTTPS is specified, this API returns an HTTPS endpoint.
    */
  var Protocols: js.UndefOr[ListOfProtocols] = js.native
  
  /**
    * This property is used to determine messaging permissions in this SINGLE_MASTER signaling channel. If MASTER is specified, this API returns an endpoint that a client can use to receive offers from and send answers to any of the viewers on this signaling channel. If VIEWER is specified, this API returns an endpoint that a client can use only to send offers to another MASTER client on this signaling channel. 
    */
  var Role: js.UndefOr[ChannelRole] = js.native
}
object SingleMasterChannelEndpointConfiguration {
  
  @scala.inline
  def apply(): SingleMasterChannelEndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMasterChannelEndpointConfiguration]
  }
  
  @scala.inline
  implicit class SingleMasterChannelEndpointConfigurationMutableBuilder[Self <: SingleMasterChannelEndpointConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocols(value: ListOfProtocols): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: ChannelProtocol*): Self = StObject.set(x, "Protocols", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: ChannelRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
