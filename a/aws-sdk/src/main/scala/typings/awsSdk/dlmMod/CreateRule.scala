package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRule extends js.Object {
  /**
    * The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more information, see Cron expressions in the Amazon CloudWatch User Guide.
    */
  var CronExpression: js.UndefOr[typings.awsSdk.dlmMod.CronExpression] = js.native
  /**
    * The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
    */
  var Interval: js.UndefOr[typings.awsSdk.dlmMod.Interval] = js.native
  /**
    * The interval unit.
    */
  var IntervalUnit: js.UndefOr[IntervalUnitValues] = js.native
  /**
    * The time, in UTC, to start the operation. The supported format is hh:mm. The operation occurs within a one-hour window following the specified time. If you do not specify a time, Amazon DLM selects a time within the next 24 hours.
    */
  var Times: js.UndefOr[TimesList] = js.native
}

object CreateRule {
  @scala.inline
  def apply(
    CronExpression: CronExpression = null,
    Interval: js.UndefOr[Interval] = js.undefined,
    IntervalUnit: IntervalUnitValues = null,
    Times: TimesList = null
  ): CreateRule = {
    val __obj = js.Dynamic.literal()
    if (CronExpression != null) __obj.updateDynamic("CronExpression")(CronExpression.asInstanceOf[js.Any])
    if (!js.isUndefined(Interval)) __obj.updateDynamic("Interval")(Interval.get.asInstanceOf[js.Any])
    if (IntervalUnit != null) __obj.updateDynamic("IntervalUnit")(IntervalUnit.asInstanceOf[js.Any])
    if (Times != null) __obj.updateDynamic("Times")(Times.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRule]
  }
}

