package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLinkRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The ID of the link.
    */
  var LinkId: String
}
object DeleteLinkRequest {
  
  @scala.inline
  def apply(GlobalNetworkId: String, LinkId: String): DeleteLinkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], LinkId = LinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLinkRequest]
  }
  
  @scala.inline
  implicit class DeleteLinkRequestMutableBuilder[Self <: DeleteLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkId(value: String): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
  }
}
