package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionCompletedEventAttributes extends StObject {
  
  /**
    * The results of the Lambda task.
    */
  var result: js.UndefOr[Data] = js.undefined
  
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this Lambda task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  
  /**
    * The ID of the LambdaFunctionStarted event recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var startedEventId: EventId
}
object LambdaFunctionCompletedEventAttributes {
  
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId): LambdaFunctionCompletedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionCompletedEventAttributes]
  }
  
  @scala.inline
  implicit class LambdaFunctionCompletedEventAttributesMutableBuilder[Self <: LambdaFunctionCompletedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Data): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
  }
}
