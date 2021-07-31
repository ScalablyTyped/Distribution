package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlanOffering extends StObject {
  
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.undefined
  
  /**
    * The description.
    */
  var description: js.UndefOr[SavingsPlanDescription] = js.undefined
  
  /**
    * The duration, in seconds.
    */
  var durationSeconds: js.UndefOr[SavingsPlansDuration] = js.undefined
  
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operation: js.UndefOr[SavingsPlanOperation] = js.undefined
  
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.undefined
  
  /**
    * The plan type.
    */
  var planType: js.UndefOr[SavingsPlanType] = js.undefined
  
  /**
    * The product type.
    */
  var productTypes: js.UndefOr[SavingsPlanProductTypeList] = js.undefined
  
  /**
    * The properties.
    */
  var properties: js.UndefOr[SavingsPlanOfferingPropertyList] = js.undefined
  
  /**
    * The service.
    */
  var serviceCode: js.UndefOr[SavingsPlanServiceCode] = js.undefined
  
  /**
    * The usage details of the line item in the billing report.
    */
  var usageType: js.UndefOr[SavingsPlanUsageType] = js.undefined
}
object SavingsPlanOffering {
  
  @scala.inline
  def apply(): SavingsPlanOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOffering]
  }
  
  @scala.inline
  implicit class SavingsPlanOfferingMutableBuilder[Self <: SavingsPlanOffering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: CurrencyCode): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDescription(value: SavingsPlanDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDurationSeconds(value: SavingsPlansDuration): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    @scala.inline
    def setOfferingId(value: UUID): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "offeringId", js.undefined)
    
    @scala.inline
    def setOperation(value: SavingsPlanOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: SavingsPlanPaymentOption): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionUndefined: Self = StObject.set(x, "paymentOption", js.undefined)
    
    @scala.inline
    def setPlanType(value: SavingsPlanType): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanTypeUndefined: Self = StObject.set(x, "planType", js.undefined)
    
    @scala.inline
    def setProductTypes(value: SavingsPlanProductTypeList): Self = StObject.set(x, "productTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypesUndefined: Self = StObject.set(x, "productTypes", js.undefined)
    
    @scala.inline
    def setProductTypesVarargs(value: SavingsPlanProductType*): Self = StObject.set(x, "productTypes", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: SavingsPlanOfferingPropertyList): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: SavingsPlanOfferingProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setServiceCode(value: SavingsPlanServiceCode): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodeUndefined: Self = StObject.set(x, "serviceCode", js.undefined)
    
    @scala.inline
    def setUsageType(value: SavingsPlanUsageType): Self = StObject.set(x, "usageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageTypeUndefined: Self = StObject.set(x, "usageType", js.undefined)
  }
}
