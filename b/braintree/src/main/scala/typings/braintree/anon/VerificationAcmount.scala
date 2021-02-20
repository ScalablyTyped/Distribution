package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerificationAcmount extends StObject {
  
  var makeDefault: js.UndefOr[Boolean] = js.native
  
  var verificationAcmount: js.UndefOr[String] = js.native
  
  var verificationMerchantAccountId: js.UndefOr[String] = js.native
  
  var verifyCard: js.UndefOr[Boolean] = js.native
}
object VerificationAcmount {
  
  @scala.inline
  def apply(): VerificationAcmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationAcmount]
  }
  
  @scala.inline
  implicit class VerificationAcmountMutableBuilder[Self <: VerificationAcmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMakeDefault(value: Boolean): Self = StObject.set(x, "makeDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeDefaultUndefined: Self = StObject.set(x, "makeDefault", js.undefined)
    
    @scala.inline
    def setVerificationAcmount(value: String): Self = StObject.set(x, "verificationAcmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationAcmountUndefined: Self = StObject.set(x, "verificationAcmount", js.undefined)
    
    @scala.inline
    def setVerificationMerchantAccountId(value: String): Self = StObject.set(x, "verificationMerchantAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationMerchantAccountIdUndefined: Self = StObject.set(x, "verificationMerchantAccountId", js.undefined)
    
    @scala.inline
    def setVerifyCard(value: Boolean): Self = StObject.set(x, "verifyCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyCardUndefined: Self = StObject.set(x, "verifyCard", js.undefined)
  }
}
