package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.AdditionalInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodOptions extends StObject {
  
  var threeDSecure: AdditionalInformation
}
object PaymentMethodOptions {
  
  inline def apply(threeDSecure: AdditionalInformation): PaymentMethodOptions = {
    val __obj = js.Dynamic.literal(threeDSecure = threeDSecure.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodOptions]
  }
  
  extension [Self <: PaymentMethodOptions](x: Self) {
    
    inline def setThreeDSecure(value: AdditionalInformation): Self = StObject.set(x, "threeDSecure", value.asInstanceOf[js.Any])
  }
}
