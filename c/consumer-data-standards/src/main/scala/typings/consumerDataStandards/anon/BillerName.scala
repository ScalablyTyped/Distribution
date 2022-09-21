package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typings.consumerDataStandards.consumerDataStandardsStrings.FEE
import typings.consumerDataStandards.consumerDataStandardsStrings.INTEREST_CHARGED
import typings.consumerDataStandards.consumerDataStandardsStrings.INTEREST_PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PAYMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.PENDING
import typings.consumerDataStandards.consumerDataStandardsStrings.POSTED
import typings.consumerDataStandards.consumerDataStandardsStrings.TRANSFER_INCOMING
import typings.consumerDataStandards.consumerDataStandardsStrings.TRANSFER_OUTGOING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillerName
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * ID of the account for which transactions are provided
    */
  var accountId: String
  
  /**
    * The value of the transaction. Negative values mean money was outgoing from the account
    */
  var amount: String
  
  /**
    * 6 Digit APCA number for the initiating institution. The field is fixed-width and padded with leading zeros if applicable.
    */
  var apcaNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * BPAY Biller Code for the transaction (if available)
    */
  var billerCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the BPAY biller for the transaction (if available)
    */
  var billerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * BPAY CRN for the transaction (if available).<br/>Where the CRN contains sensitive information, it should be masked in line with how the Data Holder currently displays account identifiers in their existing online banking channels. If the contents of the CRN match the format of a Credit Card PAN they should be masked according to the rules applicable for MaskedPANString. If the contents are are otherwise sensitive, then it should be masked using the rules applicable for the MaskedAccountString common type.
    */
  var crn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency for the transaction amount. AUD assumed if not present
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The transaction description as applied by the financial institution
    */
  var description: String
  
  /**
    * The time the transaction was executed by the originating customer, if available
    */
  var executionDateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if extended information is available using the transaction detail end point. False if extended data is not available
    */
  var isDetailAvailable: Boolean
  
  /**
    * The merchant category code (or MCC) for an outgoing payment to a merchant
    */
  var merchantCategoryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the merchant for an outgoing payment to a merchant
    */
  var merchantName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time the transaction was posted. This field is Mandatory if the transaction has status POSTED.  This is the time that appears on a standard statement
    */
  var postingDateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reference for the transaction provided by the originating institution. Empty string if no data provided
    */
  var reference: String
  
  /**
    * Status of the transaction whether pending or posted. Note that there is currently no provision in the standards to guarantee the ability to correlate a pending transaction with an associated posted transaction
    */
  var status: PENDING | POSTED
  
  /**
    * A unique ID of the transaction adhering to the standards for ID permanence.  This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type. It is mandatory if `isDetailAvailable` is set to true.
    */
  var transactionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the transaction
    */
  var `type`: DIRECT_DEBIT | FEE | INTEREST_CHARGED | INTEREST_PAID | OTHER | PAYMENT | TRANSFER_INCOMING | TRANSFER_OUTGOING
  
  /**
    * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry
    */
  var valueDateTime: js.UndefOr[String | Null] = js.undefined
}
object BillerName {
  
  inline def apply(
    accountId: String,
    amount: String,
    description: String,
    isDetailAvailable: Boolean,
    reference: String,
    status: PENDING | POSTED,
    `type`: DIRECT_DEBIT | FEE | INTEREST_CHARGED | INTEREST_PAID | OTHER | PAYMENT | TRANSFER_INCOMING | TRANSFER_OUTGOING
  ): BillerName = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isDetailAvailable = isDetailAvailable.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillerName]
  }
  
  extension [Self <: BillerName](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setApcaNumber(value: String): Self = StObject.set(x, "apcaNumber", value.asInstanceOf[js.Any])
    
    inline def setApcaNumberNull: Self = StObject.set(x, "apcaNumber", null)
    
    inline def setApcaNumberUndefined: Self = StObject.set(x, "apcaNumber", js.undefined)
    
    inline def setBillerCode(value: String): Self = StObject.set(x, "billerCode", value.asInstanceOf[js.Any])
    
    inline def setBillerCodeNull: Self = StObject.set(x, "billerCode", null)
    
    inline def setBillerCodeUndefined: Self = StObject.set(x, "billerCode", js.undefined)
    
    inline def setBillerName(value: String): Self = StObject.set(x, "billerName", value.asInstanceOf[js.Any])
    
    inline def setBillerNameNull: Self = StObject.set(x, "billerName", null)
    
    inline def setBillerNameUndefined: Self = StObject.set(x, "billerName", js.undefined)
    
    inline def setCrn(value: String): Self = StObject.set(x, "crn", value.asInstanceOf[js.Any])
    
    inline def setCrnNull: Self = StObject.set(x, "crn", null)
    
    inline def setCrnUndefined: Self = StObject.set(x, "crn", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExecutionDateTime(value: String): Self = StObject.set(x, "executionDateTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionDateTimeNull: Self = StObject.set(x, "executionDateTime", null)
    
    inline def setExecutionDateTimeUndefined: Self = StObject.set(x, "executionDateTime", js.undefined)
    
    inline def setIsDetailAvailable(value: Boolean): Self = StObject.set(x, "isDetailAvailable", value.asInstanceOf[js.Any])
    
    inline def setMerchantCategoryCode(value: String): Self = StObject.set(x, "merchantCategoryCode", value.asInstanceOf[js.Any])
    
    inline def setMerchantCategoryCodeNull: Self = StObject.set(x, "merchantCategoryCode", null)
    
    inline def setMerchantCategoryCodeUndefined: Self = StObject.set(x, "merchantCategoryCode", js.undefined)
    
    inline def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
    
    inline def setMerchantNameNull: Self = StObject.set(x, "merchantName", null)
    
    inline def setMerchantNameUndefined: Self = StObject.set(x, "merchantName", js.undefined)
    
    inline def setPostingDateTime(value: String): Self = StObject.set(x, "postingDateTime", value.asInstanceOf[js.Any])
    
    inline def setPostingDateTimeNull: Self = StObject.set(x, "postingDateTime", null)
    
    inline def setPostingDateTimeUndefined: Self = StObject.set(x, "postingDateTime", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PENDING | POSTED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    inline def setType(
      value: DIRECT_DEBIT | FEE | INTEREST_CHARGED | INTEREST_PAID | OTHER | PAYMENT | TRANSFER_INCOMING | TRANSFER_OUTGOING
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeNull: Self = StObject.set(x, "valueDateTime", null)
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
  }
}
