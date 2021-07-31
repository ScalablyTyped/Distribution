package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAILY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.HOURLY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.MONTHLY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ONCE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.WEEKLY
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesScheduleMod {
  
  trait Schedule extends StObject {
    
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
    def apply(): Schedule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Schedule]
    }
    
    @scala.inline
    implicit class ScheduleMutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: String): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      @scala.inline
      def setFrequency(value: ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
      
      @scala.inline
      def setIsLocalTime(value: Boolean): Self = StObject.set(x, "IsLocalTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLocalTimeUndefined: Self = StObject.set(x, "IsLocalTime", js.undefined)
      
      @scala.inline
      def setQuietTime(value: QuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
      
      @scala.inline
      def setStartTime(value: String): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    }
  }
  
  trait UnmarshalledSchedule
    extends StObject
       with Schedule {
    
    /**
      * The time during which the campaign sends no messages.
      */
    @JSName("QuietTime")
    var QuietTime_UnmarshalledSchedule: js.UndefOr[UnmarshalledQuietTime] = js.undefined
  }
  object UnmarshalledSchedule {
    
    @scala.inline
    def apply(): UnmarshalledSchedule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSchedule]
    }
    
    @scala.inline
    implicit class UnmarshalledScheduleMutableBuilder[Self <: UnmarshalledSchedule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuietTime(value: UnmarshalledQuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    }
  }
}
