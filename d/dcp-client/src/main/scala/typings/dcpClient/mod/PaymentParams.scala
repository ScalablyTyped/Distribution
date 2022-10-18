package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentParams extends StObject {
  
  /**
    * Whether the slice was accepted, payment value will be 0 if not accepted.
    */
  var accepted: Boolean
  
  /**
    * String representation of the DCC value that was paid out.
    */
  var payment: String
  
  /**
    * Bank address that the payment was sent to.
    */
  var paymentAddress: String
  
  /**
    * Reason string for why the slice was accepted/rejected.
    */
  var reason: String
}
object PaymentParams {
  
  inline def apply(accepted: Boolean, payment: String, paymentAddress: String, reason: String): PaymentParams = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], paymentAddress = paymentAddress.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentParams]
  }
  
  extension [Self <: PaymentParams](x: Self) {
    
    inline def setAccepted(value: Boolean): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    inline def setPayment(value: String): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setPaymentAddress(value: String): Self = StObject.set(x, "paymentAddress", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
