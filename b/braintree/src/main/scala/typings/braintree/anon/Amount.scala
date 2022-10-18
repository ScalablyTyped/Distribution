package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amount extends StObject {
  
  var amount: String
  
  var createdAt: String
  
  var id: String
  
  var orderId: String
  
  var paymentInstrumentSubtype: String
  
  var purchaseOrderNumber: String
}
object Amount {
  
  inline def apply(
    amount: String,
    createdAt: String,
    id: String,
    orderId: String,
    paymentInstrumentSubtype: String,
    purchaseOrderNumber: String
  ): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], orderId = orderId.asInstanceOf[js.Any], paymentInstrumentSubtype = paymentInstrumentSubtype.asInstanceOf[js.Any], purchaseOrderNumber = purchaseOrderNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  
  extension [Self <: Amount](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setPaymentInstrumentSubtype(value: String): Self = StObject.set(x, "paymentInstrumentSubtype", value.asInstanceOf[js.Any])
    
    inline def setPurchaseOrderNumber(value: String): Self = StObject.set(x, "purchaseOrderNumber", value.asInstanceOf[js.Any])
  }
}
