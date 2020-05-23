package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceStartTimeOutput extends js.Object {
  /**
    * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.  This value is only available for tape and volume gateways. 
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
  def apply(
    DayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
    DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
    GatewayARN: GatewayARN = null,
    HourOfDay: js.UndefOr[HourOfDay] = js.undefined,
    MinuteOfHour: js.UndefOr[MinuteOfHour] = js.undefined,
    Timezone: GatewayTimezone = null
  ): DescribeMaintenanceStartTimeOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DayOfMonth)) __obj.updateDynamic("DayOfMonth")(DayOfMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DayOfWeek)) __obj.updateDynamic("DayOfWeek")(DayOfWeek.get.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (!js.isUndefined(HourOfDay)) __obj.updateDynamic("HourOfDay")(HourOfDay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinuteOfHour)) __obj.updateDynamic("MinuteOfHour")(MinuteOfHour.get.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceStartTimeOutput]
  }
}

