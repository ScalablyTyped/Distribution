package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScheduledAuditRequest extends js.Object {
  /**
    * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.native
  /**
    * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI", or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.native
  /**
    * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The start time of each audit is determined by the system.
    */
  var frequency: AuditFrequency = js.native
  /**
    * The name you want to give to the scheduled audit. (Max. 128 chars)
    */
  var scheduledAuditName: ScheduledAuditName = js.native
  /**
    * Metadata that can be used to manage the scheduled audit.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or use UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: TargetAuditCheckNames = js.native
}

object CreateScheduledAuditRequest {
  @scala.inline
  def apply(
    frequency: AuditFrequency,
    scheduledAuditName: ScheduledAuditName,
    targetCheckNames: TargetAuditCheckNames
  ): CreateScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any], scheduledAuditName = scheduledAuditName.asInstanceOf[js.Any], targetCheckNames = targetCheckNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduledAuditRequest]
  }
  @scala.inline
  implicit class CreateScheduledAuditRequestOps[Self <: CreateScheduledAuditRequest] (val x: Self) extends AnyVal {
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
    def setFrequency(value: AuditFrequency): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduledAuditName(value: ScheduledAuditName): Self = this.set("scheduledAuditName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetCheckNamesVarargs(value: AuditCheckName*): Self = this.set("targetCheckNames", js.Array(value :_*))
    @scala.inline
    def setTargetCheckNames(value: TargetAuditCheckNames): Self = this.set("targetCheckNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayOfMonth(value: DayOfMonth): Self = this.set("dayOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfMonth: Self = this.set("dayOfMonth", js.undefined)
    @scala.inline
    def setDayOfWeek(value: DayOfWeek): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

