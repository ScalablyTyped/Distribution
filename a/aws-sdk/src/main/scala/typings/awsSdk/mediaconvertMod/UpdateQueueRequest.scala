package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueueRequest extends StObject {
  
  /**
    * The new description for the queue, if you are changing it.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the queue that you are modifying.
    */
  var Name: string
  
  /**
    * The new details of your pricing plan for your reserved queue. When you set up a new pricing plan to replace an expired one, you enter into another 12-month commitment. When you add capacity to your queue by increasing the number of RTS, you extend the term of your commitment to 12 months from when you add capacity. After you make these commitments, you can't cancel them.
    */
  var ReservationPlanSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.ReservationPlanSettings] = js.undefined
  
  /**
    * Pause or activate a queue by changing its status between ACTIVE and PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause the queue continue to run until they finish or result in an error.
    */
  var Status: js.UndefOr[QueueStatus] = js.undefined
}
object UpdateQueueRequest {
  
  @scala.inline
  def apply(Name: string): UpdateQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueRequest]
  }
  
  @scala.inline
  implicit class UpdateQueueRequestMutableBuilder[Self <: UpdateQueueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationPlanSettings(value: ReservationPlanSettings): Self = StObject.set(x, "ReservationPlanSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationPlanSettingsUndefined: Self = StObject.set(x, "ReservationPlanSettings", js.undefined)
    
    @scala.inline
    def setStatus(value: QueueStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
