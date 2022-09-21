package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.NOT_PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.PARTIALLY_PAID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCharges
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Object contain charges and credits related to electricity usage
    */
  var accountCharges: js.UndefOr[TotalCharges] = js.undefined
  
  /**
    * The ID of the account for which the invoice was issued
    */
  var accountId: String
  
  /**
    * The account balance at the time the invoice was issued
    */
  var balanceAtIssue: String
  
  /**
    * The date that the invoice is due to be paid
    */
  var dueDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Object containing charges and credits related to electricity usage
    */
  var electricity: js.UndefOr[OtherCharges] = js.undefined
  
  /**
    * Object containing charges and credits related to gas usage
    */
  var gas: js.UndefOr[OtherCharges] = js.undefined
  
  /**
    * The total GST amount for this invoice.  If absent then zero is assumed
    */
  var gstAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The net amount due for this invoice regardless of previous balance
    */
  var invoiceAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number assigned to this invoice by the energy Retailer
    */
  var invoiceNumber: String
  
  /**
    * The date that the invoice was actually issued (as opposed to generated or calculated)
    */
  var issueDate: String
  
  /**
    * A discount for on time payment
    */
  var payOnTimeDiscount: js.UndefOr[Date | Null] = js.undefined
  
  /**
    * Indicator of the payment status for the invoice
    */
  var paymentStatus: PAID | PARTIALLY_PAID | NOT_PAID
  
  /**
    * Object containing the start and end date for the period covered by the invoice.  Mandatory if any usage or demand based charges are included in the invoice
    */
  var period: js.UndefOr[StartDate | Null] = js.undefined
  
  /**
    * Array of service point IDs to which this invoice applies. May be empty if the invoice contains no electricity usage related charges
    */
  var servicePoints: js.Array[String]
}
object AccountCharges {
  
  inline def apply(
    accountId: String,
    balanceAtIssue: String,
    invoiceNumber: String,
    issueDate: String,
    paymentStatus: PAID | PARTIALLY_PAID | NOT_PAID,
    servicePoints: js.Array[String]
  ): AccountCharges = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], balanceAtIssue = balanceAtIssue.asInstanceOf[js.Any], invoiceNumber = invoiceNumber.asInstanceOf[js.Any], issueDate = issueDate.asInstanceOf[js.Any], paymentStatus = paymentStatus.asInstanceOf[js.Any], servicePoints = servicePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountCharges]
  }
  
  extension [Self <: AccountCharges](x: Self) {
    
    inline def setAccountCharges(value: TotalCharges): Self = StObject.set(x, "accountCharges", value.asInstanceOf[js.Any])
    
    inline def setAccountChargesUndefined: Self = StObject.set(x, "accountCharges", js.undefined)
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setBalanceAtIssue(value: String): Self = StObject.set(x, "balanceAtIssue", value.asInstanceOf[js.Any])
    
    inline def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateNull: Self = StObject.set(x, "dueDate", null)
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setElectricity(value: OtherCharges): Self = StObject.set(x, "electricity", value.asInstanceOf[js.Any])
    
    inline def setElectricityUndefined: Self = StObject.set(x, "electricity", js.undefined)
    
    inline def setGas(value: OtherCharges): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
    
    inline def setGstAmount(value: String): Self = StObject.set(x, "gstAmount", value.asInstanceOf[js.Any])
    
    inline def setGstAmountNull: Self = StObject.set(x, "gstAmount", null)
    
    inline def setGstAmountUndefined: Self = StObject.set(x, "gstAmount", js.undefined)
    
    inline def setInvoiceAmount(value: String): Self = StObject.set(x, "invoiceAmount", value.asInstanceOf[js.Any])
    
    inline def setInvoiceAmountNull: Self = StObject.set(x, "invoiceAmount", null)
    
    inline def setInvoiceAmountUndefined: Self = StObject.set(x, "invoiceAmount", js.undefined)
    
    inline def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    inline def setIssueDate(value: String): Self = StObject.set(x, "issueDate", value.asInstanceOf[js.Any])
    
    inline def setPayOnTimeDiscount(value: Date): Self = StObject.set(x, "payOnTimeDiscount", value.asInstanceOf[js.Any])
    
    inline def setPayOnTimeDiscountNull: Self = StObject.set(x, "payOnTimeDiscount", null)
    
    inline def setPayOnTimeDiscountUndefined: Self = StObject.set(x, "payOnTimeDiscount", js.undefined)
    
    inline def setPaymentStatus(value: PAID | PARTIALLY_PAID | NOT_PAID): Self = StObject.set(x, "paymentStatus", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: StartDate): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodNull: Self = StObject.set(x, "period", null)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setServicePoints(value: js.Array[String]): Self = StObject.set(x, "servicePoints", value.asInstanceOf[js.Any])
    
    inline def setServicePointsVarargs(value: String*): Self = StObject.set(x, "servicePoints", js.Array(value*))
  }
}
