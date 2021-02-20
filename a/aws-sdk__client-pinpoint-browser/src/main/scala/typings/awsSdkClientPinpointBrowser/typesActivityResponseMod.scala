package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesActivityResponseMod {
  
  @js.native
  trait ActivityResponse extends StObject {
    
    /**
      * The ID of the application to which the campaign applies.
      */
    var ApplicationId: js.UndefOr[String] = js.native
    
    /**
      * The ID of the campaign to which the activity applies.
      */
    var CampaignId: js.UndefOr[String] = js.native
    
    /**
      * The actual time the activity was marked CANCELLED or COMPLETED. Provided in ISO 8601 format.
      */
    var End: js.UndefOr[String] = js.native
    
    /**
      * The unique activity ID.
      */
    var Id: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether the activity succeeded.
      *
      * Valid values: SUCCESS, FAIL
      */
    var Result: js.UndefOr[String] = js.native
    
    /**
      * The scheduled start time for the activity in ISO 8601 format.
      */
    var ScheduledStart: js.UndefOr[String] = js.native
    
    /**
      * The actual start time of the activity in ISO 8601 format.
      */
    var Start: js.UndefOr[String] = js.native
    
    /**
      * The state of the activity.
      *
      * Valid values: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, COMPLETED
      */
    var State: js.UndefOr[String] = js.native
    
    /**
      * The total number of endpoints to which the campaign successfully delivered messages.
      */
    var SuccessfulEndpointCount: js.UndefOr[Double] = js.native
    
    /**
      * The total number of timezones completed.
      */
    var TimezonesCompletedCount: js.UndefOr[Double] = js.native
    
    /**
      * The total number of unique timezones present in the segment.
      */
    var TimezonesTotalCount: js.UndefOr[Double] = js.native
    
    /**
      * The total number of endpoints to which the campaign attempts to deliver messages.
      */
    var TotalEndpointCount: js.UndefOr[Double] = js.native
    
    /**
      * The ID of a variation of the campaign used for A/B testing.
      */
    var TreatmentId: js.UndefOr[String] = js.native
  }
  object ActivityResponse {
    
    @scala.inline
    def apply(): ActivityResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityResponse]
    }
    
    @scala.inline
    implicit class ActivityResponseMutableBuilder[Self <: ActivityResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      @scala.inline
      def setCampaignId(value: String): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignIdUndefined: Self = StObject.set(x, "CampaignId", js.undefined)
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
      
      @scala.inline
      def setScheduledStart(value: String): Self = StObject.set(x, "ScheduledStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduledStartUndefined: Self = StObject.set(x, "ScheduledStart", js.undefined)
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      @scala.inline
      def setSuccessfulEndpointCount(value: Double): Self = StObject.set(x, "SuccessfulEndpointCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulEndpointCountUndefined: Self = StObject.set(x, "SuccessfulEndpointCount", js.undefined)
      
      @scala.inline
      def setTimezonesCompletedCount(value: Double): Self = StObject.set(x, "TimezonesCompletedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezonesCompletedCountUndefined: Self = StObject.set(x, "TimezonesCompletedCount", js.undefined)
      
      @scala.inline
      def setTimezonesTotalCount(value: Double): Self = StObject.set(x, "TimezonesTotalCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezonesTotalCountUndefined: Self = StObject.set(x, "TimezonesTotalCount", js.undefined)
      
      @scala.inline
      def setTotalEndpointCount(value: Double): Self = StObject.set(x, "TotalEndpointCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalEndpointCountUndefined: Self = StObject.set(x, "TotalEndpointCount", js.undefined)
      
      @scala.inline
      def setTreatmentId(value: String): Self = StObject.set(x, "TreatmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreatmentIdUndefined: Self = StObject.set(x, "TreatmentId", js.undefined)
    }
  }
  
  type UnmarshalledActivityResponse = ActivityResponse
}
