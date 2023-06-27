package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkRates
import typings.consumerDataStandards.anon.RatesTimeVariations
import typings.consumerDataStandards.consumerDataStandardsStrings.GOVERNMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PREMIUM
import typings.consumerDataStandards.consumerDataStandardsStrings.RETAILER
import typings.consumerDataStandards.consumerDataStandardsStrings.singleTariff
import typings.consumerDataStandards.consumerDataStandardsStrings.timeVaryingTariffs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanSolarFeedInTariffV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A description of the tariff
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the tariff
    */
  var displayName: String
  
  /**
    * The type of the payer
    */
  var payerType: GOVERNMENT | RETAILER
  
  /**
    * The applicable scheme
    */
  var scheme: PREMIUM | OTHER
  
  /**
    * Represents a constant tariff.  Mandatory if tariffUType is set to singleTariff
    */
  var singleTariff: js.UndefOr[DictkRates] = js.undefined
  
  /**
    * The type of the payer
    */
  var tariffUType: singleTariff | timeVaryingTariffs
  
  /**
    * Represents a tariff based on time.  Mandatory if tariffUType is set to timeVaryingTariffs
    */
  var timeVaryingTariffs: js.UndefOr[RatesTimeVariations] = js.undefined
}
object EnergyPlanSolarFeedInTariffV2 {
  
  inline def apply(
    displayName: String,
    payerType: GOVERNMENT | RETAILER,
    scheme: PREMIUM | OTHER,
    tariffUType: singleTariff | timeVaryingTariffs
  ): EnergyPlanSolarFeedInTariffV2 = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], payerType = payerType.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], tariffUType = tariffUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanSolarFeedInTariffV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyPlanSolarFeedInTariffV2] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setPayerType(value: GOVERNMENT | RETAILER): Self = StObject.set(x, "payerType", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: PREMIUM | OTHER): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSingleTariff(value: DictkRates): Self = StObject.set(x, "singleTariff", value.asInstanceOf[js.Any])
    
    inline def setSingleTariffUndefined: Self = StObject.set(x, "singleTariff", js.undefined)
    
    inline def setTariffUType(value: singleTariff | timeVaryingTariffs): Self = StObject.set(x, "tariffUType", value.asInstanceOf[js.Any])
    
    inline def setTimeVaryingTariffs(value: RatesTimeVariations): Self = StObject.set(x, "timeVaryingTariffs", value.asInstanceOf[js.Any])
    
    inline def setTimeVaryingTariffsUndefined: Self = StObject.set(x, "timeVaryingTariffs", js.undefined)
  }
}
