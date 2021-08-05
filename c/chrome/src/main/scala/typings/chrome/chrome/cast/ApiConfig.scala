package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiConfig extends StObject {
  
  var autoJoinPolicy: AutoJoinPolicy
  
  var defaultActionPolicy: DefaultActionPolicy
  
  def receiverListener(receiverAvailability: ReceiverAvailability): Unit
  
  def sessionListener(session: Session): Unit
  
  var sessionRequest: SessionRequest
}
object ApiConfig {
  
  inline def apply(
    autoJoinPolicy: AutoJoinPolicy,
    defaultActionPolicy: DefaultActionPolicy,
    receiverListener: ReceiverAvailability => Unit,
    sessionListener: Session => Unit,
    sessionRequest: SessionRequest
  ): ApiConfig = {
    val __obj = js.Dynamic.literal(autoJoinPolicy = autoJoinPolicy.asInstanceOf[js.Any], defaultActionPolicy = defaultActionPolicy.asInstanceOf[js.Any], receiverListener = js.Any.fromFunction1(receiverListener), sessionListener = js.Any.fromFunction1(sessionListener), sessionRequest = sessionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiConfig]
  }
  
  extension [Self <: ApiConfig](x: Self) {
    
    inline def setAutoJoinPolicy(value: AutoJoinPolicy): Self = StObject.set(x, "autoJoinPolicy", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionPolicy(value: DefaultActionPolicy): Self = StObject.set(x, "defaultActionPolicy", value.asInstanceOf[js.Any])
    
    inline def setReceiverListener(value: ReceiverAvailability => Unit): Self = StObject.set(x, "receiverListener", js.Any.fromFunction1(value))
    
    inline def setSessionListener(value: Session => Unit): Self = StObject.set(x, "sessionListener", js.Any.fromFunction1(value))
    
    inline def setSessionRequest(value: SessionRequest): Self = StObject.set(x, "sessionRequest", value.asInstanceOf[js.Any])
  }
}
