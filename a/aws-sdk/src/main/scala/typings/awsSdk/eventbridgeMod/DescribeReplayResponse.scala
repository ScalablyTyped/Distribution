package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReplayResponse extends js.Object {
  
  /**
    * The description of the replay.
    */
  var Description: js.UndefOr[ReplayDescription] = js.native
  
  /**
    * A ReplayDestination object that contains details about the replay.
    */
  var Destination: js.UndefOr[ReplayDestination] = js.native
  
  /**
    * The time stamp for the last event that was replayed from the archive.
    */
  var EventEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time that the event was last replayed.
    */
  var EventLastReplayedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the archive events were replayed from.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The time stamp of the first event that was last replayed from the archive.
    */
  var EventStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the replay.
    */
  var ReplayArn: js.UndefOr[typings.awsSdk.eventbridgeMod.ReplayArn] = js.native
  
  /**
    * A time stamp for the time that the replay stopped.
    */
  var ReplayEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the replay.
    */
  var ReplayName: js.UndefOr[typings.awsSdk.eventbridgeMod.ReplayName] = js.native
  
  /**
    * A time stamp for the time that the replay started.
    */
  var ReplayStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The current state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.native
  
  /**
    * The reason that the replay is in the current state.
    */
  var StateReason: js.UndefOr[ReplayStateReason] = js.native
}
object DescribeReplayResponse {
  
  @scala.inline
  def apply(): DescribeReplayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplayResponse]
  }
  
  @scala.inline
  implicit class DescribeReplayResponseOps[Self <: DescribeReplayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: ReplayDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDestination(value: ReplayDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
    
    @scala.inline
    def setEventEndTime(value: Timestamp): Self = this.set("EventEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventEndTime: Self = this.set("EventEndTime", js.undefined)
    
    @scala.inline
    def setEventLastReplayedTime(value: Timestamp): Self = this.set("EventLastReplayedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventLastReplayedTime: Self = this.set("EventLastReplayedTime", js.undefined)
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSourceArn: Self = this.set("EventSourceArn", js.undefined)
    
    @scala.inline
    def setEventStartTime(value: Timestamp): Self = this.set("EventStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventStartTime: Self = this.set("EventStartTime", js.undefined)
    
    @scala.inline
    def setReplayArn(value: ReplayArn): Self = this.set("ReplayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplayArn: Self = this.set("ReplayArn", js.undefined)
    
    @scala.inline
    def setReplayEndTime(value: Timestamp): Self = this.set("ReplayEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplayEndTime: Self = this.set("ReplayEndTime", js.undefined)
    
    @scala.inline
    def setReplayName(value: ReplayName): Self = this.set("ReplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplayName: Self = this.set("ReplayName", js.undefined)
    
    @scala.inline
    def setReplayStartTime(value: Timestamp): Self = this.set("ReplayStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplayStartTime: Self = this.set("ReplayStartTime", js.undefined)
    
    @scala.inline
    def setState(value: ReplayState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateReason(value: ReplayStateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
  }
}
