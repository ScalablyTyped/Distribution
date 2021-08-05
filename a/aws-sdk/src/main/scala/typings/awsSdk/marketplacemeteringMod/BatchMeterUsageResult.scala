package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchMeterUsageResult extends StObject {
  
  /**
    * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace Metering Service or were invalid.
    */
  var Results: js.UndefOr[UsageRecordResultList] = js.undefined
  
  /**
    * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can retry the failed request by making another BatchMeterUsage call with this list as input in the BatchMeterUsageRequest.
    */
  var UnprocessedRecords: js.UndefOr[UsageRecordList] = js.undefined
}
object BatchMeterUsageResult {
  
  inline def apply(): BatchMeterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchMeterUsageResult]
  }
  
  extension [Self <: BatchMeterUsageResult](x: Self) {
    
    inline def setResults(value: UsageRecordResultList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setResultsVarargs(value: UsageRecordResult*): Self = StObject.set(x, "Results", js.Array(value :_*))
    
    inline def setUnprocessedRecords(value: UsageRecordList): Self = StObject.set(x, "UnprocessedRecords", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedRecordsUndefined: Self = StObject.set(x, "UnprocessedRecords", js.undefined)
    
    inline def setUnprocessedRecordsVarargs(value: UsageRecord*): Self = StObject.set(x, "UnprocessedRecords", js.Array(value :_*))
  }
}
