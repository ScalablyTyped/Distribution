package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BONUS
import typings.consumerDataStandards.consumerDataStandardsStrings.BUNDLE_BONUS
import typings.consumerDataStandards.consumerDataStandardsStrings.FIXED
import typings.consumerDataStandards.consumerDataStandardsStrings.FLOATING
import typings.consumerDataStandards.consumerDataStandardsStrings.INTRODUCTORY
import typings.consumerDataStandards.consumerDataStandardsStrings.MARKET_LINKED
import typings.consumerDataStandards.consumerDataStandardsStrings.VARIABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalValue
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on the rate
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on this rate
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generic field containing additional information relevant to the [depositRateType](#tocSproductdepositratetypedoc) specified. Whether mandatory or not is dependent on the value of [depositRateType](#tocSproductdepositratetypedoc)
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
    * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
    */
  var depositRateType: BONUS | BUNDLE_BONUS | FIXED | FLOATING | INTRODUCTORY | MARKET_LINKED | VARIABLE
  
  /**
    * The rate to be applied
    */
  var rate: String
  
  /**
    * Rate tiers applicable for this rate
    */
  var tiers: js.UndefOr[js.Array[AdditionalInfoUri] | Null] = js.undefined
}
object AdditionalValue {
  
  inline def apply(
    depositRateType: BONUS | BUNDLE_BONUS | FIXED | FLOATING | INTRODUCTORY | MARKET_LINKED | VARIABLE,
    rate: String
  ): AdditionalValue = {
    val __obj = js.Dynamic.literal(depositRateType = depositRateType.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalValue] (val x: Self) extends AnyVal {
    
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
    
    inline def setDepositRateType(value: BONUS | BUNDLE_BONUS | FIXED | FLOATING | INTRODUCTORY | MARKET_LINKED | VARIABLE): Self = StObject.set(x, "depositRateType", value.asInstanceOf[js.Any])
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setTiers(value: js.Array[AdditionalInfoUri]): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
    
    inline def setTiersNull: Self = StObject.set(x, "tiers", null)
    
    inline def setTiersUndefined: Self = StObject.set(x, "tiers", js.undefined)
    
    inline def setTiersVarargs(value: AdditionalInfoUri*): Self = StObject.set(x, "tiers", js.Array(value*))
  }
}
