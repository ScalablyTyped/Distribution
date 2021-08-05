package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacilitatedDetails extends StObject {
  
  var merchantId: String
  
  var merchantName: String
  
  var paymentMethodNonce: String
}
object FacilitatedDetails {
  
  inline def apply(merchantId: String, merchantName: String, paymentMethodNonce: String): FacilitatedDetails = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any], merchantName = merchantName.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacilitatedDetails]
  }
  
  extension [Self <: FacilitatedDetails](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
  }
}
