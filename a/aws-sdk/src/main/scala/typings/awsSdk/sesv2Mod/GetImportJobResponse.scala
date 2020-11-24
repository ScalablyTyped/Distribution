package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImportJobResponse extends js.Object {
  
  /**
    * The time stamp of when the import job was completed.
    */
  var CompletedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time stamp of when the import job was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The number of records that failed processing because of invalid input or other reasons.
    */
  var FailedRecordsCount: js.UndefOr[typings.awsSdk.sesv2Mod.FailedRecordsCount] = js.native
  
  /**
    * The failure details about an import job.
    */
  var FailureInfo: js.UndefOr[typings.awsSdk.sesv2Mod.FailureInfo] = js.native
  
  /**
    * The data source of the import job.
    */
  var ImportDataSource: js.UndefOr[typings.awsSdk.sesv2Mod.ImportDataSource] = js.native
  
  /**
    * The destination of the import job.
    */
  var ImportDestination: js.UndefOr[typings.awsSdk.sesv2Mod.ImportDestination] = js.native
  
  /**
    * A string that represents the import job ID.
    */
  var JobId: js.UndefOr[typings.awsSdk.sesv2Mod.JobId] = js.native
  
  /**
    * The status of the import job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.sesv2Mod.JobStatus] = js.native
  
  /**
    * The current number of records processed.
    */
  var ProcessedRecordsCount: js.UndefOr[typings.awsSdk.sesv2Mod.ProcessedRecordsCount] = js.native
}
object GetImportJobResponse {
  
  @scala.inline
  def apply(): GetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImportJobResponse]
  }
  
  @scala.inline
  implicit class GetImportJobResponseOps[Self <: GetImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompletedTimestamp(value: Timestamp): Self = this.set("CompletedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedTimestamp: Self = this.set("CompletedTimestamp", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setFailedRecordsCount(value: FailedRecordsCount): Self = this.set("FailedRecordsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedRecordsCount: Self = this.set("FailedRecordsCount", js.undefined)
    
    @scala.inline
    def setFailureInfo(value: FailureInfo): Self = this.set("FailureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureInfo: Self = this.set("FailureInfo", js.undefined)
    
    @scala.inline
    def setImportDataSource(value: ImportDataSource): Self = this.set("ImportDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportDataSource: Self = this.set("ImportDataSource", js.undefined)
    
    @scala.inline
    def setImportDestination(value: ImportDestination): Self = this.set("ImportDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportDestination: Self = this.set("ImportDestination", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
    
    @scala.inline
    def setProcessedRecordsCount(value: ProcessedRecordsCount): Self = this.set("ProcessedRecordsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessedRecordsCount: Self = this.set("ProcessedRecordsCount", js.undefined)
  }
}
