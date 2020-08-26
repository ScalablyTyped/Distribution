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
  def apply(): CreateRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRule]
  }
  @scala.inline
  implicit class CreateRuleOps[Self <: CreateRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCronExpression(value: CronExpression): Self = this.set("CronExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCronExpression: Self = this.set("CronExpression", js.undefined)
    @scala.inline
    def setInterval(value: Interval): Self = this.set("Interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("Interval", js.undefined)
    @scala.inline
    def setIntervalUnit(value: IntervalUnitValues): Self = this.set("IntervalUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalUnit: Self = this.set("IntervalUnit", js.undefined)
    @scala.inline
    def setTimesVarargs(value: Time*): Self = this.set("Times", js.Array(value :_*))
    @scala.inline
    def setTimes(value: TimesList): Self = this.set("Times", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimes: Self = this.set("Times", js.undefined)
  }
  
}

