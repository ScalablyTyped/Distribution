package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeDefault extends StObject {
  
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined
  
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  
  var verificationAmount: js.UndefOr[String] = js.undefined
  
  var verificationMerchantAccountId: js.UndefOr[String] = js.undefined
  
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}
object MakeDefault {
  
  inline def apply(): MakeDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeDefault]
  }
  
  extension [Self <: MakeDefault](x: Self) {
    
    inline def setFailOnDuplicatePaymentMethod(value: Boolean): Self = StObject.set(x, "failOnDuplicatePaymentMethod", value.asInstanceOf[js.Any])
    
    inline def setFailOnDuplicatePaymentMethodUndefined: Self = StObject.set(x, "failOnDuplicatePaymentMethod", js.undefined)
    
    inline def setMakeDefault(value: Boolean): Self = StObject.set(x, "makeDefault", value.asInstanceOf[js.Any])
    
    inline def setMakeDefaultUndefined: Self = StObject.set(x, "makeDefault", js.undefined)
    
    inline def setVerificationAmount(value: String): Self = StObject.set(x, "verificationAmount", value.asInstanceOf[js.Any])
    
    inline def setVerificationAmountUndefined: Self = StObject.set(x, "verificationAmount", js.undefined)
    
    inline def setVerificationMerchantAccountId(value: String): Self = StObject.set(x, "verificationMerchantAccountId", value.asInstanceOf[js.Any])
    
    inline def setVerificationMerchantAccountIdUndefined: Self = StObject.set(x, "verificationMerchantAccountId", js.undefined)
    
    inline def setVerifyCard(value: Boolean): Self = StObject.set(x, "verifyCard", value.asInstanceOf[js.Any])
    
    inline def setVerifyCardUndefined: Self = StObject.set(x, "verifyCard", js.undefined)
  }
}
