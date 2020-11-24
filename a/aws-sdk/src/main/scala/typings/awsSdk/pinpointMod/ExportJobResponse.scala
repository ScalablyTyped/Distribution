package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportJobResponse extends js.Object {
  
  /**
    * The unique identifier for the application that's associated with the export job.
    */
  var ApplicationId: string = js.native
  
  /**
    * The number of pieces that were processed successfully (completed) by the export job, as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[integer] = js.native
  
  /**
    * The date, in ISO 8601 format, when the export job was completed.
    */
  var CompletionDate: js.UndefOr[string] = js.native
  
  /**
    * The date, in ISO 8601 format, when the export job was created.
    */
  var CreationDate: string = js.native
  
  /**
    * The resource settings that apply to the export job.
    */
  var Definition: ExportJobResource = js.native
  
  /**
    * The number of pieces that weren't processed successfully (failed) by the export job, as of the time of the request.
    */
  var FailedPieces: js.UndefOr[integer] = js.native
  
  /**
    * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the export job, if any.
    */
  var Failures: js.UndefOr[ListOfString] = js.native
  
  /**
    * The unique identifier for the export job.
    */
  var Id: string = js.native
  
  /**
    * The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more pieces in the job.
    */
  var JobStatus: typings.awsSdk.pinpointMod.JobStatus = js.native
  
  /**
    * The total number of endpoint definitions that weren't processed successfully (failed) by the export job, typically because an error, such as a syntax error, occurred.
    */
  var TotalFailures: js.UndefOr[integer] = js.native
  
  /**
    * The total number of pieces that must be processed to complete the export job. Each piece consists of an approximately equal portion of the endpoint definitions that are part of the export job.
    */
  var TotalPieces: js.UndefOr[integer] = js.native
  
  /**
    * The total number of endpoint definitions that were processed by the export job.
    */
  var TotalProcessed: js.UndefOr[integer] = js.native
  
  /**
    * The job type. This value is EXPORT for export jobs.
    */
  var Type: string = js.native
}
object ExportJobResponse {
  
  @scala.inline
  def apply(
    ApplicationId: string,
    CreationDate: string,
    Definition: ExportJobResource,
    Id: string,
    JobStatus: JobStatus,
    Type: string
  ): ExportJobResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Definition = Definition.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobResponse]
  }
  
  @scala.inline
  implicit class ExportJobResponseOps[Self <: ExportJobResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: string): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: ExportJobResource): Self = this.set("Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: string): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedPieces(value: integer): Self = this.set("CompletedPieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedPieces: Self = this.set("CompletedPieces", js.undefined)
    
    @scala.inline
    def setCompletionDate(value: string): Self = this.set("CompletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionDate: Self = this.set("CompletionDate", js.undefined)
    
    @scala.inline
    def setFailedPieces(value: integer): Self = this.set("FailedPieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedPieces: Self = this.set("FailedPieces", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: string*): Self = this.set("Failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: ListOfString): Self = this.set("Failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("Failures", js.undefined)
    
    @scala.inline
    def setTotalFailures(value: integer): Self = this.set("TotalFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalFailures: Self = this.set("TotalFailures", js.undefined)
    
    @scala.inline
    def setTotalPieces(value: integer): Self = this.set("TotalPieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPieces: Self = this.set("TotalPieces", js.undefined)
    
    @scala.inline
    def setTotalProcessed(value: integer): Self = this.set("TotalProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalProcessed: Self = this.set("TotalProcessed", js.undefined)
  }
}
