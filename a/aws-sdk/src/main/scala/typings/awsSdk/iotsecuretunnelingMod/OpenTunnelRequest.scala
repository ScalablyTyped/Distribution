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
  
  @scala.inline
  def apply(): OpenTunnelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTunnelRequest]
  }
  
  @scala.inline
  implicit class OpenTunnelRequestMutableBuilder[Self <: OpenTunnelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimeoutConfig(value: TimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
  }
}
