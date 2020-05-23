package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryScheduleInput extends js.Object {
  /**
    * How long, in seconds, for the canary to continue making regular runs according to the schedule in the Expression value. If you specify 0, the canary continues making runs until you stop it. If you omit this field, the default of 0 is used.
    */
  var DurationInSeconds: js.UndefOr[MaxOneYearInSeconds] = js.native
  /**
    * A rate expression that defines how often the canary is to run. The syntax is rate(number unit). unit can be minute, minutes, or hour.  For example, rate(1 minute) runs the canary once a minute, rate(10 minutes) runs it once every 10 minutes, and rate(1 hour) runs it once every hour. You can specify a frequency between rate(1 minute) and rate(1 hour). Specifying rate(0 minute) or rate(0 hour) is a special value that causes the canary to run only once when it is started.
    */
  var Expression: String = js.native
}

object CanaryScheduleInput {
  @scala.inline
  def apply(Expression: String, DurationInSeconds: js.UndefOr[MaxOneYearInSeconds] = js.undefined): CanaryScheduleInput = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    if (!js.isUndefined(DurationInSeconds)) __obj.updateDynamic("DurationInSeconds")(DurationInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryScheduleInput]
  }
}

