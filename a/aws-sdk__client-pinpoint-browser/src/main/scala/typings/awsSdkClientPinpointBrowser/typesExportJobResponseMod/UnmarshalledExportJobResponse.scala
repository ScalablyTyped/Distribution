package typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CREATED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INITIALIZING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROCESSING
import typings.awsSdkClientPinpointBrowser.typesExportJobResourceMod.UnmarshalledExportJobResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledExportJobResponse extends ExportJobResponse {
  /**
    * The export job settings.
    */
  @JSName("Definition")
  var Definition_UnmarshalledExportJobResponse: js.UndefOr[UnmarshalledExportJobResource] = js.undefined
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  @JSName("Failures")
  var Failures_UnmarshalledExportJobResponse: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledExportJobResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CompletedPieces: js.UndefOr[Double] = js.undefined,
    CompletionDate: String = null,
    CreationDate: String = null,
    Definition: UnmarshalledExportJobResource = null,
    FailedPieces: js.UndefOr[Double] = js.undefined,
    Failures: js.Array[String] = null,
    Id: String = null,
    JobStatus: CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String = null,
    TotalFailures: js.UndefOr[Double] = js.undefined,
    TotalPieces: js.UndefOr[Double] = js.undefined,
    TotalProcessed: js.UndefOr[Double] = js.undefined,
    Type: String = null
  ): UnmarshalledExportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (!js.isUndefined(CompletedPieces)) __obj.updateDynamic("CompletedPieces")(CompletedPieces.get.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Definition != null) __obj.updateDynamic("Definition")(Definition.asInstanceOf[js.Any])
    if (!js.isUndefined(FailedPieces)) __obj.updateDynamic("FailedPieces")(FailedPieces.get.asInstanceOf[js.Any])
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalFailures)) __obj.updateDynamic("TotalFailures")(TotalFailures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalPieces)) __obj.updateDynamic("TotalPieces")(TotalPieces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalProcessed)) __obj.updateDynamic("TotalProcessed")(TotalProcessed.get.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledExportJobResponse]
  }
}

