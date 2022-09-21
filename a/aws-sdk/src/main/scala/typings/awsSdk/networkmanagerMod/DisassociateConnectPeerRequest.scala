package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateConnectPeerRequest extends StObject {
  
  /**
    * The ID of the Connect peer to disassociate from a device.
    */
  var ConnectPeerId: typings.awsSdk.networkmanagerMod.ConnectPeerId
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.networkmanagerMod.GlobalNetworkId
}
object DisassociateConnectPeerRequest {
  
  inline def apply(ConnectPeerId: ConnectPeerId, GlobalNetworkId: GlobalNetworkId): DisassociateConnectPeerRequest = {
    val __obj = js.Dynamic.literal(ConnectPeerId = ConnectPeerId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConnectPeerRequest]
  }
  
  extension [Self <: DisassociateConnectPeerRequest](x: Self) {
    
    inline def setConnectPeerId(value: ConnectPeerId): Self = StObject.set(x, "ConnectPeerId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
  }
}
