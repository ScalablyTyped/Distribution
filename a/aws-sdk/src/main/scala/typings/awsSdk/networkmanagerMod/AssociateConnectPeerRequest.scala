package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateConnectPeerRequest extends StObject {
  
  /**
    * The ID of the Connect peer.
    */
  var ConnectPeerId: typings.awsSdk.networkmanagerMod.ConnectPeerId
  
  /**
    * The ID of the device.
    */
  var DeviceId: typings.awsSdk.networkmanagerMod.DeviceId
  
  /**
    * The ID of your global network.
    */
  var GlobalNetworkId: typings.awsSdk.networkmanagerMod.GlobalNetworkId
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[typings.awsSdk.networkmanagerMod.LinkId] = js.undefined
}
object AssociateConnectPeerRequest {
  
  inline def apply(ConnectPeerId: ConnectPeerId, DeviceId: DeviceId, GlobalNetworkId: GlobalNetworkId): AssociateConnectPeerRequest = {
    val __obj = js.Dynamic.literal(ConnectPeerId = ConnectPeerId.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateConnectPeerRequest]
  }
  
  extension [Self <: AssociateConnectPeerRequest](x: Self) {
    
    inline def setConnectPeerId(value: ConnectPeerId): Self = StObject.set(x, "ConnectPeerId", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
  }
}
