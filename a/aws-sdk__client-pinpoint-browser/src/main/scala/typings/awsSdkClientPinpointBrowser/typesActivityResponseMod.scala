package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesActivityResponseMod {
  
  trait ActivityResponse extends StObject {
    
    /**
      * The ID of the application to which the campaign applies.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the campaign to which the activity applies.
      */
    var CampaignId: js.UndefOr[String] = js.undefined
    
    /**
      * The actual time the activity was marked CANCELLED or COMPLETED. Provided in ISO 8601 format.
      */
    var End: js.UndefOr[String] = js.undefined
    
    /**
      * The unique activity ID.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether the activity succeeded.
      *
      * Valid values: SUCCESS, FAIL
      */
    var Result: js.UndefOr[String] = js.undefined
    
    /**
      * The scheduled start time for the activity in ISO 8601 format.
      */
    var ScheduledStart: js.UndefOr[String] = js.undefined
    
    /**
      * The actual start time of the activity in ISO 8601 format.
      */
    var Start: js.UndefOr[String] = js.undefined
    
    /**
      * The state of the activity.
      *
      * Valid values: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, COMPLETED
      */
    var State: js.UndefOr[String] = js.undefined
    
    /**
      * The total number of endpoints to which the campaign successfully delivered messages.
      */
    var SuccessfulEndpointCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The total number of timezones completed.
      */
    var TimezonesCompletedCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The total number of unique timezones present in the segment.
      */
    var TimezonesTotalCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The total number of endpoints to which the campaign attempts to deliver messages.
      */
    var TotalEndpointCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The ID of a variation of the campaign used for A/B testing.
      */
    var TreatmentId: js.UndefOr[String] = js.undefined
  }
  object ActivityResponse {
    
    inline def apply(): ActivityResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActivityResponse] (val x: Self) extends AnyVal {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setCampaignId(value: String): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
      
      inline def setCampaignIdUndefined: Self = StObject.set(x, "CampaignId", js.undefined)
      
      inline def setEnd(value: String): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
      
      inline def setScheduledStart(value: String): Self = StObject.set(x, "ScheduledStart", value.asInstanceOf[js.Any])
      
      inline def setScheduledStartUndefined: Self = StObject.set(x, "ScheduledStart", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      inline def setSuccessfulEndpointCount(value: Double): Self = StObject.set(x, "SuccessfulEndpointCount", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulEndpointCountUndefined: Self = StObject.set(x, "SuccessfulEndpointCount", js.undefined)
      
      inline def setTimezonesCompletedCount(value: Double): Self = StObject.set(x, "TimezonesCompletedCount", value.asInstanceOf[js.Any])
      
      inline def setTimezonesCompletedCountUndefined: Self = StObject.set(x, "TimezonesCompletedCount", js.undefined)
      
      inline def setTimezonesTotalCount(value: Double): Self = StObject.set(x, "TimezonesTotalCount", value.asInstanceOf[js.Any])
      
      inline def setTimezonesTotalCountUndefined: Self = StObject.set(x, "TimezonesTotalCount", js.undefined)
      
      inline def setTotalEndpointCount(value: Double): Self = StObject.set(x, "TotalEndpointCount", value.asInstanceOf[js.Any])
      
      inline def setTotalEndpointCountUndefined: Self = StObject.set(x, "TotalEndpointCount", js.undefined)
      
      inline def setTreatmentId(value: String): Self = StObject.set(x, "TreatmentId", value.asInstanceOf[js.Any])
      
      inline def setTreatmentIdUndefined: Self = StObject.set(x, "TreatmentId", js.undefined)
    }
  }
  
  type UnmarshalledActivityResponse = ActivityResponse
}
