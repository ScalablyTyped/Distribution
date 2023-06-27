package typings.consumerDataStandards.energyMod

import typings.consumerDataStandards.consumerDataStandardsStrings.BPAY
import typings.consumerDataStandards.consumerDataStandardsStrings.CREDIT_CARD
import typings.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typings.consumerDataStandards.consumerDataStandardsStrings.FLEXIBLE
import typings.consumerDataStandards.consumerDataStandardsStrings.FLEXIBLE_CONT_LOAD
import typings.consumerDataStandards.consumerDataStandardsStrings.ONGOING
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PAPER_BILL
import typings.consumerDataStandards.consumerDataStandardsStrings.QUOTA
import typings.consumerDataStandards.consumerDataStandardsStrings.SINGLE_RATE
import typings.consumerDataStandards.consumerDataStandardsStrings.SINGLE_RATE_CONT_LOAD
import typings.consumerDataStandards.consumerDataStandardsStrings.TIME_OF_USE
import typings.consumerDataStandards.consumerDataStandardsStrings.TIME_OF_USE_CONT_LOAD
import typings.consumerDataStandards.consumerDataStandardsStrings.`1_YEAR`
import typings.consumerDataStandards.consumerDataStandardsStrings.`2_YEAR`
import typings.consumerDataStandards.consumerDataStandardsStrings.`3_YEAR`
import typings.consumerDataStandards.consumerDataStandardsStrings.`4_YEAR`
import typings.consumerDataStandards.consumerDataStandardsStrings.`5_YEAR`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanContractFullV2
  extends StObject
     with EnergyPlanContractV2 {
  
  /**
    * Description of the benefit period.  Should only be present if termType has the value ONGOING
    */
  var benefitPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * An array of the available billing schedules for this contract. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var billFrequency: js.Array[String]
  
  /**
    * Number of days in the cooling off period for the contract.  Mandatory for plans with type of MARKET
    */
  var coolingOffDays: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of the meter types that this contract is available for
    */
  var meterTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The term for the contract.  If absent assumes no specified term
    */
  var termType: js.UndefOr[`1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | ONGOING | OTHER] = js.undefined
  
  /**
    * Free text description of the terms for the contract
    */
  var terms: js.UndefOr[String] = js.undefined
}
object EnergyPlanContractFullV2 {
  
  inline def apply(
    billFrequency: js.Array[String],
    isFixed: Boolean,
    paymentOption: js.Array[PAPER_BILL | CREDIT_CARD | DIRECT_DEBIT | BPAY | OTHER],
    pricingModel: SINGLE_RATE | SINGLE_RATE_CONT_LOAD | TIME_OF_USE | TIME_OF_USE_CONT_LOAD | FLEXIBLE | FLEXIBLE_CONT_LOAD | QUOTA,
    tariffPeriod: js.Array[EnergyPlanTariffPeriod]
  ): EnergyPlanContractFullV2 = {
    val __obj = js.Dynamic.literal(billFrequency = billFrequency.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], paymentOption = paymentOption.asInstanceOf[js.Any], pricingModel = pricingModel.asInstanceOf[js.Any], tariffPeriod = tariffPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanContractFullV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyPlanContractFullV2] (val x: Self) extends AnyVal {
    
    inline def setBenefitPeriod(value: String): Self = StObject.set(x, "benefitPeriod", value.asInstanceOf[js.Any])
    
    inline def setBenefitPeriodUndefined: Self = StObject.set(x, "benefitPeriod", js.undefined)
    
    inline def setBillFrequency(value: js.Array[String]): Self = StObject.set(x, "billFrequency", value.asInstanceOf[js.Any])
    
    inline def setBillFrequencyVarargs(value: String*): Self = StObject.set(x, "billFrequency", js.Array(value*))
    
    inline def setCoolingOffDays(value: Double): Self = StObject.set(x, "coolingOffDays", value.asInstanceOf[js.Any])
    
    inline def setCoolingOffDaysUndefined: Self = StObject.set(x, "coolingOffDays", js.undefined)
    
    inline def setMeterTypes(value: js.Array[String]): Self = StObject.set(x, "meterTypes", value.asInstanceOf[js.Any])
    
    inline def setMeterTypesUndefined: Self = StObject.set(x, "meterTypes", js.undefined)
    
    inline def setMeterTypesVarargs(value: String*): Self = StObject.set(x, "meterTypes", js.Array(value*))
    
    inline def setTermType(value: `1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | ONGOING | OTHER): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
    
    inline def setTermTypeUndefined: Self = StObject.set(x, "termType", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
  }
}
