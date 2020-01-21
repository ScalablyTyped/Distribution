package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The timestamp in epoch seconds for when you created the queue.
    */
  var CreatedAt: js.UndefOr[timestampUnix] = js.native
  /**
    * An optional description that you create for each queue.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The timestamp in epoch seconds for when you most recently updated the queue.
    */
  var LastUpdated: js.UndefOr[timestampUnix] = js.native
  /**
    * A name that you create for each queue. Each name must be unique within your account.
    */
  var Name: string = js.native
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.mediaconvertMod.PricingPlan] = js.native
  /**
    * The estimated number of jobs with a PROGRESSING status.
    */
  var ProgressingJobsCount: js.UndefOr[integer] = js.native
  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  var ReservationPlan: js.UndefOr[typings.awsSdk.mediaconvertMod.ReservationPlan] = js.native
  /**
    * Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that queue. Jobs that are running when you pause the queue continue to run until they finish or result in an error.
    */
  var Status: js.UndefOr[QueueStatus] = js.native
  /**
    * The estimated number of jobs with a SUBMITTED status.
    */
  var SubmittedJobsCount: js.UndefOr[integer] = js.native
  /**
    * Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify or delete system queues. You can create and modify custom queues.
    */
  var Type: js.UndefOr[typings.awsSdk.mediaconvertMod.Type] = js.native
}

object Queue {
  @scala.inline
  def apply(
    Name: string,
    Arn: string = null,
    CreatedAt: timestampUnix = null,
    Description: string = null,
    LastUpdated: timestampUnix = null,
    PricingPlan: PricingPlan = null,
    ProgressingJobsCount: Int | Double = null,
    ReservationPlan: ReservationPlan = null,
    Status: QueueStatus = null,
    SubmittedJobsCount: Int | Double = null,
    Type: Type = null
  ): Queue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (PricingPlan != null) __obj.updateDynamic("PricingPlan")(PricingPlan.asInstanceOf[js.Any])
    if (ProgressingJobsCount != null) __obj.updateDynamic("ProgressingJobsCount")(ProgressingJobsCount.asInstanceOf[js.Any])
    if (ReservationPlan != null) __obj.updateDynamic("ReservationPlan")(ReservationPlan.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubmittedJobsCount != null) __obj.updateDynamic("SubmittedJobsCount")(SubmittedJobsCount.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
}

