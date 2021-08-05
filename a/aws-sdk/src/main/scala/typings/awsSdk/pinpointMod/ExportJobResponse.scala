package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportJobResponse extends StObject {
  
  /**
    * The unique identifier for the application that's associated with the export job.
    */
  var ApplicationId: string
  
  /**
    * The number of pieces that were processed successfully (completed) by the export job, as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[integer] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the export job was completed.
    */
  var CompletionDate: js.UndefOr[string] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the export job was created.
    */
  var CreationDate: string
  
  /**
    * The resource settings that apply to the export job.
    */
  var Definition: ExportJobResource
  
  /**
    * The number of pieces that weren't processed successfully (failed) by the export job, as of the time of the request.
    */
  var FailedPieces: js.UndefOr[integer] = js.undefined
  
  /**
    * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the export job, if any.
    */
  var Failures: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * The unique identifier for the export job.
    */
  var Id: string
  
  /**
    * The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more pieces in the job.
    */
  var JobStatus: typings.awsSdk.pinpointMod.JobStatus
  
  /**
    * The total number of endpoint definitions that weren't processed successfully (failed) by the export job, typically because an error, such as a syntax error, occurred.
    */
  var TotalFailures: js.UndefOr[integer] = js.undefined
  
  /**
    * The total number of pieces that must be processed to complete the export job. Each piece consists of an approximately equal portion of the endpoint definitions that are part of the export job.
    */
  var TotalPieces: js.UndefOr[integer] = js.undefined
  
  /**
    * The total number of endpoint definitions that were processed by the export job.
    */
  var TotalProcessed: js.UndefOr[integer] = js.undefined
  
  /**
    * The job type. This value is EXPORT for export jobs.
    */
  var Type: string
}
object ExportJobResponse {
  
  inline def apply(
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
  
  extension [Self <: ExportJobResponse](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setCompletedPieces(value: integer): Self = StObject.set(x, "CompletedPieces", value.asInstanceOf[js.Any])
    
    inline def setCompletedPiecesUndefined: Self = StObject.set(x, "CompletedPieces", js.undefined)
    
    inline def setCompletionDate(value: string): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: ExportJobResource): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setFailedPieces(value: integer): Self = StObject.set(x, "FailedPieces", value.asInstanceOf[js.Any])
    
    inline def setFailedPiecesUndefined: Self = StObject.set(x, "FailedPieces", js.undefined)
    
    inline def setFailures(value: ListOfString): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    inline def setFailuresVarargs(value: string*): Self = StObject.set(x, "Failures", js.Array(value :_*))
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setTotalFailures(value: integer): Self = StObject.set(x, "TotalFailures", value.asInstanceOf[js.Any])
    
    inline def setTotalFailuresUndefined: Self = StObject.set(x, "TotalFailures", js.undefined)
    
    inline def setTotalPieces(value: integer): Self = StObject.set(x, "TotalPieces", value.asInstanceOf[js.Any])
    
    inline def setTotalPiecesUndefined: Self = StObject.set(x, "TotalPieces", js.undefined)
    
    inline def setTotalProcessed(value: integer): Self = StObject.set(x, "TotalProcessed", value.asInstanceOf[js.Any])
    
    inline def setTotalProcessedUndefined: Self = StObject.set(x, "TotalProcessed", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
