package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobLogs extends js.Object {
  /**
    * A link to an Amazon S3 presigned URL where the job completion report is located.
    */
  var JobCompletionReportURI: js.UndefOr[String] = js.native
  /**
    * A link to an Amazon S3 presigned URL where the job failure log is located.
    */
  var JobFailureLogURI: js.UndefOr[String] = js.native
  /**
    * A link to an Amazon S3 presigned URL where the job success log is located.
    */
  var JobSuccessLogURI: js.UndefOr[String] = js.native
}

object JobLogs {
  @scala.inline
  def apply(
    JobCompletionReportURI: String = null,
    JobFailureLogURI: String = null,
    JobSuccessLogURI: String = null
  ): JobLogs = {
    val __obj = js.Dynamic.literal()
    if (JobCompletionReportURI != null) __obj.updateDynamic("JobCompletionReportURI")(JobCompletionReportURI.asInstanceOf[js.Any])
    if (JobFailureLogURI != null) __obj.updateDynamic("JobFailureLogURI")(JobFailureLogURI.asInstanceOf[js.Any])
    if (JobSuccessLogURI != null) __obj.updateDynamic("JobSuccessLogURI")(JobSuccessLogURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobLogs]
  }
}

