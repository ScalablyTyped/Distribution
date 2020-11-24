package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchMeterUsageResult extends js.Object {
  
  /**
    * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace Metering Service or were invalid.
    */
  var Results: js.UndefOr[UsageRecordResultList] = js.native
  
  /**
    * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can retry the failed request by making another BatchMeterUsage call with this list as input in the BatchMeterUsageRequest.
    */
  var UnprocessedRecords: js.UndefOr[UsageRecordList] = js.native
}
object BatchMeterUsageResult {
  
  @scala.inline
  def apply(): BatchMeterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchMeterUsageResult]
  }
  
  @scala.inline
  implicit class BatchMeterUsageResultOps[Self <: BatchMeterUsageResult] (val x: Self) extends AnyVal {
    
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
    def setResultsVarargs(value: UsageRecordResult*): Self = this.set("Results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: UsageRecordResultList): Self = this.set("Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("Results", js.undefined)
    
    @scala.inline
    def setUnprocessedRecordsVarargs(value: UsageRecord*): Self = this.set("UnprocessedRecords", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedRecords(value: UsageRecordList): Self = this.set("UnprocessedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedRecords: Self = this.set("UnprocessedRecords", js.undefined)
  }
}
