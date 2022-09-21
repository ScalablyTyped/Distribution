package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AdditionalInfo
import typings.consumerDataStandards.consumerDataStandardsStrings.DAY
import typings.consumerDataStandards.consumerDataStandardsStrings.DOLLAR
import typings.consumerDataStandards.consumerDataStandardsStrings.MONTH
import typings.consumerDataStandards.consumerDataStandardsStrings.PERCENT
import typings.consumerDataStandards.consumerDataStandardsStrings.PER_TIER
import typings.consumerDataStandards.consumerDataStandardsStrings.WHOLE_BALANCE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingProductRateTierV3
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on the rate tier.
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on this rate tier
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines a condition for the applicability of a tiered rate
    */
  var applicabilityConditions: js.UndefOr[AdditionalInfo] = js.undefined
  
  /**
    * The number of tierUnitOfMeasure units that form the upper bound of the tier or band. For a tier with a discrete value (as opposed to a range of values e.g. 1 month) this must be the same as tierValueMinimum. Where this is the same as the tierValueMinimum value of the next-higher tier the referenced tier should be exclusive of this value. For example a term deposit of 2 months falls into the upper tier of the following tiers: (1 – 2 months, 2 – 3 months). If absent the tier's range has no upper bound.
    */
  var maximumValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of tierUnitOfMeasure units that form the lower bound of the tier. The tier should be inclusive of this value
    */
  var minimumValue: Double
  
  /**
    * A display name for the tier
    */
  var name: String
  
  /**
    * The method used to calculate the amount to be applied using one or more tiers. A single rate may be applied to the entire balance or each applicable tier rate is applied to the portion of the balance that falls into that tier (referred to as 'bands' or 'steps')
    */
  var rateApplicationMethod: js.UndefOr[PER_TIER | WHOLE_BALANCE | Null] = js.undefined
  
  /**
    * The unit of measure that applies to the tierValueMinimum and tierValueMaximum values e.g. a **DOLLAR** amount. **PERCENT** (in the case of loan-to-value ratio or LVR). Tier term period representing a discrete number of **MONTH**'s or **DAY**'s (in the case of term deposit tiers)
    */
  var unitOfMeasure: DAY | DOLLAR | MONTH | PERCENT
}
object BankingProductRateTierV3 {
  
  inline def apply(minimumValue: Double, name: String, unitOfMeasure: DAY | DOLLAR | MONTH | PERCENT): BankingProductRateTierV3 = {
    val __obj = js.Dynamic.literal(minimumValue = minimumValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unitOfMeasure = unitOfMeasure.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingProductRateTierV3]
  }
  
  extension [Self <: BankingProductRateTierV3](x: Self) {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setApplicabilityConditions(value: AdditionalInfo): Self = StObject.set(x, "applicabilityConditions", value.asInstanceOf[js.Any])
    
    inline def setApplicabilityConditionsUndefined: Self = StObject.set(x, "applicabilityConditions", js.undefined)
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueNull: Self = StObject.set(x, "maximumValue", null)
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRateApplicationMethod(value: PER_TIER | WHOLE_BALANCE): Self = StObject.set(x, "rateApplicationMethod", value.asInstanceOf[js.Any])
    
    inline def setRateApplicationMethodNull: Self = StObject.set(x, "rateApplicationMethod", null)
    
    inline def setRateApplicationMethodUndefined: Self = StObject.set(x, "rateApplicationMethod", js.undefined)
    
    inline def setUnitOfMeasure(value: DAY | DOLLAR | MONTH | PERCENT): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
  }
}
