package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionStartedEventAttributes extends StObject {
  
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
}
object LambdaFunctionStartedEventAttributes {
  
  @scala.inline
  def apply(scheduledEventId: EventId): LambdaFunctionStartedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionStartedEventAttributes]
  }
  
  @scala.inline
  implicit class LambdaFunctionStartedEventAttributesMutableBuilder[Self <: LambdaFunctionStartedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
  }
}
