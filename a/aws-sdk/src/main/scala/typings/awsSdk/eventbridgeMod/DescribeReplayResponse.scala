package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplayResponse extends StObject {
  
  /**
    * The description of the replay.
    */
  var Description: js.UndefOr[ReplayDescription] = js.undefined
  
  /**
    * A ReplayDestination object that contains details about the replay.
    */
  var Destination: js.UndefOr[ReplayDestination] = js.undefined
  
  /**
    * The time stamp for the last event that was replayed from the archive.
    */
  var EventEndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time that the event was last replayed.
    */
  var EventLastReplayedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ARN of the archive events were replayed from.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time stamp of the first event that was last replayed from the archive.
    */
  var EventStartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ARN of the replay.
    */
  var ReplayArn: js.UndefOr[typings.awsSdk.eventbridgeMod.ReplayArn] = js.undefined
  
  /**
    * A time stamp for the time that the replay stopped.
    */
  var ReplayEndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the replay.
    */
  var ReplayName: js.UndefOr[typings.awsSdk.eventbridgeMod.ReplayName] = js.undefined
  
  /**
    * A time stamp for the time that the replay started.
    */
  var ReplayStartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The current state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.undefined
  
  /**
    * The reason that the replay is in the current state.
    */
  var StateReason: js.UndefOr[ReplayStateReason] = js.undefined
}
object DescribeReplayResponse {
  
  inline def apply(): DescribeReplayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplayResponse]
  }
  
  extension [Self <: DescribeReplayResponse](x: Self) {
    
    inline def setDescription(value: ReplayDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestination(value: ReplayDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setEventEndTime(value: Timestamp): Self = StObject.set(x, "EventEndTime", value.asInstanceOf[js.Any])
    
    inline def setEventEndTimeUndefined: Self = StObject.set(x, "EventEndTime", js.undefined)
    
    inline def setEventLastReplayedTime(value: Timestamp): Self = StObject.set(x, "EventLastReplayedTime", value.asInstanceOf[js.Any])
    
    inline def setEventLastReplayedTimeUndefined: Self = StObject.set(x, "EventLastReplayedTime", js.undefined)
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    inline def setEventStartTime(value: Timestamp): Self = StObject.set(x, "EventStartTime", value.asInstanceOf[js.Any])
    
    inline def setEventStartTimeUndefined: Self = StObject.set(x, "EventStartTime", js.undefined)
    
    inline def setReplayArn(value: ReplayArn): Self = StObject.set(x, "ReplayArn", value.asInstanceOf[js.Any])
    
    inline def setReplayArnUndefined: Self = StObject.set(x, "ReplayArn", js.undefined)
    
    inline def setReplayEndTime(value: Timestamp): Self = StObject.set(x, "ReplayEndTime", value.asInstanceOf[js.Any])
    
    inline def setReplayEndTimeUndefined: Self = StObject.set(x, "ReplayEndTime", js.undefined)
    
    inline def setReplayName(value: ReplayName): Self = StObject.set(x, "ReplayName", value.asInstanceOf[js.Any])
    
    inline def setReplayNameUndefined: Self = StObject.set(x, "ReplayName", js.undefined)
    
    inline def setReplayStartTime(value: Timestamp): Self = StObject.set(x, "ReplayStartTime", value.asInstanceOf[js.Any])
    
    inline def setReplayStartTimeUndefined: Self = StObject.set(x, "ReplayStartTime", js.undefined)
    
    inline def setState(value: ReplayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: ReplayStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
