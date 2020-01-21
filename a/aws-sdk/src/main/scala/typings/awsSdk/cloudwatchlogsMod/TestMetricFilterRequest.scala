package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

