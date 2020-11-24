package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(Name: string): Queue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  
  @scala.inline
  implicit class QueueOps[Self <: Queue] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: timestampUnix): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: timestampUnix): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    
    @scala.inline
    def setPricingPlan(value: PricingPlan): Self = this.set("PricingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingPlan: Self = this.set("PricingPlan", js.undefined)
    
    @scala.inline
    def setProgressingJobsCount(value: integer): Self = this.set("ProgressingJobsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressingJobsCount: Self = this.set("ProgressingJobsCount", js.undefined)
    
    @scala.inline
    def setReservationPlan(value: ReservationPlan): Self = this.set("ReservationPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationPlan: Self = this.set("ReservationPlan", js.undefined)
    
    @scala.inline
    def setStatus(value: QueueStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setSubmittedJobsCount(value: integer): Self = this.set("SubmittedJobsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmittedJobsCount: Self = this.set("SubmittedJobsCount", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
