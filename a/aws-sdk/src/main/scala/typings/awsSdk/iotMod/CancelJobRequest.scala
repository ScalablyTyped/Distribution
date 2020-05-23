package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJobRequest extends js.Object {
  /**
    * An optional comment string describing why the job was canceled.
    */
  var comment: js.UndefOr[Comment] = js.native
  /**
    * (Optional) If true job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise only job executions with status "QUEUED" are canceled. The default is false. Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the job execution status. Use caution and ensure that each device executing a job which is canceled is able to recover to a valid state.
    */
  var force: js.UndefOr[ForceFlag] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId = js.native
  /**
    * (Optional)A reason code string that explains why the job was canceled.
    */
  var reasonCode: js.UndefOr[ReasonCode] = js.native
}

object CancelJobRequest {
  @scala.inline
  def apply(
    jobId: JobId,
    comment: Comment = null,
    force: js.UndefOr[ForceFlag] = js.undefined,
    reasonCode: ReasonCode = null
  ): CancelJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
}

