package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlanRate extends js.Object {
  
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
  implicit class SavingsPlanRateOps[Self <: SavingsPlanRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrency(value: CurrencyCode): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setOperation(value: SavingsPlanRateOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setProductType(value: SavingsPlanProductType): Self = this.set("productType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductType: Self = this.set("productType", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: SavingsPlanRateProperty*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: SavingsPlanRatePropertyList): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRate(value: Amount): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setServiceCode(value: SavingsPlanRateServiceCode): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCode: Self = this.set("serviceCode", js.undefined)
    
    @scala.inline
    def setUnit(value: SavingsPlanRateUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setUsageType(value: SavingsPlanRateUsageType): Self = this.set("usageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageType: Self = this.set("usageType", js.undefined)
  }
}
