package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceEndpointListItem extends StObject {
  
  /**
    * The protocol of the signaling channel returned by the GetSignalingChannelEndpoint API.
    */
  var Protocol: js.UndefOr[ChannelProtocol] = js.native
  
  /**
    * The endpoint of the signaling channel returned by the GetSignalingChannelEndpoint API.
    */
  var ResourceEndpoint: js.UndefOr[typings.awsSdk.kinesisvideoMod.ResourceEndpoint] = js.native
}
object ResourceEndpointListItem {
  
  @scala.inline
  def apply(): ResourceEndpointListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceEndpointListItem]
  }
  
  @scala.inline
  implicit class ResourceEndpointListItemMutableBuilder[Self <: ResourceEndpointListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocol(value: ChannelProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setResourceEndpoint(value: ResourceEndpoint): Self = StObject.set(x, "ResourceEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceEndpointUndefined: Self = StObject.set(x, "ResourceEndpoint", js.undefined)
  }
}
