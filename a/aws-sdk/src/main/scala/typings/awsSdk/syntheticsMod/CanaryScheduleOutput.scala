package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryScheduleOutput extends js.Object {
  /**
    * How long, in seconds, for the canary to continue making regular runs after it was created. The runs are performed according to the schedule in the Expression value.
    */
  var DurationInSeconds: js.UndefOr[MaxOneYearInSeconds] = js.native
  /**
    * A rate expression that defines how often the canary is to run. The syntax is rate(number unit). unit can be minute, minutes, or hour.  For example, rate(1 minute) runs the canary once a minute, rate(10 minutes) runs it once every 10 minutes, and rate(1 hour) runs it once every hour. Specifying rate(0 minute) or rate(0 hour) is a special value that causes the canary to run only once when it is started.
    */
  var Expression: js.UndefOr[String] = js.native
}

object CanaryScheduleOutput {
  @scala.inline
  def apply(DurationInSeconds: js.UndefOr[MaxOneYearInSeconds] = js.undefined, Expression: String = null): CanaryScheduleOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DurationInSeconds)) __obj.updateDynamic("DurationInSeconds")(DurationInSeconds.get.asInstanceOf[js.Any])
    if (Expression != null) __obj.updateDynamic("Expression")(Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryScheduleOutput]
  }
}

