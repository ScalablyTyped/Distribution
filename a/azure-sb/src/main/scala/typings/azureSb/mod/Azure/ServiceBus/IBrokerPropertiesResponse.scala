package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBrokerPropertiesResponse extends StObject {
  
  val DeliveryCount: Double
  
  val LockToken: String
  
  val LockedUntil: DateString
  
  val SequenceNumber: Double
}
object IBrokerPropertiesResponse {
  
  inline def apply(DeliveryCount: Double, LockToken: String, LockedUntil: DateString, SequenceNumber: Double): IBrokerPropertiesResponse = {
    val __obj = js.Dynamic.literal(DeliveryCount = DeliveryCount.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], LockedUntil = LockedUntil.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrokerPropertiesResponse]
  }
  
  extension [Self <: IBrokerPropertiesResponse](x: Self) {
    
    inline def setDeliveryCount(value: Double): Self = StObject.set(x, "DeliveryCount", value.asInstanceOf[js.Any])
    
    inline def setLockToken(value: String): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    inline def setLockedUntil(value: DateString): Self = StObject.set(x, "LockedUntil", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
  }
}
