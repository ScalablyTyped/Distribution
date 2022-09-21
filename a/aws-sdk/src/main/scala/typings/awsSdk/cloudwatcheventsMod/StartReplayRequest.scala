package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplayRequest extends StObject {
  
  /**
    * A description for the replay to start.
    */
  var Description: js.UndefOr[ReplayDescription] = js.undefined
  
  /**
    * A ReplayDestination object that includes details about the destination for the replay.
    */
  var Destination: ReplayDestination
  
  /**
    * A time stamp for the time to stop replaying events. Only events that occurred between the EventStartTime and EventEndTime are replayed.
    */
  var EventEndTime: js.Date
  
  /**
    * The ARN of the archive to replay events from.
    */
  var EventSourceArn: Arn
  
  /**
    * A time stamp for the time to start replaying events. Only events that occurred between the EventStartTime and EventEndTime are replayed.
    */
  var EventStartTime: js.Date
  
  /**
    * The name of the replay to start.
    */
  var ReplayName: typings.awsSdk.cloudwatcheventsMod.ReplayName
}
object StartReplayRequest {
  
  inline def apply(
    Destination: ReplayDestination,
    EventEndTime: js.Date,
    EventSourceArn: Arn,
    EventStartTime: js.Date,
    ReplayName: ReplayName
  ): StartReplayRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], EventEndTime = EventEndTime.asInstanceOf[js.Any], EventSourceArn = EventSourceArn.asInstanceOf[js.Any], EventStartTime = EventStartTime.asInstanceOf[js.Any], ReplayName = ReplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplayRequest]
  }
  
  extension [Self <: StartReplayRequest](x: Self) {
    
    inline def setDescription(value: ReplayDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestination(value: ReplayDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setEventEndTime(value: js.Date): Self = StObject.set(x, "EventEndTime", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventStartTime(value: js.Date): Self = StObject.set(x, "EventStartTime", value.asInstanceOf[js.Any])
    
    inline def setReplayName(value: ReplayName): Self = StObject.set(x, "ReplayName", value.asInstanceOf[js.Any])
  }
}
