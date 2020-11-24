package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestMetricFilterRequest extends js.Object {
  
  var filterPattern: FilterPattern = js.native
  
  /**
    * The log event messages to test.
    */
  var logEventMessages: TestEventMessages = js.native
}
object TestMetricFilterRequest {
  
  @scala.inline
  def apply(filterPattern: FilterPattern, logEventMessages: TestEventMessages): TestMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterPattern = filterPattern.asInstanceOf[js.Any], logEventMessages = logEventMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMetricFilterRequest]
  }
  
  @scala.inline
  implicit class TestMetricFilterRequestOps[Self <: TestMetricFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilterPattern(value: FilterPattern): Self = this.set("filterPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEventMessagesVarargs(value: EventMessage*): Self = this.set("logEventMessages", js.Array(value :_*))
    
    @scala.inline
    def setLogEventMessages(value: TestEventMessages): Self = this.set("logEventMessages", value.asInstanceOf[js.Any])
  }
}
