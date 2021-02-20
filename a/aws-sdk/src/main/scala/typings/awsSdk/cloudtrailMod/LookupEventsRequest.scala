package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupEventsRequest extends StObject {
  
  /**
    * Specifies that only events that occur before or at the specified time are returned. If the specified end time is before the specified start time, an error is returned.
    */
  var EndTime: js.UndefOr[Date] = js.native
  
  /**
    * Specifies the event category. If you do not specify an event category, events of the category are not returned in the response. For example, if you do not specify insight as the value of EventCategory, no Insights events are returned.
    */
  var EventCategory: js.UndefOr[typings.awsSdk.cloudtrailMod.EventCategory] = js.native
  
  /**
    * Contains a list of lookup attributes. Currently the list can contain only one item.
    */
  var LookupAttributes: js.UndefOr[LookupAttributesList] = js.native
  
  /**
    * The number of events to return. Possible values are 1 through 50. The default is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudtrailMod.MaxResults] = js.native
  
  /**
    * The token to use to get the next page of results after a previous API call. This token must be passed in with the same parameters that were specified in the the original call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudtrailMod.NextToken] = js.native
  
  /**
    * Specifies that only events that occur after or at the specified time are returned. If the specified start time is after the specified end time, an error is returned.
    */
  var StartTime: js.UndefOr[Date] = js.native
}
object LookupEventsRequest {
  
  @scala.inline
  def apply(): LookupEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupEventsRequest]
  }
  
  @scala.inline
  implicit class LookupEventsRequestMutableBuilder[Self <: LookupEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setEventCategory(value: EventCategory): Self = StObject.set(x, "EventCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoryUndefined: Self = StObject.set(x, "EventCategory", js.undefined)
    
    @scala.inline
    def setLookupAttributes(value: LookupAttributesList): Self = StObject.set(x, "LookupAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupAttributesUndefined: Self = StObject.set(x, "LookupAttributes", js.undefined)
    
    @scala.inline
    def setLookupAttributesVarargs(value: LookupAttribute*): Self = StObject.set(x, "LookupAttributes", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
