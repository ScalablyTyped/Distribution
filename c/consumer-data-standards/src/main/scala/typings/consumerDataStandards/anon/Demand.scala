package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.demand_
import typings.consumerDataStandards.consumerDataStandardsStrings.onceOff
import typings.consumerDataStandards.consumerDataStandardsStrings.otherCharges
import typings.consumerDataStandards.consumerDataStandardsStrings.payment_
import typings.consumerDataStandards.consumerDataStandardsStrings.usage_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Demand
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The ID of the account for which transaction applies
    */
  var accountId: String
  
  /**
    * Represents a demand charge or generation credit.  Mandatory if transactionUType is equal to demand
    */
  var demand: js.UndefOr[Adjustments] = js.undefined
  
  /**
    * The date and time that the transaction occurred
    */
  var executionDateTime: String
  
  /**
    * The GST incurred in the transaction.  Should not be included for credits or payments.  If absent zero is assumed
    */
  var gst: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents a once off charge or credit.  Mandatory if transactionUType is equal to onceOff
    */
  var onceOff: js.UndefOr[InvoiceNumber] = js.undefined
  
  /**
    * Represents charge other than usage and once off.  Mandatory if transactionUType is equal to otherCharge
    */
  var otherCharges: js.UndefOr[CalculationFactors] = js.undefined
  
  /**
    * Represents a payment to the account.  Mandatory if transactionUType is equal to payment
    */
  var payment: js.UndefOr[Method] = js.undefined
  
  /**
    * Indicator of the type of transaction object present in this record
    */
  var transactionUType: usage_ | demand_ | onceOff | otherCharges | payment_
  
  /**
    * Represents a usage charge or generation credit.  Mandatory if transactionUType is equal to usage
    */
  var usage: js.UndefOr[EndDate] = js.undefined
}
object Demand {
  
  inline def apply(
    accountId: String,
    executionDateTime: String,
    transactionUType: usage_ | demand_ | onceOff | otherCharges | payment_
  ): Demand = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], executionDateTime = executionDateTime.asInstanceOf[js.Any], transactionUType = transactionUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Demand]
  }
  
  extension [Self <: Demand](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setDemand(value: Adjustments): Self = StObject.set(x, "demand", value.asInstanceOf[js.Any])
    
    inline def setDemandUndefined: Self = StObject.set(x, "demand", js.undefined)
    
    inline def setExecutionDateTime(value: String): Self = StObject.set(x, "executionDateTime", value.asInstanceOf[js.Any])
    
    inline def setGst(value: String): Self = StObject.set(x, "gst", value.asInstanceOf[js.Any])
    
    inline def setGstNull: Self = StObject.set(x, "gst", null)
    
    inline def setGstUndefined: Self = StObject.set(x, "gst", js.undefined)
    
    inline def setOnceOff(value: InvoiceNumber): Self = StObject.set(x, "onceOff", value.asInstanceOf[js.Any])
    
    inline def setOnceOffUndefined: Self = StObject.set(x, "onceOff", js.undefined)
    
    inline def setOtherCharges(value: CalculationFactors): Self = StObject.set(x, "otherCharges", value.asInstanceOf[js.Any])
    
    inline def setOtherChargesUndefined: Self = StObject.set(x, "otherCharges", js.undefined)
    
    inline def setPayment(value: Method): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    inline def setTransactionUType(value: usage_ | demand_ | onceOff | otherCharges | payment_): Self = StObject.set(x, "transactionUType", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: EndDate): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
