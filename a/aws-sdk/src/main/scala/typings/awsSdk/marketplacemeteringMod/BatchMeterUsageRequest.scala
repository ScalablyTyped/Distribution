package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchMeterUsageRequest extends StObject {
  
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typings.awsSdk.marketplacemeteringMod.ProductCode
  
  /**
    * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
    */
  var UsageRecords: UsageRecordList
}
object BatchMeterUsageRequest {
  
  inline def apply(ProductCode: ProductCode, UsageRecords: UsageRecordList): BatchMeterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], UsageRecords = UsageRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchMeterUsageRequest]
  }
  
  extension [Self <: BatchMeterUsageRequest](x: Self) {
    
    inline def setProductCode(value: ProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    inline def setUsageRecords(value: UsageRecordList): Self = StObject.set(x, "UsageRecords", value.asInstanceOf[js.Any])
    
    inline def setUsageRecordsVarargs(value: UsageRecord*): Self = StObject.set(x, "UsageRecords", js.Array(value*))
  }
}
