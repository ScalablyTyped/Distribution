package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreScheduleMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DAILY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.HOURLY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.MONTHLY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ONCE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.WEEKLY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreQuietTimeMod._UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSchedule extends _Schedule {
  /**
    * The time during which the campaign sends no messages.
    */
  @JSName("QuietTime")
  var QuietTime__UnmarshalledSchedule: js.UndefOr[_UnmarshalledQuietTime] = js.undefined
}

object _UnmarshalledSchedule {
  @scala.inline
  def apply(
    EndTime: String = null,
    Frequency: ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String = null,
    IsLocalTime: js.UndefOr[Boolean] = js.undefined,
    QuietTime: _UnmarshalledQuietTime = null,
    StartTime: String = null,
    Timezone: String = null
  ): _UnmarshalledSchedule = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    if (!js.isUndefined(IsLocalTime)) __obj.updateDynamic("IsLocalTime")(IsLocalTime)
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    __obj.asInstanceOf[_UnmarshalledSchedule]
  }
}

