package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    Type: string,
    CompletedPieces: Int | Double = null,
    CompletionDate: string = null,
    FailedPieces: Int | Double = null,
    Failures: ListOfString = null,
    TotalFailures: Int | Double = null,
    TotalPieces: Int | Double = null,
    TotalProcessed: Int | Double = null
  ): ExportJobResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Definition = Definition.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (CompletedPieces != null) __obj.updateDynamic("CompletedPieces")(CompletedPieces.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (FailedPieces != null) __obj.updateDynamic("FailedPieces")(FailedPieces.asInstanceOf[js.Any])
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    if (TotalFailures != null) __obj.updateDynamic("TotalFailures")(TotalFailures.asInstanceOf[js.Any])
    if (TotalPieces != null) __obj.updateDynamic("TotalPieces")(TotalPieces.asInstanceOf[js.Any])
    if (TotalProcessed != null) __obj.updateDynamic("TotalProcessed")(TotalProcessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobResponse]
  }
}

