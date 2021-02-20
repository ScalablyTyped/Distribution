package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledAuditMetadata extends StObject {
  
  /**
    * The day of the month on which the scheduled audit is run (if the frequency is "MONTHLY"). If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.native
  
  /**
    * The day of the week on which the scheduled audit is run (if the frequency is "WEEKLY" or "BIWEEKLY").
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.native
  
  /**
    * How often the scheduled audit occurs.
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
}
object ScheduledAuditMetadata {
  
  @scala.inline
  def apply(): ScheduledAuditMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledAuditMetadata]
  }
  
  @scala.inline
  implicit class ScheduledAuditMetadataMutableBuilder[Self <: ScheduledAuditMetadata] (val x: Self) extends AnyVal {
    
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
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setScheduledAuditArn(value: ScheduledAuditArn): Self = StObject.set(x, "scheduledAuditArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledAuditArnUndefined: Self = StObject.set(x, "scheduledAuditArn", js.undefined)
    
    @scala.inline
    def setScheduledAuditName(value: ScheduledAuditName): Self = StObject.set(x, "scheduledAuditName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledAuditNameUndefined: Self = StObject.set(x, "scheduledAuditName", js.undefined)
  }
}
