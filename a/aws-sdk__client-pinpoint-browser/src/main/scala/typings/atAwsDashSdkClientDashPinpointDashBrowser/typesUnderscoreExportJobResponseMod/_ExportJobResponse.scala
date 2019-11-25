package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.COMPLETED
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.COMPLETING
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.CREATED
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.FAILED
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.FAILING
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.INITIALIZING
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.PROCESSING
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobResourceMod._ExportJobResource
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ExportJobResponse extends js.Object {
  /**
    * The unique ID of the application associated with the export job.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The number of pieces that have successfully completed as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[Double] = js.undefined
  /**
    * The date the job completed in ISO 8601 format.
    */
  var CompletionDate: js.UndefOr[String] = js.undefined
  /**
    * The date the job was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * The export job settings.
    */
  var Definition: js.UndefOr[_ExportJobResource] = js.undefined
  /**
    * The number of pieces that failed to be processed as of the time of the request.
    */
  var FailedPieces: js.UndefOr[Double] = js.undefined
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  var Failures: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * The unique ID of the job.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The status of the job.
    * Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
    *
    * The job status is FAILED if one or more pieces failed.
    */
  var JobStatus: js.UndefOr[
    CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String
  ] = js.undefined
  /**
    * The number of endpoints that were not processed; for example, because of syntax errors.
    */
  var TotalFailures: js.UndefOr[Double] = js.undefined
  /**
    * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion of the endpoints.
    */
  var TotalPieces: js.UndefOr[Double] = js.undefined
  /**
    * The number of endpoints that were processed by the job.
    */
  var TotalProcessed: js.UndefOr[Double] = js.undefined
  /**
    * The job type. Will be 'EXPORT'.
    */
  var Type: js.UndefOr[String] = js.undefined
}

object _ExportJobResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CompletedPieces: Int | Double = null,
    CompletionDate: String = null,
    CreationDate: String = null,
    Definition: _ExportJobResource = null,
    FailedPieces: Int | Double = null,
    Failures: js.Array[String] | Iterable[String] = null,
    Id: String = null,
    JobStatus: CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String = null,
    TotalFailures: Int | Double = null,
    TotalPieces: Int | Double = null,
    TotalProcessed: Int | Double = null,
    Type: String = null
  ): _ExportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CompletedPieces != null) __obj.updateDynamic("CompletedPieces")(CompletedPieces.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Definition != null) __obj.updateDynamic("Definition")(Definition.asInstanceOf[js.Any])
    if (FailedPieces != null) __obj.updateDynamic("FailedPieces")(FailedPieces.asInstanceOf[js.Any])
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (TotalFailures != null) __obj.updateDynamic("TotalFailures")(TotalFailures.asInstanceOf[js.Any])
    if (TotalPieces != null) __obj.updateDynamic("TotalPieces")(TotalPieces.asInstanceOf[js.Any])
    if (TotalProcessed != null) __obj.updateDynamic("TotalProcessed")(TotalProcessed.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ExportJobResponse]
  }
}

