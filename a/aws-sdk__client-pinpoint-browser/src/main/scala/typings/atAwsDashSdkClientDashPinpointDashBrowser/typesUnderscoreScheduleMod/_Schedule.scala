package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreScheduleMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DAILY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.HOURLY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.MONTHLY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ONCE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.WEEKLY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreQuietTimeMod._QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Schedule extends js.Object {
  /**
    * The scheduled time that the campaign ends in ISO 8601 format.
    */
  var EndTime: js.UndefOr[String] = js.undefined
  /**
    * How often the campaign delivers messages.
    *
    * Valid values: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY
    */
  var Frequency: js.UndefOr[ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String] = js.undefined
  /**
    * Indicates whether the campaign schedule takes effect according to each user's local time.
    */
  var IsLocalTime: js.UndefOr[Boolean] = js.undefined
  /**
    * The time during which the campaign sends no messages.
    */
  var QuietTime: js.UndefOr[_QuietTime] = js.undefined
  /**
    * The scheduled time that the campaign begins in ISO 8601 format.
    */
  var StartTime: js.UndefOr[String] = js.undefined
  /**
    * The starting UTC offset for the schedule if the value for isLocalTime is true
    *
    * Valid values:
    * UTC
    * UTC+01
    * UTC+02
    * UTC+03
    * UTC+03:30
    * UTC+04
    * UTC+04:30
    * UTC+05
    * UTC+05:30
    * UTC+05:45
    * UTC+06
    * UTC+06:30
    * UTC+07
    * UTC+08
    * UTC+09
    * UTC+09:30
    * UTC+10
    * UTC+10:30
    * UTC+11
    * UTC+12
    * UTC+13
    * UTC-02
    * UTC-03
    * UTC-04
    * UTC-05
    * UTC-06
    * UTC-07
    * UTC-08
    * UTC-09
    * UTC-10
    * UTC-11
    */
  var Timezone: js.UndefOr[String] = js.undefined
}

object _Schedule {
  @scala.inline
  def apply(
    EndTime: String = null,
    Frequency: ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String = null,
    IsLocalTime: js.UndefOr[Boolean] = js.undefined,
    QuietTime: _QuietTime = null,
    StartTime: String = null,
    Timezone: String = null
  ): _Schedule = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    if (!js.isUndefined(IsLocalTime)) __obj.updateDynamic("IsLocalTime")(IsLocalTime)
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    __obj.asInstanceOf[_Schedule]
  }
}

