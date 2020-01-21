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
  def apply(
    Frequency: String = null,
    Interval: Int | scala.Double = null,
    OccurrenceDays: OccurrenceDayRequestSet = null,
    OccurrenceRelativeToEnd: js.UndefOr[scala.Boolean] = js.undefined,
    OccurrenceUnit: String = null
  ): ScheduledInstanceRecurrenceRequest = {
    val __obj = js.Dynamic.literal()
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    if (Interval != null) __obj.updateDynamic("Interval")(Interval.asInstanceOf[js.Any])
    if (OccurrenceDays != null) __obj.updateDynamic("OccurrenceDays")(OccurrenceDays.asInstanceOf[js.Any])
    if (!js.isUndefined(OccurrenceRelativeToEnd)) __obj.updateDynamic("OccurrenceRelativeToEnd")(OccurrenceRelativeToEnd.asInstanceOf[js.Any])
    if (OccurrenceUnit != null) __obj.updateDynamic("OccurrenceUnit")(OccurrenceUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstanceRecurrenceRequest]
  }
}

