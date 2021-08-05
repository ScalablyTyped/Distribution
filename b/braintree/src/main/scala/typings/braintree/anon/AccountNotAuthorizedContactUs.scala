package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountNotAuthorizedContactUs extends StObject {
  
  var AccountNotAuthorizedContactUs: String
  
  var AnotherUsBankMerchantAccount: String
  
  var Approve: String
  
  var BankRejectedNone: String
  
  var BankRejectedUpdateFundingInformation: String
  
  var InsufficientFundsContactUs: String
  
  var UsBankMerchantAccount: String
}
object AccountNotAuthorizedContactUs {
  
  inline def apply(
    AccountNotAuthorizedContactUs: String,
    AnotherUsBankMerchantAccount: String,
    Approve: String,
    BankRejectedNone: String,
    BankRejectedUpdateFundingInformation: String,
    InsufficientFundsContactUs: String,
    UsBankMerchantAccount: String
  ): AccountNotAuthorizedContactUs = {
    val __obj = js.Dynamic.literal(AccountNotAuthorizedContactUs = AccountNotAuthorizedContactUs.asInstanceOf[js.Any], AnotherUsBankMerchantAccount = AnotherUsBankMerchantAccount.asInstanceOf[js.Any], Approve = Approve.asInstanceOf[js.Any], BankRejectedNone = BankRejectedNone.asInstanceOf[js.Any], BankRejectedUpdateFundingInformation = BankRejectedUpdateFundingInformation.asInstanceOf[js.Any], InsufficientFundsContactUs = InsufficientFundsContactUs.asInstanceOf[js.Any], UsBankMerchantAccount = UsBankMerchantAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountNotAuthorizedContactUs]
  }
  
  extension [Self <: AccountNotAuthorizedContactUs](x: Self) {
    
    inline def setAccountNotAuthorizedContactUs(value: String): Self = StObject.set(x, "AccountNotAuthorizedContactUs", value.asInstanceOf[js.Any])
    
    inline def setAnotherUsBankMerchantAccount(value: String): Self = StObject.set(x, "AnotherUsBankMerchantAccount", value.asInstanceOf[js.Any])
    
    inline def setApprove(value: String): Self = StObject.set(x, "Approve", value.asInstanceOf[js.Any])
    
    inline def setBankRejectedNone(value: String): Self = StObject.set(x, "BankRejectedNone", value.asInstanceOf[js.Any])
    
    inline def setBankRejectedUpdateFundingInformation(value: String): Self = StObject.set(x, "BankRejectedUpdateFundingInformation", value.asInstanceOf[js.Any])
    
    inline def setInsufficientFundsContactUs(value: String): Self = StObject.set(x, "InsufficientFundsContactUs", value.asInstanceOf[js.Any])
    
    inline def setUsBankMerchantAccount(value: String): Self = StObject.set(x, "UsBankMerchantAccount", value.asInstanceOf[js.Any])
  }
}
