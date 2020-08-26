package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportEC2InstanceRecommendationsResponse extends js.Object {
  /**
    * The identification number of the export job. Use the DescribeRecommendationExportJobs action, and specify the job ID to view the status of an export job.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * An object that describes the destination Amazon S3 bucket of a recommendations export file.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.native
}

object ExportEC2InstanceRecommendationsResponse {
  @scala.inline
  def apply(): ExportEC2InstanceRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportEC2InstanceRecommendationsResponse]
  }
  @scala.inline
  implicit class ExportEC2InstanceRecommendationsResponseOps[Self <: ExportEC2InstanceRecommendationsResponse] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setS3Destination(value: S3Destination): Self = this.set("s3Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Destination: Self = this.set("s3Destination", js.undefined)
  }
  
}

