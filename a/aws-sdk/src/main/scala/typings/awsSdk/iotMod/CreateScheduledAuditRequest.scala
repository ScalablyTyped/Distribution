package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScheduledAuditRequest extends StObject {
  
  /**
    * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined
  
  /**
    * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI", or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  
  /**
    * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The start time of each audit is determined by the system.
    */
  var frequency: AuditFrequency
  
  /**
    * The name you want to give to the scheduled audit. (Max. 128 chars)
    */
  var scheduledAuditName: ScheduledAuditName
  
  /**
    * Metadata that can be used to manage the scheduled audit.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or use UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: TargetAuditCheckNames
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
  implicit class CreateScheduledAuditRequestMutableBuilder[Self <: CreateScheduledAuditRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    @scala.inline
    def setFrequency(value: AuditFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledAuditName(value: ScheduledAuditName): Self = StObject.set(x, "scheduledAuditName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetCheckNames(value: TargetAuditCheckNames): Self = StObject.set(x, "targetCheckNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCheckNamesVarargs(value: AuditCheckName*): Self = StObject.set(x, "targetCheckNames", js.Array(value :_*))
  }
}
