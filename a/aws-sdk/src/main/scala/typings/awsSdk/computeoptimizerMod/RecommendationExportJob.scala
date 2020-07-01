package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendationExportJob extends js.Object {
  /**
    * The timestamp of when the export job was created.
    */
  var creationTimestamp: js.UndefOr[CreationTimestamp] = js.native
  /**
    * An object that describes the destination of the export file.
    */
  var destination: js.UndefOr[ExportDestination] = js.native
  /**
    * The reason for an export job failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The identification number of the export job.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * The timestamp of when the export job was last updated.
    */
  var lastUpdatedTimestamp: js.UndefOr[LastUpdatedTimestamp] = js.native
  /**
    * The resource type of the exported recommendations.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The status of the export job.
    */
  var status: js.UndefOr[JobStatus] = js.native
}

object RecommendationExportJob {
  @scala.inline
  def apply(
    creationTimestamp: CreationTimestamp = null,
    destination: ExportDestination = null,
    failureReason: FailureReason = null,
    jobId: JobId = null,
    lastUpdatedTimestamp: LastUpdatedTimestamp = null,
    resourceType: ResourceType = null,
    status: JobStatus = null
  ): RecommendationExportJob = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationExportJob]
  }
}

