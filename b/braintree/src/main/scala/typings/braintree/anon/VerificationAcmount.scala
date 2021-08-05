package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationAcmount extends StObject {
  
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  
  var verificationAcmount: js.UndefOr[String] = js.undefined
  
  var verificationMerchantAccountId: js.UndefOr[String] = js.undefined
  
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}
object VerificationAcmount {
  
  inline def apply(): VerificationAcmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationAcmount]
  }
  
  extension [Self <: VerificationAcmount](x: Self) {
    
    inline def setMakeDefault(value: Boolean): Self = StObject.set(x, "makeDefault", value.asInstanceOf[js.Any])
    
    inline def setMakeDefaultUndefined: Self = StObject.set(x, "makeDefault", js.undefined)
    
    inline def setVerificationAcmount(value: String): Self = StObject.set(x, "verificationAcmount", value.asInstanceOf[js.Any])
    
    inline def setVerificationAcmountUndefined: Self = StObject.set(x, "verificationAcmount", js.undefined)
    
    inline def setVerificationMerchantAccountId(value: String): Self = StObject.set(x, "verificationMerchantAccountId", value.asInstanceOf[js.Any])
    
    inline def setVerificationMerchantAccountIdUndefined: Self = StObject.set(x, "verificationMerchantAccountId", js.undefined)
    
    inline def setVerifyCard(value: Boolean): Self = StObject.set(x, "verifyCard", value.asInstanceOf[js.Any])
    
    inline def setVerifyCardUndefined: Self = StObject.set(x, "verifyCard", js.undefined)
  }
}
