package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeterUsageRequest extends StObject {
  
  /**
    * Checks whether you have the permissions required for the action, but does not make the request. If you have the permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to false if not specified.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typings.awsSdk.marketplacemeteringMod.ProductCode = js.native
  
  /**
    * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in the past. Make sure the timestamp value is not before the start of the software usage.
    */
  var Timestamp: typings.awsSdk.marketplacemeteringMod.Timestamp = js.native
  
  /**
    * The set of UsageAllocations to submit. The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each UsageAllocation must have a unique set of tags (include no tags).
    */
  var UsageAllocations: js.UndefOr[typings.awsSdk.marketplacemeteringMod.UsageAllocations] = js.native
  
  /**
    * It will be one of the fcp dimension name provided during the publishing of the product.
    */
  var UsageDimension: typings.awsSdk.marketplacemeteringMod.UsageDimension = js.native
  
  /**
    * Consumption value for the hour. Defaults to 0 if not specified.
    */
  var UsageQuantity: js.UndefOr[typings.awsSdk.marketplacemeteringMod.UsageQuantity] = js.native
}
object MeterUsageRequest {
  
  @scala.inline
  def apply(ProductCode: ProductCode, Timestamp: Timestamp, UsageDimension: UsageDimension): MeterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], UsageDimension = UsageDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeterUsageRequest]
  }
  
  @scala.inline
  implicit class MeterUsageRequestMutableBuilder[Self <: MeterUsageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setProductCode(value: ProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageAllocations(value: UsageAllocations): Self = StObject.set(x, "UsageAllocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageAllocationsUndefined: Self = StObject.set(x, "UsageAllocations", js.undefined)
    
    @scala.inline
    def setUsageAllocationsVarargs(value: UsageAllocation*): Self = StObject.set(x, "UsageAllocations", js.Array(value :_*))
    
    @scala.inline
    def setUsageDimension(value: UsageDimension): Self = StObject.set(x, "UsageDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageQuantity(value: UsageQuantity): Self = StObject.set(x, "UsageQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageQuantityUndefined: Self = StObject.set(x, "UsageQuantity", js.undefined)
  }
}
