package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMaintenanceStartTimeInput extends js.Object {
  
  /**
    * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.
    */
  var DayOfMonth: js.UndefOr[typings.awsSdk.storagegatewayMod.DayOfMonth] = js.native
  
  /**
    * The day of the week component of the maintenance start time week represented as an ordinal number from 0 to 6, where 0 represents Sunday and 6 Saturday.
    */
  var DayOfWeek: js.UndefOr[typings.awsSdk.storagegatewayMod.DayOfWeek] = js.native
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * The hour component of the maintenance start time represented as hh, where hh is the hour (00 to 23). The hour of the day is in the time zone of the gateway.
    */
  var HourOfDay: typings.awsSdk.storagegatewayMod.HourOfDay = js.native
  
  /**
    * The minute component of the maintenance start time represented as mm, where mm is the minute (00 to 59). The minute of the hour is in the time zone of the gateway.
    */
  var MinuteOfHour: typings.awsSdk.storagegatewayMod.MinuteOfHour = js.native
}
object UpdateMaintenanceStartTimeInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN, HourOfDay: HourOfDay, MinuteOfHour: MinuteOfHour): UpdateMaintenanceStartTimeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], HourOfDay = HourOfDay.asInstanceOf[js.Any], MinuteOfHour = MinuteOfHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceStartTimeInput]
  }
  
  @scala.inline
  implicit class UpdateMaintenanceStartTimeInputOps[Self <: UpdateMaintenanceStartTimeInput] (val x: Self) extends AnyVal {
    
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
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourOfDay(value: HourOfDay): Self = this.set("HourOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteOfHour(value: MinuteOfHour): Self = this.set("MinuteOfHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfMonth(value: DayOfMonth): Self = this.set("DayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfMonth: Self = this.set("DayOfMonth", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: DayOfWeek): Self = this.set("DayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeek: Self = this.set("DayOfWeek", js.undefined)
  }
}
