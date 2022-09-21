package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledAuditResponse extends StObject {
  
  /**
    * The day of the month on which the scheduled audit takes place. This is will be 1 through 31 or LAST. If days 29-31 are specified, and the month does not have that many days, the audit takes place on the LAST day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined
  
  /**
    * The day of the week on which the scheduled audit takes place, either one of SUN, MON, TUE, WED, THU, FRI, or SAT.
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  
  /**
    * How often the scheduled audit takes place, either one of DAILY, WEEKLY, BIWEEKLY, or MONTHLY. The start time of each audit is determined by the system.
    */
  var frequency: js.UndefOr[AuditFrequency] = js.undefined
  
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
  
  /**
    * The name of the scheduled audit.
    */
  var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined
  
  /**
    * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or use UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
}
object DescribeScheduledAuditResponse {
  
  inline def apply(): DescribeScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledAuditResponse]
  }
  
  extension [Self <: DescribeScheduledAuditResponse](x: Self) {
    
    inline def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setFrequency(value: AuditFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setScheduledAuditArn(value: ScheduledAuditArn): Self = StObject.set(x, "scheduledAuditArn", value.asInstanceOf[js.Any])
    
    inline def setScheduledAuditArnUndefined: Self = StObject.set(x, "scheduledAuditArn", js.undefined)
    
    inline def setScheduledAuditName(value: ScheduledAuditName): Self = StObject.set(x, "scheduledAuditName", value.asInstanceOf[js.Any])
    
    inline def setScheduledAuditNameUndefined: Self = StObject.set(x, "scheduledAuditName", js.undefined)
    
    inline def setTargetCheckNames(value: TargetAuditCheckNames): Self = StObject.set(x, "targetCheckNames", value.asInstanceOf[js.Any])
    
    inline def setTargetCheckNamesUndefined: Self = StObject.set(x, "targetCheckNames", js.undefined)
    
    inline def setTargetCheckNamesVarargs(value: AuditCheckName*): Self = StObject.set(x, "targetCheckNames", js.Array(value*))
  }
}
