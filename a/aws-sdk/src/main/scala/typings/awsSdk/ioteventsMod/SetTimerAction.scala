package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTimerAction extends js.Object {
  /**
    * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables ($variable.&lt;variable-name&gt;), and input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;) as the duration. The range of the duration is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the duration is rounded down to the nearest whole number. 
    */
  var durationExpression: js.UndefOr[VariableValue] = js.native
  /**
    * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The maximum value is 31622400 seconds. 
    */
  var seconds: js.UndefOr[Seconds] = js.native
  /**
    * The name of the timer.
    */
  var timerName: TimerName = js.native
}

object SetTimerAction {
  @scala.inline
  def apply(timerName: TimerName, durationExpression: VariableValue = null, seconds: Int | Double = null): SetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    if (durationExpression != null) __obj.updateDynamic("durationExpression")(durationExpression.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimerAction]
  }
}

