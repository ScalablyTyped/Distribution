package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeFabricAttributes extends js.Object {
  
  /**
    * The endpoint that identifies the peer node for all services except peer channel-based event services.
    */
  var PeerEndpoint: js.UndefOr[String] = js.native
  
  /**
    * The endpoint that identifies the peer node for peer channel-based event services.
    */
  var PeerEventEndpoint: js.UndefOr[String] = js.native
}
object NodeFabricAttributes {
  
  @scala.inline
  def apply(): NodeFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeFabricAttributes]
  }
  
  @scala.inline
  implicit class NodeFabricAttributesOps[Self <: NodeFabricAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPeerEndpoint(value: String): Self = this.set("PeerEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerEndpoint: Self = this.set("PeerEndpoint", js.undefined)
    
    @scala.inline
    def setPeerEventEndpoint(value: String): Self = this.set("PeerEventEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerEventEndpoint: Self = this.set("PeerEventEndpoint", js.undefined)
  }
}
