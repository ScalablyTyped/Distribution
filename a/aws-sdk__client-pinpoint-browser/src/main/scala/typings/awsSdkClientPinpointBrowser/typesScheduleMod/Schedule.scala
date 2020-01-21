package typings.awsSdkClientPinpointBrowser.typesScheduleMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAILY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.HOURLY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.MONTHLY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ONCE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.WEEKLY
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
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
  var QuietTime: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.undefined
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

object Schedule {
  @scala.inline
  def apply(
    EndTime: String = null,
    Frequency: ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String = null,
    IsLocalTime: js.UndefOr[Boolean] = js.undefined,
    QuietTime: QuietTime = null,
    StartTime: String = null,
    Timezone: String = null
  ): Schedule = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    if (!js.isUndefined(IsLocalTime)) __obj.updateDynamic("IsLocalTime")(IsLocalTime.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
}

