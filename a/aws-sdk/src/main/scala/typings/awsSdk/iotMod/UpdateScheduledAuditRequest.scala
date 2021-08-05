package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScheduledAuditRequest extends StObject {
  
  /**
    * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined
  
  /**
    * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI", or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  
  /**
    * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY", or "MONTHLY". The start time of each audit is determined by the system.
    */
  var frequency: js.UndefOr[AuditFrequency] = js.undefined
  
  /**
    * The name of the scheduled audit. (Max. 128 chars)
    */
  var scheduledAuditName: ScheduledAuditName
  
  /**
    * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or use UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
}
object UpdateScheduledAuditRequest {
  
  inline def apply(scheduledAuditName: ScheduledAuditName): UpdateScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(scheduledAuditName = scheduledAuditName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScheduledAuditRequest]
  }
  
  extension [Self <: UpdateScheduledAuditRequest](x: Self) {
    
    inline def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setFrequency(value: AuditFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setScheduledAuditName(value: ScheduledAuditName): Self = StObject.set(x, "scheduledAuditName", value.asInstanceOf[js.Any])
    
    inline def setTargetCheckNames(value: TargetAuditCheckNames): Self = StObject.set(x, "targetCheckNames", value.asInstanceOf[js.Any])
    
    inline def setTargetCheckNamesUndefined: Self = StObject.set(x, "targetCheckNames", js.undefined)
    
    inline def setTargetCheckNamesVarargs(value: AuditCheckName*): Self = StObject.set(x, "targetCheckNames", js.Array(value :_*))
  }
}
