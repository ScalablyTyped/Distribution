package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Category
import typings.consumerDataStandards.anon.DailyCharge
import typings.consumerDataStandards.anon.DailySupplyCharges
import typings.consumerDataStandards.anon.Eligibility
import typings.consumerDataStandards.anon.GreenPercentage
import typings.consumerDataStandards.anon.Information
import typings.consumerDataStandards.anon.PayerType
import typings.consumerDataStandards.anon.Scheme
import typings.consumerDataStandards.anon.Term
import typings.consumerDataStandards.consumerDataStandardsStrings.AEST
import typings.consumerDataStandards.consumerDataStandardsStrings.BPAY
import typings.consumerDataStandards.consumerDataStandardsStrings.CREDIT_CARD
import typings.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typings.consumerDataStandards.consumerDataStandardsStrings.FLEXIBLE
import typings.consumerDataStandards.consumerDataStandardsStrings.FLEXIBLE_CONT_LOAD
import typings.consumerDataStandards.consumerDataStandardsStrings.LOCAL
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

trait EnergyPlanContractFull
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Free text field containing additional information of the fees for this contract
    */
  var additionalFeeInformation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the benefit period.  Should only be present if termType has the value ONGOING
    */
  var benefitPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * An array of the available billing schedules for this contract. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var billFrequency: js.Array[String]
  
  /**
    * Required if pricing model is SINGLE_RATE_CONT_LOAD or TIME_OF_USE_CONT_LOAD or FLEXIBLE_CONT_LOAD
    */
  var controlledLoad: js.UndefOr[DailyCharge] = js.undefined
  
  /**
    * Number of days in the cooling off period for the contract.  Mandatory for plans with type of MARKET
    */
  var coolingOffDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional list of discounts available for the contract
    */
  var discounts: js.UndefOr[js.Array[Category]] = js.undefined
  
  /**
    * Eligibility restrictions or requirements
    */
  var eligibility: js.UndefOr[js.Array[Information]] = js.undefined
  
  /**
    * An array of fees applicable to the plan
    */
  var fees: js.UndefOr[js.Array[Term]] = js.undefined
  
  /**
    * Optional list of charges applicable to green power
    */
  var greenPowerCharges: js.UndefOr[js.Array[Scheme]] = js.undefined
  
  /**
    * Optional list of incentives available for the contract
    */
  var incentives: js.UndefOr[js.Array[Eligibility]] = js.undefined
  
  /**
    * Describes intrinsic green power for the plan.  If present then the plan includes a percentage of green power in the base plan. Should not be present for gas contracts
    */
  var intrinsicGreenPower: js.UndefOr[GreenPercentage | Null] = js.undefined
  
  /**
    * Flag indicating whether prices are fixed or variable
    */
  var isFixed: Boolean
  
  /**
    * An array of the meter types that this contract is available for
    */
  var meterTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Free text field that describes what will occur on or prior to expiry of the fixed contract term or benefit period
    */
  var onExpiryDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Payment options for this contract
    */
  var paymentOption: js.Array[PAPER_BILL | CREDIT_CARD | DIRECT_DEBIT | BPAY | OTHER]
  
  /**
    * The pricing model for the contract.  Contracts for gas must use SINGLE_RATE.  Note that the detail for the enumeration values are:<ul><li>**SINGLE_RATE** - all energy usage is charged at a single unit rate no matter when it is consumed. Multiple unit rates may exist that correspond to varying volumes of usage i.e. a ‘block’ or ‘step’ tariff (first 50kWh @ X cents, next 50kWh at Y cents etc.</li><li>**SINGLE_RATE_CONT_LOAD** - as above, but with an additional, separate unit rate charged for all energy usage from a controlled load i.e. separately metered appliance like hot water service, pool pump etc.</li><li>**TIME_OF_USE** - energy usage is charged at unit rates that vary dependent on time of day and day of week that the energy is consumed</li><li>**TIME_OF_USE_CONT_LOAD** - as above, but with an additional, separate unit rate charged for all energy usage from a controlled load i.e. separately metered appliance like hot water service, pool pump etc.</li><li>**FLEXIBLE** - energy usage is charged at unit rates that vary based on external factors</li><li>**FLEXIBLE_CONT_LOAD** - as above, but with an additional, separate unit rate charged for all energy usage from a controlled load i.e. separately metered appliance like hot water service, pool pump etc.</li><li>**QUOTA** - all energy usage is charged at a single fixed rate, up to a specified usage quota/allowance. All excess usage beyond the allowance is then charged at a single unit rate (may not be the best way to explain it but it is essentially a ‘subscription’ or telco style product i.e. $50/month for up to 150kWh included usage</li></ul>
    */
  var pricingModel: SINGLE_RATE | SINGLE_RATE_CONT_LOAD | TIME_OF_USE | TIME_OF_USE_CONT_LOAD | FLEXIBLE | FLEXIBLE_CONT_LOAD | QUOTA
  
  /**
    * Array of feed in tariffs for solar power
    */
  var solarFeedInTariff: js.UndefOr[js.Array[PayerType]] = js.undefined
  
  /**
    * Array of tariff periods
    */
  var tariffPeriod: js.Array[DailySupplyCharges]
  
  /**
    * The term for the contract.  If absent assumes no specified term
    */
  var termType: js.UndefOr[`1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | ONGOING | OTHER] = js.undefined
  
  /**
    * Free text description of the terms for the contract
    */
  var terms: js.UndefOr[String] = js.undefined
  
  /**
    * Required if pricingModel is set to TIME_OF_USE.  Defines the time zone to use for calculation of the time of use thresholds. Defaults to AEST if absent
    */
  var timeZone: js.UndefOr[LOCAL | AEST | Null] = js.undefined
  
  /**
    * Free text description of price variation policy and conditions for the contract.  Mandatory if isFixed is true
    */
  var variation: js.UndefOr[String | Null] = js.undefined
}
object EnergyPlanContractFull {
  
  inline def apply(
    billFrequency: js.Array[String],
    isFixed: Boolean,
    paymentOption: js.Array[PAPER_BILL | CREDIT_CARD | DIRECT_DEBIT | BPAY | OTHER],
    pricingModel: SINGLE_RATE | SINGLE_RATE_CONT_LOAD | TIME_OF_USE | TIME_OF_USE_CONT_LOAD | FLEXIBLE | FLEXIBLE_CONT_LOAD | QUOTA,
    tariffPeriod: js.Array[DailySupplyCharges]
  ): EnergyPlanContractFull = {
    val __obj = js.Dynamic.literal(billFrequency = billFrequency.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], paymentOption = paymentOption.asInstanceOf[js.Any], pricingModel = pricingModel.asInstanceOf[js.Any], tariffPeriod = tariffPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanContractFull]
  }
  
  extension [Self <: EnergyPlanContractFull](x: Self) {
    
    inline def setAdditionalFeeInformation(value: String): Self = StObject.set(x, "additionalFeeInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFeeInformationNull: Self = StObject.set(x, "additionalFeeInformation", null)
    
    inline def setAdditionalFeeInformationUndefined: Self = StObject.set(x, "additionalFeeInformation", js.undefined)
    
    inline def setBenefitPeriod(value: String): Self = StObject.set(x, "benefitPeriod", value.asInstanceOf[js.Any])
    
    inline def setBenefitPeriodUndefined: Self = StObject.set(x, "benefitPeriod", js.undefined)
    
    inline def setBillFrequency(value: js.Array[String]): Self = StObject.set(x, "billFrequency", value.asInstanceOf[js.Any])
    
    inline def setBillFrequencyVarargs(value: String*): Self = StObject.set(x, "billFrequency", js.Array(value*))
    
    inline def setControlledLoad(value: DailyCharge): Self = StObject.set(x, "controlledLoad", value.asInstanceOf[js.Any])
    
    inline def setControlledLoadUndefined: Self = StObject.set(x, "controlledLoad", js.undefined)
    
    inline def setCoolingOffDays(value: Double): Self = StObject.set(x, "coolingOffDays", value.asInstanceOf[js.Any])
    
    inline def setCoolingOffDaysUndefined: Self = StObject.set(x, "coolingOffDays", js.undefined)
    
    inline def setDiscounts(value: js.Array[Category]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: Category*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setEligibility(value: js.Array[Information]): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setEligibilityVarargs(value: Information*): Self = StObject.set(x, "eligibility", js.Array(value*))
    
    inline def setFees(value: js.Array[Term]): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    inline def setFeesVarargs(value: Term*): Self = StObject.set(x, "fees", js.Array(value*))
    
    inline def setGreenPowerCharges(value: js.Array[Scheme]): Self = StObject.set(x, "greenPowerCharges", value.asInstanceOf[js.Any])
    
    inline def setGreenPowerChargesUndefined: Self = StObject.set(x, "greenPowerCharges", js.undefined)
    
    inline def setGreenPowerChargesVarargs(value: Scheme*): Self = StObject.set(x, "greenPowerCharges", js.Array(value*))
    
    inline def setIncentives(value: js.Array[Eligibility]): Self = StObject.set(x, "incentives", value.asInstanceOf[js.Any])
    
    inline def setIncentivesUndefined: Self = StObject.set(x, "incentives", js.undefined)
    
    inline def setIncentivesVarargs(value: Eligibility*): Self = StObject.set(x, "incentives", js.Array(value*))
    
    inline def setIntrinsicGreenPower(value: GreenPercentage): Self = StObject.set(x, "intrinsicGreenPower", value.asInstanceOf[js.Any])
    
    inline def setIntrinsicGreenPowerNull: Self = StObject.set(x, "intrinsicGreenPower", null)
    
    inline def setIntrinsicGreenPowerUndefined: Self = StObject.set(x, "intrinsicGreenPower", js.undefined)
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setMeterTypes(value: js.Array[String]): Self = StObject.set(x, "meterTypes", value.asInstanceOf[js.Any])
    
    inline def setMeterTypesUndefined: Self = StObject.set(x, "meterTypes", js.undefined)
    
    inline def setMeterTypesVarargs(value: String*): Self = StObject.set(x, "meterTypes", js.Array(value*))
    
    inline def setOnExpiryDescription(value: String): Self = StObject.set(x, "onExpiryDescription", value.asInstanceOf[js.Any])
    
    inline def setOnExpiryDescriptionNull: Self = StObject.set(x, "onExpiryDescription", null)
    
    inline def setOnExpiryDescriptionUndefined: Self = StObject.set(x, "onExpiryDescription", js.undefined)
    
    inline def setPaymentOption(value: js.Array[PAPER_BILL | CREDIT_CARD | DIRECT_DEBIT | BPAY | OTHER]): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionVarargs(value: (PAPER_BILL | CREDIT_CARD | DIRECT_DEBIT | BPAY | OTHER)*): Self = StObject.set(x, "paymentOption", js.Array(value*))
    
    inline def setPricingModel(
      value: SINGLE_RATE | SINGLE_RATE_CONT_LOAD | TIME_OF_USE | TIME_OF_USE_CONT_LOAD | FLEXIBLE | FLEXIBLE_CONT_LOAD | QUOTA
    ): Self = StObject.set(x, "pricingModel", value.asInstanceOf[js.Any])
    
    inline def setSolarFeedInTariff(value: js.Array[PayerType]): Self = StObject.set(x, "solarFeedInTariff", value.asInstanceOf[js.Any])
    
    inline def setSolarFeedInTariffUndefined: Self = StObject.set(x, "solarFeedInTariff", js.undefined)
    
    inline def setSolarFeedInTariffVarargs(value: PayerType*): Self = StObject.set(x, "solarFeedInTariff", js.Array(value*))
    
    inline def setTariffPeriod(value: js.Array[DailySupplyCharges]): Self = StObject.set(x, "tariffPeriod", value.asInstanceOf[js.Any])
    
    inline def setTariffPeriodVarargs(value: DailySupplyCharges*): Self = StObject.set(x, "tariffPeriod", js.Array(value*))
    
    inline def setTermType(value: `1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | ONGOING | OTHER): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
    
    inline def setTermTypeUndefined: Self = StObject.set(x, "termType", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTimeZone(value: LOCAL | AEST): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationNull: Self = StObject.set(x, "variation", null)
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
