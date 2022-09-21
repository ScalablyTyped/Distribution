package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConnectionAction extends StObject {
  
  /**
    * Indicates whether the network connection attempt was blocked.
    */
  var Blocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The direction of the network connection request (IN or OUT).
    */
  var ConnectionDirection: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the port on the EC2 instance.
    */
  var LocalPortDetails: js.UndefOr[ActionLocalPortDetails] = js.undefined
  
  /**
    * The protocol used to make the network connection request.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the remote IP address that issued the network connection request.
    */
  var RemoteIpDetails: js.UndefOr[ActionRemoteIpDetails] = js.undefined
  
  /**
    * Information about the port on the remote IP address.
    */
  var RemotePortDetails: js.UndefOr[ActionRemotePortDetails] = js.undefined
}
object NetworkConnectionAction {
  
  inline def apply(): NetworkConnectionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConnectionAction]
  }
  
  extension [Self <: NetworkConnectionAction](x: Self) {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "Blocked", js.undefined)
    
    inline def setConnectionDirection(value: NonEmptyString): Self = StObject.set(x, "ConnectionDirection", value.asInstanceOf[js.Any])
    
    inline def setConnectionDirectionUndefined: Self = StObject.set(x, "ConnectionDirection", js.undefined)
    
    inline def setLocalPortDetails(value: ActionLocalPortDetails): Self = StObject.set(x, "LocalPortDetails", value.asInstanceOf[js.Any])
    
    inline def setLocalPortDetailsUndefined: Self = StObject.set(x, "LocalPortDetails", js.undefined)
    
    inline def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setRemoteIpDetails(value: ActionRemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
    
    inline def setRemotePortDetails(value: ActionRemotePortDetails): Self = StObject.set(x, "RemotePortDetails", value.asInstanceOf[js.Any])
    
    inline def setRemotePortDetailsUndefined: Self = StObject.set(x, "RemotePortDetails", js.undefined)
  }
}
