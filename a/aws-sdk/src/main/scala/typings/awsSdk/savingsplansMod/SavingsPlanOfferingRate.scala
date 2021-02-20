package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlanOfferingRate extends StObject {
  
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operation: js.UndefOr[SavingsPlanRateOperation] = js.native
  
  /**
    * The product type.
    */
  var productType: js.UndefOr[SavingsPlanProductType] = js.native
  
  /**
    * The properties.
    */
  var properties: js.UndefOr[SavingsPlanOfferingRatePropertyList] = js.native
  
  /**
    * The Savings Plan rate.
    */
  var rate: js.UndefOr[SavingsPlanRatePricePerUnit] = js.native
  
  /**
    * The Savings Plan offering.
    */
  var savingsPlanOffering: js.UndefOr[ParentSavingsPlanOffering] = js.native
  
  /**
    * The service.
    */
  var serviceCode: js.UndefOr[SavingsPlanRateServiceCode] = js.native
  
  /**
    * The unit.
    */
  var unit: js.UndefOr[SavingsPlanRateUnit] = js.native
  
  /**
    * The usage details of the line item in the billing report.
    */
  var usageType: js.UndefOr[SavingsPlanRateUsageType] = js.native
}
object SavingsPlanOfferingRate {
  
  @scala.inline
  def apply(): SavingsPlanOfferingRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingRate]
  }
  
  @scala.inline
  implicit class SavingsPlanOfferingRateMutableBuilder[Self <: SavingsPlanOfferingRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: SavingsPlanRateOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setProductType(value: SavingsPlanProductType): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    @scala.inline
    def setProperties(value: SavingsPlanOfferingRatePropertyList): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: SavingsPlanOfferingRateProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setRate(value: SavingsPlanRatePricePerUnit): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setSavingsPlanOffering(value: ParentSavingsPlanOffering): Self = StObject.set(x, "savingsPlanOffering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlanOfferingUndefined: Self = StObject.set(x, "savingsPlanOffering", js.undefined)
    
    @scala.inline
    def setServiceCode(value: SavingsPlanRateServiceCode): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodeUndefined: Self = StObject.set(x, "serviceCode", js.undefined)
    
    @scala.inline
    def setUnit(value: SavingsPlanRateUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setUsageType(value: SavingsPlanRateUsageType): Self = StObject.set(x, "usageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageTypeUndefined: Self = StObject.set(x, "usageType", js.undefined)
  }
}
