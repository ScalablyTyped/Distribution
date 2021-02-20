package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchMeterUsageRequest extends StObject {
  
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typings.awsSdk.marketplacemeteringMod.ProductCode = js.native
  
  /**
    * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
    */
  var UsageRecords: UsageRecordList = js.native
}
object BatchMeterUsageRequest {
  
  @scala.inline
  def apply(ProductCode: ProductCode, UsageRecords: UsageRecordList): BatchMeterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], UsageRecords = UsageRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchMeterUsageRequest]
  }
  
  @scala.inline
  implicit class BatchMeterUsageRequestMutableBuilder[Self <: BatchMeterUsageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductCode(value: ProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageRecords(value: UsageRecordList): Self = StObject.set(x, "UsageRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageRecordsVarargs(value: UsageRecord*): Self = StObject.set(x, "UsageRecords", js.Array(value :_*))
  }
}
