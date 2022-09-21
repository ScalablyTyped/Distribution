package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectPeerResponse extends StObject {
  
  /**
    * Returns information about a core network Connect peer.
    */
  var ConnectPeer: js.UndefOr[typings.awsSdk.networkmanagerMod.ConnectPeer] = js.undefined
}
object GetConnectPeerResponse {
  
  inline def apply(): GetConnectPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectPeerResponse]
  }
  
  extension [Self <: GetConnectPeerResponse](x: Self) {
    
    inline def setConnectPeer(value: ConnectPeer): Self = StObject.set(x, "ConnectPeer", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerUndefined: Self = StObject.set(x, "ConnectPeer", js.undefined)
  }
}
