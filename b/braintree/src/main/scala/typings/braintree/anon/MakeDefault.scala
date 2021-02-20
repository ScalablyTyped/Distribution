package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeDefault extends StObject {
  
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.native
  
  var makeDefault: js.UndefOr[Boolean] = js.native
  
  var verificationAmount: js.UndefOr[String] = js.native
  
  var verificationMerchantAccountId: js.UndefOr[String] = js.native
  
  var verifyCard: js.UndefOr[Boolean] = js.native
}
object MakeDefault {
  
  @scala.inline
  def apply(): MakeDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeDefault]
  }
  
  @scala.inline
  implicit class MakeDefaultMutableBuilder[Self <: MakeDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailOnDuplicatePaymentMethod(value: Boolean): Self = StObject.set(x, "failOnDuplicatePaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnDuplicatePaymentMethodUndefined: Self = StObject.set(x, "failOnDuplicatePaymentMethod", js.undefined)
    
    @scala.inline
    def setMakeDefault(value: Boolean): Self = StObject.set(x, "makeDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeDefaultUndefined: Self = StObject.set(x, "makeDefault", js.undefined)
    
    @scala.inline
    def setVerificationAmount(value: String): Self = StObject.set(x, "verificationAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationAmountUndefined: Self = StObject.set(x, "verificationAmount", js.undefined)
    
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
