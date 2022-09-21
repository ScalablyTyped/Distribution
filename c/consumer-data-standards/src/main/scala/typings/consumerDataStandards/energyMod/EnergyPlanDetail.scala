package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.BenefitPeriod
import typings.consumerDataStandards.anon.BundleUri
import typings.consumerDataStandards.anon.ExcludedPostcodes
import typings.consumerDataStandards.anon.MaximumValue
import typings.consumerDataStandards.consumerDataStandardsStrings.BUSINESS
import typings.consumerDataStandards.consumerDataStandardsStrings.DUAL
import typings.consumerDataStandards.consumerDataStandardsStrings.ELECTRICITY
import typings.consumerDataStandards.consumerDataStandardsStrings.GAS
import typings.consumerDataStandards.consumerDataStandardsStrings.MARKET
import typings.consumerDataStandards.consumerDataStandardsStrings.REGULATED
import typings.consumerDataStandards.consumerDataStandardsStrings.RESIDENTIAL
import typings.consumerDataStandards.consumerDataStandardsStrings.STANDING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanDetail
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Object that contains links to additional information on specific topics
    */
  var additionalInformation: js.UndefOr[BundleUri | Null] = js.undefined
  
  /**
    * A link to an application web page where this plan can be applied for
    */
  var applicationUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the brand under which this plan is offered
    */
  var brand: String
  
  /**
    * The display name of the brand under which this plan is offered
    */
  var brandName: String
  
  /**
    * The type of customer that the plan is offered to.  If absent then the plan is available to all customers
    */
  var customerType: js.UndefOr[RESIDENTIAL | BUSINESS | Null] = js.undefined
  
  /**
    * A description of the plan
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the plan
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time from which this plan is effective (ie. is available for origination). Used to enable the articulation of products to the regime before they are available for customers to originate
    */
  var effectiveFrom: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time at which this plan will be retired and will no longer be offered. Used to enable the managed deprecation of plans
    */
  var effectiveTo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The details of the terms for the supply of electricity under this plan.  Is mandatory if fuelType is set to ELECTRICITY or DUAL
    */
  var electricityContract: js.UndefOr[BenefitPeriod] = js.undefined
  
  /**
    * The fuel types covered by the plan
    */
  var fuelType: ELECTRICITY | GAS | DUAL
  
  /**
    * The details of the terms for the supply of electricity under this plan.  Is mandatory if fuelType is set to GAS or DUAL
    */
  var gasContract: js.UndefOr[BenefitPeriod] = js.undefined
  
  /**
    * Describes the geographical area that the plan is available for.  If absent then it is assumed the plan is not geographically limited
    */
  var geography: js.UndefOr[ExcludedPostcodes | Null] = js.undefined
  
  /**
    * The last date and time that the information for this plan was changed (or the creation date for the plan if it has never been altered)
    */
  var lastUpdated: String
  
  /**
    * Charges for metering included in the plan
    */
  var meteringCharges: js.UndefOr[js.Array[MaximumValue]] = js.undefined
  
  /**
    * The ID of the specific plan
    */
  var planId: String
  
  /**
    * The type of the plan
    */
  var `type`: STANDING | MARKET | REGULATED
}
object EnergyPlanDetail {
  
  inline def apply(
    brand: String,
    brandName: String,
    fuelType: ELECTRICITY | GAS | DUAL,
    lastUpdated: String,
    planId: String,
    `type`: STANDING | MARKET | REGULATED
  ): EnergyPlanDetail = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], brandName = brandName.asInstanceOf[js.Any], fuelType = fuelType.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanDetail]
  }
  
  extension [Self <: EnergyPlanDetail](x: Self) {
    
    inline def setAdditionalInformation(value: BundleUri): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInformationNull: Self = StObject.set(x, "additionalInformation", null)
    
    inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
    
    inline def setApplicationUri(value: String): Self = StObject.set(x, "applicationUri", value.asInstanceOf[js.Any])
    
    inline def setApplicationUriNull: Self = StObject.set(x, "applicationUri", null)
    
    inline def setApplicationUriUndefined: Self = StObject.set(x, "applicationUri", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setCustomerType(value: RESIDENTIAL | BUSINESS): Self = StObject.set(x, "customerType", value.asInstanceOf[js.Any])
    
    inline def setCustomerTypeNull: Self = StObject.set(x, "customerType", null)
    
    inline def setCustomerTypeUndefined: Self = StObject.set(x, "customerType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEffectiveFrom(value: String): Self = StObject.set(x, "effectiveFrom", value.asInstanceOf[js.Any])
    
    inline def setEffectiveFromNull: Self = StObject.set(x, "effectiveFrom", null)
    
    inline def setEffectiveFromUndefined: Self = StObject.set(x, "effectiveFrom", js.undefined)
    
    inline def setEffectiveTo(value: String): Self = StObject.set(x, "effectiveTo", value.asInstanceOf[js.Any])
    
    inline def setEffectiveToNull: Self = StObject.set(x, "effectiveTo", null)
    
    inline def setEffectiveToUndefined: Self = StObject.set(x, "effectiveTo", js.undefined)
    
    inline def setElectricityContract(value: BenefitPeriod): Self = StObject.set(x, "electricityContract", value.asInstanceOf[js.Any])
    
    inline def setElectricityContractUndefined: Self = StObject.set(x, "electricityContract", js.undefined)
    
    inline def setFuelType(value: ELECTRICITY | GAS | DUAL): Self = StObject.set(x, "fuelType", value.asInstanceOf[js.Any])
    
    inline def setGasContract(value: BenefitPeriod): Self = StObject.set(x, "gasContract", value.asInstanceOf[js.Any])
    
    inline def setGasContractUndefined: Self = StObject.set(x, "gasContract", js.undefined)
    
    inline def setGeography(value: ExcludedPostcodes): Self = StObject.set(x, "geography", value.asInstanceOf[js.Any])
    
    inline def setGeographyNull: Self = StObject.set(x, "geography", null)
    
    inline def setGeographyUndefined: Self = StObject.set(x, "geography", js.undefined)
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setMeteringCharges(value: js.Array[MaximumValue]): Self = StObject.set(x, "meteringCharges", value.asInstanceOf[js.Any])
    
    inline def setMeteringChargesUndefined: Self = StObject.set(x, "meteringCharges", js.undefined)
    
    inline def setMeteringChargesVarargs(value: MaximumValue*): Self = StObject.set(x, "meteringCharges", js.Array(value*))
    
    inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setType(value: STANDING | MARKET | REGULATED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
