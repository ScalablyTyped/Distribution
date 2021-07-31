package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodRequestablePayload extends StObject {
  
  var paymentMethodIsSelected: Boolean
  
  var `type`: CreditCard | PayPalAccount
}
object PaymentMethodRequestablePayload {
  
  @scala.inline
  def apply(paymentMethodIsSelected: Boolean, `type`: CreditCard | PayPalAccount): PaymentMethodRequestablePayload = {
    val __obj = js.Dynamic.literal(paymentMethodIsSelected = paymentMethodIsSelected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodRequestablePayload]
  }
  
  @scala.inline
  implicit class PaymentMethodRequestablePayloadMutableBuilder[Self <: PaymentMethodRequestablePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaymentMethodIsSelected(value: Boolean): Self = StObject.set(x, "paymentMethodIsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CreditCard | PayPalAccount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
