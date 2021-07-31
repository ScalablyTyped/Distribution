package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyExecutionActivityMetricsRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the journey activity.
    */
  var JourneyActivityId: string
  
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: string
  
  /**
    * The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.undefined
}
object GetJourneyExecutionActivityMetricsRequest {
  
  @scala.inline
  def apply(ApplicationId: string, JourneyActivityId: string, JourneyId: string): GetJourneyExecutionActivityMetricsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyActivityId = JourneyActivityId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyExecutionActivityMetricsRequest]
  }
  
  @scala.inline
  implicit class GetJourneyExecutionActivityMetricsRequestMutableBuilder[Self <: GetJourneyExecutionActivityMetricsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJourneyActivityId(value: string): Self = StObject.set(x, "JourneyActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJourneyId(value: string): Self = StObject.set(x, "JourneyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: string): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
