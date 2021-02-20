package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacilitatedDetails extends StObject {
  
  var merchantId: String = js.native
  
  var merchantName: String = js.native
  
  var paymentMethodNonce: String = js.native
}
object FacilitatedDetails {
  
  @scala.inline
  def apply(merchantId: String, merchantName: String, paymentMethodNonce: String): FacilitatedDetails = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any], merchantName = merchantName.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacilitatedDetails]
  }
  
  @scala.inline
  implicit class FacilitatedDetailsMutableBuilder[Self <: FacilitatedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
  }
}
