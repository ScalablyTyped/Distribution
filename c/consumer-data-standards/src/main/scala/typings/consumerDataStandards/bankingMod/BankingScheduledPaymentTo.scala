package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Account
import typings.consumerDataStandards.anon.BankDetails
import typings.consumerDataStandards.anon.BillerCode
import typings.consumerDataStandards.consumerDataStandardsStrings.accountId
import typings.consumerDataStandards.consumerDataStandardsStrings.biller_
import typings.consumerDataStandards.consumerDataStandardsStrings.domestic_
import typings.consumerDataStandards.consumerDataStandardsStrings.international_
import typings.consumerDataStandards.consumerDataStandardsStrings.payeeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingScheduledPaymentTo
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Present if toUType is set to accountId. Indicates that the payment is to another account that is accessible under the current consent
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  var biller: js.UndefOr[BillerCode] = js.undefined
  
  var domestic: js.UndefOr[Account] = js.undefined
  
  var international: js.UndefOr[BankDetails] = js.undefined
  
  /**
    * The short display name of the payee as provided by the customer unless toUType is set to payeeId. Where a customer has not provided a nickname, a display name derived by the bank for payee should be provided that is consistent with existing digital banking channels
    */
  var nickname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Present if toUType is set to payeeId. Indicates that the payment is to registered payee that can be accessed using the payee end point. If the Bank Payees scope has not been consented to then a payeeId should not be provided and the full payee details should be provided instead
    */
  var payeeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reference for the transaction, if applicable, that will be provided by the originating institution for the specific payment. If not empty, it overrides the value provided at the BankingScheduledPayment level.
    */
  var payeeReference: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of object provided that specifies the destination of the funds for the payment.
    */
  var toUType: accountId | biller_ | domestic_ | international_ | payeeId
}
object BankingScheduledPaymentTo {
  
  inline def apply(toUType: accountId | biller_ | domestic_ | international_ | payeeId): BankingScheduledPaymentTo = {
    val __obj = js.Dynamic.literal(toUType = toUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingScheduledPaymentTo]
  }
  
  extension [Self <: BankingScheduledPaymentTo](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBiller(value: BillerCode): Self = StObject.set(x, "biller", value.asInstanceOf[js.Any])
    
    inline def setBillerUndefined: Self = StObject.set(x, "biller", js.undefined)
    
    inline def setDomestic(value: Account): Self = StObject.set(x, "domestic", value.asInstanceOf[js.Any])
    
    inline def setDomesticUndefined: Self = StObject.set(x, "domestic", js.undefined)
    
    inline def setInternational(value: BankDetails): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
    
    inline def setInternationalUndefined: Self = StObject.set(x, "international", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameNull: Self = StObject.set(x, "nickname", null)
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPayeeId(value: String): Self = StObject.set(x, "payeeId", value.asInstanceOf[js.Any])
    
    inline def setPayeeIdNull: Self = StObject.set(x, "payeeId", null)
    
    inline def setPayeeIdUndefined: Self = StObject.set(x, "payeeId", js.undefined)
    
    inline def setPayeeReference(value: String): Self = StObject.set(x, "payeeReference", value.asInstanceOf[js.Any])
    
    inline def setPayeeReferenceNull: Self = StObject.set(x, "payeeReference", null)
    
    inline def setPayeeReferenceUndefined: Self = StObject.set(x, "payeeReference", js.undefined)
    
    inline def setToUType(value: accountId | biller_ | domestic_ | international_ | payeeId): Self = StObject.set(x, "toUType", value.asInstanceOf[js.Any])
  }
}
