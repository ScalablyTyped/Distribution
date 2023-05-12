package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Data
import typings.consumerDataStandards.anon.Date
import typings.consumerDataStandards.anon.StartDate
import typings.consumerDataStandards.anon.TotalDiscounts
import typings.consumerDataStandards.consumerDataStandardsStrings.NOT_PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.PARTIALLY_PAID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoInvoice
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Object contain charges and credits related to usage
    */
  var accountCharges: js.UndefOr[TotalDiscounts] = js.undefined
  
  /**
    * The ID of the account for which the invoice was issued. accountId must comply in accordance with [CDR ID permanence](#id-permanence)
    */
  var accountId: String
  
  /**
    * Object containing usage summary
    */
  var accountUsage: js.UndefOr[Data] = js.undefined
  
  /**
    * The account balance at the time the invoice was issued
    */
  var balanceAtIssue: String
  
  /**
    * The date that the invoice is due to be paid
    */
  var dueDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total GST amount for this invoice.  If absent then zero is assumed
    */
  var gstAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The net amount due for this invoice regardless of previous balance
    */
  var invoiceAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number assigned to this invoice by the telco Retailer
    */
  var invoiceNumber: String
  
  /**
    * The date that the invoice was actually issued (as opposed to generated or calculated)
    */
  var issueDate: String
  
  /**
    * A discount for on time payment
    */
  var payOnTimeDiscount: js.UndefOr[Date] = js.undefined
  
  /**
    * Indicator of the payment status for the invoice
    */
  var paymentStatus: PAID | PARTIALLY_PAID | NOT_PAID
  
  /**
    * Object containing the start and end date for the period covered by the invoice. Mandatory if any usage based charges are included in the invoice
    */
  var period: js.UndefOr[StartDate] = js.undefined
  
  /**
    * An array of service IDs to which this invoice applies. May be empty if the invoice contains no usage related charges
    */
  var services: js.Array[String]
}
object TelcoInvoice {
  
  inline def apply(
    accountId: String,
    balanceAtIssue: String,
    invoiceNumber: String,
    issueDate: String,
    paymentStatus: PAID | PARTIALLY_PAID | NOT_PAID,
    services: js.Array[String]
  ): TelcoInvoice = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], balanceAtIssue = balanceAtIssue.asInstanceOf[js.Any], invoiceNumber = invoiceNumber.asInstanceOf[js.Any], issueDate = issueDate.asInstanceOf[js.Any], paymentStatus = paymentStatus.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoInvoice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoInvoice] (val x: Self) extends AnyVal {
    
    inline def setAccountCharges(value: TotalDiscounts): Self = StObject.set(x, "accountCharges", value.asInstanceOf[js.Any])
    
    inline def setAccountChargesUndefined: Self = StObject.set(x, "accountCharges", js.undefined)
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountUsage(value: Data): Self = StObject.set(x, "accountUsage", value.asInstanceOf[js.Any])
    
    inline def setAccountUsageUndefined: Self = StObject.set(x, "accountUsage", js.undefined)
    
    inline def setBalanceAtIssue(value: String): Self = StObject.set(x, "balanceAtIssue", value.asInstanceOf[js.Any])
    
    inline def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateNull: Self = StObject.set(x, "dueDate", null)
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setGstAmount(value: String): Self = StObject.set(x, "gstAmount", value.asInstanceOf[js.Any])
    
    inline def setGstAmountNull: Self = StObject.set(x, "gstAmount", null)
    
    inline def setGstAmountUndefined: Self = StObject.set(x, "gstAmount", js.undefined)
    
    inline def setInvoiceAmount(value: String): Self = StObject.set(x, "invoiceAmount", value.asInstanceOf[js.Any])
    
    inline def setInvoiceAmountNull: Self = StObject.set(x, "invoiceAmount", null)
    
    inline def setInvoiceAmountUndefined: Self = StObject.set(x, "invoiceAmount", js.undefined)
    
    inline def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    inline def setIssueDate(value: String): Self = StObject.set(x, "issueDate", value.asInstanceOf[js.Any])
    
    inline def setPayOnTimeDiscount(value: Date): Self = StObject.set(x, "payOnTimeDiscount", value.asInstanceOf[js.Any])
    
    inline def setPayOnTimeDiscountUndefined: Self = StObject.set(x, "payOnTimeDiscount", js.undefined)
    
    inline def setPaymentStatus(value: PAID | PARTIALLY_PAID | NOT_PAID): Self = StObject.set(x, "paymentStatus", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: StartDate): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
