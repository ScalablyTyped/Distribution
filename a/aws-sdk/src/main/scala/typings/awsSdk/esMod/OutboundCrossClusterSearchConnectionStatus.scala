package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutboundCrossClusterSearchConnectionStatus extends StObject {
  
  /**
    * Specifies verbose information for the outbound connection status.
    */
  var Message: js.UndefOr[CrossClusterSearchConnectionStatusMessage] = js.undefined
  
  /**
    * The state code for outbound connection. This can be one of the following:  VALIDATING: The outbound connection request is being validated. VALIDATION_FAILED: Validation failed for the connection request. PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by destination domain owner. PROVISIONING: Outbound connection request is in process. ACTIVE: Outbound connection is active and ready to use. REJECTED: Outbound connection request is rejected by destination domain owner. DELETING: Outbound connection deletion is in progress. DELETED: Outbound connection is deleted and cannot be used further. 
    */
  var StatusCode: js.UndefOr[OutboundCrossClusterSearchConnectionStatusCode] = js.undefined
}
object OutboundCrossClusterSearchConnectionStatus {
  
  inline def apply(): OutboundCrossClusterSearchConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutboundCrossClusterSearchConnectionStatus]
  }
  
  extension [Self <: OutboundCrossClusterSearchConnectionStatus](x: Self) {
    
    inline def setMessage(value: CrossClusterSearchConnectionStatusMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatusCode(value: OutboundCrossClusterSearchConnectionStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
