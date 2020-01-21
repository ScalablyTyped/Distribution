package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQueueRequest extends js.Object {
  /**
    * Optional. A description of the queue that you are creating.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The name of the queue that you are creating.
    */
  var Name: string = js.native
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. When you use the API to create a queue, the default is on-demand.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.mediaconvertMod.PricingPlan] = js.native
  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  var ReservationPlanSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ReservationPlanSettings] = js.native
  /**
    * Initial state of the queue. If you create a paused queue, then jobs in that queue won't begin.
    */
  var Status: js.UndefOr[QueueStatus] = js.native
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object CreateQueueRequest {
  @scala.inline
  def apply(
    Name: string,
    Description: string = null,
    PricingPlan: PricingPlan = null,
    ReservationPlanSettings: ReservationPlanSettings = null,
    Status: QueueStatus = null,
    Tags: mapOfString = null
  ): CreateQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (PricingPlan != null) __obj.updateDynamic("PricingPlan")(PricingPlan.asInstanceOf[js.Any])
    if (ReservationPlanSettings != null) __obj.updateDynamic("ReservationPlanSettings")(ReservationPlanSettings.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueueRequest]
  }
}

