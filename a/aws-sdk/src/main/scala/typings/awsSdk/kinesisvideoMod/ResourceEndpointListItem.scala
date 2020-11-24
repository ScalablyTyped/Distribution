package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceEndpointListItem extends js.Object {
  
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
  implicit class ResourceEndpointListItemOps[Self <: ResourceEndpointListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProtocol(value: ChannelProtocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setResourceEndpoint(value: ResourceEndpoint): Self = this.set("ResourceEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceEndpoint: Self = this.set("ResourceEndpoint", js.undefined)
  }
}
