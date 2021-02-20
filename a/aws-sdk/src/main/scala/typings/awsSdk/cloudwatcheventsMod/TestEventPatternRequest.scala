package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestEventPatternRequest extends StObject {
  
  /**
    * The event, in JSON format, to test against the event pattern.
    */
  var Event: String = js.native
  
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: typings.awsSdk.cloudwatcheventsMod.EventPattern = js.native
}
object TestEventPatternRequest {
  
  @scala.inline
  def apply(Event: String, EventPattern: EventPattern): TestEventPatternRequest = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], EventPattern = EventPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEventPatternRequest]
  }
  
  @scala.inline
  implicit class TestEventPatternRequestMutableBuilder[Self <: TestEventPatternRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
  }
}
