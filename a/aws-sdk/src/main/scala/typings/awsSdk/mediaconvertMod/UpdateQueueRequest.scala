package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQueueRequest extends js.Object {
  /**
    * The new description for the queue, if you are changing it.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The name of the queue that you are modifying.
    */
  var Name: string = js.native
  /**
    * The new details of your pricing plan for your reserved queue. When you set up a new pricing plan to replace an expired one, you enter into another 12-month commitment. When you add capacity to your queue by increasing the number of RTS, you extend the term of your commitment to 12 months from when you add capacity. After you make these commitments, you can't cancel them.
    */
  var ReservationPlanSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ReservationPlanSettings] = js.native
  /**
    * Pause or activate a queue by changing its status between ACTIVE and PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause the queue continue to run until they finish or result in an error.
    */
  var Status: js.UndefOr[QueueStatus] = js.native
}

object UpdateQueueRequest {
  @scala.inline
  def apply(Name: string): UpdateQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueRequest]
  }
  @scala.inline
  implicit class UpdateQueueRequestOps[Self <: UpdateQueueRequest] (val x: Self) extends AnyVal {
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
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setReservationPlanSettings(value: ReservationPlanSettings): Self = this.set("ReservationPlanSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservationPlanSettings: Self = this.set("ReservationPlanSettings", js.undefined)
    @scala.inline
    def setStatus(value: QueueStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

