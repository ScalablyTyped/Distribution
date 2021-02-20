package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceStartTimeOutput extends StObject {
  
  /**
    * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.
    */
  var DayOfMonth: js.UndefOr[typings.awsSdk.storagegatewayMod.DayOfMonth] = js.native
  
  /**
    * An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6 represents Saturday. The day of week is in the time zone of the gateway.
    */
  var DayOfWeek: js.UndefOr[typings.awsSdk.storagegatewayMod.DayOfWeek] = js.native
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The hour component of the maintenance start time represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
    */
  var HourOfDay: js.UndefOr[typings.awsSdk.storagegatewayMod.HourOfDay] = js.native
  
  /**
    * The minute component of the maintenance start time represented as mm, where mm is the minute (0 to 59). The minute of the hour is in the time zone of the gateway.
    */
  var MinuteOfHour: js.UndefOr[typings.awsSdk.storagegatewayMod.MinuteOfHour] = js.native
  
  /**
    * A value that indicates the time zone that is set for the gateway. The start time and day of week specified should be in the time zone of the gateway.
    */
  var Timezone: js.UndefOr[GatewayTimezone] = js.native
}
object DescribeMaintenanceStartTimeOutput {
  
  @scala.inline
  def apply(): DescribeMaintenanceStartTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceStartTimeOutput]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceStartTimeOutputMutableBuilder[Self <: DescribeMaintenanceStartTimeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "DayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfMonthUndefined: Self = StObject.set(x, "DayOfMonth", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "DayOfWeek", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setHourOfDay(value: HourOfDay): Self = StObject.set(x, "HourOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourOfDayUndefined: Self = StObject.set(x, "HourOfDay", js.undefined)
    
    @scala.inline
    def setMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "MinuteOfHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteOfHourUndefined: Self = StObject.set(x, "MinuteOfHour", js.undefined)
    
    @scala.inline
    def setTimezone(value: GatewayTimezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
