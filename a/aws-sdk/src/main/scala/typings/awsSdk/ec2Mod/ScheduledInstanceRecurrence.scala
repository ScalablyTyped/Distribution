package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstanceRecurrence extends js.Object {
  /**
    * The frequency (Daily, Weekly, or Monthly).
    */
  var Frequency: js.UndefOr[String] = js.native
  /**
    * The interval quantity. The interval unit depends on the value of frequency. For example, every 2 weeks or every 2 months.
    */
  var Interval: js.UndefOr[Integer] = js.native
  /**
    * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is one or more days of the week (1-7, where 1 is Sunday).
    */
  var OccurrenceDaySet: js.UndefOr[typings.awsSdk.ec2Mod.OccurrenceDaySet] = js.native
  /**
    * Indicates whether the occurrence is relative to the end of the specified week or month.
    */
  var OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.native
  /**
    * The unit for occurrenceDaySet (DayOfWeek or DayOfMonth).
    */
  var OccurrenceUnit: js.UndefOr[String] = js.native
}

object ScheduledInstanceRecurrence {
  @scala.inline
  def apply(
    Frequency: String = null,
    Interval: js.UndefOr[Integer] = js.undefined,
    OccurrenceDaySet: OccurrenceDaySet = null,
    OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.undefined,
    OccurrenceUnit: String = null
  ): ScheduledInstanceRecurrence = {
    val __obj = js.Dynamic.literal()
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    if (!js.isUndefined(Interval)) __obj.updateDynamic("Interval")(Interval.get.asInstanceOf[js.Any])
    if (OccurrenceDaySet != null) __obj.updateDynamic("OccurrenceDaySet")(OccurrenceDaySet.asInstanceOf[js.Any])
    if (!js.isUndefined(OccurrenceRelativeToEnd)) __obj.updateDynamic("OccurrenceRelativeToEnd")(OccurrenceRelativeToEnd.get.asInstanceOf[js.Any])
    if (OccurrenceUnit != null) __obj.updateDynamic("OccurrenceUnit")(OccurrenceUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstanceRecurrence]
  }
}

