package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAutoScalingGroupRecommendationsResponse extends js.Object {
  /**
    * The identification number of the export job. Use the DescribeRecommendationExportJobs action, and specify the job ID to view the status of an export job.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * An object that describes the destination Amazon S3 bucket of a recommendations export file.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.native
}

object ExportAutoScalingGroupRecommendationsResponse {
  @scala.inline
  def apply(jobId: JobId = null, s3Destination: S3Destination = null): ExportAutoScalingGroupRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (s3Destination != null) __obj.updateDynamic("s3Destination")(s3Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAutoScalingGroupRecommendationsResponse]
  }
}

