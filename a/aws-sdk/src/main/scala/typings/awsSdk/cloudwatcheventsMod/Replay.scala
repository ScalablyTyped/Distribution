package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replay extends js.Object {
  
  /**
    * A time stamp for the time to start replaying events. Any event with a creation time prior to the EventEndTime specified is replayed.
    */
  var EventEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A time stamp for the time that the last event was replayed.
    */
  var EventLastReplayedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the archive to replay event from.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * A time stamp for the time to start replaying events. This is determined by the time in the event as described in Time.
    */
  var EventStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A time stamp for the time that the replay completed.
    */
  var ReplayEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the replay.
    */
  var ReplayName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ReplayName] = js.native
  
  /**
    * A time stamp for the time that the replay started.
    */
  var ReplayStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The current state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.native
  
  /**
    * A description of why the replay is in the current state.
    */
  var StateReason: js.UndefOr[ReplayStateReason] = js.native
}
object Replay {
  
  @scala.inline
  def apply(): Replay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replay]
  }
  
  @scala.inline
  implicit class ReplayOps[Self <: Replay] (val x: Self) extends AnyVal {
    
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
