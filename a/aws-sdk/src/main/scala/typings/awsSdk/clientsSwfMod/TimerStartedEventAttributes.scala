package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerStartedEventAttributes extends StObject {
  
  /**
    * Data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the StartTimer decision for this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  
  /**
    * The duration of time after which the timer fires. The duration is specified in seconds, an integer greater than or equal to 0.
    */
  var startToFireTimeout: DurationInSeconds
  
  /**
    * The unique ID of the timer that was started.
    */
  var timerId: TimerId
}
object TimerStartedEventAttributes {
  
  inline def apply(decisionTaskCompletedEventId: EventId, startToFireTimeout: DurationInSeconds, timerId: TimerId): TimerStartedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], startToFireTimeout = startToFireTimeout.asInstanceOf[js.Any], timerId = timerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerStartedEventAttributes]
  }
  
  extension [Self <: TimerStartedEventAttributes](x: Self) {
    
    inline def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    inline def setStartToFireTimeout(value: DurationInSeconds): Self = StObject.set(x, "startToFireTimeout", value.asInstanceOf[js.Any])
    
    inline def setTimerId(value: TimerId): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
  }
}
