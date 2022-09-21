package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectPeerRequest extends StObject {
  
  /**
    * The ID of the deleted Connect peer.
    */
  var ConnectPeerId: typings.awsSdk.networkmanagerMod.ConnectPeerId
}
object DeleteConnectPeerRequest {
  
  inline def apply(ConnectPeerId: ConnectPeerId): DeleteConnectPeerRequest = {
    val __obj = js.Dynamic.literal(ConnectPeerId = ConnectPeerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectPeerRequest]
  }
  
  extension [Self <: DeleteConnectPeerRequest](x: Self) {
    
    inline def setConnectPeerId(value: ConnectPeerId): Self = StObject.set(x, "ConnectPeerId", value.asInstanceOf[js.Any])
  }
}
