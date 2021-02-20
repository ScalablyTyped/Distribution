package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlanRate extends StObject {
  
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  
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
  var properties: js.UndefOr[SavingsPlanRatePropertyList] = js.native
  
  /**
    * The rate.
    */
  var rate: js.UndefOr[Amount] = js.native
  
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
object SavingsPlanRate {
  
  @scala.inline
  def apply(): SavingsPlanRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanRate]
  }
  
  @scala.inline
  implicit class SavingsPlanRateMutableBuilder[Self <: SavingsPlanRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: CurrencyCode): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setOperation(value: SavingsPlanRateOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setProductType(value: SavingsPlanProductType): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    @scala.inline
    def setProperties(value: SavingsPlanRatePropertyList): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: SavingsPlanRateProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setRate(value: Amount): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
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
