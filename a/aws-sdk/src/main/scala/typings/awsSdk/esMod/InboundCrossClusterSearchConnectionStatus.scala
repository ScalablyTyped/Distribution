package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundCrossClusterSearchConnectionStatus extends StObject {
  
  /**
    * Specifies verbose information for the inbound connection status.
    */
  var Message: js.UndefOr[CrossClusterSearchConnectionStatusMessage] = js.undefined
  
  /**
    * The state code for inbound connection. This can be one of the following:  PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner. APPROVED: Inbound connection is pending acceptance by destination domain owner. REJECTING: Inbound connection rejection is in process. REJECTED: Inbound connection is rejected. DELETING: Inbound connection deletion is in progress. DELETED: Inbound connection is deleted and cannot be used further. 
    */
  var StatusCode: js.UndefOr[InboundCrossClusterSearchConnectionStatusCode] = js.undefined
}
object InboundCrossClusterSearchConnectionStatus {
  
  inline def apply(): InboundCrossClusterSearchConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboundCrossClusterSearchConnectionStatus]
  }
  
  extension [Self <: InboundCrossClusterSearchConnectionStatus](x: Self) {
    
    inline def setMessage(value: CrossClusterSearchConnectionStatusMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatusCode(value: InboundCrossClusterSearchConnectionStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
