package typings.consumerDataStandards.energyMod

import typings.consumerDataStandards.anon.MaximumValue
import typings.consumerDataStandards.consumerDataStandardsStrings.DUAL
import typings.consumerDataStandards.consumerDataStandardsStrings.ELECTRICITY
import typings.consumerDataStandards.consumerDataStandardsStrings.GAS
import typings.consumerDataStandards.consumerDataStandardsStrings.MARKET
import typings.consumerDataStandards.consumerDataStandardsStrings.REGULATED
import typings.consumerDataStandards.consumerDataStandardsStrings.STANDING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanDetail
  extends StObject
     with EnergyPlan {
  
  /**
    * The details of the terms for the supply of electricity under this plan.  Is mandatory if fuelType is set to ELECTRICITY or DUAL
    */
  var electricityContract: js.UndefOr[EnergyPlanContractFull] = js.undefined
  
  /**
    * The details of the terms for the supply of electricity under this plan.  Is mandatory if fuelType is set to GAS or DUAL
    */
  var gasContract: js.UndefOr[EnergyPlanContractFull] = js.undefined
  
  /**
    * Charges for metering included in the plan
    */
  var meteringCharges: js.UndefOr[MaximumValue] = js.undefined
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyPlanDetail] (val x: Self) extends AnyVal {
    
    inline def setElectricityContract(value: EnergyPlanContractFull): Self = StObject.set(x, "electricityContract", value.asInstanceOf[js.Any])
    
    inline def setElectricityContractUndefined: Self = StObject.set(x, "electricityContract", js.undefined)
    
    inline def setGasContract(value: EnergyPlanContractFull): Self = StObject.set(x, "gasContract", value.asInstanceOf[js.Any])
    
    inline def setGasContractUndefined: Self = StObject.set(x, "gasContract", js.undefined)
    
    inline def setMeteringCharges(value: MaximumValue): Self = StObject.set(x, "meteringCharges", value.asInstanceOf[js.Any])
    
    inline def setMeteringChargesUndefined: Self = StObject.set(x, "meteringCharges", js.undefined)
  }
}
