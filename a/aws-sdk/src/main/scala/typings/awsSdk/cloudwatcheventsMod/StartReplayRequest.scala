package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartReplayRequest extends js.Object {
  
  /**
    * A description for the replay to start.
    */
  var Description: js.UndefOr[ReplayDescription] = js.native
  
  /**
    * A ReplayDestination object that includes details about the destination for the replay.
    */
  var Destination: ReplayDestination = js.native
  
  /**
    * A time stamp for the time to stop replaying events. Only events that occurred between the EventStartTime and EventEndTime are replayed.
    */
  var EventEndTime: Timestamp = js.native
  
  /**
    * The ARN of the archive to replay events from.
    */
  var EventSourceArn: Arn = js.native
  
  /**
    * A time stamp for the time to start replaying events. Only events that occurred between the EventStartTime and EventEndTime are replayed.
    */
  var EventStartTime: Timestamp = js.native
  
  /**
    * The name of the replay to start.
    */
  var ReplayName: typings.awsSdk.cloudwatcheventsMod.ReplayName = js.native
}
object StartReplayRequest {
  
  @scala.inline
  def apply(
    Destination: ReplayDestination,
    EventEndTime: Timestamp,
    EventSourceArn: Arn,
    EventStartTime: Timestamp,
    ReplayName: ReplayName
  ): StartReplayRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], EventEndTime = EventEndTime.asInstanceOf[js.Any], EventSourceArn = EventSourceArn.asInstanceOf[js.Any], EventStartTime = EventStartTime.asInstanceOf[js.Any], ReplayName = ReplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplayRequest]
  }
  
  @scala.inline
  implicit class StartReplayRequestOps[Self <: StartReplayRequest] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: ReplayDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEndTime(value: Timestamp): Self = this.set("EventEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventStartTime(value: Timestamp): Self = this.set("EventStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayName(value: ReplayName): Self = this.set("ReplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ReplayDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}
