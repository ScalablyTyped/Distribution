package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstanceRecurrenceRequest extends js.Object {
  /**
    * The frequency (Daily, Weekly, or Monthly).
    */
  var Frequency: js.UndefOr[String] = js.native
  /**
    * The interval quantity. The interval unit depends on the value of Frequency. For example, every 2 weeks or every 2 months.
    */
  var Interval: js.UndefOr[Integer] = js.native
  /**
    * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily schedule. If the occurrence is relative to the end of the month, you can specify only a single day.
    */
  var OccurrenceDays: js.UndefOr[OccurrenceDayRequestSet] = js.native
  /**
    * Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify this value with a daily schedule.
    */
  var OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.native
  /**
    * The unit for OccurrenceDays (DayOfWeek or DayOfMonth). This value is required for a monthly schedule. You can't specify DayOfWeek with a weekly schedule. You can't specify this value with a daily schedule.
    */
  var OccurrenceUnit: js.UndefOr[String] = js.native
}

object ScheduledInstanceRecurrenceRequest {
  @scala.inline
  def apply(): ScheduledInstanceRecurrenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceRecurrenceRequest]
  }
  @scala.inline
  implicit class ScheduledInstanceRecurrenceRequestOps[Self <: ScheduledInstanceRecurrenceRequest] (val x: Self) extends AnyVal {
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
    def setFrequency(value: String): Self = this.set("Frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("Frequency", js.undefined)
    @scala.inline
    def setInterval(value: Integer): Self = this.set("Interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("Interval", js.undefined)
    @scala.inline
    def setOccurrenceDaysVarargs(value: Integer*): Self = this.set("OccurrenceDays", js.Array(value :_*))
    @scala.inline
    def setOccurrenceDays(value: OccurrenceDayRequestSet): Self = this.set("OccurrenceDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrenceDays: Self = this.set("OccurrenceDays", js.undefined)
    @scala.inline
    def setOccurrenceRelativeToEnd(value: Boolean): Self = this.set("OccurrenceRelativeToEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrenceRelativeToEnd: Self = this.set("OccurrenceRelativeToEnd", js.undefined)
    @scala.inline
    def setOccurrenceUnit(value: String): Self = this.set("OccurrenceUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrenceUnit: Self = this.set("OccurrenceUnit", js.undefined)
  }
  
}

