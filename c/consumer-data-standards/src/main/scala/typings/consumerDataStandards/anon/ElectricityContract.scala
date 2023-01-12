package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.DUAL
import typings.consumerDataStandards.consumerDataStandardsStrings.ELECTRICITY
import typings.consumerDataStandards.consumerDataStandardsStrings.GAS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElectricityContract
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The details of the terms for the supply of electricity under this plan.  Is mandatory if fuelType is set to ELECTRICITY or DUAL
    */
  var electricityContract: js.UndefOr[AdditionalFeeInformation] = js.undefined
  
  /**
    * The fuel types covered by the plan
    */
  var fuelType: ELECTRICITY | GAS | DUAL
  
  /**
    * The details of the terms for the supply of electricity under this plan.  Is mandatory if fuelType is set to GAS or DUAL
    */
  var gasContract: js.UndefOr[AdditionalFeeInformation] = js.undefined
  
  /**
    * Flag that indicates that the plan is contingent on the customer taking up an alternate fuel plan from the same retailer (for instance, if the fuelType is ELECTRICITY then a GAS plan from the same retailer must be taken up). Has no meaning if the plan has a fuelType of DUAL. If absent the value is assumed to be false
    */
  var isContingentPlan: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Charges for metering included in the plan
    */
  var meteringCharges: js.UndefOr[js.Array[MaximumValue]] = js.undefined
}
object ElectricityContract {
  
  inline def apply(fuelType: ELECTRICITY | GAS | DUAL): ElectricityContract = {
    val __obj = js.Dynamic.literal(fuelType = fuelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectricityContract]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElectricityContract] (val x: Self) extends AnyVal {
    
    inline def setElectricityContract(value: AdditionalFeeInformation): Self = StObject.set(x, "electricityContract", value.asInstanceOf[js.Any])
    
    inline def setElectricityContractUndefined: Self = StObject.set(x, "electricityContract", js.undefined)
    
    inline def setFuelType(value: ELECTRICITY | GAS | DUAL): Self = StObject.set(x, "fuelType", value.asInstanceOf[js.Any])
    
    inline def setGasContract(value: AdditionalFeeInformation): Self = StObject.set(x, "gasContract", value.asInstanceOf[js.Any])
    
    inline def setGasContractUndefined: Self = StObject.set(x, "gasContract", js.undefined)
    
    inline def setIsContingentPlan(value: Boolean): Self = StObject.set(x, "isContingentPlan", value.asInstanceOf[js.Any])
    
    inline def setIsContingentPlanUndefined: Self = StObject.set(x, "isContingentPlan", js.undefined)
    
    inline def setMeteringCharges(value: js.Array[MaximumValue]): Self = StObject.set(x, "meteringCharges", value.asInstanceOf[js.Any])
    
    inline def setMeteringChargesUndefined: Self = StObject.set(x, "meteringCharges", js.undefined)
    
    inline def setMeteringChargesVarargs(value: MaximumValue*): Self = StObject.set(x, "meteringCharges", js.Array(value*))
  }
}
