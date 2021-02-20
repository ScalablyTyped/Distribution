package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateScheduleRequest extends StObject {
  
  /**
    * Id of the channel whose schedule is being updated.
    */
  var ChannelId: string = js.native
  
  /**
    * Schedule actions to create in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateRequest] = js.native
  
  /**
    * Schedule actions to delete from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteRequest] = js.native
}
object BatchUpdateScheduleRequest {
  
  @scala.inline
  def apply(ChannelId: string): BatchUpdateScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateScheduleRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateScheduleRequestMutableBuilder[Self <: BatchUpdateScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreates(value: BatchScheduleActionCreateRequest): Self = StObject.set(x, "Creates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatesUndefined: Self = StObject.set(x, "Creates", js.undefined)
    
    @scala.inline
    def setDeletes(value: BatchScheduleActionDeleteRequest): Self = StObject.set(x, "Deletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletesUndefined: Self = StObject.set(x, "Deletes", js.undefined)
  }
}
