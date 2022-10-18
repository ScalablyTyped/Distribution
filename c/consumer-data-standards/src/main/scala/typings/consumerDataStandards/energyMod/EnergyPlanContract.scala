package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.GreenPercentage
import typings.consumerDataStandards.consumerDataStandardsStrings.AEST
import typings.consumerDataStandards.consumerDataStandardsStrings.BPAY
import typings.consumerDataStandards.consumerDataStandardsStrings.CREDIT_CARD
import typings.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typings.consumerDataStandards.consumerDataStandardsStrings.FLEXIBLE
import typings.consumerDataStandards.consumerDataStandardsStrings.FLEXIBLE_CONT_LOAD
import typings.consumerDataStandards.consumerDataStandardsStrings.LOCAL
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PAPER_BILL
import typings.consumerDataStandards.consumerDataStandardsStrings.QUOTA
import typings.consumerDataStandards.consumerDataStandardsStrings.SINGLE_RATE
import typings.consumerDataStandards.consumerDataStandardsStrings.SINGLE_RATE_CONT_LOAD
import typings.consumerDataStandards.consumerDataStandardsStrings.TIME_OF_USE
import typings.consumerDataStandards.consumerDataStandardsStrings.TIME_OF_USE_CONT_LOAD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanContract
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Free text field containing additional information of the fees for this contract
    */
  var additionalFeeInformation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required if pricing model is SINGLE_RATE_CONT_LOAD or TIME_OF_USE_CONT_LOAD or FLEXIBLE_CONT_LOAD
    */
  var controlledLoad: js.UndefOr[js.Array[EnergyPlanControlledLoad]] = js.undefined
  
  /**
    * Optional list of discounts available for the contract
    */
  var discounts: js.UndefOr[js.Array[EnergyPlanDiscounts]] = js.undefined
  
  /**
    * Eligibility restrictions or requirements
    */
  var eligibility: js.UndefOr[js.Array[EnergyPlanEligibility]] = js.undefined
  
  /**
    * An array of fees applicable to the plan
    */
  var fees: js.UndefOr[js.Array[EnergyPlanFees]] = js.undefined
  
  /**
    * Optional list of charges applicable to green power
    */
  var greenPowerCharges: js.UndefOr[js.Array[EnergyPlanGreenPowerCharges]] = js.undefined
  
  /**
    * Optional list of incentives available for the contract
    */
  var incentives: js.UndefOr[js.Array[EnergyPlanIncentives]] = js.undefined
  
  /**
    * Describes intrinsic green power for the plan.  If present then the plan includes a percentage of green power in the base plan. Should not be present for gas contracts
    */
  var intrinsicGreenPower: js.UndefOr[GreenPercentage | Null] = js.undefined
  
  /**
    * Flag indicating whether prices are fixed or variable
    */
  var isFixed: Boolean
  
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
  var solarFeedInTariff: js.UndefOr[js.Array[EnergyPlanSolarFeedInTariff]] = js.undefined
  
  /**
    * Array of tariff periods
    */
  var tariffPeriod: js.Array[EnergyPlanTariffPeriod]
  
  /**
    * Required if pricingModel is set to TIME_OF_USE.  Defines the time zone to use for calculation of the time of use thresholds. Defaults to AEST if absent
    */
  var timeZone: js.UndefOr[LOCAL | AEST | Null] = js.undefined
  
  /**
    * Free text description of price variation policy and conditions for the contract.  Mandatory if `isFixed` is false
    */
  var variation: js.UndefOr[String | Null] = js.undefined
}
object EnergyPlanContract {
  
  inline def apply(
    isFixed: Boolean,
    paymentOption: js.Array[PAPER_BILL | CREDIT_CARD | DIRECT_DEBIT | BPAY | OTHER],
    pricingModel: SINGLE_RATE | SINGLE_RATE_CONT_LOAD | TIME_OF_USE | TIME_OF_USE_CONT_LOAD | FLEXIBLE | FLEXIBLE_CONT_LOAD | QUOTA,
    tariffPeriod: js.Array[EnergyPlanTariffPeriod]
  ): EnergyPlanContract = {
    val __obj = js.Dynamic.literal(isFixed = isFixed.asInstanceOf[js.Any], paymentOption = paymentOption.asInstanceOf[js.Any], pricingModel = pricingModel.asInstanceOf[js.Any], tariffPeriod = tariffPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanContract]
  }
  
  extension [Self <: EnergyPlanContract](x: Self) {
    
    inline def setAdditionalFeeInformation(value: String): Self = StObject.set(x, "additionalFeeInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFeeInformationNull: Self = StObject.set(x, "additionalFeeInformation", null)
    
    inline def setAdditionalFeeInformationUndefined: Self = StObject.set(x, "additionalFeeInformation", js.undefined)
    
    inline def setControlledLoad(value: js.Array[EnergyPlanControlledLoad]): Self = StObject.set(x, "controlledLoad", value.asInstanceOf[js.Any])
    
    inline def setControlledLoadUndefined: Self = StObject.set(x, "controlledLoad", js.undefined)
    
    inline def setControlledLoadVarargs(value: EnergyPlanControlledLoad*): Self = StObject.set(x, "controlledLoad", js.Array(value*))
    
    inline def setDiscounts(value: js.Array[EnergyPlanDiscounts]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: EnergyPlanDiscounts*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setEligibility(value: js.Array[EnergyPlanEligibility]): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setEligibilityVarargs(value: EnergyPlanEligibility*): Self = StObject.set(x, "eligibility", js.Array(value*))
    
    inline def setFees(value: js.Array[EnergyPlanFees]): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    inline def setFeesVarargs(value: EnergyPlanFees*): Self = StObject.set(x, "fees", js.Array(value*))
    
    inline def setGreenPowerCharges(value: js.Array[EnergyPlanGreenPowerCharges]): Self = StObject.set(x, "greenPowerCharges", value.asInstanceOf[js.Any])
    
    inline def setGreenPowerChargesUndefined: Self = StObject.set(x, "greenPowerCharges", js.undefined)
    
    inline def setGreenPowerChargesVarargs(value: EnergyPlanGreenPowerCharges*): Self = StObject.set(x, "greenPowerCharges", js.Array(value*))
    
    inline def setIncentives(value: js.Array[EnergyPlanIncentives]): Self = StObject.set(x, "incentives", value.asInstanceOf[js.Any])
    
    inline def setIncentivesUndefined: Self = StObject.set(x, "incentives", js.undefined)
    
    inline def setIncentivesVarargs(value: EnergyPlanIncentives*): Self = StObject.set(x, "incentives", js.Array(value*))
    
    inline def setIntrinsicGreenPower(value: GreenPercentage): Self = StObject.set(x, "intrinsicGreenPower", value.asInstanceOf[js.Any])
    
    inline def setIntrinsicGreenPowerNull: Self = StObject.set(x, "intrinsicGreenPower", null)
    
    inline def setIntrinsicGreenPowerUndefined: Self = StObject.set(x, "intrinsicGreenPower", js.undefined)
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setOnExpiryDescription(value: String): Self = StObject.set(x, "onExpiryDescription", value.asInstanceOf[js.Any])
    
    inline def setOnExpiryDescriptionNull: Self = StObject.set(x, "onExpiryDescription", null)
    
    inline def setOnExpiryDescriptionUndefined: Self = StObject.set(x, "onExpiryDescription", js.undefined)
    
    inline def setPaymentOption(value: js.Array[PAPER_BILL | CREDIT_CARD | DIRECT_DEBIT | BPAY | OTHER]): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionVarargs(value: (PAPER_BILL | CREDIT_CARD | DIRECT_DEBIT | BPAY | OTHER)*): Self = StObject.set(x, "paymentOption", js.Array(value*))
    
    inline def setPricingModel(
      value: SINGLE_RATE | SINGLE_RATE_CONT_LOAD | TIME_OF_USE | TIME_OF_USE_CONT_LOAD | FLEXIBLE | FLEXIBLE_CONT_LOAD | QUOTA
    ): Self = StObject.set(x, "pricingModel", value.asInstanceOf[js.Any])
    
    inline def setSolarFeedInTariff(value: js.Array[EnergyPlanSolarFeedInTariff]): Self = StObject.set(x, "solarFeedInTariff", value.asInstanceOf[js.Any])
    
    inline def setSolarFeedInTariffUndefined: Self = StObject.set(x, "solarFeedInTariff", js.undefined)
    
    inline def setSolarFeedInTariffVarargs(value: EnergyPlanSolarFeedInTariff*): Self = StObject.set(x, "solarFeedInTariff", js.Array(value*))
    
    inline def setTariffPeriod(value: js.Array[EnergyPlanTariffPeriod]): Self = StObject.set(x, "tariffPeriod", value.asInstanceOf[js.Any])
    
    inline def setTariffPeriodVarargs(value: EnergyPlanTariffPeriod*): Self = StObject.set(x, "tariffPeriod", js.Array(value*))
    
    inline def setTimeZone(value: LOCAL | AEST): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationNull: Self = StObject.set(x, "variation", null)
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
