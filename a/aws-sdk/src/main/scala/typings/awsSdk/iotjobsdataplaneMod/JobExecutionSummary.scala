package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionSummary extends js.Object {
  /**
    * A number that identifies a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was enqueued.
    */
  var queuedAt: js.UndefOr[QueuedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution started.
    */
  var startedAt: js.UndefOr[StartedAt] = js.native
  /**
    * The version of the job execution. Job execution versions are incremented each time AWS IoT Jobs receives an update from a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.native
}

object JobExecutionSummary {
  @scala.inline
  def apply(
    executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
    jobId: JobId = null,
    lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
    queuedAt: js.UndefOr[QueuedAt] = js.undefined,
    startedAt: js.UndefOr[StartedAt] = js.undefined,
    versionNumber: js.UndefOr[VersionNumber] = js.undefined
  ): JobExecutionSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(executionNumber)) __obj.updateDynamic("executionNumber")(executionNumber.get.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (!js.isUndefined(lastUpdatedAt)) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queuedAt)) __obj.updateDynamic("queuedAt")(queuedAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startedAt)) __obj.updateDynamic("startedAt")(startedAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(versionNumber)) __obj.updateDynamic("versionNumber")(versionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionSummary]
  }
}

