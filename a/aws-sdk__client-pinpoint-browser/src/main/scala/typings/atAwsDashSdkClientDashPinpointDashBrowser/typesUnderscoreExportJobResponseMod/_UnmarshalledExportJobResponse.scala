package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.COMPLETED
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.COMPLETING
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.CREATED
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.FAILED
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.FAILING
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.INITIALIZING
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.PROCESSING
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobResourceMod._UnmarshalledExportJobResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledExportJobResponse extends _ExportJobResponse {
  /**
    * The export job settings.
    */
  @JSName("Definition")
  var Definition__UnmarshalledExportJobResponse: js.UndefOr[_UnmarshalledExportJobResource] = js.undefined
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  @JSName("Failures")
  var Failures__UnmarshalledExportJobResponse: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledExportJobResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CompletedPieces: Int | Double = null,
    CompletionDate: String = null,
    CreationDate: String = null,
    Definition: _UnmarshalledExportJobResource = null,
    FailedPieces: Int | Double = null,
    Failures: js.Array[String] = null,
    Id: String = null,
    JobStatus: CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String = null,
    TotalFailures: Int | Double = null,
    TotalPieces: Int | Double = null,
    TotalProcessed: Int | Double = null,
    Type: String = null
  ): _UnmarshalledExportJobResponse = {
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
    __obj.asInstanceOf[_UnmarshalledExportJobResponse]
  }
}

