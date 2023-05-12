package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.account
import typings.consumerDataStandards.consumerDataStandardsStrings.onceOff
import typings.consumerDataStandards.consumerDataStandardsStrings.otherCharges
import typings.consumerDataStandards.consumerDataStandardsStrings.payment_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionDateTime
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var account: js.UndefOr[DictkAdjustments] = js.undefined
  
  /**
    * The ID of the account for which the transaction occurred. accountId must comply in accordance with [CDR ID permanence](#id-permanence)
    */
  var accountId: String
  
  /**
    * The date and time that the transaction occurred
    */
  var executionDateTime: String
  
  /**
    * The GST incurred in the transaction.  Should not be included for credits or payments.  If absent zero is assumed
    */
  var gst: js.UndefOr[String | Null] = js.undefined
  
  var onceOff: js.UndefOr[DescriptionInvoiceNumber] = js.undefined
  
  var otherCharges: js.UndefOr[AdjustmentsAmount] = js.undefined
  
  var payment: js.UndefOr[AmountMethod] = js.undefined
  
  /**
    * Indicator of the type of transaction object present in this record
    */
  var transactionUType: account | onceOff | otherCharges | payment_
}
object ExecutionDateTime {
  
  inline def apply(
    accountId: String,
    executionDateTime: String,
    transactionUType: account | onceOff | otherCharges | payment_
  ): ExecutionDateTime = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], executionDateTime = executionDateTime.asInstanceOf[js.Any], transactionUType = transactionUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionDateTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionDateTime] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: DictkAdjustments): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setExecutionDateTime(value: String): Self = StObject.set(x, "executionDateTime", value.asInstanceOf[js.Any])
    
    inline def setGst(value: String): Self = StObject.set(x, "gst", value.asInstanceOf[js.Any])
    
    inline def setGstNull: Self = StObject.set(x, "gst", null)
    
    inline def setGstUndefined: Self = StObject.set(x, "gst", js.undefined)
    
    inline def setOnceOff(value: DescriptionInvoiceNumber): Self = StObject.set(x, "onceOff", value.asInstanceOf[js.Any])
    
    inline def setOnceOffUndefined: Self = StObject.set(x, "onceOff", js.undefined)
    
    inline def setOtherCharges(value: AdjustmentsAmount): Self = StObject.set(x, "otherCharges", value.asInstanceOf[js.Any])
    
    inline def setOtherChargesUndefined: Self = StObject.set(x, "otherCharges", js.undefined)
    
    inline def setPayment(value: AmountMethod): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    inline def setTransactionUType(value: account | onceOff | otherCharges | payment_): Self = StObject.set(x, "transactionUType", value.asInstanceOf[js.Any])
  }
}
