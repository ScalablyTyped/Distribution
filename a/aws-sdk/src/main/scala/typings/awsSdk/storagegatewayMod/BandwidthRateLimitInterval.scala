package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandwidthRateLimitInterval extends js.Object {
  
  /**
    *  The average download rate limit component of the bandwidth rate limit interval, in bits per second. This field does not appear in the response if the download rate limit is not set. 
    */
  var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.native
  
  /**
    *  The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This field does not appear in the response if the upload rate limit is not set. 
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.native
  
  /**
    *  The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0 to 6, where 0 represents Sunday and 6 Saturday. 
    */
  var DaysOfWeek: typings.awsSdk.storagegatewayMod.DaysOfWeek = js.native
  
  /**
    *  The hour of the day to end the bandwidth rate limit interval. 
    */
  var EndHourOfDay: HourOfDay = js.native
  
  /**
    *  The minute of the hour to end the bandwidth rate limit interval.    The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an hour, use the value 59.  
    */
  var EndMinuteOfHour: MinuteOfHour = js.native
  
  /**
    *  The hour of the day to start the bandwidth rate limit interval. 
    */
  var StartHourOfDay: HourOfDay = js.native
  
  /**
    *  The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of that minute. To begin an interval exactly at the start of the hour, use the value 0. 
    */
  var StartMinuteOfHour: MinuteOfHour = js.native
}
object BandwidthRateLimitInterval {
  
  @scala.inline
  def apply(
    DaysOfWeek: DaysOfWeek,
    EndHourOfDay: HourOfDay,
    EndMinuteOfHour: MinuteOfHour,
    StartHourOfDay: HourOfDay,
    StartMinuteOfHour: MinuteOfHour
  ): BandwidthRateLimitInterval = {
    val __obj = js.Dynamic.literal(DaysOfWeek = DaysOfWeek.asInstanceOf[js.Any], EndHourOfDay = EndHourOfDay.asInstanceOf[js.Any], EndMinuteOfHour = EndMinuteOfHour.asInstanceOf[js.Any], StartHourOfDay = StartHourOfDay.asInstanceOf[js.Any], StartMinuteOfHour = StartMinuteOfHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandwidthRateLimitInterval]
  }
  
  @scala.inline
  implicit class BandwidthRateLimitIntervalOps[Self <: BandwidthRateLimitInterval] (val x: Self) extends AnyVal {
    
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
    def setDaysOfWeekVarargs(value: DayOfWeek*): Self = this.set("DaysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeek(value: DaysOfWeek): Self = this.set("DaysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndHourOfDay(value: HourOfDay): Self = this.set("EndHourOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMinuteOfHour(value: MinuteOfHour): Self = this.set("EndMinuteOfHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHourOfDay(value: HourOfDay): Self = this.set("StartHourOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMinuteOfHour(value: MinuteOfHour): Self = this.set("StartMinuteOfHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageDownloadRateLimitInBitsPerSec(value: BandwidthDownloadRateLimit): Self = this.set("AverageDownloadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageDownloadRateLimitInBitsPerSec: Self = this.set("AverageDownloadRateLimitInBitsPerSec", js.undefined)
    
    @scala.inline
    def setAverageUploadRateLimitInBitsPerSec(value: BandwidthUploadRateLimit): Self = this.set("AverageUploadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageUploadRateLimitInBitsPerSec: Self = this.set("AverageUploadRateLimitInBitsPerSec", js.undefined)
  }
}
