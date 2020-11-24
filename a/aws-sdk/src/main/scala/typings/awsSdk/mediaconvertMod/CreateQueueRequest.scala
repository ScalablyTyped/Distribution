package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(Name: string): CreateQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueueRequest]
  }
  
  @scala.inline
  implicit class CreateQueueRequestOps[Self <: CreateQueueRequest] (val x: Self) extends AnyVal {
    
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
    def setPricingPlan(value: PricingPlan): Self = this.set("PricingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingPlan: Self = this.set("PricingPlan", js.undefined)
    
    @scala.inline
    def setReservationPlanSettings(value: ReservationPlanSettings): Self = this.set("ReservationPlanSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationPlanSettings: Self = this.set("ReservationPlanSettings", js.undefined)
    
    @scala.inline
    def setStatus(value: QueueStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTags(value: mapOfString): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
