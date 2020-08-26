package typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CREATED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INITIALIZING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROCESSING
import typings.awsSdkClientPinpointBrowser.typesExportJobResourceMod.ExportJobResource
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJobResponse extends js.Object {
  /**
    * The unique ID of the application associated with the export job.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The number of pieces that have successfully completed as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[Double] = js.native
  /**
    * The date the job completed in ISO 8601 format.
    */
  var CompletionDate: js.UndefOr[String] = js.native
  /**
    * The date the job was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The export job settings.
    */
  var Definition: js.UndefOr[ExportJobResource] = js.native
  /**
    * The number of pieces that failed to be processed as of the time of the request.
    */
  var FailedPieces: js.UndefOr[Double] = js.native
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  var Failures: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  /**
    * The unique ID of the job.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The status of the job.
    * Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
    *
    * The job status is FAILED if one or more pieces failed.
    */
  var JobStatus: js.UndefOr[
    CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String
  ] = js.native
  /**
    * The number of endpoints that were not processed; for example, because of syntax errors.
    */
  var TotalFailures: js.UndefOr[Double] = js.native
  /**
    * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion of the endpoints.
    */
  var TotalPieces: js.UndefOr[Double] = js.native
  /**
    * The number of endpoints that were processed by the job.
    */
  var TotalProcessed: js.UndefOr[Double] = js.native
  /**
    * The job type. Will be 'EXPORT'.
    */
  var Type: js.UndefOr[String] = js.native
}

object ExportJobResponse {
  @scala.inline
  def apply(): ExportJobResponse = {
    val __obj = js.Dynamic.literal()
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
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setCompletedPieces(value: Double): Self = this.set("CompletedPieces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedPieces: Self = this.set("CompletedPieces", js.undefined)
    @scala.inline
    def setCompletionDate(value: String): Self = this.set("CompletionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionDate: Self = this.set("CompletionDate", js.undefined)
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDefinition(value: ExportJobResource): Self = this.set("Definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("Definition", js.undefined)
    @scala.inline
    def setFailedPieces(value: Double): Self = this.set("FailedPieces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedPieces: Self = this.set("FailedPieces", js.undefined)
    @scala.inline
    def setFailuresVarargs(value: String*): Self = this.set("Failures", js.Array(value :_*))
    @scala.inline
    def setFailures(value: js.Array[String] | Iterable[String]): Self = this.set("Failures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailures: Self = this.set("Failures", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setJobStatus(value: CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
    @scala.inline
    def setTotalFailures(value: Double): Self = this.set("TotalFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalFailures: Self = this.set("TotalFailures", js.undefined)
    @scala.inline
    def setTotalPieces(value: Double): Self = this.set("TotalPieces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPieces: Self = this.set("TotalPieces", js.undefined)
    @scala.inline
    def setTotalProcessed(value: Double): Self = this.set("TotalProcessed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalProcessed: Self = this.set("TotalProcessed", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

