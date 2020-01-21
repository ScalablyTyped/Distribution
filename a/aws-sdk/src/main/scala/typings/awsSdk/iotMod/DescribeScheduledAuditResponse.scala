package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledAuditResponse extends js.Object {
  /**
    * The day of the month on which the scheduled audit takes place. Will be "1" through "31" or "LAST". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.native
  /**
    * The day of the week on which the scheduled audit takes place. One of "SUN", "MON", "TUE", "WED", "THU", "FRI", or "SAT".
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.native
  /**
    * How often the scheduled audit takes place. One of "DAILY", "WEEKLY", "BIWEEKLY", or "MONTHLY". The start time of each audit is determined by the system.
    */
  var frequency: js.UndefOr[AuditFrequency] = js.native
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.native
  /**
    * The name of the scheduled audit.
    */
  var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.native
  /**
    * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or use UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.native
}

object DescribeScheduledAuditResponse {
  @scala.inline
  def apply(
    dayOfMonth: DayOfMonth = null,
    dayOfWeek: DayOfWeek = null,
    frequency: AuditFrequency = null,
    scheduledAuditArn: ScheduledAuditArn = null,
    scheduledAuditName: ScheduledAuditName = null,
    targetCheckNames: TargetAuditCheckNames = null
  ): DescribeScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    if (dayOfMonth != null) __obj.updateDynamic("dayOfMonth")(dayOfMonth.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (scheduledAuditArn != null) __obj.updateDynamic("scheduledAuditArn")(scheduledAuditArn.asInstanceOf[js.Any])
    if (scheduledAuditName != null) __obj.updateDynamic("scheduledAuditName")(scheduledAuditName.asInstanceOf[js.Any])
    if (targetCheckNames != null) __obj.updateDynamic("targetCheckNames")(targetCheckNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledAuditResponse]
  }
}

