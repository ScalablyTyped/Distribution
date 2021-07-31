package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateLinkRequest extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: String
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The ID of the link.
    */
  var LinkId: String
}
object DisassociateLinkRequest {
  
  @scala.inline
  def apply(DeviceId: String, GlobalNetworkId: String, LinkId: String): DisassociateLinkRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], LinkId = LinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLinkRequest]
  }
  
  @scala.inline
  implicit class DisassociateLinkRequestMutableBuilder[Self <: DisassociateLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkId(value: String): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
  }
}
