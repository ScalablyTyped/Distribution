package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenTunnelRequest extends StObject {
  
  /**
    * A short text description of the tunnel. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The destination configuration for the OpenTunnel request.
    */
  var destinationConfig: js.UndefOr[DestinationConfig] = js.undefined
  
  /**
    * A collection of tag metadata.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Timeout configuration for a tunnel.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
}
object OpenTunnelRequest {
  
  inline def apply(): OpenTunnelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTunnelRequest]
  }
  
  extension [Self <: OpenTunnelRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTimeoutConfig(value: TimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    inline def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
  }
}
