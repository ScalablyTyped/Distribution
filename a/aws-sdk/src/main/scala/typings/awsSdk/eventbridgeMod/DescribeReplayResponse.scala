package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReplayResponse extends StObject {
  
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
  implicit class DescribeReplayResponseMutableBuilder[Self <: DescribeReplayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ReplayDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDestination(value: ReplayDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    @scala.inline
    def setEventEndTime(value: Timestamp): Self = StObject.set(x, "EventEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEndTimeUndefined: Self = StObject.set(x, "EventEndTime", js.undefined)
    
    @scala.inline
    def setEventLastReplayedTime(value: Timestamp): Self = StObject.set(x, "EventLastReplayedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLastReplayedTimeUndefined: Self = StObject.set(x, "EventLastReplayedTime", js.undefined)
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    @scala.inline
    def setEventStartTime(value: Timestamp): Self = StObject.set(x, "EventStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventStartTimeUndefined: Self = StObject.set(x, "EventStartTime", js.undefined)
    
    @scala.inline
    def setReplayArn(value: ReplayArn): Self = StObject.set(x, "ReplayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayArnUndefined: Self = StObject.set(x, "ReplayArn", js.undefined)
    
    @scala.inline
    def setReplayEndTime(value: Timestamp): Self = StObject.set(x, "ReplayEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayEndTimeUndefined: Self = StObject.set(x, "ReplayEndTime", js.undefined)
    
    @scala.inline
    def setReplayName(value: ReplayName): Self = StObject.set(x, "ReplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayNameUndefined: Self = StObject.set(x, "ReplayName", js.undefined)
    
    @scala.inline
    def setReplayStartTime(value: Timestamp): Self = StObject.set(x, "ReplayStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayStartTimeUndefined: Self = StObject.set(x, "ReplayStartTime", js.undefined)
    
    @scala.inline
    def setState(value: ReplayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: ReplayStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
