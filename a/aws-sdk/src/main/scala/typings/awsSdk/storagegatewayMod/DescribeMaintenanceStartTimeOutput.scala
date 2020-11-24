package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceStartTimeOutput extends js.Object {
  
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
  implicit class DescribeMaintenanceStartTimeOutputOps[Self <: DescribeMaintenanceStartTimeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDayOfMonth(value: DayOfMonth): Self = this.set("DayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfMonth: Self = this.set("DayOfMonth", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: DayOfWeek): Self = this.set("DayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeek: Self = this.set("DayOfWeek", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    
    @scala.inline
    def setHourOfDay(value: HourOfDay): Self = this.set("HourOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourOfDay: Self = this.set("HourOfDay", js.undefined)
    
    @scala.inline
    def setMinuteOfHour(value: MinuteOfHour): Self = this.set("MinuteOfHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteOfHour: Self = this.set("MinuteOfHour", js.undefined)
    
    @scala.inline
    def setTimezone(value: GatewayTimezone): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
  }
}
