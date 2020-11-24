package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ScheduledInstanceRecurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceRecurrence]
  }
  
  @scala.inline
  implicit class ScheduledInstanceRecurrenceOps[Self <: ScheduledInstanceRecurrence] (val x: Self) extends AnyVal {
    
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
    def setFrequency(value: String): Self = this.set("Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("Frequency", js.undefined)
    
    @scala.inline
    def setInterval(value: Integer): Self = this.set("Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("Interval", js.undefined)
    
    @scala.inline
    def setOccurrenceDaySetVarargs(value: Integer*): Self = this.set("OccurrenceDaySet", js.Array(value :_*))
    
    @scala.inline
    def setOccurrenceDaySet(value: OccurrenceDaySet): Self = this.set("OccurrenceDaySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceDaySet: Self = this.set("OccurrenceDaySet", js.undefined)
    
    @scala.inline
    def setOccurrenceRelativeToEnd(value: Boolean): Self = this.set("OccurrenceRelativeToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceRelativeToEnd: Self = this.set("OccurrenceRelativeToEnd", js.undefined)
    
    @scala.inline
    def setOccurrenceUnit(value: String): Self = this.set("OccurrenceUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceUnit: Self = this.set("OccurrenceUnit", js.undefined)
  }
}
