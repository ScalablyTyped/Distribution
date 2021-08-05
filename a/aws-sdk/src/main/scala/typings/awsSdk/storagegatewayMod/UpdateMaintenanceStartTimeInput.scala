package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMaintenanceStartTimeInput extends StObject {
  
  /**
    * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.
    */
  var DayOfMonth: js.UndefOr[typings.awsSdk.storagegatewayMod.DayOfMonth] = js.undefined
  
  /**
    * The day of the week component of the maintenance start time week represented as an ordinal number from 0 to 6, where 0 represents Sunday and 6 Saturday.
    */
  var DayOfWeek: js.UndefOr[typings.awsSdk.storagegatewayMod.DayOfWeek] = js.undefined
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
  
  /**
    * The hour component of the maintenance start time represented as hh, where hh is the hour (00 to 23). The hour of the day is in the time zone of the gateway.
    */
  var HourOfDay: typings.awsSdk.storagegatewayMod.HourOfDay
  
  /**
    * The minute component of the maintenance start time represented as mm, where mm is the minute (00 to 59). The minute of the hour is in the time zone of the gateway.
    */
  var MinuteOfHour: typings.awsSdk.storagegatewayMod.MinuteOfHour
}
object UpdateMaintenanceStartTimeInput {
  
  inline def apply(GatewayARN: GatewayARN, HourOfDay: HourOfDay, MinuteOfHour: MinuteOfHour): UpdateMaintenanceStartTimeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], HourOfDay = HourOfDay.asInstanceOf[js.Any], MinuteOfHour = MinuteOfHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceStartTimeInput]
  }
  
  extension [Self <: UpdateMaintenanceStartTimeInput](x: Self) {
    
    inline def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "DayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "DayOfMonth", js.undefined)
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "DayOfWeek", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setHourOfDay(value: HourOfDay): Self = StObject.set(x, "HourOfDay", value.asInstanceOf[js.Any])
    
    inline def setMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "MinuteOfHour", value.asInstanceOf[js.Any])
  }
}
