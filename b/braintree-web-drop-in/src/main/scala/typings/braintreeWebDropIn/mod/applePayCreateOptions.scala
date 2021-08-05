package typings.braintreeWebDropIn.mod

import typings.braintreeWeb.applePayMod.ApplePayPaymentRequest
import typings.braintreeWebDropIn.braintreeWebDropInStrings.`white-outline`
import typings.braintreeWebDropIn.braintreeWebDropInStrings.black
import typings.braintreeWebDropIn.braintreeWebDropInStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait applePayCreateOptions extends StObject {
  
  var applePaySessionVersion: js.UndefOr[Double] = js.undefined
  
  var buttonStyle: js.UndefOr[black | white | `white-outline`] = js.undefined
  
  var displayName: String
  
  var paymentRequest: ApplePayPaymentRequest
}
object applePayCreateOptions {
  
  inline def apply(displayName: String, paymentRequest: ApplePayPaymentRequest): applePayCreateOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], paymentRequest = paymentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[applePayCreateOptions]
  }
  
  extension [Self <: applePayCreateOptions](x: Self) {
    
    inline def setApplePaySessionVersion(value: Double): Self = StObject.set(x, "applePaySessionVersion", value.asInstanceOf[js.Any])
    
    inline def setApplePaySessionVersionUndefined: Self = StObject.set(x, "applePaySessionVersion", js.undefined)
    
    inline def setButtonStyle(value: black | white | `white-outline`): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setPaymentRequest(value: ApplePayPaymentRequest): Self = StObject.set(x, "paymentRequest", value.asInstanceOf[js.Any])
  }
}
