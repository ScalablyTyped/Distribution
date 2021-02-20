package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportJobResponse extends StObject {
  
  /**
    * The unique identifier for the application that's associated with the import job.
    */
  var ApplicationId: string = js.native
  
  /**
    * The number of pieces that were processed successfully (completed) by the import job, as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[integer] = js.native
  
  /**
    * The date, in ISO 8601 format, when the import job was completed.
    */
  var CompletionDate: js.UndefOr[string] = js.native
  
  /**
    * The date, in ISO 8601 format, when the import job was created.
    */
  var CreationDate: string = js.native
  
  /**
    * The resource settings that apply to the import job.
    */
  var Definition: ImportJobResource = js.native
  
  /**
    * The number of pieces that weren't processed successfully (failed) by the import job, as of the time of the request.
    */
  var FailedPieces: js.UndefOr[integer] = js.native
  
  /**
    * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the import job, if any.
    */
  var Failures: js.UndefOr[ListOfString] = js.native
  
  /**
    * The unique identifier for the import job.
    */
  var Id: string = js.native
  
  /**
    * The status of the import job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more pieces in the job.
    */
  var JobStatus: typings.awsSdk.pinpointMod.JobStatus = js.native
  
  /**
    * The total number of endpoint definitions that weren't processed successfully (failed) by the import job, typically because an error, such as a syntax error, occurred.
    */
  var TotalFailures: js.UndefOr[integer] = js.native
  
  /**
    * The total number of pieces that must be processed to complete the import job. Each piece consists of an approximately equal portion of the endpoint definitions that are part of the import job.
    */
  var TotalPieces: js.UndefOr[integer] = js.native
  
  /**
    * The total number of endpoint definitions that were processed by the import job.
    */
  var TotalProcessed: js.UndefOr[integer] = js.native
  
  /**
    * The job type. This value is IMPORT for import jobs.
    */
  var Type: string = js.native
}
object ImportJobResponse {
  
  @scala.inline
  def apply(
    ApplicationId: string,
    CreationDate: string,
    Definition: ImportJobResource,
    Id: string,
    JobStatus: JobStatus,
    Type: string
  ): ImportJobResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Definition = Definition.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobResponse]
  }
  
  @scala.inline
  implicit class ImportJobResponseMutableBuilder[Self <: ImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedPieces(value: integer): Self = StObject.set(x, "CompletedPieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedPiecesUndefined: Self = StObject.set(x, "CompletedPieces", js.undefined)
    
    @scala.inline
    def setCompletionDate(value: string): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    @scala.inline
    def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: ImportJobResource): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedPieces(value: integer): Self = StObject.set(x, "FailedPieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedPiecesUndefined: Self = StObject.set(x, "FailedPieces", js.undefined)
    
    @scala.inline
    def setFailures(value: ListOfString): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: string*): Self = StObject.set(x, "Failures", js.Array(value :_*))
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFailures(value: integer): Self = StObject.set(x, "TotalFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFailuresUndefined: Self = StObject.set(x, "TotalFailures", js.undefined)
    
    @scala.inline
    def setTotalPieces(value: integer): Self = StObject.set(x, "TotalPieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPiecesUndefined: Self = StObject.set(x, "TotalPieces", js.undefined)
    
    @scala.inline
    def setTotalProcessed(value: integer): Self = StObject.set(x, "TotalProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalProcessedUndefined: Self = StObject.set(x, "TotalProcessed", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
