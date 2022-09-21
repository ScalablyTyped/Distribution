package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutboundConnectionStatus extends StObject {
  
  /**
    * Verbose information for the outbound connection status.
    */
  var Message: js.UndefOr[ConnectionStatusMessage] = js.undefined
  
  /**
    * The state code for the outbound connection. Can be one of the following:  VALIDATING: The outbound connection request is being validated. VALIDATION_FAILED: Validation failed for the connection request. PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote domain owner.  APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned. PROVISIONING: Outbound connection request is in process. ACTIVE: Outbound connection is active and ready to use. REJECTING: Outbound connection rejection by remote domain owner is in progress. REJECTED: Outbound connection request is rejected by remote domain owner. DELETING: Outbound connection deletion is in progress. DELETED: Outbound connection is deleted and can no longer be used. 
    */
  var StatusCode: js.UndefOr[OutboundConnectionStatusCode] = js.undefined
}
object OutboundConnectionStatus {
  
  inline def apply(): OutboundConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutboundConnectionStatus]
  }
  
  extension [Self <: OutboundConnectionStatus](x: Self) {
    
    inline def setMessage(value: ConnectionStatusMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatusCode(value: OutboundConnectionStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
