package typings.awsSdkClientPinpointBrowser.typesScheduleMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAILY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.HOURLY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.MONTHLY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ONCE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.WEEKLY
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends js.Object {
  
  /**
    * The scheduled time that the campaign ends in ISO 8601 format.
    */
  var EndTime: js.UndefOr[String] = js.native
  
  /**
    * How often the campaign delivers messages.
    *
    * Valid values: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY
    */
  var Frequency: js.UndefOr[ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String] = js.native
  
  /**
    * Indicates whether the campaign schedule takes effect according to each user's local time.
    */
  var IsLocalTime: js.UndefOr[Boolean] = js.native
  
  /**
    * The time during which the campaign sends no messages.
    */
  var QuietTime: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.native
  
  /**
    * The scheduled time that the campaign begins in ISO 8601 format.
    */
  var StartTime: js.UndefOr[String] = js.native
  
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
  var Timezone: js.UndefOr[String] = js.native
}
object Schedule {
  
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setFrequency(value: ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String): Self = this.set("Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("Frequency", js.undefined)
    
    @scala.inline
    def setIsLocalTime(value: Boolean): Self = this.set("IsLocalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLocalTime: Self = this.set("IsLocalTime", js.undefined)
    
    @scala.inline
    def setQuietTime(value: QuietTime): Self = this.set("QuietTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuietTime: Self = this.set("QuietTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
  }
}
