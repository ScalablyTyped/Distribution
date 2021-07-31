package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageByAccount extends StObject {
  
  /**
    * The type of currency that the value for the metric (estimatedCost) is reported in.
    */
  var currency: js.UndefOr[Currency] = js.undefined
  
  /**
    * The estimated value for the metric.
    */
  var estimatedCost: js.UndefOr[string] = js.undefined
  
  /**
    * The current value for the quota that corresponds to the metric specified by the type field.
    */
  var serviceLimit: js.UndefOr[ServiceLimit] = js.undefined
  
  /**
    * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and, SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
    */
  var `type`: js.UndefOr[UsageType] = js.undefined
}
object UsageByAccount {
  
  @scala.inline
  def apply(): UsageByAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageByAccount]
  }
  
  @scala.inline
  implicit class UsageByAccountMutableBuilder[Self <: UsageByAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setEstimatedCost(value: string): Self = StObject.set(x, "estimatedCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedCostUndefined: Self = StObject.set(x, "estimatedCost", js.undefined)
    
    @scala.inline
    def setServiceLimit(value: ServiceLimit): Self = StObject.set(x, "serviceLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceLimitUndefined: Self = StObject.set(x, "serviceLimit", js.undefined)
    
    @scala.inline
    def setType(value: UsageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
