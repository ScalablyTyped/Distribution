package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlanOfferingRate extends StObject {
  
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operation: js.UndefOr[SavingsPlanRateOperation] = js.undefined
  
  /**
    * The product type.
    */
  var productType: js.UndefOr[SavingsPlanProductType] = js.undefined
  
  /**
    * The properties.
    */
  var properties: js.UndefOr[SavingsPlanOfferingRatePropertyList] = js.undefined
  
  /**
    * The Savings Plan rate.
    */
  var rate: js.UndefOr[SavingsPlanRatePricePerUnit] = js.undefined
  
  /**
    * The Savings Plan offering.
    */
  var savingsPlanOffering: js.UndefOr[ParentSavingsPlanOffering] = js.undefined
  
  /**
    * The service.
    */
  var serviceCode: js.UndefOr[SavingsPlanRateServiceCode] = js.undefined
  
  /**
    * The unit.
    */
  var unit: js.UndefOr[SavingsPlanRateUnit] = js.undefined
  
  /**
    * The usage details of the line item in the billing report.
    */
  var usageType: js.UndefOr[SavingsPlanRateUsageType] = js.undefined
}
object SavingsPlanOfferingRate {
  
  inline def apply(): SavingsPlanOfferingRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingRate]
  }
  
  extension [Self <: SavingsPlanOfferingRate](x: Self) {
    
    inline def setOperation(value: SavingsPlanRateOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setProductType(value: SavingsPlanProductType): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    inline def setProperties(value: SavingsPlanOfferingRatePropertyList): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SavingsPlanOfferingRateProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    inline def setRate(value: SavingsPlanRatePricePerUnit): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setSavingsPlanOffering(value: ParentSavingsPlanOffering): Self = StObject.set(x, "savingsPlanOffering", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanOfferingUndefined: Self = StObject.set(x, "savingsPlanOffering", js.undefined)
    
    inline def setServiceCode(value: SavingsPlanRateServiceCode): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCodeUndefined: Self = StObject.set(x, "serviceCode", js.undefined)
    
    inline def setUnit(value: SavingsPlanRateUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUsageType(value: SavingsPlanRateUsageType): Self = StObject.set(x, "usageType", value.asInstanceOf[js.Any])
    
    inline def setUsageTypeUndefined: Self = StObject.set(x, "usageType", js.undefined)
  }
}
