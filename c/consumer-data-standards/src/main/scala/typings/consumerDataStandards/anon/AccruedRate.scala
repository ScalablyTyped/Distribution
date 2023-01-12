package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BALANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.DEPOSITS
import typings.consumerDataStandards.consumerDataStandardsStrings.ELIGIBILITY_ONLY
import typings.consumerDataStandards.consumerDataStandardsStrings.FEE_CAP
import typings.consumerDataStandards.consumerDataStandardsStrings.PAYMENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccruedRate
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A discount rate calculated based on a proportion of the calculated interest accrued on the account. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee
    */
  var accruedRate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display text providing more information on the discount
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on this discount
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generic field containing additional information relevant to the [discountType](#tocSproductdiscounttypedoc) specified. Whether mandatory or not is dependent on the value of [discountType](#tocSproductdiscounttypedoc)
    */
  var additionalValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dollar value of the discount. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory.
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A discount rate calculated based on a proportion of the balance. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee
    */
  var balanceRate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the discount
    */
  var description: String
  
  /**
    * The type of discount. See the next section for an overview of valid values and their meaning
    */
  var discountType: BALANCE | DEPOSITS | ELIGIBILITY_ONLY | FEE_CAP | PAYMENTS
  
  /**
    * Eligibility constraints that apply to this discount. Mandatory if ``discountType`` is ``ELIGIBILITY_ONLY``.
    */
  var eligibility: js.UndefOr[js.Array[DiscountEligibilityType] | Null] = js.undefined
  
  /**
    * A discount rate calculated based on a proportion of the fee to which this discount is attached. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee
    */
  var feeRate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A discount rate calculated based on a proportion of a transaction. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory
    */
  var transactionRate: js.UndefOr[String | Null] = js.undefined
}
object AccruedRate {
  
  inline def apply(description: String, discountType: BALANCE | DEPOSITS | ELIGIBILITY_ONLY | FEE_CAP | PAYMENTS): AccruedRate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], discountType = discountType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccruedRate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccruedRate] (val x: Self) extends AnyVal {
    
    inline def setAccruedRate(value: String): Self = StObject.set(x, "accruedRate", value.asInstanceOf[js.Any])
    
    inline def setAccruedRateNull: Self = StObject.set(x, "accruedRate", null)
    
    inline def setAccruedRateUndefined: Self = StObject.set(x, "accruedRate", js.undefined)
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setAdditionalValue(value: String): Self = StObject.set(x, "additionalValue", value.asInstanceOf[js.Any])
    
    inline def setAdditionalValueNull: Self = StObject.set(x, "additionalValue", null)
    
    inline def setAdditionalValueUndefined: Self = StObject.set(x, "additionalValue", js.undefined)
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setBalanceRate(value: String): Self = StObject.set(x, "balanceRate", value.asInstanceOf[js.Any])
    
    inline def setBalanceRateNull: Self = StObject.set(x, "balanceRate", null)
    
    inline def setBalanceRateUndefined: Self = StObject.set(x, "balanceRate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDiscountType(value: BALANCE | DEPOSITS | ELIGIBILITY_ONLY | FEE_CAP | PAYMENTS): Self = StObject.set(x, "discountType", value.asInstanceOf[js.Any])
    
    inline def setEligibility(value: js.Array[DiscountEligibilityType]): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityNull: Self = StObject.set(x, "eligibility", null)
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setEligibilityVarargs(value: DiscountEligibilityType*): Self = StObject.set(x, "eligibility", js.Array(value*))
    
    inline def setFeeRate(value: String): Self = StObject.set(x, "feeRate", value.asInstanceOf[js.Any])
    
    inline def setFeeRateNull: Self = StObject.set(x, "feeRate", null)
    
    inline def setFeeRateUndefined: Self = StObject.set(x, "feeRate", js.undefined)
    
    inline def setTransactionRate(value: String): Self = StObject.set(x, "transactionRate", value.asInstanceOf[js.Any])
    
    inline def setTransactionRateNull: Self = StObject.set(x, "transactionRate", null)
    
    inline def setTransactionRateUndefined: Self = StObject.set(x, "transactionRate", js.undefined)
  }
}
