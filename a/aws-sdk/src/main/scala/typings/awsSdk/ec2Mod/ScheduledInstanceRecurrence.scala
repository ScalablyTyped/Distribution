package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledInstanceRecurrence extends StObject {
  
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
  def apply(): ScheduledInstanceRecurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceRecurrence]
  }
  
  @scala.inline
  implicit class ScheduledInstanceRecurrenceMutableBuilder[Self <: ScheduledInstanceRecurrence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: String): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    @scala.inline
    def setInterval(value: Integer): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    @scala.inline
    def setOccurrenceDaySet(value: OccurrenceDaySet): Self = StObject.set(x, "OccurrenceDaySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceDaySetUndefined: Self = StObject.set(x, "OccurrenceDaySet", js.undefined)
    
    @scala.inline
    def setOccurrenceDaySetVarargs(value: Integer*): Self = StObject.set(x, "OccurrenceDaySet", js.Array(value :_*))
    
    @scala.inline
    def setOccurrenceRelativeToEnd(value: Boolean): Self = StObject.set(x, "OccurrenceRelativeToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceRelativeToEndUndefined: Self = StObject.set(x, "OccurrenceRelativeToEnd", js.undefined)
    
    @scala.inline
    def setOccurrenceUnit(value: String): Self = StObject.set(x, "OccurrenceUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceUnitUndefined: Self = StObject.set(x, "OccurrenceUnit", js.undefined)
  }
}
