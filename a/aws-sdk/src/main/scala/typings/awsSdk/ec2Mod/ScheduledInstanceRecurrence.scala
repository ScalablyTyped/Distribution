package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstanceRecurrence extends StObject {
  
  /**
    * The frequency (Daily, Weekly, or Monthly).
    */
  var Frequency: js.UndefOr[String] = js.undefined
  
  /**
    * The interval quantity. The interval unit depends on the value of frequency. For example, every 2 weeks or every 2 months.
    */
  var Interval: js.UndefOr[Integer] = js.undefined
  
  /**
    * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is one or more days of the week (1-7, where 1 is Sunday).
    */
  var OccurrenceDaySet: js.UndefOr[typings.awsSdk.ec2Mod.OccurrenceDaySet] = js.undefined
  
  /**
    * Indicates whether the occurrence is relative to the end of the specified week or month.
    */
  var OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unit for occurrenceDaySet (DayOfWeek or DayOfMonth).
    */
  var OccurrenceUnit: js.UndefOr[String] = js.undefined
}
object ScheduledInstanceRecurrence {
  
  inline def apply(): ScheduledInstanceRecurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceRecurrence]
  }
  
  extension [Self <: ScheduledInstanceRecurrence](x: Self) {
    
    inline def setFrequency(value: String): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    inline def setInterval(value: Integer): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setOccurrenceDaySet(value: OccurrenceDaySet): Self = StObject.set(x, "OccurrenceDaySet", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDaySetUndefined: Self = StObject.set(x, "OccurrenceDaySet", js.undefined)
    
    inline def setOccurrenceDaySetVarargs(value: Integer*): Self = StObject.set(x, "OccurrenceDaySet", js.Array(value :_*))
    
    inline def setOccurrenceRelativeToEnd(value: Boolean): Self = StObject.set(x, "OccurrenceRelativeToEnd", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceRelativeToEndUndefined: Self = StObject.set(x, "OccurrenceRelativeToEnd", js.undefined)
    
    inline def setOccurrenceUnit(value: String): Self = StObject.set(x, "OccurrenceUnit", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceUnitUndefined: Self = StObject.set(x, "OccurrenceUnit", js.undefined)
  }
}
