package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BUNDLE_DISCOUNT_FIXED
import typings.consumerDataStandards.consumerDataStandardsStrings.BUNDLE_DISCOUNT_VARIABLE
import typings.consumerDataStandards.consumerDataStandardsStrings.CASH_ADVANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.DISCOUNT
import typings.consumerDataStandards.consumerDataStandardsStrings.FIXED
import typings.consumerDataStandards.consumerDataStandardsStrings.FLOATING
import typings.consumerDataStandards.consumerDataStandardsStrings.INTEREST_ONLY
import typings.consumerDataStandards.consumerDataStandardsStrings.INTRODUCTORY
import typings.consumerDataStandards.consumerDataStandardsStrings.INVESTMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.IN_ADVANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.IN_ARREARS
import typings.consumerDataStandards.consumerDataStandardsStrings.MARKET_LINKED
import typings.consumerDataStandards.consumerDataStandardsStrings.OWNER_OCCUPIED
import typings.consumerDataStandards.consumerDataStandardsStrings.PENALTY
import typings.consumerDataStandards.consumerDataStandardsStrings.PRINCIPAL_AND_INTEREST
import typings.consumerDataStandards.consumerDataStandardsStrings.PURCHASE
import typings.consumerDataStandards.consumerDataStandardsStrings.VARIABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationFrequency
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on the rate.
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on this rate
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generic field containing additional information relevant to the [lendingRateType](#tocSproductlendingratetypedoc) specified. Whether mandatory or not is dependent on the value of [lendingRateType](#tocSproductlendingratetypedoc)
    */
  var additionalValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The period after which the calculated amount(s) (see calculationFrequency) are 'applied' (i.e. debited or credited) to the account. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var applicationFrequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The period after which the rate is applied to the balance to calculate the amount due for the period. Calculation of the amount is often daily (as balances may change) but accumulated until the total amount is 'applied' to the account (see applicationFrequency). Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var calculationFrequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A comparison rate equivalent for this rate
    */
  var comparisonRate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When loan payments are due to be paid within each period. The investment benefit of earlier payments affect the rate that can be offered
    */
  var interestPaymentDue: js.UndefOr[IN_ADVANCE | IN_ARREARS | Null] = js.undefined
  
  /**
    * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
    */
  var lendingRateType: BUNDLE_DISCOUNT_FIXED | BUNDLE_DISCOUNT_VARIABLE | CASH_ADVANCE | DISCOUNT | FIXED | FLOATING | INTRODUCTORY | MARKET_LINKED | PENALTY | PURCHASE | VARIABLE
  
  /**
    * The reason for taking out the loan. If absent, the lending rate is applicable to all loan purposes
    */
  var loanPurpose: js.UndefOr[INVESTMENT | OWNER_OCCUPIED | Null] = js.undefined
  
  /**
    * The rate to be applied
    */
  var rate: String
  
  /**
    * Options in place for repayments. If absent, the lending rate is applicable to all repayment types
    */
  var repaymentType: js.UndefOr[INTEREST_ONLY | PRINCIPAL_AND_INTEREST | Null] = js.undefined
  
  /**
    * Rate tiers applicable for this rate
    */
  var tiers: js.UndefOr[js.Array[AdditionalInfoUri] | Null] = js.undefined
}
object ApplicationFrequency {
  
  inline def apply(
    lendingRateType: BUNDLE_DISCOUNT_FIXED | BUNDLE_DISCOUNT_VARIABLE | CASH_ADVANCE | DISCOUNT | FIXED | FLOATING | INTRODUCTORY | MARKET_LINKED | PENALTY | PURCHASE | VARIABLE,
    rate: String
  ): ApplicationFrequency = {
    val __obj = js.Dynamic.literal(lendingRateType = lendingRateType.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationFrequency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationFrequency] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setAdditionalValue(value: String): Self = StObject.set(x, "additionalValue", value.asInstanceOf[js.Any])
    
    inline def setAdditionalValueNull: Self = StObject.set(x, "additionalValue", null)
    
    inline def setAdditionalValueUndefined: Self = StObject.set(x, "additionalValue", js.undefined)
    
    inline def setApplicationFrequency(value: String): Self = StObject.set(x, "applicationFrequency", value.asInstanceOf[js.Any])
    
    inline def setApplicationFrequencyNull: Self = StObject.set(x, "applicationFrequency", null)
    
    inline def setApplicationFrequencyUndefined: Self = StObject.set(x, "applicationFrequency", js.undefined)
    
    inline def setCalculationFrequency(value: String): Self = StObject.set(x, "calculationFrequency", value.asInstanceOf[js.Any])
    
    inline def setCalculationFrequencyNull: Self = StObject.set(x, "calculationFrequency", null)
    
    inline def setCalculationFrequencyUndefined: Self = StObject.set(x, "calculationFrequency", js.undefined)
    
    inline def setComparisonRate(value: String): Self = StObject.set(x, "comparisonRate", value.asInstanceOf[js.Any])
    
    inline def setComparisonRateNull: Self = StObject.set(x, "comparisonRate", null)
    
    inline def setComparisonRateUndefined: Self = StObject.set(x, "comparisonRate", js.undefined)
    
    inline def setInterestPaymentDue(value: IN_ADVANCE | IN_ARREARS): Self = StObject.set(x, "interestPaymentDue", value.asInstanceOf[js.Any])
    
    inline def setInterestPaymentDueNull: Self = StObject.set(x, "interestPaymentDue", null)
    
    inline def setInterestPaymentDueUndefined: Self = StObject.set(x, "interestPaymentDue", js.undefined)
    
    inline def setLendingRateType(
      value: BUNDLE_DISCOUNT_FIXED | BUNDLE_DISCOUNT_VARIABLE | CASH_ADVANCE | DISCOUNT | FIXED | FLOATING | INTRODUCTORY | MARKET_LINKED | PENALTY | PURCHASE | VARIABLE
    ): Self = StObject.set(x, "lendingRateType", value.asInstanceOf[js.Any])
    
    inline def setLoanPurpose(value: INVESTMENT | OWNER_OCCUPIED): Self = StObject.set(x, "loanPurpose", value.asInstanceOf[js.Any])
    
    inline def setLoanPurposeNull: Self = StObject.set(x, "loanPurpose", null)
    
    inline def setLoanPurposeUndefined: Self = StObject.set(x, "loanPurpose", js.undefined)
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRepaymentType(value: INTEREST_ONLY | PRINCIPAL_AND_INTEREST): Self = StObject.set(x, "repaymentType", value.asInstanceOf[js.Any])
    
    inline def setRepaymentTypeNull: Self = StObject.set(x, "repaymentType", null)
    
    inline def setRepaymentTypeUndefined: Self = StObject.set(x, "repaymentType", js.undefined)
    
    inline def setTiers(value: js.Array[AdditionalInfoUri]): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
    
    inline def setTiersNull: Self = StObject.set(x, "tiers", null)
    
    inline def setTiersUndefined: Self = StObject.set(x, "tiers", js.undefined)
    
    inline def setTiersVarargs(value: AdditionalInfoUri*): Self = StObject.set(x, "tiers", js.Array(value*))
  }
}
