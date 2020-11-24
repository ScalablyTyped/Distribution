package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateScheduleRequest extends js.Object {
  
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
  implicit class BatchUpdateScheduleRequestOps[Self <: BatchUpdateScheduleRequest] (val x: Self) extends AnyVal {
    
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
    def setChannelId(value: string): Self = this.set("ChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreates(value: BatchScheduleActionCreateRequest): Self = this.set("Creates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreates: Self = this.set("Creates", js.undefined)
    
    @scala.inline
    def setDeletes(value: BatchScheduleActionDeleteRequest): Self = this.set("Deletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletes: Self = this.set("Deletes", js.undefined)
  }
}
