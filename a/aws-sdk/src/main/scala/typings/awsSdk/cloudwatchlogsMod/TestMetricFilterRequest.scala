package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMetricFilterRequest extends StObject {
  
  var filterPattern: FilterPattern
  
  /**
    * The log event messages to test.
    */
  var logEventMessages: TestEventMessages
}
object TestMetricFilterRequest {
  
  @scala.inline
  def apply(filterPattern: FilterPattern, logEventMessages: TestEventMessages): TestMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterPattern = filterPattern.asInstanceOf[js.Any], logEventMessages = logEventMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMetricFilterRequest]
  }
  
  @scala.inline
  implicit class TestMetricFilterRequestMutableBuilder[Self <: TestMetricFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterPattern(value: FilterPattern): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEventMessages(value: TestEventMessages): Self = StObject.set(x, "logEventMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEventMessagesVarargs(value: EventMessage*): Self = StObject.set(x, "logEventMessages", js.Array(value :_*))
  }
}
