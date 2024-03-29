package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BPAY
import typings.consumerDataStandards.consumerDataStandardsStrings.CARD
import typings.consumerDataStandards.consumerDataStandardsStrings.CASH
import typings.consumerDataStandards.consumerDataStandardsStrings.CHEQUE
import typings.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.TRANSFER
import typings.consumerDataStandards.consumerDataStandardsStrings.VOUCHER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoBillingPaymentTransaction
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The amount paid
    */
  var amount: String
  
  /**
    * The method of payment
    */
  var method: DIRECT_DEBIT | CARD | TRANSFER | BPAY | CASH | CHEQUE | VOUCHER | OTHER
}
object TelcoBillingPaymentTransaction {
  
  inline def apply(amount: String, method: DIRECT_DEBIT | CARD | TRANSFER | BPAY | CASH | CHEQUE | VOUCHER | OTHER): TelcoBillingPaymentTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoBillingPaymentTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoBillingPaymentTransaction] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: DIRECT_DEBIT | CARD | TRANSFER | BPAY | CASH | CHEQUE | VOUCHER | OTHER): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
