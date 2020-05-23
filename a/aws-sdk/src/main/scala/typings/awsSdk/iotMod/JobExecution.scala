package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecution extends js.Object {
  /**
    * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT. The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The actual job execution timeout can occur up to 60 seconds later than the estimated duration. This value will not be included if the job execution has reached a terminal status.
    */
  var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.native
  /**
    * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this particular device. It can be used in commands which return or update job execution information. 
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * Will be true if the job execution was canceled with the optional force parameter set to true.
    */
  var forceCanceled: js.UndefOr[Forced] = js.native
  /**
    * The unique identifier you assigned to the job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * The time, in seconds since the epoch, when the job execution was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  /**
    * The time, in seconds since the epoch, when the job execution was queued.
    */
  var queuedAt: js.UndefOr[DateType] = js.native
  /**
    * The time, in seconds since the epoch, when the job execution started.
    */
  var startedAt: js.UndefOr[DateType] = js.native
  /**
    * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED, TIMED_OUT, CANCELED, or REJECTED).
    */
  var status: js.UndefOr[JobExecutionStatus] = js.native
  /**
    * A collection of name/value pairs that describe the status of the job execution.
    */
  var statusDetails: js.UndefOr[JobExecutionStatusDetails] = js.native
  /**
    * The ARN of the thing on which the job execution is running.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.native
}

object JobExecution {
  @scala.inline
  def apply(
    approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined,
    executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
    forceCanceled: js.UndefOr[Forced] = js.undefined,
    jobId: JobId = null,
    lastUpdatedAt: DateType = null,
    queuedAt: DateType = null,
    startedAt: DateType = null,
    status: JobExecutionStatus = null,
    statusDetails: JobExecutionStatusDetails = null,
    thingArn: ThingArn = null,
    versionNumber: js.UndefOr[VersionNumber] = js.undefined
  ): JobExecution = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(approximateSecondsBeforeTimedOut)) __obj.updateDynamic("approximateSecondsBeforeTimedOut")(approximateSecondsBeforeTimedOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(executionNumber)) __obj.updateDynamic("executionNumber")(executionNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCanceled)) __obj.updateDynamic("forceCanceled")(forceCanceled.get.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (queuedAt != null) __obj.updateDynamic("queuedAt")(queuedAt.asInstanceOf[js.Any])
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails.asInstanceOf[js.Any])
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn.asInstanceOf[js.Any])
    if (!js.isUndefined(versionNumber)) __obj.updateDynamic("versionNumber")(versionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecution]
  }
}

