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
  def apply(): DescribeScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledAuditResponse]
  }
  @scala.inline
  implicit class DescribeScheduledAuditResponseOps[Self <: DescribeScheduledAuditResponse] (val x: Self) extends AnyVal {
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
    def setDayOfMonth(value: DayOfMonth): Self = this.set("dayOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfMonth: Self = this.set("dayOfMonth", js.undefined)
    @scala.inline
    def setDayOfWeek(value: DayOfWeek): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    @scala.inline
    def setFrequency(value: AuditFrequency): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setScheduledAuditArn(value: ScheduledAuditArn): Self = this.set("scheduledAuditArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledAuditArn: Self = this.set("scheduledAuditArn", js.undefined)
    @scala.inline
    def setScheduledAuditName(value: ScheduledAuditName): Self = this.set("scheduledAuditName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledAuditName: Self = this.set("scheduledAuditName", js.undefined)
    @scala.inline
    def setTargetCheckNamesVarargs(value: AuditCheckName*): Self = this.set("targetCheckNames", js.Array(value :_*))
    @scala.inline
    def setTargetCheckNames(value: TargetAuditCheckNames): Self = this.set("targetCheckNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCheckNames: Self = this.set("targetCheckNames", js.undefined)
  }
  
}

